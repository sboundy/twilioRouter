package models;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

import pagerDutyIntegration.PagerDutyIncident;


public class IncidentsAndDetails {

	private static IncidentsAndDetails incidentsAndDetails = null;
	private static List<IncidentAndDetails> closedIncidents = new ArrayList();
	private static List<IncidentAndDetails> acknowledgedIncidents = new ArrayList();
	private static List<IncidentAndDetails> triggeredIncidents = new ArrayList();
	
		
	protected IncidentsAndDetails() {
	}
		
	public synchronized static IncidentsAndDetails getInstance() throws IOException, JSONException {
		if(incidentsAndDetails == null) {
			      
			incidentsAndDetails = new IncidentsAndDetails();
			
			closedIncidents = PagerDutyIncident.retrieveIncidents("Closed", 4, true);
			acknowledgedIncidents = PagerDutyIncident.retrieveIncidents("Acknowledged", 0, false);
		    triggeredIncidents = PagerDutyIncident.retrieveIncidents("Triggered", 0, false);
			
				   
		}
			   
			return incidentsAndDetails;
			
		}
		
	public List<IncidentAndDetails> getClosedIncidents() {
			return closedIncidents;
		}

	public void setClosedIncidents(List<IncidentAndDetails> closedIncidents) {
			this.closedIncidents = closedIncidents;
	}
		
	public List<IncidentAndDetails> getAcknowledgedIncidents() {
		return acknowledgedIncidents;
	}


	public void setAcknowledgedIncidents(List<IncidentAndDetails> acknowledgedIncidents) {
		this.acknowledgedIncidents = acknowledgedIncidents;
	}
	
	public List<IncidentAndDetails> getTriggeredIncidents() {
		return triggeredIncidents;
	}

	public void setTriggeredIncidents(List<IncidentAndDetails> triggeredIncidents) {
		this.triggeredIncidents = triggeredIncidents;
	}

}
