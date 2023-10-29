package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bean.Emp;
import com.bean.Property;
import com.connect.Connect;
import com.bean.BookingBean;

public class Usersql {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int insertData(Emp e) throws SQLException {
		int result = 0;
		String insertData = "insert into emp values(?,?,?,?,?)";
		con = Connect.dbCon();

		ps = con.prepareStatement(insertData);
		ps.setString(1, e.getName());
		ps.setString(2, e.getEmail());
		ps.setString(3, e.getAddress());
		ps.setString(4, e.getRole());
		ps.setString(5, e.getPass());

		result = ps.executeUpdate();

		con.close();
		return result;
	}
	
	public int insertDatasec(Property p) throws SQLException {
		int result2 = 0;
		String insertDatasec = "insert into property values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		con = Connect.dbCon();

		ps = con.prepareStatement(insertDatasec);
		ps.setInt(1, p.getPropertyID());
		ps.setString(2, p.getPropertyType());
		ps.setString(3, p.getCity());
		ps.setString(4, p.getAvailableDate());
		ps.setInt(5, p.getRooms());
		ps.setString(6, p.getAddress());
		ps.setString(7, p.getCrimeRate());
		ps.setString(8, p.getNeighbourhood());
		ps.setInt(9, p.getPrice());
		ps.setString(10, p.getNearBySchool());
		ps.setString(11, p.getExtraFeature());
		ps.setString(12, p.getBookStatus());
		ps.setInt(13, p.getBookID());
		
		result2 = ps.executeUpdate();

		con.close();
		return result2;
	}

	public boolean userLogin(Emp e) throws SQLException {
		String checkData = "Select * from emp where email=? and pass=?";
		con = Connect.dbCon();

		ps = con.prepareStatement(checkData);
		ps.setString(1, e.getEmail());
		ps.setString(2, e.getPass());

		rs = ps.executeQuery();

		if (rs.next()) {
			return true;
		}
		return false;
	}

	public boolean checkUser(Emp e) throws SQLException {
		String checkData = "Select * from emp where email=? and name=?";
		con = Connect.dbCon();

		ps = con.prepareStatement(checkData);
		ps.setString(1, e.getEmail());
		ps.setString(2, e.getName());

		rs = ps.executeQuery();

		if (!rs.next()) {
			return true;
		}
		return false;
	}
	
	public List<String> getProperty(Property p) throws SQLException{
		List<String> property = new ArrayList<String>();
		int count = 0;
		
		con = Connect.dbCon();
		
		String sql = "select * from property where available_date=? and neighbourhood=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, p.getAvailableDate());
		ps.setString(2, p.getNeighbourhood());
		System.out.println("Date "+ p.getAvailableDate()+ " Hood "+ p.getNeighbourhood());
		rs = ps.executeQuery();
		count = rs.getMetaData().getColumnCount();
	
		System.out.println(count);
		while (rs.next()) {
			//data = new String[count];
			for (int i = 0; i < count; i++) {
				property.add(rs.getString(i + 1));
			}	
			//System.out.println(Arrays.toString(data));
	}
		con.close();
		return property;
	}
	
	public List<Property> getRenterProperty(Property p) throws SQLException{
		List<Property> properties = new ArrayList<Property>();
		
		int count = 0;
		
		con = Connect.dbCon();
		
		String sql = "select * from property where available_date=? and neighbourhood=? and property_id not in(select property_id from booking)";
		ps = con.prepareStatement(sql);
		ps.setString(1, p.getAvailableDate());
		ps.setString(2, p.getNeighbourhood());
		System.out.println("Date "+ p.getAvailableDate()+ " Hood "+ p.getNeighbourhood());
		rs = ps.executeQuery();
	
		System.out.println(count);
		while (rs.next()) {
			//data = new String[count];
			    Property p1= new Property();
				p1.setPropertyID(rs.getInt("property_id"));
				p1.setPropertyType(rs.getString("property_type"));
				p1.setBookStatus(rs.getString("book_status"));
				p1.setAvailableDate(rs.getString("available_date"));
				p1.setPrice(rs.getInt("price"));
				properties.add(p1);
			
			//System.out.println(Arrays.toString(data));
	}
		con.close();
		return properties;
	}
	
	
	
	
	public String[] singleView(Emp e) throws ClassNotFoundException, SQLException {
		String data[] = null;
		int count = 0;

		con = Connect.dbCon();

		String sql = "select * from emp where email=? and pass=?";

		ps = con.prepareStatement(sql);
		ps.setString(1, e.getEmail());
		ps.setString(2, e.getPass());

		rs = ps.executeQuery();
		count = rs.getMetaData().getColumnCount();
		while (rs.next()) {
			data = new String[count];
			for (int i = 0; i < count; i++) {
				data[i] = rs.getString(i + 1);
			}
		}
		con.close();
		return data;
	}
	public int updateData(Emp e) throws SQLException {
		int result = 0;
		String updateData = "update emp set name=?,email=?,address=?,pass=? where email=?";
		con = Connect.dbCon();

		ps = con.prepareStatement(updateData);
		ps.setString(1, e.getName());
		ps.setString(2, e.getEmail());
		ps.setString(3, e.getAddress());
		ps.setString(4, e.getPass());


		result = ps.executeUpdate();

		con.close();
		return result;
	}
	
	public void insertBooking(BookingBean b) throws SQLException{
		String insertData="insert into booking values(?,?,?,?,?)";
		con= Connect.dbCon();
		
		ps=con.prepareStatement(insertData);
		ps.setInt(1, b.getBookingId());
		ps.setString(2, b.getStatus());
		ps.setInt(3, Integer.parseInt(b.getCardNumber()));
		System.out.printf("Inserting the Booking",Integer.parseInt(b.getCardNumber()));
		ps.setString(4,b.getAddress());
		ps.setInt(5,b.getPropertyId());
		
		ps.executeUpdate();
		con.close();
		
	}

}
