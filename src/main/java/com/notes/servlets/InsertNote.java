package com.notes.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.notes.hbm.DBConnect;
import com.notes.pojo.Note;

import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/insert")
public class InsertNote extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = req.getParameter("title");
		String msg = req.getParameter("note");
		
		Note note = new Note();
		note.setTitle(title);
		note.setMessage(msg);
		note.setDate(new Date());
		
		System.out.println(note);
		Session session = DBConnect.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(note);
		tx.commit();
		session.close();
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<center><h1 style='color:green;'>Data saved successfully.</h1></center>");
		out.println("<center><a href='show_notes.jsp'>View All Notes</a></center>");
	}
}
