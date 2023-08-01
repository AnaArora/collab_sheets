<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>LOGIN PAGE</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  <!-- <link rel="stylesheet" type="text/css" href="style/style.css" /> -->	
  <link rel="stylesheet" type="text/css" href="style/mission.css" />
  	<link rel="icon"  href="favicon.ico" />
  </head>
  <body>
  <header>
<nav>
<img src=" emblem.png" alt="India Emblem" style="float:left;width:100px;height:100px;">
<img src="nic.png" alt="NIC Logo" style="float:left;width:100px;height:100px;">
<a href="home.jsp">Home</a>
<a href="about.jsp">About</a>
<a href="contact.jsp">Contact Us</a>
</nav>
</header>
 
 <center><h1>COLLABORATIVE SHEET LOGIN</h1></center><br>
  
  <div class="container"><br>
  <table>
  	  <div class="col-4">
    <form method="post" action="account">
  <div class="mb-3">
    <label for="username" class="form-label">Email address</label>
    <input type="email" class="form-control" name="ename" id="username">
    
  </div>
  <div class="mb-3">
    <label for="pass" class="form-label">Password</label>
    <input type="password" class="form-control" name="pass" id="pass" pattern="[A-Za-z0-9^0-9]*{8,14}">
  </div>
  <br/>
  
  <div class="captcha">
     <img  src="captcha-image">
     <label for="captcha-input">Enter Captcha </label>
     
     <div class="preview"></div>
     <div class="captcha-form">
       <input type="text" name="captcha-form" id="captcha-form" placeholder="Enter Captcha">
       ${error }
     </div>
   </div>
    <br/>
   
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
  
  </table>
  
  <div class="row"></div>
  <div class="col-2"></div>

<div class="col-4"></div>
<div class="col-2"></div>
</div>
<footer>
<p>&copy;Copyright Ministry Of External Affairs 2023<br>   Government of India</p>
</footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  </body>
</html>




