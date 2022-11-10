package com.hibernate;

public class Address {
	private String hno;
	private String area;
	private String city;
	public Address(String hno, String area, String city) {
		super();
		this.hno = hno;
		this.area = area;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + "]";
	}
}