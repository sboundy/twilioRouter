package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;

public class Assigned_to_user extends Model {

	private String html_url;
	private String email;
	private String name;
	private String id;

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
