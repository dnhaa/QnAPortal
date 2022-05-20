function takelife(){
    var life = document.getElementById('life').innerHTML;
    console.log(life);
    alert('We have claimed ' + life);
}
function erase(){
    document.getElementById('life').innerHTML = 'You don\'t exist';
}

// for (const btn of document.querySelectorAll('.downvote')) {
//     btn.addEventListener('click', event => {
//       document.getElementsByClassName('upvote')[0].classList.toggle('off');
//       event.currentTarget.classList.toggle('on');
//     });
//   }
// for (const btn of document.querySelectorAll('.upvote')) {
//     btn.addEventListener('click', event => {
//       document.getElementsByClassName('downvote')[0].classList.toggle('off');
//       event.currentTarget.classList.toggle('on');
//     });
//   }

function downvote(){
  document.getElementsByClassName('downvote')[0].classList.toggle('on');
  if (document.getElementsByClassName('upvote')[0].classList.contains('on')){
    document.getElementsByClassName('upvote')[0].classList.toggle('on');
  }
}
function upvote(){
  document.getElementsByClassName('upvote')[0].classList.toggle('on');
  if ( document.getElementsByClassName('downvote')[0].classList.contains('on')){
    document.getElementsByClassName('downvote')[0].classList.toggle('on');
  }
}
  