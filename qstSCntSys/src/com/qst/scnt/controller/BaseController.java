package com.qst.scnt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.qst.scnt.model.UserInfo;

public class BaseController   {

	private UserInfo CurrentUser;	

	@Autowired  
    private HttpSession session;  
      
    @Autowired  
    private HttpServletRequest request; 
    
    public UserInfo getCurrentUser() {
		//HttpSession httpSession= request.getSession();
	    System.out.println((UserInfo)session.getAttribute("currentUser"));
	    UserInfo CurrentUser=(UserInfo) session.getAttribute("currentUser");
		return CurrentUser;
	}
    public void setCurrentUser(UserInfo currentUser) {
		CurrentUser = currentUser;
	}
}
