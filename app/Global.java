

import java.io.IOException;

import models.EscalationPoliciesAndUsers;
import models.IncidentsAndDetails;

import org.json.JSONException;

import scala.concurrent.duration.Duration;
import pagerDutyIntegration.PagerDutyEscalationPolicy;
import pagerDutyIntegration.PagerDutyIncident;
import play.*;
import play.libs.*;
import play.api.Logger.*;


public class Global extends GlobalSettings  { 

	  	EscalationPoliciesAndUsers escalationPoliciesAndUsers = null;
	
		  public void onStart(Application app) {
  
			  Akka.system().scheduler().schedule(
				        Duration.create(0, "milliseconds"),
				        Duration.create(Play.application().configuration().getLong("application.pagerdutyPollingFrequency"), "seconds"),
				        new Runnable() 
				        {
				            public void run() 
				            {
				                try{
				                	
				                	EscalationPoliciesAndUsers escalationPoliciesAndUsers = EscalationPoliciesAndUsers.getInstance();
				                	
				                	IncidentsAndDetails incidentsAndDetails = IncidentsAndDetails.getInstance();
				   
				                	escalationPoliciesAndUsers.setePsAUs(PagerDutyEscalationPolicy.retrievePolicyAndOnCallUsers());
				                	
				                	incidentsAndDetails.setClosedIncidents(PagerDutyIncident.retrieveIncidents("Closed", 4, true));
				                	
				                	incidentsAndDetails.setAcknowledgedIncidents(PagerDutyIncident.retrieveIncidents("Acknowledged", 0, false));
				                	
				                	incidentsAndDetails.setTriggeredIncidents(PagerDutyIncident.retrieveIncidents("Triggered", 0, false));				                	
          	
				                }
				                catch(IOException e){
				                	
				                	Logger.error("Error trying to retrieve data from Pager Duty: ", e);
				                	
				                }
				                catch(JSONException j){};
				                
				            }
				        },
				        
				        Akka.system().dispatcher());

		  }
	
}
