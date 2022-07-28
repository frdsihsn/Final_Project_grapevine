function publishPost() {
  const postList = document.querySelector("#postContainer");
  const img = document.querySelector("#imageURL").value;
  const post = document.querySelector("#userTitle").value;
  const desc = document.querySelector("#userDesc").value;
  const user = document.querySelector("#userName").value;
  myController.addPosts(post, desc, img, user);
}

function publishFromLocalStorage() {
  const storagePost = JSON.parse(localStorage.getItem("post"));
  const postList = document.querySelector("#postContainer");
  postList.innerHTML = "";
  for (let i = 0; i < myController.posts.length; i += 1) {
    const id = storagePost[i].id;
    const img = storagePost[i].img;
    const post = storagePost[i].post;
    const desc = storagePost[i].desc;
    const user = storagePost[i].user;
    postList.innerHTML += ` <div class="col-12 col-sm-6 col-md-6 col-lg-4"> <div class="card bg-dark text-white">
            <img
              src="${img}"
              class="card-img-top img-raised cardImage"
              alt="..."
            />
            <div class="card-img-overlay top-layout cardDesc">
              <h2 class="card-title">${post}</h2>
              <h4 class="card-text">${user}</h4>
              <p class="card-text">${desc}</p>
              <p class="card-text card-time">Last updated 3 mins ago</p>
                 <li class="nav-item dropdown me-auto">
              <a
                class="nav-link dropdown-toggle"
                href="#"
                id="navbarDropdownMenuLink"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                More
              </a>
              <ul
                class="dropdown-menu dropdown-menu-end dropdown-menu-light"
                aria-labelledby="navbarDropdownMenuLink"
              >
                <li><a class="dropdown-item" href="#" onclick="deletePost(${id})">Delete</a></li>
                <li><a class="dropdown-item" href="#">Share</a></li>
                </li>
            </div>
          </div> </div>`;
  }
}

function deletePost(id) {
  myController.delete(id);
}

// function onPost() {
//   myController.addPosts(
//     "kodsakdos",
//     "this is my new website!",
//     "https://cdn.pixabay.com/photo/2014/02/27/16/10/tree-276014_1280.jpg",
//     "George2029"
//   );
//   publishPost();
// }

publishFromLocalStorage();
