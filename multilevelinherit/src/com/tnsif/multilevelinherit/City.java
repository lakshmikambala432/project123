package com.tnsif.multilevelinherit;

public class City extends State {
	private String Cityname;

	public String getCityname() {
		return Cityname;
	}

	public void setCityname(String cityname) {
		Cityname = cityname;
	}

	@Override
	public String toString() {
		return "City [Cityname=" + Cityname + "]";
	}
	
}
