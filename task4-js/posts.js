function publishPost() {
  const postList = document.querySelector("#postContainer");
  const img = myController.posts[0].img;
  const post = myController.posts[0].post;
  const desc = myController.posts[0].desc;
  const user = myController.posts[0].user;
  postList.innerHTML += ` <div class="col-4"> <div class="card bg-dark text-white">
            <img
              src="${img}"
              class="card-img cardImage"
              alt="..."
            />
            <div class="card-img-overlay cardDesc">
              <h5 class="card-title">${post}</h5>
              <p class="card-text">${user}</p>
              <p class="card-text">${desc}</p>
              <p class="card-text">Last updated 3 mins ago</p>
            </div>
          </div> </div>`;
}

function publishFromLocalStorage() {
  const storagePost = JSON.parse(localStorage.getItem("post"));
  const postList = document.querySelector("#postContainer");
  for (let i = 0; i < myController.posts.length; i += 1) {
    const img = storagePost[i].img;
    const post = storagePost[i].post;
    const desc = storagePost[i].desc;
    const user = storagePost[i].user;
    postList.innerHTML += ` <div class="col-4"> <div class="card bg-dark text-white">
            <img
              src="${img}"
              class="card-img cardImage"
              alt="..."
            />
            <div class="card-img-overlay cardDesc">
              <h5 class="card-title">${post}</h5>
              <p class="card-text">${user}</p>
              <p class="card-text">${desc}</p>
              <p class="card-text">Last updated 3 mins ago</p>
            </div>
          </div> </div>`;
  }
}

function onPost() {
  myController.addPosts(
    "kodsakdos",
    "this is my new website!",
    "https://cdn.pixabay.com/photo/2014/02/27/16/10/tree-276014_1280.jpg",
    "George2029"
  );
  publishPost();
}

publishFromLocalStorage();
