<%@page import="org.hibernate.Criteria"%>
<%@page import="javax.persistence.TypedQuery"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.notes.hbm.DBConnect"%>
<%@page import="com.notes.pojo.Note"%>
<%@page import="org.hibernate.query.Query"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Notes</title>
<%@ include file="all_css.jsp"%>
</head>
<body style="background-color: whitesmoke;">
	<%@ include file="navbar.jsp"%>

	<div class="mx-auto mt-5" style="width:1000px;">
	<p class="fs-1 text-center">All Notes</p>
		<hr>
	
	<%
		Session s = DBConnect.getFactory().openSession();
		Criteria crit = s.createCriteria(Note.class);
	    List<Note> list = crit.list();
	    if(list.size()!= 0){
		for(Note note : list){
			%>
			
			<div class="card my-2">
			<div class="card-header">Created on : <%= note.getDate() %></div>
			<div class="card-body">
				<h5 class="card-title">Title : <%= note.getTitle() %></h5>
				<p class="card-text"><%= note.getMessage() %></p>
				<a href="delete?id=<%= note.getNote_id() %>" class="btn btn-danger">Delete</a>
			</div>
			</div>
		<%
			}
		}
	    else{
	    	%>
	    	<div class="card my-2">
			<div class="card-body">
			<h5 class="card-title">Notes not available</h5>
			</div>
			</div>
			<%
	    }
		%>
	</div>

</body>
</html>