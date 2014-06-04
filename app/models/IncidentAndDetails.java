package models;

import java.util.Date;
import java.util.List;

import play.db.ebean.Model;

public class IncidentAndDetails extends Model{

	private String name;
    private Date at;
    private Date created_on;
    private String subject;
    private String assignedGroup;
	
    public String getname() {
    	return name;
    }
    
    public void setname(String name) {
    	this.name = name;	
    }
    public Date getat() {
    	return at;
    }
    
    public void setat(Date at) {
    	this.at = at;	
    }
    public Date getcreated_on() {
    	return created_on;
    }
    
    public void setcreated_on(Date created_on) {
    	this.created_on = created_on;	
    }
    public String getsubject() {
    	return subject;
    }
    
    public void setsubject(String subject) {
    	this.subject = subject;	
    }
    
    public String getgroupAssignedTo() {
    	return assignedGroup;	
	}
    
    public void setgroupAssignedTo(String assignedGroup) {
    	this.assignedGroup = assignedGroup;	
	}
    
}
