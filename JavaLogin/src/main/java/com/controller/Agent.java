package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Property;
import com.dao.Usersql;

/**
 * Servlet implementation class Agent
 */
public class Agent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usersql usql = new Usersql();
		Property p = new Property();
		HttpSession session=request.getSession();
		int result = 0;
		p.setPropertyID(Integer.parseInt(request.getParameter("PropertyID")));
		p.setPropertyType(request.getParameter("PropertyType"));
		p.setCity(request.getParameter("City"));
		p.setAvailableDate(request.getParameter("AvailableDate"));
		p.setRooms(Integer.parseInt(request.getParameter("Rooms")));
		p.setAddress(request.getParameter("Address"));
		p.setCrimeRate(request.getParameter("CrimeRate"));
		p.setNeighbourhood(request.getParameter("Neighbourhood"));
		p.setPrice(Integer.parseInt(request.getParameter("Price")));
		p.setNearBySchool(request.getParameter("NearBySchool"));
		p.setExtraFeature(request.getParameter("ExtraFeature"));
		p.setBookStatus(request.getParameter("BookStatus"));
		p.setBookID(Integer.parseInt(request.getParameter("BookID")));
		Integer PropertyID = Integer.parseInt(request.getParameter("PropertyID"));
		try {
			result = usql.insertDatasec(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result != 0) {
			session = request.getSession();
			session.setAttribute("PropertyID",PropertyID);
			RequestDispatcher rd = request.getRequestDispatcher("Agent.jsp");
			rd.forward(request, response);
			
			//System.out.println("Success");	
		} else {
			System.out.println("Fail");
		}

		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
