package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.BookingBean;
import com.connect.Connect;
import com.dao.Usersql;
import java.util.Random;

/**
 * Servlet implementation class Booking
 */
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Booking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookingBean b = new BookingBean();
		Usersql u = new Usersql();
		Random r= new Random();
		
		b.setPropertyId(Integer.parseInt(request.getParameter("propertyID")));
		System.out.println(Integer.parseInt(request.getParameter("propertyID")));
		b.setCardNumber(request.getParameter("cardNumber"));
		b.setStatus("Booked");
		b.setAddress("USA 12345");
		b.setBookingId(r.nextInt(10000));
		
		
		
		
		try {
			u.insertBooking(b);
			request.setAttribute("bookingId", b.getBookingId());
			request.setAttribute("cardNumber",b.getCardNumber());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("BookingConfirmation.jsp");
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
