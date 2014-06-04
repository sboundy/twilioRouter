package pagerDutyIntegration;

import models.*;

import org.apache.http.HttpResponse;
import org.json.JSONException;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PagerDutyIncident {

	public static List<IncidentAndDetails> retrieveIncidents(String incidentType, Integer sinceDate, Boolean isClosed) throws IOException, JSONException {
			
		List<IncidentAndDetails> incidentAndDetails = new ArrayList();		
		PagerDutyClient pagerDutyClient = new PagerDutyClient();	
		HttpResponse response = pagerDutyClient.retrieveIncidentResult(incidentType, sinceDate);	
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
		Gson gson = new Gson();   
		List<Incident> incidents = gson.fromJson(rd, AccountIncidents.class).getIncidents();
	    	
	    if(isClosed){
	    	
	    	for (int i = 0; i < incidents.size(); i++) {
	    	    
	    		Incident incident = incidents.get(i);
	    		incidentAndDetails.add(i, calculateIncAndDetails(incident));
			
	    	}
	    	
	    }
	    
	    else{
	    
	    	for (int i = 0; i < incidents.size(); i++) {
    	    
	    		Incident incident = incidents.get(i);
	    		incidentAndDetails.add(i, calculateIncidentAndDetails(incident));
			
	    	}
	    }
	    return incidentAndDetails;
	
	}

//public static List<UserAndDetails> retrieveClosedIncidents() throws IOException, JSONException {

//}
	public static IncidentAndDetails calculateIncAndDetails(Incident incident) {
		
		IncidentAndDetails incidentAndDetails = new IncidentAndDetails();
		
		if(incident.getLast_status_change_by() != null){
		
			incidentAndDetails.setname(incident.getLast_status_change_by().getName());
		};
		
		incidentAndDetails.setsubject(incident.getTrigger_summary_data().getSubject());
		incidentAndDetails.setcreated_on(incident.getLast_status_change_on());
		incidentAndDetails.setgroupAssignedTo(incident.getEscalation_policy().getName());	
		return incidentAndDetails;
		
	
	}
	
	
	
	public static IncidentAndDetails calculateIncidentAndDetails(Incident incident) {
		
		IncidentAndDetails incidentAndDetails = new IncidentAndDetails();
		
		
		
			incidentAndDetails.setname(incident.getAssigned_to_user().getName());
		
		incidentAndDetails.setsubject(incident.getTrigger_summary_data().getSubject());
		incidentAndDetails.setcreated_on(incident.getCreated_on());
		//incidentAndDetails.setat(incident.getAssigned_to());	
		return incidentAndDetails;
		
	
	}
	
	
}
