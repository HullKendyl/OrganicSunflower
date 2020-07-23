const createFooter = ()=>{
    const footer = document.createElement("footer");
    footer.classList.add('footer');
    footer.innerHTML = `
<footer class="footer">
    <div class="footer-content">
       <h1 class="logo-text"><span>Organic</span> Sunflower</h1>
        <ul class ="footerlist">
            <li class="footer-button">
                <a
                  style="text-decoration: none;"
                  alink="white"
                  vlink="white"
                  >HOME</a>
              </li>
        </ul>                       
      </div>
</footer>    
    `
    return footer;
}

export{
  createFooter
}