<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Note</title>
<%@ include file="all_css.jsp"%>
</head>
<body style="background-color: whitesmoke;">
	<%@ include file="navbar.jsp"%>
	<div class="bg-light card p-5 mx-auto my-5" style="width: 1000px;">
		<p class="fs-1 text-center">Write a Note</p>
		<hr>
		<form method="post" action="insert">
			
			<div class="form-group">
				<label for="title">Write title :</label> 
				<input type="text" class="form-control" id="title" name="title" required aria-describedby="emailHelp" placeholder="Enter title"> 
			</div>
			
			 <div class="form-group">
				<label for="note">Write content :</label>
				<textarea class="form-control" name="note" required id="note" rows="5" placeholder="Write here..."></textarea>
			</div>
			<button type="submit" class="btn btn-success">Add Note</button>
			
		</form>
	</div>
</body>
</html>