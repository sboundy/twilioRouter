package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

import pagerDutyIntegration.PagerDutyEscalationPolicy;

public class EscalationPoliciesAndUsers {

	private static EscalationPoliciesAndUsers escalationPoliciesAndUsers = null;
	private static List<EscalationPolicyAndUsers> ePsAUs = new ArrayList();
	
	protected EscalationPoliciesAndUsers() {
	}
	
	public synchronized static EscalationPoliciesAndUsers getInstance() throws IOException, JSONException {
		   if(escalationPoliciesAndUsers == null) {
		      
			   escalationPoliciesAndUsers = new EscalationPoliciesAndUsers();
			   
			   ePsAUs = PagerDutyEscalationPolicy.retrievePolicyAndOnCallUsers();
			   
		   }
		   
		   return escalationPoliciesAndUsers;
		
	}
	
	public List<EscalationPolicyAndUsers> getePsAUs() {
		return ePsAUs;
		}

	public void setePsAUs(List<EscalationPolicyAndUsers> ePsAUs) {
		
		this.ePsAUs = ePsAUs;
	}
	
	
}
