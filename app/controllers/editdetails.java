package controllers; 
 
 
 import play.*; 
 import play.mvc.*; 
 

 import java.util.*; 
 
 
 import models.Message; 
 import models.User; 
 
 
 import java.util.List; 
 import java.util.ArrayList; 
 
 
 import javax.persistence.OneToMany; 
 import javax.persistence.Entity; 
 

 import controllers.Home; 
 import play.Logger; 
 import play.db.jpa.Model; 
 import play.db.jpa.Blob; 
 
 
 public class editdetails extends Controller 
 { 
 	public static void index() 
 	  { 
 		String userId = session.get("logged_in_userid"); 
 	     
 	    if(userId != null) 
 	    { 
 	    	render(); 
 	    } 
 
 
 	    else 
	    { 
 	    	Accounts.redirect(); 
 	    } 
 	  } 
 	  	public static void changeDetails(String firstName, String lastName, String email, String password, int age, String nationality) 
 	  { 
 	    Logger.info("New details are: " + firstName + " " + lastName + " " + email + " " + password + " " + age + " " + nationality + " "); 
	    String userId = session.get("logged_in_userid"); 
	    User user = User.findById(Long.parseLong(userId)); 
	    user.firstName = firstName; 
	    user.lastName = lastName; 
 	    user.email = email;  
 	    user.password = password;  
 	    user.age = age;  
 	    user.nationality = nationality; 
 	    user.findById(Long.parseLong(userId)); 
 	    user.save(); 
 	    Home.index(); 
 	  } 
 } 
