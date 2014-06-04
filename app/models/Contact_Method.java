package models;

import play.db.ebean.*;


public class Contact_Method extends Model {


private Boolean send_short_email;
private String email;
private String type;
private String user_id;
private String address;
private String label;
private String id;
private String phone_number;
private Integer country_code;
private String created_at;
private String device_type;
private String device_token;



	public Boolean getSend_short_email() {
		return send_short_email;
	}


	public void setSend_short_email(Boolean send_short_email) {
		this.send_short_email = send_short_email;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public Integer getCountry_code() {
		return country_code;
	}


	public void setCountry_code(Integer country_code) {
		this.country_code = country_code;
	}


	public String getCreated_at() {
		return created_at;
	}


	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public String getDevice_type() {
		return device_type;
	}


	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}


	public String getDevice_token() {
		return device_token;
	}


	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}

}




