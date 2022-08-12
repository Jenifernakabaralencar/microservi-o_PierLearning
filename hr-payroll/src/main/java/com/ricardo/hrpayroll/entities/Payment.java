package com.ricardo.hrpayroll.entities;

public class Payment {
	private String name;
	private double dailyIncomes;
	private int days;
	
	public Payment() {}
	
	public Payment(String name, double dailyIncomes, int days) {	
		this.name = name;
		this.dailyIncomes = dailyIncomes;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyIncomes() {
		return dailyIncomes;
	}

	public void setDailyIncomes(double dailyIncomes) {
		this.dailyIncomes = dailyIncomes;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyIncomes;
	}
}
