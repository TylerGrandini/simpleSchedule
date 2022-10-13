package com.simpleschedule.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simpleschedule.dao.ScheduleDAO;
import com.simpleschedule.model.Schedule;

@WebServlet(urlPatterns = {"/ScheduleController", "/Main", "/formContact", "/Select"})
public class ScheduleController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

   	public ScheduleController() {
        super();
    }

   	
   	Schedule schedule = new Schedule();
   	ScheduleDAO scheduleDAO = new ScheduleDAO();
   	
   	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Action = request.getServletPath();
		
		if(Action.equals("/Main")) {	
			contactList(request,response);
		}else if(Action.equals("/formContact")) {
			newContact(request,response);
		}else if(Action.equals("/Select")) {
			editContact(request,response);
		}else {
			response.sendRedirect("Index.html");
		}	
	}
		
 	
	protected void newContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// SETTING THE DATA FROM "NEWCONTACT.JSP" TO "SCHEDULE.JAVA".
		schedule.setFirstname(request.getParameter("firstname"));
		schedule.setLastname(request.getParameter("lastname"));
		schedule.setPrincipalphonenumber(request.getParameter("principalphonenumber"));
		schedule.setOtherphonenumber(request.getParameter("otherphonenumber"));
		schedule.setEmail(request.getParameter("email"));

		// INVOKING THE METHOD "INSERTINCONTACT" PASSING TO "SCHEDULE" OBJECT.
		scheduleDAO.insertNewContact(schedule);
		
		// ANNOTATION(1)
		// REDIRECTING TO "DASHBOARDSCHEDULE.JSP".
		response.sendRedirect("Main");
	}
	
	
	protected void contactList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ANNOTATION(2)
		// Criando um objeto que irá receber os dados user
		ArrayList<Schedule> list = scheduleDAO.listContact();
		
		// FORWARDING THE "LIST" TO "DASHBOARDSCHEDULE.JSP".
		request.setAttribute("contactList", list);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("DashboardSchedule.jsp");
		reqDispatcher.forward(request, response);
	}
	
	
	@SuppressWarnings("deprecation")
	private void editContact(HttpServletRequest request, HttpServletResponse response) {
			
		//RECEIVING THE ID OF THE CONTACT THAT WILL BE EDITED IN THE VARIABLE "USERCODE".
		String usercode = request.getParameter("usercode");
		schedule.setUsercode(new Long (usercode));
	}
}