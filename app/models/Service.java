package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;

public class Service extends Model {
	
	private java.lang.Object deleted_at;
	private String html_url;
	private String name;
	private String id;

	public java.lang.Object getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(java.lang.Object deleted_at) {
		this.deleted_at = deleted_at;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
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
