package pagerDutyIntegration;

import play.*;
import models.*;
import play.mvc.*;
import play.libs.WS;
import play.mvc.Result;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.client.utils.*;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.chrono.ISOChronology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class PagerDutyClient extends Controller {
	
	Chronology chrono = ISOChronology.getInstance();
	DateTime dt = new DateTime(chrono);
	
	private String pagerDutyDomain = Play.application().configuration().getString("application.pagerDutyDomain");
	private String pagerDutytoken =  Play.application().configuration().getString("application.pagerDutytoken");
	
	private String pagerDutytokenString = "Token token=" + pagerDutytoken;
	
	private String onCallUrl = pagerDutyDomain + "/api/v1/users/";
	private String triggeredIncidentUrl = pagerDutyDomain + "/api/v1/incidents?status=triggered";
	private String acknowledgedIncidentUrl = pagerDutyDomain + "/api/v1/incidents?status=acknowledged";
	private String typeOfEscalationResult = pagerDutyDomain + "/api/v1/escalation_policies/on_call?query=WebSys";
	private String resolvedIncidentUrl = pagerDutyDomain + "/api/v1/incidents?status=resolved";
	
	private String url = new String();
	
	public HttpResponse retrieveOnCallResult(String userID) throws IOException {
	    
		//try+catch
		
	    HttpClient client = new DefaultHttpClient();
	    HttpGet request = new HttpGet(onCallUrl+ userID + "/on_call?include[]=contact_methods");    
	    request.addHeader("Authorization", pagerDutytokenString);
	    HttpResponse response = client.execute(request);
	    return response;
	    
	}

	public HttpResponse retrieveIncidentResult(String typeOfIncident, Integer sinceDate) throws IOException {
		
		//use case type here and also use
		if(typeOfIncident.equals("Triggered")){
			
			url = triggeredIncidentUrl;
		}
		else if(typeOfIncident.equals("Acknowledged")){
			
			url = acknowledgedIncidentUrl;
		
		}
		else if(typeOfIncident.equals("Closed")){

			url = resolvedIncidentUrl + "&since=" + dt.minusDays(sinceDate).toString();
			
		}
			
		else {
			
			//throw error
			
		}	
		
		HttpClient client = new DefaultHttpClient();
	    HttpGet request = new HttpGet(url);    
	    request.addHeader("Authorization", pagerDutytokenString);
	    HttpResponse response = client.execute(request);
	    return response;
		
	}
	
   public HttpResponse retrieveEscalationResult() throws IOException {
	   
	   	HttpClient client = new DefaultHttpClient();
	    HttpGet request = new HttpGet(typeOfEscalationResult);
	    request.addHeader("Authorization", pagerDutytokenString);
	    HttpResponse response = client.execute(request);
	    return response;
	    
	}
   
   
	  
}
