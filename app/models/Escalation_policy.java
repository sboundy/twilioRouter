package models;

import java.util.ArrayList;
import java.util.List;

import play.db.ebean.*;


public class Escalation_policy extends Model {


	private String name;
	private String id;
	private List<On_call> on_call = new ArrayList<On_call>();
	private String description;
	private Integer num_loops;
	private List<Service> services = new ArrayList<Service>();
	private List<Escalation_rule> escalation_rules = new ArrayList<Escalation_rule>();
	
	

	public List<On_call> getOn_call() {
	return on_call;
	}


	public void setOn_call(List<On_call> on_call) {
	this.on_call = on_call;
	}
	

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}
	
	public Integer getNum_loops() {
		return num_loops;
	}
	
	
	public void setNum_loops(Integer num_loops) {
	this.num_loops = num_loops;
	}
	

	public List<Service> getServices() {
	return services;
	}


	public void setServices(List<Service> services) {
	this.services = services;
	}
	
	public List<Escalation_rule> getEscalation_rules() {
		return escalation_rules;
	}


		public void setEscalation_rules(List<Escalation_rule> escalation_rules) {
		this.escalation_rules = escalation_rules;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
}





























