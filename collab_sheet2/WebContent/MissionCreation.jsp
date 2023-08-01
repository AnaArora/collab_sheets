<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mission Creation</title>
<link rel="stylesheet" href="style/mission.css">
<link rel="icon"  href="favicon.ico" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<script>
var subjectObject = {
  "Australia (AUS)": {
    "HTML", "CSS", "JavaScript"   
  },
  "Bangladesh (BGD)": {
    "PHP": ["Variables", "Strings", "Arrays"],
    "SQL": ["SELECT", "UPDATE", "DELETE"]
  }
  "Pakistan(PAK)":{
	  "Surat", "Punjab", " Kashmir", ";"
  }
}
window.onload = function() {
  var coutnrySel = document.getElementById("country-name");
  var missionSel = document.getElementById("mission");
  
  for (var x in subjectObject) {
    countrySel.options[countrySel.options.length] = new Option(x, x);
  }
  subjectSel.onchange = function() {
    //empty Chapters- and Topics- dropdowns
    
    missionSel.length = 1;
    //display correct values
    for (var y in subjectObject[this.value]) {
      topicSel.options[topicSel.options.length] = new Option(y, y);
    }
  }
  missionSel.onchange = function() {
    //empty Chapters dropdown
    
    //display correct values
   
  }
}
</script>

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
<main>
<div class="row p-5">
<div class="d-flex align-items-start">
  <div class="nav flex-column nav-pills me-3 col-lg-3" id="v-pills-tab" role="tablist" aria-orientation="vertical">
    <button class="nav-link active" id="v-pills-home-tab" data-bs-toggle="pill" data-bs-target="#v-pills-home" type="button" role="tab" aria-controls="v-pills-home" aria-selected="true">Create Mission</button>
    <button class="nav-link" id="v-pills-profile-tab" data-bs-toggle="pill" data-bs-target="#v-pills-profile" type="button" role="tab" aria-controls="v-pills-profile" aria-selected="false">Create User</button>
    
  </div>
  <div class="tab-content col-lg-12" id="v-pills-tabContent">
    <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">
    <div class="">
    <h1>Mission Creation Form</h1>
<form action="submit.jsp" method="post">
Country Name: <select name="country-name" id="country-name">
    <option value="" selected="selected">Select Country</option>
  </select>
  <br><br>
Mission Name: <select name="mission" id="mission">
    <option value="" selected="selected">Please select country first</option>
  </select>
  <br><br>

</form>
</div>
    </div>
    <div class="tab-pane fade" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab">...</div>
    
  </div>
</div>
</div>
</main>

<footer>
<p>&copy;Copyright 2023 Government of India</p>
</footer>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>