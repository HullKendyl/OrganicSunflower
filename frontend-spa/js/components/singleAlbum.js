import{
    clearElementChildren
} from "../domHelper.js"
import {
  createHeader 
} from "./header.js"
import {
  createFooter
} from "./footer.js"

const renderSingleAlbum = (element, album) => {
    clearElementChildren(element);
    element.prepend(createHeader());
    const albumView = document.createElement('div');
    albumView.classList.add('artist-profile');
    albumView.innerHTML=`
        <div class="artist">
        <h6>ALBUM</h6>
        <h1>${album.albumTitle}</h1>
        </div>
    `;
    element.append(albumView);
    
    const artistInfo = document.createElement('div');
    artistInfo.classList.add('artist-info');
    artistInfo.innerHTML = `
        <h3>Record Label</h3>
        <p>${album.recordLabel}</p>
    `;
    element.append(artistInfo);
   
    const albumSection=document.createElement('div');
    albumSection.classList.add('artist-albums');
    
    const albumTitle=document.createElement('h3');
    albumTitle.innerHTML="Songs";
    albumSection.append(albumTitle);
    
    const songList= document.createElement('ol');
    album.songs.forEach((song) =>{
        const li = document.createElement('li');
        li.innerHTML=`
        ${song.songTitle}
        `;
    })

    albumSection.append(songList);
    element.append(albumSection);
    element.append(createFooter());
}

export{
    renderSingleAlbum
}