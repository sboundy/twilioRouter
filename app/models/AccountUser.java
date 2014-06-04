package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;

public class AccountUser extends Model {
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
