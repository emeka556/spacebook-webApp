package models;

import play.db.jpa.*;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Message extends Model {
	public String messageText;

	@ManyToOne
	public User from;

	@ManyToOne
	public User to;

	public Date dateMessage;

	public Message(User from, User to, String messageText) {
		this.from = from;
		this.to = to;
		this.messageText = messageText;

		dateMessage = new Date();
		pause();

	}

	private void pause() {
		try {
			Thread.sleep(15);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
