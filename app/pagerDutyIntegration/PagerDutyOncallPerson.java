package pagerDutyIntegration;

import models.*;

import org.apache.http.HttpResponse;
import org.json.JSONException;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;




public class PagerDutyOncallPerson {

	
	public static UserAndDetail retrieveUserAndDetails(String id) throws IOException, JSONException {
		
		
		List<UserAndDetail> usersAndDetails = new ArrayList();	
		PagerDutyClient pagerDutyClient = new PagerDutyClient();	
		HttpResponse response = pagerDutyClient.retrieveOnCallResult(id);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));

		Gson gson2 = new Gson();
		
	    UserAndDetail userAndDetails = calculateUserAndDetails(gson2.fromJson(rd, AccountUser.class).getUser());
	    return userAndDetails;
	
	}
	    
	 public static UserAndDetail calculateUserAndDetails(User user){
	    
		 
		 
		  UserAndDetail userAndDetails = new UserAndDetail();
		  userAndDetails.setName(user.getName());
		  List<Contact_Method> all_contact_methods = user.getContact_method();
		  List<On_call> on_calls = user.getOn_call();
		  
		  

		  
		  
		  for (int j=0; j < all_contact_methods.size(); j++) {
			  	
			  Contact_Method contact_method = all_contact_methods.get(j);
			  		  	
			  if(contact_method.getType().equals("email")) {
				
				 
				  userAndDetails.setEmail(contact_method.getAddress());
				  
			  }
			  
			  else if(contact_method.getType().equals("phone")) {
				  
				 
				  String phone =  "+" + contact_method.getCountry_code() + contact_method.getAddress();
				 
				  
				  userAndDetails.setPhone_number(phone);
				  
			  }
			  
			  else if(contact_method.getType().equals("SMS")) {
				  
				  userAndDetails.setSMS_number(contact_method.getAddress());
				  
			  }
			  else {}
			  
		  }
		  
		return userAndDetails;
 	
	 }	 

}
		    
		
	


