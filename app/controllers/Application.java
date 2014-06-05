package controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.json.JSONException;

import models.EscalationPoliciesAndUsers;
import play.*;
import play.mvc.*;
import play.mvc.BodyParser.Xml;
import views.html.*;

public class Application extends Controller {

	@BodyParser.Of(Xml.class)
	public static Result index() throws IOException, JSONException {
			
			 	
			EscalationPoliciesAndUsers escalationPoliciesAndUsers = EscalationPoliciesAndUsers.getInstance();
			
			if(request().getQueryString("secretKey") != null) {
			
				if(request().getQueryString("secretKey").equals(Play.application().configuration().getString("application.secretKey"))){
					
					
					String responseXML = "<Response><Dial><Number>" + escalationPoliciesAndUsers.getePsAUs().get(0).getUsersAndDetails().get(0).getPhone_Number() + "</Number></Dial></Response>";
					//TODO - pull correct user iteration from pagerduty
					return ok(responseXML).as("text/xml");
				}
				else {
				
					return ok("error, no secret key provided");
				}
			}
			else{	
				return ok("error, no secret key provided");
			
			}
					
				
		}

}
