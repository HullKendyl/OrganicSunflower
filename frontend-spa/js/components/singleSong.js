import { clearElementChildren } from "../domHelper.js";
import { createSongHeader } from "./header.js";
import { createFooter } from "./footer.js";
import { renderPage } from "../app.js";
import { fetchArtists, deleteSong } from "../apiHelper.js";
import { renderSingleAlbum } from "./singleAlbum.js";

const renderSingleSong = (element, song) => {
  clearElementChildren(element);
  element.prepend(createSongHeader(song));

  const songInfo = document.createElement("div");
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
  drawFormDeleteSong(element, song);
  element.append(createFooter());
  const homeButton = document.querySelector(".home-button");
  homeButton.addEventListener("click", () => {
    fetchArtists().then((artists) => {
      renderPage(element, artists);
    });
  });
  const lowerHomeButton = document.querySelector(".footer-button");
  lowerHomeButton.addEventListener("click", () => {
    fetchArtists().then((artists) => {
      renderPage(element, artists);
    });
  });
};

function drawFormDeleteSong(element, song) {
  const deleteButton = document.createElement("button");
  deleteButton.innerText = "Delete Song";
  deleteButton.classList.add("song__form-delete");
  element.append(deleteButton);

  deleteButton.addEventListener("click", () => {
    deleteSong(song).then((album) => {
      renderSingleAlbum(element, album);
    });
  });
}
export { renderSingleSong };
