/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//this function will be developed later
function takelife(){
    var life = document.getElementById('life').innerHTML;
    console.log(life);
    alert('We have claimed ' + life);
}
function erase(){
    document.getElementById('life').innerHTML = 'You don\'t exist';
}


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
function openlogin(){
    document.getElementsByClassName('login')[0].style.display="";
}
function closelogin(){
    document.getElementsByClassName('login')[0].style.display="none";
}