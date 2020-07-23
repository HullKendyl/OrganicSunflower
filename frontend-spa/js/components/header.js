const createHomepageHeader = () => {
  const header = document.createElement("header");
  header.classList.add("header");
  header.innerHTML = `
    <div class="banner">
    <nav>
        <h1 class="logo-text"><span>Organic</span> Sunflower</h1>
        <ul>    
            <li class="nav-li">
                <a
                href="#"
                style="text-decoration: none;"
                alink="white"
                vlink="white"
                >ALBUMS</a>
            </li>
            <li class="nav-li">
                <a
                href="#"
                style="text-decoration: none;"
                alink="white"
                vlink="white"
                >SONGS</a>
            </li>
            <li class="nav-li">
                <a href="#"
                style="text-decoration: none;"
                alink="white"
                vlink="white"
                >ARTISTS</a>
            </li>
            <li class="nav-li">
                <a href="#"
                style="text-decoration: none;"
                alink="white"
                vlink="white"
                >HOME</a>
            </li>
        </ul>  
    </nav>
    <video autoplay muted loop>
        <source src = "./Images/headervid.mp4" type="video/mp4">
    </video>
</div>
    `;
  return header;
}
const createHeader = () => {
    const header = document.createElement("header");
    header.classList.add("header");
    header.innerHTML = `
      <div class="banner2">
      <nav class="nav-2">
          <h1 class="logo-text2"><span>Organic</span> Sunflower</h1>
          <ul>    
              <li class="nav-li2">
                  <a
                  href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >ALBUMS</a>
              </li>
              <li class="nav-li2">
                  <a
                  href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >SONGS</a>
              </li>
              <li class="nav-li2">
                  <a href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >ARTISTS</a>
              </li>
              <li class="nav-li2">
                  <a href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >HOME</a>
              </li>
          </ul>  
      </nav>
  </div>
      `;
    return header;
  }

  const createSongHeader = (song) => {
    const header = document.createElement("header");
    header.classList.add("header");
    header.innerHTML = `
      <div class="banner">
      <nav>
          <h1 class="logo-text"><span>Organic</span> Sunflower</h1>
          <ul>    
              <li class="nav-li">
                  <a
                  href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >ALBUMS</a>
              </li>
              <li class="nav-li">
                  <a
                  href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >SONGS</a>
              </li>
              <li class="nav-li">
                  <a href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >ARTISTS</a>
              </li>
              <li class="nav-li">
                  <a href="#"
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >HOME</a>
              </li>
          </ul>  
      </nav>
      <iframe src="${song.songLink}"></iframe>
      </div>
      `;
    return header;
  }
  
export { createHomepageHeader, 
createHeader, createSongHeader };

