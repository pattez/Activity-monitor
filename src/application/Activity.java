package application;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Activity
{
	private final StringProperty activity;
	private final StringProperty date;
	
	List<Activity> list = new ArrayList<>();
	
	public Activity(String activity, String date) {
		this.activity = new SimpleStringProperty(activity);
		this.date = new SimpleStringProperty(date);
	}
	
	public StringProperty activityProperty() {
		return activity;
	}
	
	public StringProperty dateProperty() {
		return date;
	}
	
	public String getActivity() {
		return activity.get();
	}
	
	public String getDate() {
		return date.get();
	}
	
	public void setActivity(String activity) {
		this.activity.set(activity);
	}
	
	public void setDate(String date) {
		this.date.set(date);
	}


	public List<Activity> createList() {	
		return list;
	}
	
}
