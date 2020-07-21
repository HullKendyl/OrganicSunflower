import { createHomepageHeader } from "./components/header.js";
import { createFooter } from "./components/footer.js";
import { createAllArtistsView } from "./components/artists.js";
import { fetchArtists } from "./apiHelper.js";
import { clearElementChildren } from "./domHelper.js";

const container = document.querySelector(".container");

const renderPage = (element, artists) => {

  clearElementChildren(element)

  container.prepend(createHomepageHeader());
  container.appendChild(createAllArtistsView(element, artists));
  container.appendChild(createFooter());
};

fetchArtists().then((artists) => {
  renderPage(container, artists);
});

export {
  renderPage
}