package models;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import validators.CourseCode;

//import org.hibernate.validator.constraints.NotBlank;(suggested not to use bcz its vendor locked)

public class Student {
	
	
	//validation annotation
	@NotNull(message = "Name is required yar!!")
	private String uname;
	private String email;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	@NotNull(message = "Passes required!!")
	@Max(value=10,message="Max 10 passes only")
	@Min(value=1,message="Min 1 passes required")
	private Integer pass;
	
	
	@CourseCode(code = "CTS")
	private String course;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student() {
		// TODO Auto-generated constructor stub
		// dummy list of countries (can be fetched from DB)
		this.countries = new LinkedHashMap<String, String>();
		this.countries.put("FR", "FRANCE");
		this.countries.put("IN", "INDIA");
		this.countries.put("GR", "GERMANY");
		this.countries.put("US", "USA");
	}
	
	// collection to hold country list
	private LinkedHashMap<String, String> countries;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Integer getPass() {
		return pass;
	}
	public void setPass(Integer pass) {
		this.pass = pass;
	}
	public String getEmail() {

		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		if(this.email == null)
			this.email = "dummy@mail.com";
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	// used by the form
	public LinkedHashMap<String, String> getCountries() {
		return countries; 
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	
}