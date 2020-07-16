import{
    createHeader
} from "./components/header.js"
import{
    createFooter
} from "./components/footer.js"
import{
    createAllArtistsView
} from "./components/artists.js"
// import{
//     fetchHomePage
// }from "./homePageFetcher.js"

// fetchHomePage()
//     .then(fetch => renderPage());

const renderPage = () => {
    const container = document.querySelector('.container');

    while(container.firstChild) {
        container.firstChild.remove();
    }

        container.prepend(createHeader())
        container.appendChild(createAllArtistsView())
        container.appendChild(createFooter())
    // container.appendChild(createRecipeSection(tacoToDisplay)); 
}

// const renderAllArtists = () => {
//     const container = document.querySelector('.container');

//     while(container.firstChild) {
//         container.firstChild.remove();
//     }
    
//         container.prepend(createHeader())
        
//         container.appendChild(createFooter())
// }

renderPage()
// const fetchHomePage = async()=> {
//     return fetch() 
//     .then(response => response.json())
// }

// const renderAllVendors

