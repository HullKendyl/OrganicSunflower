import{
    clearElementChildren
} from "../domHelper.js"
import {
  createHeader 
} from "./header.js"
import {
  createFooter
} from "./footer.js"
import{
    renderSingleAlbum
}from "./singleAlbum.js"
import{
    postNewAlbum
} from "../apiHelper.js"

const renderSingleArtist = (element, artist) => {
    clearElementChildren(element);
    element.prepend(createHeader());

    const artistView = document.createElement('div')
    artistView.innerHTML = `
    <div style="background-image: url(${artist.artistImage})" class="artist-profile">
        <div class="artist">
            <h6>ARTIST</h6>
            <h1>${artist.name}</h1>
        </div>
    </div>

    <div class="artist-info">
        <h3>Bio</h3>
        <ul>
            <li>Age of Band - ${artist.age}</li>
            <li>Record Label - ${artist.recordLabel}</li>
            <li>Hometown - ${artist.homeTown}</li>
        </ul>
    </div>
    `;

    const artistAlbums = document.createElement('div');
    artistAlbums.classList.add("artist-albums");
    const albumTitle = document.createElement('h3');
    albumTitle.innerHTML = `Albums`;

    artistAlbums.append(albumTitle);
    element.append(artistView);
    
    const albumList = document.createElement('ol');
    artist.albums.forEach((album) => {
        const li = document.createElement('li');
        li.classList.add('album-div');
        li.innerHTML = `
        <img src="${album.albumImage}">
        <div class="span-div">
        <span class="album-title">${album.albumTitle}</span>
        </div>
        `;

        li.addEventListener('click', ()=>{
            renderSingleAlbum(element, album);
        });

        albumList.append(li);
    })

    artistAlbums.append(albumList);
    element.append(artistAlbums);
    drawFormAddAlbum(element, artist);
    element.appendChild(createFooter());
}
function drawFormAddAlbum(element, artist){
    const nameInput= document.createElement("input");
    nameInput.type= "text";
    nameInput.placeholder= "Album Name";
    nameInput.classList.add("album__form-albumTitle");
    element.append(nameInput);

    const recordLabel= document.createElement("input");
    recordLabel.type= "text";
    recordLabel.placeholder= "Record Label";
    recordLabel.classList.add("album__form-recordLabel");
    element.append(recordLabel);

    const albumImage= document.createElement("input");
    albumImage.type= "text";
    albumImage.placeholder= "Album Image URL";
    albumImage.classList.add("album__form-albumImage");
    element.append(albumImage);
    
    const submitButton = document.createElement('button');
    submitButton.innerText = "Submit";
    submitButton.classList.add('album__form-submit');
    element.append(submitButton);
  
    submitButton.addEventListener("click", () => {
        const album = {
            "albumTitle": nameInput.value,
            "recordLabel": recordLabel.value,
            "albumImage": albumImage.value,
        };
        console.log (album)

        postNewAlbum(album, artist).then((artist) => {
            renderSingleArtist(element, artist);
        });
    });
}

export {
    renderSingleArtist
}