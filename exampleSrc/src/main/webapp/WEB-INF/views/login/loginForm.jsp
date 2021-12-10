<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Login form using Material Design - Demo by W3lessons</title>
  <!-- CORE CSS-->
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">

<style type="text/css">
html,
body {
    height: 100%;
}
html {
    display: table;
    margin: auto;
}
body {
    display: table-cell;
    vertical-align: middle;
}
.margin {
  margin: 0 !important;
}
</style>
  
</head>

<body class="red">
  <div id="login-page" class="row">
    <div class="col s12 z-depth-6 card-panel">
      <form class="login-form" action="loginProcess" method="post">
        <div class="row">
          <div class="input-field col s12 center">
            <img src="http://w3lessons.info/logo.png" alt="" class="responsive-img valign profile-image-login">
            <p class="center login-form-text">W3lessons - Material Design Login Form</p>
          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-social-person-outline prefix"></i>
            <input class="validate" id="email" type="text" name="id">
            <label for="email" data-error="wrong" data-success="right" class="center-align">ID</label>
          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-action-lock-outline prefix"></i>
            <input id="password" type="password" name="pwd">
            <label for="password">Password</label>
          </div>
        </div>
       
        <div class="row">
          <div class="input-field col s12">
          	<input type="submit" value="Login"> 
            <!--  <a href="login.html" class="btn waves-effect waves-light col s12">Login</a>-->
          </div>
        </div>
        <div class="row">
          <div class="input-field col s6 m6 l6">
            <p class="margin medium-small"><a href="register.html">Register Now!</a></p>
          </div>
                 
        </div>

      </form>
    </div>
  </div>

  

   <footer class="page-footer">
          <div class="footer-copyright">
            <div class="container">
            © 2015 W3lessons.info
            <a class="grey-text text-lighten-4 right" href="http://w3lessons.info">Karthikeyan K</a>
            </div>
          </div>
  </footer>
</body>

</html>