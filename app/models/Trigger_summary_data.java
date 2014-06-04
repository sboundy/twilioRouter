package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;

public class Trigger_summary_data extends Model {

	private String subject;

	public String getSubject() {
	return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
