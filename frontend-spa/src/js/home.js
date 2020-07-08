function bgChanger() {
    if(this.scrollY >this.innerHeight / 1.3){
    document.body.classList.add("bkg");
    }else{
    document.body.classList.remove("bkg");
    }
}

window.addEventListener("scroll", bgChanger);

