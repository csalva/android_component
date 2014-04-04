package com.example.component_android;

public class Date {
	int newday;
	int newmonth;
	int newyear;
	
	public Date(int newday, int newmonth,	int newyear){
		this.newday = newday;
		this.newmonth = newmonth;
		this.newyear = newyear;
	}
	
	public int getDay(){
		return this.newday;
	}
	
	public int getMonth(){
		return this.newmonth;
	}
	
	public int getYear(){
		return this.newyear;
	}
}
