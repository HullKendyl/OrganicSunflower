export{
    createAllArtistsView
}

const createAllArtistsView = ()=>{
    const allArtistsView = document.createElement("div");
    header.classList.add('main');
    header.innerHTML = `
    <h3>Artists</h3>
  <ol>
      <li class="artist-div">
        <a href="./Artist.html">
          <img src="./Images/AbbeyRoad.png">
          <div class="span-div">
          <span class="artist-name">The Beatles</span>
          </div>
        </a>
      </li>

      <li class="artist-div">
        <a href="./Artist.html">
        <img src="./Images/AbbeyRoad.png">
        <div class="span-div">
        <span class="artist-name">Artist Name</span>
        </div>
      </a>
    </li>

    <li class="artist-div">
      <a href="./Artist.html">
      <img src="./Images/AbbeyRoad.png">
      <div class="span-div">
      <span class="artist-name">Artist Name</span>
      </div>
    </a>
  </li>
  </ol>
  `
  return allArtistsView;
}