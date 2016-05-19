package utils;

import java.util.Comparator;

import models.Message;

public class MessageFromComparator implements Comparator<Message> {
	/**
	 * Compares the String name of the sender (user from) in both Message object
	 * 
	 * @param arg0
	 *            1st message object
	 * @param arg1
	 *            is the 2nd Message object
	 * 
	 */
	@Override
	public int compare(Message arg0, Message arg1) {
		// TODO Auto-generated method stub
		String arg0_Name = arg0.from.firstName + arg0.from.lastName;
		String arg1_Name = arg0.from.firstName + arg0.from.lastName;
		return arg0_Name.compareTo(arg1_Name);
	}

}
