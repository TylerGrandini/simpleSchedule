package com.simpleschedule.model;

public class Schedule extends Contact{
	
	private Long diarycode;
	private String contactdescription; 
	private String contactreason;
	
	
	public Schedule(){
		super();
	}
		
	public Schedule(Long diarycode, String contactdescription, String contactreason) {
		super();
		this.diarycode = diarycode;
		this.contactdescription = contactdescription;
		this.contactreason = contactreason;
	}
	
	public Schedule(Long usercode, String firstname, String lastname, String principalphonenumber, String otherphonenumber,String email, 
			        Long diarycode, String contactdescription, String contactreason) {
		super(usercode, firstname, lastname, principalphonenumber, otherphonenumber, email);
		this.diarycode = diarycode;
		this.contactdescription = contactdescription;
		this.contactreason = contactreason;
	}

	
	public Long getDiarycode() {
		return diarycode;
	}
	public void setDiarycode(Long diarycode) {
		this.diarycode = diarycode;
	}
	
	public String getContactdescription() {
		return contactdescription;
	}
	public void setContactdescription(String contactdescription) {
		this.contactdescription = contactdescription;
	}
	
	public String getContactreason() {
		return contactreason;
	}
	public void setContactreason(String contactreason) {
		this.contactreason = contactreason;
	}	
}