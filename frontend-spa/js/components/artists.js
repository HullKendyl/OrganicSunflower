// import {
//   createHeader 
// } from "./header.js"
// import {
//   createFooter
// } from "./footer.js"

import {
  renderSingleArtist
} from "./singleArtist.js"

const createAllArtistsView = (element, artists) => {
  const artistSection = document.createElement("section");
  const artistTitle = document.createElement("div");
  artistTitle.classList.add("main");
  artistTitle.innerHTML = `
  <h3>Artists</h3>
  `;
  artistSection.append(artistTitle)
  for (let i = 0; i < artists.length; i++) {
    const allArtistsView = document.createElement("div");
    allArtistsView.classList.add("artist-div");
    allArtistsView.innerHTML += `
          <img src="${artists[i].artistImage}">
          <div class="span-div">
          <span class="artist-name">${artists[i].name}</span>
          </div>
    `;

    allArtistsView.addEventListener('click', () => {
      renderSingleArtist(element, artists[i]);
    });

    artistSection.append(allArtistsView)
  }
  
  
  return artistSection;
};

export { createAllArtistsView };
