package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;
import java.util.Date;

public class Escalation_rule extends Model {


		private Integer escalation_delay_in_minutes;
		private String id;

		public Integer getEscalation_delay_in_minutes() {
			return escalation_delay_in_minutes;
		}

		public void setEscalation_delay_in_minutes(Integer escalation_delay_in_minutes) {
			this.escalation_delay_in_minutes = escalation_delay_in_minutes;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
	
}
