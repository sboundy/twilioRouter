package pagerDutyIntegration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import models.AccountEscalationPolicies;
import models.AccountIncidents;
import models.EscalationPolicyAndUsers;
import models.Escalation_policy;
import models.Incident;
import models.IncidentAndDetails;
import models.On_call;
import models.User;
import models.UserAndDetail;

import org.apache.http.HttpResponse;
import org.json.JSONException;

import com.google.gson.Gson;


public class PagerDutyEscalationPolicy {

	public static List<EscalationPolicyAndUsers> retrievePolicyAndOnCallUsers() throws IOException, JSONException {	
		
		
		
		List<EscalationPolicyAndUsers> escalationPoliciesAndUsers = new ArrayList();
		
		PagerDutyClient pagerDutyClient = new PagerDutyClient();	
		
		HttpResponse response = pagerDutyClient.retrieveEscalationResult();	
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));	
		Gson gson = new Gson();
		
		List<Escalation_policy> escalation_policies = gson.fromJson(rd, AccountEscalationPolicies.class).getEscalation_policies();
	  		
	    for (int i = 0; i < escalation_policies.size(); i++) {
    	    
	    	Escalation_policy escalation_policy = escalation_policies.get(i);
	    	escalationPoliciesAndUsers.add(i, calculateEscalationPolicyAndUsers(escalation_policy));
	    	
	    }
	    
	    return escalationPoliciesAndUsers;
	
	}
	    
	 public static EscalationPolicyAndUsers calculateEscalationPolicyAndUsers(Escalation_policy escalation_policy) throws IOException, JSONException {
		
		EscalationPolicyAndUsers escalationPolicyAndUsers = new EscalationPolicyAndUsers();
		escalationPolicyAndUsers.setPolicyName(escalation_policy.getName());
			
		List<On_call> on_calls = escalation_policy.getOn_call();
		
		List<UserAndDetail> usersAndDetails = new ArrayList<UserAndDetail>();
	
		
		
		for (int j = 0; j < on_calls.size(); j++) {
			
			
			UserAndDetail userAndDetail = PagerDutyOncallPerson.retrieveUserAndDetails(on_calls.get(j).getUser().getId());
			
			
			
			userAndDetail.setEnd(on_calls.get(j).getEnd());
			userAndDetail.setStart(on_calls.get(j).getStart());
			userAndDetail.setLevel(on_calls.get(j).getLevel());
			usersAndDetails.add(userAndDetail);
		
		}
		
		escalationPolicyAndUsers.setUsersAndDetails(usersAndDetails);
		
		return escalationPolicyAndUsers;
		 
	}
	
	
}
