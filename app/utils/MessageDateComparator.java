package utils;

import java.util.Comparator;

import models.Message;

public class MessageDateComparator implements Comparator<Message> {

	@Override
	public int compare(Message o1, Message o2) {
		// TODO Auto-generated method stub
		if (o1.dateMessage == null || o2.dateMessage == null)
			;
		{
			return o1.dateMessage.compareTo(o2.dateMessage);
		}

		// return o1.dateMessage.compareTo(o2.dateMessage);
	}

}
