const fetchArtists = async () => {
  return fetch("http://localhost:8080/api/artists").then((response) =>
    response.json()
  );
};

const postNewArtist = async (artist) => {
  return fetch("http://localhost:8080/api/artists/add/", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(artist),
  }).then((response) => response.json());
};

const postNewAlbum = async (album, artist) => {
  return fetch(`http://localhost:8080/api/artists/${artist.id}/addalbum/`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(album),
  }).then((response) => response.json());
};

const postNewSong = async (song, album) => {
  return fetch(`http://localhost:8080/api/albums/${album.id}/addsong/`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(song),
  }).then((response) => response.json());
};

const removeArtist = async (artist) => {
  return fetch(`http://localhost:8080/api/artists/${artist.id}/remove/`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  }).then((response) => response.json());
};

const deleteAlbum = async (album) => {
  return fetch(`http://localhost:8080/api/albums/${album.id}/`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  }).then((response) => response.json());
};

const deleteSong = async (song) => {
  return fetch(`http://localhost:8080/api/songs/${song.id}/`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  }).then((response) => response.json());
};

export {
  fetchArtists,
  postNewArtist,
  postNewAlbum,
  postNewSong,
  removeArtist,
  deleteAlbum,
  deleteSong,
};
