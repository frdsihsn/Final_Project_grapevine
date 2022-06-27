//class = template
// instance = 1 copy of the template
//method = function specially for the template

class PostsController {
  constructor(currentId = 0) {
    // constructor only runs once to create new PostsController()
    this.posts = []; // is an array that stores object
    this.currentId = currentId;
  }

  addPosts(post, desc, img, user) {
    const newPost = {
      id: this.currentId,
      post: post,
      desc: desc,
      img: img,
      user: user,
      createdAt: new Date(),
    };
    this.posts.push(newPost);
    this.currentId++;
    // add
    const myArray = this.posts;
    localStorage.setItem("post", JSON.stringify(myArray));
  }
}

// it will display the array as empty, to test whether the class works
var myController = new PostsController(); // 'new' keyword is to run the constructor
loadPostsFromLocalStorage();
function loadPostsFromLocalStorage() {
  const postStorage = JSON.parse(localStorage.getItem("post")) || [];
  myController.posts = postStorage;
  // update current id
  myController.currentId = myController.currentId + postStorage.length;
  console.log(myController);
}
