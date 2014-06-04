package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;

public class AccountIncidents extends Model {

	private Integer total;
	private Integer offset;
	private Integer limit;
	private List<Incident> incidents = new ArrayList<Incident>();

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public List<Incident> getIncidents() {
		return incidents;
	}

	public void setIncidents(List<Incident> incidents) {
		this.incidents = incidents;
	}

}