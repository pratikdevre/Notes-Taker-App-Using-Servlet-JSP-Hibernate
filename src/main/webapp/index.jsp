<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Note Maker App</title>
<%@ include file="all_css.jsp" %>
 <style>
    html,
body {
  height: 100%;
  margin: 0;
}

.background-image {
  background-image: url('bg.jpg');
  background-position: center;
  background-size: cover;
  height: 100%;
}

.overlay {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100%;
  padding: 0 20px;
}

h1 {
  color: #000;
  font-size: 48px;
  text-align: center;
  margin-bottom: 20px;
}

    </style>
</head>
<body>
<%@ include file="navbar.jsp" %>


<!DOCTYPE html>
<html>
  <head>
    <title>Homepage</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    
   

    <div class="background-image" style="height: 95%;">
      <div class="overlay">
        <h1>Welcome to <b>Notes Taker App</b></h1>
        <div>
          <a href="show_notes.jsp" class="btn btn-outline-dark m-3">Show Notes</a>
          <a href="add_note.jsp" class="btn btn-outline-dark m-3">Add Note</a>
        </div>
      </div>
    </div>


</body>
</html>