import{
    clearElementChildren
} from "../domHelper.js"
import {
    createSongHeader
} from "./header.js"
import {
  createFooter
} from "./footer.js"

const renderSingleSong = (element, song) => {
    clearElementChildren(element);
    element.prepend(createSongHeader(song));

    const songInfo = document.createElement('div');
    songInfo.innerHTML = `
    <div class="artist-profile">
    <div class="artist">
      <h6>Song</h6>
      <h1>${song.songTitle}</h1>
    </div>
  </div>
  <div class="artist-info">
    <h3>Duration: ${song.songDuration}</h3>
  </div>

  <div class="artist-albums">
    <h3>Album</h3>
    <ol>
      <li class="album-div">
        <img src="${song.songImage}" />
        <div class="span-div">
          <span class="album-title">${song.albumTitle}</span>
        </div>
      </li>
    </ol>
  </div>
    `;

    element.append(songInfo);
    element.append(createFooter());
};

export {
    renderSingleSong
}