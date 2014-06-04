package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;

public class Status_change extends Model {

	private String type;
	private String html_url;
	private String email;
	private String name;
	private String id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
