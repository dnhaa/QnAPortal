<%-- 
    Document   : index
    Created on : May 20, 2022, 9:53:44 PM
    Author     : Admin
--%>

<%@page import="hadn.dto.Posts"%>
<%@page import="java.util.List"%>
<%@page import="hadn.dao.PostsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    

    <link rel="stylesheet" href="css/style.css"/>
    
</head>
  <body>
      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <div class="container">
        <header>
        <div class="row header">
            
            <div class="col-md-3">
                    <img src="images/logo.png" style="height: 44px;"/>              
            </div>
            <div class="col-md-6">
                
                <input type="text" id="txtsearch" placeholder="Search...">
            </div>
            <div class="col-md-3">
                <a href="#">Post</a>
                <a href="#">Noti</a>
                <a href="#">Profile</a>
            </div>
        </div>
    </header>
        <div class="row">
            <div class="col-md-12">
                <a href="https://accounts.google.com/o/oauth2/auth/identifier?client_id=872517996573-61u2am7rk2fi8oeki0m1ga09194njris.apps.googleusercontent.com&redirect_uri=http://localhost:8084/QnAPortal&state=CFP4zgxwc1n9BN2RwQC8&scope=openid%20profile%20email&response_type=code&prompt=consent&access_type=offline&flowName=GeneralOAuthFlow">Click here to sign in with google</a>
            </div>
        </div>
        
        <div class="row">
            <div class="col-md-12">
                <a href="https://accounts.google.com/oauth/oauth20/token">token</a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 sidebar">
                <ul>
                    <li>Homepage</li>
                    <li>Explore</li>
                    <li>Post</li>
                    <li>About</li>
                </ul>
            </div>
            <div class="col-md-6 content">
                <h2>Tags</h2>
                <div class="row">
                    <div class="col-md-3 tag">#java</div>
                    <div class="col-md-3 tag">#python</div>
                    <div class="col-md-3 tag">#nodejs</div>
                </div>
                <%
                    PostsDao dao = new PostsDao();
                    dao.getPosts();
                    List<Posts> listPosts = dao.getListPosts();
                    request.setAttribute("LISTPOSTS", listPosts);
                %>
                
                <c:if test="${not empty requestScope.LISTPOSTS}">
                    <c:forEach var="dto" items="${requestScope.LISTPOSTS}">
                    
                <div class="row">
                    
                    <div class="col-md-2">
                        <div class="upvote">
                            <svg width="36" height="36">
                                <path d="M2 20h32L18 1 2 20z" fill="currentColor" onclick="upvote()"></path>
                              </svg>
                        </div>
                        <div class="downvote">
                            <svg width="36" height="36">
                                <path d="M2 7h32L18 26 2 8z" fill="currentColor" onclick="downvote()"></path>
                              </svg>
                        </div>
                    </div>
                    <div class="col-md-10">
                        <div class="postinfo">
                            <span class="postinfodetail">${dto.votecount} Votes</span>
                            <span class="postinfodetail">${dto.commentcount} Comments</span>
                        </div>
                        <div class="postcontent">
                            <p>${dto.content}</p>
                        </div>
                        <div class="posttag">
                            <span>${dto.tagname}</span>
                        </div>
                        
                    </div>
                    
                </div>
                    </c:forEach>
                </c:if>
            </div>
            <div class="col-md-3">
                <div id="life">Take my life</div>
                <input type="button" value="Take life" onclick="takelife()"/>
                <input type="button" value="Erase existence" onclick="erase()"/>
            </div>
        </div>
         
    </div>
    <form action="MainController">
        <input type="submit" value="x" name="action" />
    </form>
    
    <script src="script/script.js"></script>
</body>
</html>