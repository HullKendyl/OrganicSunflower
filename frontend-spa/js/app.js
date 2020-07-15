import{
    createHeader
} from "./components/header.js"
import{
    createFooter
} from "./components/footer.js"
import{
    fetchHomePage
}from "./homePageFetcher.js"

fetchHomePage()
    .then(fetch => renderPage());

const renderPage = () => {
    const container = document.querySelector('.container');


    container.prepend(createHeader())
    container.appendChild(createFooter())
}