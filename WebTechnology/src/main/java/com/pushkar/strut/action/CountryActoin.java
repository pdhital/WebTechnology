package com.pushkar.strut.action;

import com.opensymphony.xwork2.ActionSupport;

public class CountryActoin extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private String countryName;
	private String capital;
	
	public String execute(){
		return SUCCESS;
	}

	public String getcountryName() {
		return countryName;
	}

	public void setcountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
}
