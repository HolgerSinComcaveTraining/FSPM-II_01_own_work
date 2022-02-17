package com.cc_student.hsin.schulungsraum_maven.model;

public class Tier {

	private String name;
	private String preis;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPreis() {
		return preis;
	}
	public void setPreis(String preis) {
		this.preis = preis;
	}
	@Override
	public String toString() {
		return "Tier [name=" + name + ", preis=" + preis + "]";
	}
	
	
}
