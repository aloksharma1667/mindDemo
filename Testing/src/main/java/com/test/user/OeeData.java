package com.test.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OeeData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private double availability;
    private double performance;
    private double quality;
    private double oee;
	public double getAvailability() {
		return availability;
	}
	public void setAvailability(double availability) {
		this.availability = availability;
	}
	public double getPerformance() {
		return performance;
	}
	public void setPerformance(double performance) {
		this.performance = performance;
	}
	public double getQuality() {
		return quality;
	}
	public void setQuality(double quality) {
		this.quality = quality;
	}
	public double getOee() {
		return oee;
	}
	public void setOee(double oee) {
		this.oee = oee;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OeeData(int id, double availability, double performance, double quality, double oee) {
		super();
		this.id = id;
		this.availability = availability;
		this.performance = performance;
		this.quality = quality;
		this.oee = oee;
	}
	public OeeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
}

