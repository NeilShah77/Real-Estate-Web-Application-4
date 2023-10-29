package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Emp;
import com.dao.Usersql;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Emp e = new Emp();
		 Usersql usql=new Usersql();
		 String[] data=null;
		 HttpSession session=request.getSession();
		 e.setEmail(request.getParameter("email"));
		 e.setPass(request.getParameter("pass"));
		 
		 try
		 {
		 if(usql.userLogin(e))
		 {
			 data=usql.singleView(e);
			 e.setName(data[0]);
			 session.setAttribute("email",e.getEmail());
			 session.setAttribute("name", e.getName());
			 session.setAttribute("password", e.getPass());
			 RequestDispatcher rd = null;
			 if(data[3].equals("Agent")) {
				 rd=request.getRequestDispatcher("Agent.jsp");
			 }else {
				 rd=request.getRequestDispatcher("Renter.jsp");
			 }
			 rd.forward(request, response);
		 }
		 else {
			 response.sendRedirect("login.jsp");
			 session.setAttribute("ErrorMessage","Login Failed");
		 }
	}catch(SQLException ex)
		 {
			ex.printStackTrace();
		 } catch (ClassNotFoundException e1) {
			 e1.printStackTrace();
		 }
		 }

}
