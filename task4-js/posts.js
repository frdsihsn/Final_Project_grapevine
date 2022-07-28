function publishPost() {
  const postList = document.querySelector("#postContainer");
  const img = document.querySelector("#imageURL").value;
  const post = document.querySelector("#userTitle").value;
  const desc = document.querySelector("#userDesc").value;
  const user = document.querySelector("#userName").value;
  myController.addPosts(post, desc, img, user);
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
            </div>
          </div> </div>`;
  }
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
