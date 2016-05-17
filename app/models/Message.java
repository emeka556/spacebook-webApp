package models;


import play.db.jpa.*;

import javax.persistence.*;


@Entity
public class Message extends Model
{
	public String messageText;
	
	@ManyToOne
	public User   from;
	
	@ManyToOne
	public User   to;
	
	//public Date dateSent;

	public Message(User from, User to, String messageText)
	  {
	    this.from = from;
	    this.to = to;
	    this.messageText = messageText;
	    
	   // dateSent = new Date();
	  }

}
