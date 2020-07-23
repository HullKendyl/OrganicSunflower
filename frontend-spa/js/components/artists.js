import { postNewArtist } from "../apiHelper.js";

import { renderSingleArtist } from "./singleArtist.js";

import { renderPage } from "../app.js";

const createAllArtistsView = (element, artists) => {
  const artistSection = document.createElement("section");
  const artistTitle = document.createElement("div");
  artistTitle.classList.add("main");
  artistTitle.innerHTML = `
  <div class="artist-home">Artists</div>
  `;
  artistSection.append(artistTitle);
  for (let i = 0; i < artists.length; i++) {
    const allArtistsView = document.createElement("div");
    allArtistsView.classList.add("artist-div");
    allArtistsView.innerHTML += `
          <img src="${artists[i].artistImage}">
          <div class="span-div">
          <span class="artist-name">${artists[i].name}</span>
          </div>
    `;

    allArtistsView.addEventListener("click", () => {
      renderSingleArtist(element, artists[i]);
    });

    artistSection.append(allArtistsView);
  }

  drawFormAddArtist(element, artistSection);
  return artistSection;
};

function drawFormAddArtist(element, artistSection) {
  const nameInput = document.createElement("input");
  nameInput.type = "text";
  nameInput.placeholder = "Artist Name";
  nameInput.classList.add("artist__form-name");
  artistSection.append(nameInput);

  const ageInput = document.createElement("input");
  ageInput.type = "text";
  ageInput.placeholder = "Artist Age";
  ageInput.classList.add("artist__form-age");
  artistSection.append(ageInput);

  const recordLabelInput = document.createElement("input");
  recordLabelInput.type = "text";
  recordLabelInput.placeholder = "Record Label";
  recordLabelInput.classList.add("artist__form-recordLabel");
  artistSection.append(recordLabelInput);

  const homeTownInput = document.createElement("input");
  homeTownInput.type = "text";
  homeTownInput.placeholder = "Hometown";
  homeTownInput.classList.add("artist__form-homeTown");
  artistSection.append(homeTownInput);

  const artistImageInput = document.createElement("input");
  artistImageInput.type = "text";
  artistImageInput.placeholder = "Artist Image URL";
  artistImageInput.classList.add("artist__form-artistImage");
  artistSection.append(artistImageInput);

  const submitButton = document.createElement("button");
  submitButton.innerText = "Submit";
  submitButton.classList.add("artist__form-submit");
  artistSection.append(submitButton);

  submitButton.addEventListener("click", () => {
    const artist = {
      name: nameInput.value,
      age: ageInput.value,
      recordLabel: recordLabelInput.value,
      homeTown: homeTownInput.value,
      artistImage: artistImageInput.value,
      albums: [],
      songs: [],
    };
    postNewArtist(artist).then((artists) => {
      console.log(artists);
      renderPage(element, artists);
    });
  });
}

export { createAllArtistsView };
