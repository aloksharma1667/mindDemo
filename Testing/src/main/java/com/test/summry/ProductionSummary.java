package com.test.summry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

	@Entity
	public class ProductionSummary {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
	    private String date;
	    private String shift;
	    private int quantity;
	    private int plannedQuantity;
	    private int downtime;
		
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getShift() {
			return shift;
		}
		public void setShift(String shift) {
			this.shift = shift;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getPlannedQuantity() {
			return plannedQuantity;
		}
		public void setPlannedQuantity(int plannedQuantity) {
			this.plannedQuantity = plannedQuantity;
		}
		public int getDowntime() {
			return downtime;
		}
		public void setDowntime(int downtime) {
			this.downtime = downtime;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public ProductionSummary(int id, String date, String shift, int quantity, int plannedQuantity, int downtime) {
			super();
			this.id = id;
			this.date = date;
			this.shift = shift;
			this.quantity = quantity;
			this.plannedQuantity = plannedQuantity;
			this.downtime = downtime;
		}
		public ProductionSummary() {
			super();
			// TODO Auto-generated constructor stub
		}

	    // Constructor, getters, and setters
	    // ...
	    
	    
	}
