package com.ricardo.hrpayroll.entities;


public class Worker {
	private int id;
	private String name;
	private double dailyIncome;
	
	public Worker() {
		
	}
	
	public Worker(int id, String name, double dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}	
}
