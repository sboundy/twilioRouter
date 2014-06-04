package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;


	public class User extends Model {
		
	    private String id;
	    private String name;
	    private String email;
		private List<On_call> on_calls = new ArrayList<On_call>();
		private List<Contact_Method> contact_methods = new ArrayList<Contact_Method>();
		private Boolean marketing_opt_out;
		private Boolean invitation_sent;
		private String time_zone;
		private String color;
		private String role;
		private String avatar_url;
		private String user_url;

		
		public List<On_call> getOn_call() {
			return on_calls;
		}

	
		public void setOn_call(List<On_call> on_calls) {
			this.on_calls = on_calls;
		}

		
		public List<Contact_Method> getContact_method() {
			return contact_methods;
		}

		
		public void setContact_method(List<Contact_Method> contact_methods) {
			this.contact_methods = contact_methods;
		}

		
		public Boolean getMarketing_opt_out() {
			return marketing_opt_out;
		}

		
		public void setMarketing_opt_out(Boolean marketing_opt_out) {
			this.marketing_opt_out = marketing_opt_out;
		}

		
		public Boolean getInvitation_sent() {
			return invitation_sent;
		}

		
		public void setInvitation_sent(Boolean invitation_sent) {
			this.invitation_sent = invitation_sent;
		}

		
		public String getId() {
			return id;
		}

		
		public void setId(String id) {
			this.id = id;
		}

		
		public String getName() {
			return name;
		}

		
		public void setName(String name) {
			this.name = name;
		}

		
		public String getEmail() {
			return email;
		}

		
		public void setEmail(String email) {
			this.email = email;
		}

		
		public String getTime_zone() {
			return time_zone;
		}

		
		public void setTime_zone(String time_zone) {
			this.time_zone = time_zone;
		}

		
		public String getColor() {
			return color;
		}

		
		public void setColor(String color) {
			this.color = color;
		}

		
		public String getRole() {
			return role;
		}

		
		public void setRole(String role) {
			this.role = role;
		}

	
		public String getAvatar_url() {
			return avatar_url;
		}

		
		public void setAvatar_url(String avatar_url) {
			this.avatar_url = avatar_url;
		}

	
		public String getUser_url() {
			return user_url;
		}

	
		public void setUser_url(String user_url) {
			this.user_url = user_url;
		}
		
}


	
