package com.rakesh.jpamap.dto;

public enum Gender {

	Male("Male"),
	Female("Female");
	
	private String gender;
	
	private Gender(String gender){
		this.gender=gender;
	}

	public String getGender() {
		return gender;
	}

	
	
}
