import { clearElementChildren } from "../domHelper.js";
import { createHeader } from "./header.js";
import { createFooter } from "./footer.js";
import { renderSingleAlbum } from "./singleAlbum.js";
import { renderPage } from "../app.js";
import { postNewAlbum, removeArtist, fetchArtists } from "../apiHelper.js";

const renderSingleArtist = (element, artist) => {
  clearElementChildren(element);
  element.prepend(createHeader(element));

  const artistView = document.createElement("div");
  artistView.innerHTML = `
  
        <div class="artist">
            <h6 class="artist-h6">ARTIST</h6>
            <h1 class="artist-h1">${artist.name}</h1>
        </div>
    </div>

    <div class="artist-info">
        <h3 class="artist-h3">Bio</h3>
        <ul>
            <li class="artist-li">Age of Band - ${artist.age}</li>
            <li class="artist-li">Record Label - ${artist.recordLabel}</li>
            <li class="artist-li">Hometown - ${artist.homeTown}</li>
        </ul>
    </div>
    `;

  const artistAlbums = document.createElement("div");
  artistAlbums.classList.add("artist-albums");
  const albumTitle = document.createElement("h3");
  albumTitle.classList.add("artist-albumTitle-h3");
  albumTitle.innerHTML = `Albums`;

  artistAlbums.append(albumTitle);
  element.append(artistView);

  const albumList = document.createElement("ol");
  artist.albums.forEach((album) => {
    const li = document.createElement("li");
    li.classList.add("album-div");
    li.innerHTML = `
        <img class ="album-image" src="${album.albumImage}">
        <div class="span-div">
        <span class="album-title-div">${album.albumTitle}</span>
        </div>
        `;

    li.addEventListener("click", () => {
      renderSingleAlbum(element, album);
    });

    albumList.append(li);
  });

  artistAlbums.append(albumList);
  element.append(artistAlbums);
  drawFormAddAlbum(element, artist);
  drawFormRemoveArtist(element, artist);
  element.appendChild(createFooter());
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

function drawFormAddAlbum(element, artist) {
  const nameInput = document.createElement("input");
  nameInput.type = "text";
  nameInput.placeholder = "Album Name";
  nameInput.classList.add("album__form-albumTitle");
  element.append(nameInput);

  const recordLabel = document.createElement("input");
  recordLabel.type = "text";
  recordLabel.placeholder = "Record Label";
  recordLabel.classList.add("album__form-recordLabel");
  element.append(recordLabel);

  const albumImage = document.createElement("input");
  albumImage.type = "text";
  albumImage.placeholder = "Album Image URL";
  albumImage.classList.add("album__form-albumImage");
  element.append(albumImage);

  const submitButton = document.createElement("button");
  submitButton.innerText = "Submit";
  submitButton.classList.add("album__form-submit");
  element.append(submitButton);

  submitButton.addEventListener("click", () => {
    const album = {
      albumTitle: nameInput.value,
      recordLabel: recordLabel.value,
      albumImage: albumImage.value,
      songs: [],
    };

    postNewAlbum(album, artist).then((artist) => {
      renderSingleArtist(element, artist);
    });
  });
}

function drawFormRemoveArtist(element, artist) {
  const removeButton = document.createElement("button");
  removeButton.innerText = "Delete Artist";
  removeButton.classList.add("artist__form-delete");
  element.append(removeButton);

  removeButton.addEventListener("click", () => {
    removeArtist(artist).then((artists) => {
      renderPage(element, artists);
    });
  });
}

export { renderSingleArtist };
