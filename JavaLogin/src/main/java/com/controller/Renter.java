package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Property;
import com.connect.Connect;
import com.dao.Usersql;

/**
 * Servlet implementation class Renter
 */
public class Renter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Renter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Property p = new Property();
		Usersql u = new Usersql();
		p.setAvailableDate(request.getParameter("AvailableDate"));
		p.setNeighbourhood(request.getParameter("Neighbourhood"));
		
		try {
			
			
			 //List<String> products = u.getProperty(p).toString();
		    request.setAttribute("properties", u.getRenterProperty(p)); // Will be available as ${products} in JSP
		    request.getRequestDispatcher("ShowProperties.jsp").forward(request, response);
			System.out.println(u.getProperty(p));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
