package com.notes.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.notes.hbm.DBConnect;
import com.notes.pojo.Note;

import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/delete")
public class DeleteNote extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id"));
		Session session = DBConnect.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		Note note = session.get(Note.class, id);
		session.delete(note);
		tx.commit();
		session.flush();
		session.close();
		
		System.out.println(id);
		resp.sendRedirect("show_notes.jsp");
	}
}
