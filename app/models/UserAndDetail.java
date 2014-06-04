package models;

import play.db.ebean.*;
import java.util.Date;

public class UserAndDetail extends Model {

	private String name;
	private Date end;
	private Date start;
	private String phone_number;
	private String email;
	private String sms_number;
	private Integer level;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
		
	}
	
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getPhone_Number(){
		return phone_number;
				
	}
	
	public void setSMS_number(String sms_number) {
		this.sms_number = sms_number;
		
	}
	
	public String getSMS_number() {
		return sms_number;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
		
}
