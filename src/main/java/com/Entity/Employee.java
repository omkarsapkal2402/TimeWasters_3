package com.Entity;

public class Employee {
	int eId;
	String eName;
	String eMob;
	int eExp;
	String eEdu;
	String eSkills;
	String eDes;
	double score;
	
	public Employee(int eId, String eName, String eMob, int eExp, String eEdu, String eSkills, String eDes,
			double score) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eMob = eMob;
		this.eExp = eExp;
		this.eEdu = eEdu;
		this.eSkills = eSkills;
		this.eDes = eDes;
		this.score = score;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteMob() {
		return eMob;
	}
	public void seteMob(String eMob) {
		this.eMob = eMob;
	}
	public int geteExp() {
		return eExp;
	}
	public void seteExp(int eExp) {
		this.eExp = eExp;
	}
	public String geteEdu() {
		return eEdu;
	}
	public void seteEdu(String eEdu) {
		this.eEdu = eEdu;
	}
	public String geteSkills() {
		return eSkills;
	}
	public void seteSkills(String eSkills) {
		this.eSkills = eSkills;
	}
	
	public String geteDes() {
		return eDes;
	}
	public void seteDes(String eDes) {
		this.eDes = eDes;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eMob=" + eMob + ", eExp=" + eExp + ", eEdu=" + eEdu
				+ ", eSkills=" + eSkills + "]";
	}
	
	
}
