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
  const allArtists = document.createElement("div");
  allArtists.classList.add("all-artists");

  artistSection.append(artistTitle);
  for (let i = 0; i < artists.length; i++) {
    const allArtistsView = document.createElement("div");
    allArtistsView.classList.add("artist-div");
    allArtistsView.innerHTML += `
          <img class ="artists-image" src="${artists[i].artistImage}">
          <div class="span-div">
          <span class="artist-name">${artists[i].name}</span>
          </div>
    `;

    allArtistsView.addEventListener("click", () => {
      renderSingleArtist(element, artists[i]);
    });

    allArtists.append(allArtistsView);
  }

  artistSection.append(allArtists);
  drawFormAddArtist(element, artistSection);
  return artistSection;
};

function drawFormAddArtist(element, artistSection) {
  const createNewArtist = document.createElement("div");
  createNewArtist.innerHTML = "Create New Artist";
  createNewArtist.classList.add("create-artist");
  artistSection.append(createNewArtist);

  const formDiv = document.createElement("div");
  formDiv.classList.add("add-artist-form");

  const nameInput = document.createElement("input");
  nameInput.type = "text";
  nameInput.placeholder = "Artist Name";
  nameInput.classList.add("artist__form-name");
  formDiv.append(nameInput);

  const ageInput = document.createElement("input");
  ageInput.type = "text";
  ageInput.placeholder = "Artist Age";
  ageInput.classList.add("artist__form-age");
  formDiv.append(ageInput);

  const recordLabelInput = document.createElement("input");
  recordLabelInput.type = "text";
  recordLabelInput.placeholder = "Record Label";
  recordLabelInput.classList.add("artist__form-recordLabel");
  formDiv.append(recordLabelInput);

  const homeTownInput = document.createElement("input");
  homeTownInput.type = "text";
  homeTownInput.placeholder = "Hometown";
  homeTownInput.classList.add("artist__form-homeTown");
  formDiv.append(homeTownInput);

  const artistImageInput = document.createElement("input");
  artistImageInput.type = "text";
  artistImageInput.placeholder = "Artist Image URL";
  artistImageInput.classList.add("artist__form-artistImage");
  formDiv.append(artistImageInput);

  const submitButton = document.createElement("button");
  submitButton.innerText = "Submit";
  submitButton.classList.add("artist__form-submit");
  formDiv.append(submitButton);

  artistSection.append(formDiv);

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
      renderPage(element, artists);
    });
  });
}

export { createAllArtistsView };
