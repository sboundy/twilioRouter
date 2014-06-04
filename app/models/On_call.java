package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import play.db.ebean.*;


public class On_call extends Model {


	private Escalation_policy escalation_policy;
	private Date end;
	private Date start;
	private Integer level;
	private User user ;
	

	
	public Escalation_policy getEscalation_policy() {
		return escalation_policy;
	}

	
	public void setEscalation_policy(Escalation_policy escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

	
	public Date getEnd() {
		return end;
	}

	
	public void setEnd(Date end) {
		this.end = end;
	}

	
	public Date getStart() {
		return start;
	}

	
	public void setStart(Date start) {
		this.start = start;
	}

	
	public Integer getLevel() {
		return level;
	}

	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public User getUser() {
		return user;
		
	}
		
	public void setUser(User user) {
		this.user = user;
			
	}
	
}
