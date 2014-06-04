package models;

import java.util.ArrayList;
import java.util.List;

import play.db.ebean.Model;

public class AccountEscalationPolicies extends Model {
	

		private Integer total;
		private Integer offset;
		private Integer limit;
		private List<Escalation_policy> escalation_policies = new ArrayList<Escalation_policy>();

		public Integer getTotal() {
			return total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getOffset() {
			return offset;
		}

		public void setOffset(Integer offset) {
			this.offset = offset;
		}

		public Integer getLimit() {
			return limit;
		}

		public void setLimit(Integer limit) {
			this.limit = limit;
		}

		public List<Escalation_policy> getEscalation_policies() {
		return escalation_policies;
		}

		public void setEscalation_policies(List<Escalation_policy> escalation_policies) {
		this.escalation_policies = escalation_policies;
		}	
		
}
