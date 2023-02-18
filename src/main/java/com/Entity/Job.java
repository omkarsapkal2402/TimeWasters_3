package com.Entity;

public class Job {
	int jId;
	String jName;
	String jCom;
	int jSal;
	String jType;
	String jCity;
	String jSkills;
	public Job(int jId, String jName, String jCom, int jSal, String jType, String jCity, String jSkills) {
		super();
		this.jId = jId;
		this.jName = jName;
		this.jCom = jCom;
		this.jSal = jSal;
		this.jType = jType;
		this.jCity = jCity;
		this.jSkills = jSkills;
	}
	public int getjId() {
		return jId;
	}
	public void setjId(int jId) {
		this.jId = jId;
	}
	public String getjName() {
		return jName;
	}
	public void setjName(String jName) {
		this.jName = jName;
	}
	public String getjCom() {
		return jCom;
	}
	public void setjCom(String jCom) {
		this.jCom = jCom;
	}
	public int getjSal() {
		return jSal;
	}
	public void setjSal(int jSal) {
		this.jSal = jSal;
	}
	public String getjType() {
		return jType;
	}
	public void setjType(String jType) {
		this.jType = jType;
	}
	public String getjCity() {
		return jCity;
	}
	public void setjCity(String jCity) {
		this.jCity = jCity;
	}
	public String getjSkills() {
		return jSkills;
	}
	public void setjSkills(String jSkills) {
		this.jSkills = jSkills;
	}
	
}
