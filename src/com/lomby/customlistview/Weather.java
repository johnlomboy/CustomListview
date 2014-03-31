package com.lomby.customlistview;

public class Weather {
	public int icon;
	public String title;

	public Weather() {
		super();
	}

	public Weather(int icon, String title) {
		super();
		this.icon = icon;
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	
	
}
