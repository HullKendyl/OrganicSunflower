const clearElementChildren = element => {
    while (element.firstChild) {
        element.firstChild.remove();
    }
}

export {
    clearElementChildren
}