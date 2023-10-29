package com.bean;

import java.io.Serializable;

public class Property implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer propertyID;
	private String propertyType;
	private String city;
	private String availableDate;
	private Integer rooms;
	private String address;
	private String crimeRate;
	private String neighbourhood;
	private Integer price;
	private String nearBySchool;
	private String extraFeature;
	private String bookStatus;
	private Integer bookID;

	public Property() {
		this.propertyID = 0;
		this.propertyType = "";
		this.city = "";
		this.availableDate = "";
		this.rooms = 0;
		this.address = "";
		this.crimeRate = "";
		this.neighbourhood = "";
		this.price = 0;
		this.nearBySchool = "";
		this.extraFeature = "";
		this.bookStatus = "";
		this.bookID = 0;
	}

	
	public Property(Integer propertyID, String propertyType, String city, String availableDate, Integer rooms,
			String address, String crimeRate, String neighbourhood, Integer price, String nearBySchool,
			String extraFeature, String bookStatus, Integer bookID) {
		this.propertyID = propertyID;
		this.propertyType = propertyType;
		this.city = city;
		this.availableDate = availableDate;
		this.rooms = rooms;
		this.address = address;
		this.crimeRate = crimeRate;
		this.neighbourhood = neighbourhood;
		this.price = price;
		this.nearBySchool = nearBySchool;
		this.extraFeature = extraFeature;
		this.bookStatus = bookStatus;
		this.bookID = bookID;
	}

	public Integer getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(Integer propertyID) {
		this.propertyID = propertyID;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(String availableDate) {
		this.availableDate = availableDate;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCrimeRate() {
		return crimeRate;
	}

	public void setCrimeRate(String crimeRate) {
		this.crimeRate = crimeRate;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getNearBySchool() {
		return nearBySchool;
	}

	public void setNearBySchool(String nearBySchool) {
		this.nearBySchool = nearBySchool;
	}

	public String getExtraFeature() {
		return extraFeature;
	}

	public void setExtraFeature(String extraFeature) {
		this.extraFeature = extraFeature;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}
}
