package com.simpleschedule.model;

public abstract class Contact {
	
	private Long usercode;
	private String firstname;
	private String lastname;
	private String principalphonenumber;
	private String otherphonenumber;
	private String email;
		
	
	public Contact(){
		super();
	}
		
	public Contact(Long usercode, String firstname, String lastname, String principalphonenumber, String otherphonenumber,String email) {
		super();
		this.usercode = usercode;
		this.firstname = firstname;
		this.lastname = lastname;
		this.principalphonenumber = principalphonenumber;
		this.otherphonenumber = otherphonenumber;
		this.email = email;
	}

	
	public Long getUsercode() {
		return usercode;
	}
	public void setUsercode(Long usercode) {
		this.usercode = usercode;
	}
		
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
		
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
		
	public String getPrincipalphonenumber() {
		return principalphonenumber;
	}
	public void setPrincipalphonenumber(String principalphonenumber) {
		this.principalphonenumber = principalphonenumber;
	}
		
	public String getOtherphonenumber() {
		return otherphonenumber;
	}
	public void setOtherphonenumber(String otherphonenumber) {
		this.otherphonenumber = otherphonenumber;
	}
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}