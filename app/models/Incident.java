package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;
import java.util.Date;

public class Incident extends Model {
	
	private List<Object> assigned_to = new ArrayList<Object>();
	private Integer number_of_escalations;
	private Status_change last_status_change_by;
	private Date last_status_change_on;
	private String trigger_type;
	private String trigger_details_html_url;
	private Trigger_summary_data trigger_summary_data;
	private Assigned_to_user assigned_to_user;
	private String id;
	private Integer incident_number;
	private Date created_on;
	private String status;
	private String html_url;
	private String incident_key;
	private Service service;
	private Escalation_policy escalation_policy;

	public List<Object> getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(List<Object> assigned_to) {
		this.assigned_to = assigned_to;
	}

	public Integer getNumber_of_escalations() {
		return number_of_escalations;
	}

	public void setNumber_of_escalations(Integer number_of_escalations) {
		this.number_of_escalations = number_of_escalations;
	}

	public Status_change getLast_status_change_by() {
		return last_status_change_by;
	}

	public void setLast_status_change_by(Status_change last_status_change_by) {
		this.last_status_change_by = last_status_change_by;
	}

	public Date getLast_status_change_on() {
		return last_status_change_on;
	}

	public void setLast_status_change_on(Date last_status_change_on) {
		this.last_status_change_on = last_status_change_on;
	}

	public String getTrigger_type() {
		return trigger_type;
	}

	public void setTrigger_type(String trigger_type) {
		this.trigger_type = trigger_type;
	}

	public String getTrigger_details_html_url() {
		return trigger_details_html_url;
	}

	public void setTrigger_details_html_url(String trigger_details_html_url) {
		this.trigger_details_html_url = trigger_details_html_url;
	}

	public Trigger_summary_data getTrigger_summary_data() {
		return trigger_summary_data;
	}

	public void setTrigger_summary_data(Trigger_summary_data trigger_summary_data) {
		this.trigger_summary_data = trigger_summary_data;
	}

	public Assigned_to_user getAssigned_to_user() {
		return assigned_to_user;
	}

	public void setAssigned_to_user(Assigned_to_user assigned_to_user) {
		this.assigned_to_user = assigned_to_user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getIncident_number() {
		return incident_number;
	}

	public void setIncident_number(Integer incident_number) {
		this.incident_number = incident_number;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public String getIncident_key() {
		return incident_key;
	}

	public void setIncident_key(String incident_key) {
		this.incident_key = incident_key;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Escalation_policy getEscalation_policy() {
		return escalation_policy;
	}

	public void setEscalation_policy(Escalation_policy escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

}
