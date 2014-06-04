package models;

import java.util.ArrayList;
import java.util.List;

import play.db.ebean.*;

import java.util.Date;

public class EscalationPolicyAndUsers extends Model {

	private String policyName;
	private	List<UserAndDetail> usersAndDetails = new ArrayList<UserAndDetail>();
	
	
	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	
	public List<UserAndDetail> getUsersAndDetails() {
		return usersAndDetails;
		}


	public void setUsersAndDetails(List<UserAndDetail> usersAndDetails) {
		this.usersAndDetails = usersAndDetails;
	}
	
}
