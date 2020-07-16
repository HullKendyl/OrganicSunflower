import { createHeader } from "./components/header.js";
import { createFooter } from "./components/footer.js";
import { createAllArtistsView } from "./components/artists.js";
import { fetchArtists } from "./apiHelper.js";
// import{
//     fetchHomePage
// }from "./homePageFetcher.js"

// fetchHomePage()
//     .then(fetch => renderPage());

const renderPage = (artists) => {
  const container = document.querySelector(".container");

  while (container.firstChild) {
    container.firstChild.remove();
  }

  container.prepend(createHeader());
  container.appendChild(createAllArtistsView(artists));
  container.appendChild(createFooter());
};

// const renderAllArtists = () => {
//     const container = document.querySelector('.container');

//     while(container.firstChild) {
//         container.firstChild.remove();
//     }

//         container.prepend(createHeader())

//         container.appendChild(createFooter())
// }
fetchArtists().then((artists) => {
  //   console.log(artists);
  renderPage(artists);
});
