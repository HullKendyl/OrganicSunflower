const createAllArtistsView = (artists) => {
  const artistTitle = document.createElement("div");
  artistTitle.classList.add("main");
  artistTitle.innerHTML = `
  <h3>Artists</h3>
  `;
  for (let i = 0; i < artists.length; i++) {
    const allArtistsView = document.createElement("div");
    allArtistsView.classList.add("artist-div");
    allArtistsView.innerHTML = `
              <img src="${artists[i].artistImage}">
          <div class="span-div">
          <span class="artist-name">${artists[i].name}</span>
          </div>
    `;
    return artistTitle, allArtistsView;
  }
};

export { createAllArtistsView };
