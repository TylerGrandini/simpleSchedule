package com.simpleschedule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.simpleschedule.model.Schedule;
import com.simpleschedule.model.User;

public class ScheduleDAO {
	
	String sql = "";
	Connection con = null;
	PreparedStatement pStatament = null;
	ResultSet rSet = null;
	
	public void insertNewContact(Schedule schedule) {		
		
		sql = "INSERT INTO USER(FIRSTNAME, LASTNAME, PRINCIPALPHONENUMBER, OTHERPHONENUMBER, EMAIL) VALUES (?,?,?,?,?);";
		
		try {
			// OPENING THE CONNECTION TO THE DATABASE.
			con = new MySqlConnection().toConnect();
			
			// PREPARING THE QUERY FOR EXECUTION IN THE DATABASE.
			pStatament = con.prepareStatement(sql);
			
			// SUBSTITUTING PARAMETERS(?,?,?,?,?) FOR THE CONTENTS OF THE VARIABLES.
			pStatament.setString(1, schedule.getFirstname());
			pStatament.setString(2, schedule.getLastname());
			pStatament.setString(3, schedule.getPrincipalphonenumber());
			pStatament.setString(4, schedule.getOtherphonenumber());
			pStatament.setString(5, schedule.getEmail());
			
			// EXECUTING THE QUERY.
			pStatament.executeUpdate();
			
			// CLOSING THE CONNECTION TO THE DATABASE.
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}		
	}

	
	public ArrayList<Schedule> listContact() {
		
		sql = "SELECT * FROM USER ORDER BY FIRSTNAME";
		ArrayList<Schedule> allContacts = new ArrayList<>();		
		
		try {
			con = new MySqlConnection().toConnect();
			
			pStatament = con.prepareStatement(sql);
			
			// TEMPORARILY STORING WHAT HAS BEEN RETURNED FROM THE DATABASE IN A VARIABLE.
			rSet = pStatament.executeQuery();
			
			// THE FOLLOWING REPEATING LOOP WILL BE EXECUTED AS LONG AS THERE ARE "CONTACTS".
			while(rSet.next()) {
				// SUPPORT VARIABLES RESPONSIBLE FOR RECEIVING THE DATA COMING FROM THE DATABASE.
				Long usercode = rSet.getLong(1);
				String firstname = rSet.getString(2);
				String lastname = rSet.getString(3);
				String principalphonenumber = rSet.getString(4);
				String otherphonenumber = rSet.getString(5);
				String email = rSet.getString(6);
				
				// STORING EVERYTHING FROM THE DATABASE IN THE ARRAYLIST.
				allContacts.add(new Schedule(usercode,firstname,lastname,principalphonenumber,otherphonenumber,email,null,null,null));
			
			}
			con.close();
			return allContacts;
						
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}		
	}
	
	
	public void selecionarContato(User user) {
		
	}
}