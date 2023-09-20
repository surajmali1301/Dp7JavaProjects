package com.LabSession_Containment;

public class Country {

	private int countryId;
	private String countryName;

	Country() {

	}

//	Country(int countryId,String countryName,Player p){
//		
//	}
	Country(int countryId, String countryName) {

		this.countryId = countryId;
		this.countryName = countryName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
