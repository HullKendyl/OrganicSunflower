import { clearElementChildren } from "../domHelper.js";
import { createHeader } from "./header.js";
import { createFooter } from "./footer.js";
import { renderSingleSong } from "./singleSong.js";
import { postNewSong, deleteAlbum, fetchArtists } from "../apiHelper.js";
import { renderSingleArtist } from "./singleArtist.js";
import { renderPage } from "../app.js";

const renderSingleAlbum = (element, album) => {
  clearElementChildren(element);
  element.prepend(createHeader());
  const albumView = document.createElement("div");
  albumView.classList.add("artist-profile");
  albumView.innerHTML = `
        <div class="artist">
        <h6 class="album-h6">ALBUM</h6>
        <h1>${album.albumTitle}</h1>
        </div>
    `;
  element.append(albumView);

  const artistInfo = document.createElement("div");
  artistInfo.classList.add("artist-info");
  artistInfo.innerHTML = `
        <h3>Record Label</h3>
        <p>${album.recordLabel}</p>
    `;
  element.append(artistInfo);

  const albumSection = document.createElement("div");
  albumSection.classList.add("artist-albums");

  const albumTitle = document.createElement("h3");
  albumTitle.innerHTML = "Songs";
  albumSection.append(albumTitle);

  const songList = document.createElement("ol");
  album.songs.forEach((song) => {
    const li = document.createElement("li");
    li.innerHTML = `
        ${song.songTitle}
        `;
    li.addEventListener("click", () => {
      renderSingleSong(element, song);
    });
    songList.append(li);
  });

  albumSection.append(songList);
  element.append(albumSection);
  drawFormAddSong(element, album);
  drawFormDeleteAlbum(element, album);
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

function drawFormAddSong(element, album) {
  const nameInput = document.createElement("input");
  nameInput.type = "text";
  nameInput.placeholder = "Song Name";
  nameInput.classList.add("song__form-songTitle");
  element.append(nameInput);

  const songDuration = document.createElement("input");
  songDuration.type = "text";
  songDuration.placeholder = "Song Duration";
  songDuration.classList.add("song__form-songDuration");
  element.append(songDuration);

  const songLink = document.createElement("input");
  songLink.type = "text";
  songLink.placeholder = "Song Link";
  songLink.classList.add("song__form-songLink");
  element.append(songLink);

  const submitButton = document.createElement("button");
  submitButton.innerText = "Submit";
  submitButton.classList.add("song__form-submit");
  element.append(submitButton);

  submitButton.addEventListener("click", () => {
    const song = {
      songTitle: nameInput.value,
      songDuration: songDuration.value,
      songLink: songLink.value,
      songImage: `${album.albumImage}`,
    };
    postNewSong(song, album).then((album) => {
      renderSingleAlbum(element, album);
    });
  });
}

function drawFormDeleteAlbum(element, album) {
  const deleteButton = document.createElement("button");
  deleteButton.innerText = "Delete Album";
  deleteButton.classList.add("song__form-delete");
  element.append(deleteButton);

  deleteButton.addEventListener("click", () => {
    deleteAlbum(album).then((artist) => {
      renderSingleArtist(element, artist);
    });
  });
}

export { renderSingleAlbum };
