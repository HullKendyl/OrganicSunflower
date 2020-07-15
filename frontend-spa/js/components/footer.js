export{
    createFooter
}
const createFooter = ()=>{
    const footer = document.createElement("footer");
    footer.classList.add('footer');
    footer.innerHTML = `
<footer class="footer">
    <div class="footer-content">
       <h1 class="logo-text"><span>Organic</span> Sunflower</h1>
        <ul class ="footerlist">
            <li>
                <a
                  href="#artists"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >ARTISTS</a>
              </li>
              <li>
                <a
                  href="#albums"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >ALBUMS</a>
              </li>
              <li>
                <a href="#songs"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >SONGS
                </a>
              </li>
        </ul>                       
      </div>
</footer>    
    `
    return footer;
}