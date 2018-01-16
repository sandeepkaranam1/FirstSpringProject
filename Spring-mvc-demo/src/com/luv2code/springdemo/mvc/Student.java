package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	public Student()
	{
		 favoriteLanguageOptions = new LinkedHashMap<>();
		 
		 favoriteLanguageOptions.put("Java", "Java");
	        favoriteLanguageOptions.put("C#", "C#");
	        favoriteLanguageOptions.put("PHP", "PHP");
	        favoriteLanguageOptions.put("Ruby", "Ruby");
	}
	
	//private LinkedHashMap<String, String> countryOptions;
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	public Student()
//	{
//		countryOptions=new LinkedHashMap<>();
//		
//		countryOptions.put("BR","Brazil");
//		countryOptions.put("In","India");
//		countryOptions.put("US","United States");
//	}

	

	
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
