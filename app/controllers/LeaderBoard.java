package controllers;

import java.util.*;

import models.User;
import play.mvc.Controller;
import utils.UserSocialComparator;

import utils.UserTalkativeComparator;

public class LeaderBoard extends Controller {

	public static void index() {
		String userId = session.get("logged_in_userid");
		if (userId != null) {
			List<User> users = User.findAll();
			render(users);
		} else {
			Accounts.index();
		}
	}

	public static void sortByFriends() {
		List<User> users = User.findAll();
		Collections.sort(users, new UserSocialComparator());
		render(users);

	}

	public static void sortByMessages() {
		List<User> users = User.findAll();
		Collections.sort(users, new UserTalkativeComparator());
		render(users);
	}

}
