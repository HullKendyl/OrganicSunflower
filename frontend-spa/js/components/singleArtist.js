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
    element.appendChild(createFooter());
}

export {
    renderSingleArtist
}