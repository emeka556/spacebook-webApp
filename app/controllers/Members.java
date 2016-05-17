package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Members extends Controller
{
  public static void index()
  {
    List<User> users = User.findAll();
    
    String userId = session.get("logged_in_userid"); //story 5
    		if (userId != null) { 
     			User user = User.findById(Long.parseLong(userId)); 
     
     
     			users.remove(user); //object (the user logged in) deleted from the list
     			render(users); 
     			 
     		} else { 
     			Accounts.index(); 
     		} 

  }
  
  public static void follow(Long id)
  {
    User friend = User.findById(id);
    
    String userId = session.get("logged_in_userid");
    User me = User.findById(Long.parseLong(userId));
    
    me.befriend(friend);
    Home.index();
  }
  public static void logger(String name) { 
	   		Logger.info("Following " + name); 
	   		Home.index(); 
	   	} 

}