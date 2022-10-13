package com.simpleschedule.model;

public class User {
	private String login;
	private String password;
	private String twofactorauthentication;
	
	
	User(){
		super();
	}
		
	public User(String login, String password, String twofactorauthentication) {
		super();
		this.login = login;
		this.password = password;
		this.twofactorauthentication = twofactorauthentication;
	}
	

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getTwofactorauthentication() {
		return twofactorauthentication;
	}
	public void setTwofactorauthentication(String twofactorauthentication) {
		this.twofactorauthentication = twofactorauthentication;
	}	
}
