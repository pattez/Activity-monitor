package application;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ActivityController extends SceneSwitch
{
	DateFormat df = new SimpleDateFormat("yyyy/MM/DD HH:mm:ss");
	Date today = Calendar.getInstance().getTime();
	String reportDate = df.format(today); 
	List<Activity> list;
	
	@FXML
	private void processButton1(ActionEvent event) throws IOException
	{
		System.out.println("Clicked -  I'm now sick ");
		
		ActivityMgr am = new ActivityMgr("src/txt/Sick.txt");
		am.save("Sick " + reportDate);
		switchScene(event,"/application/View2.fxml");
	}
	
	@FXML
	private void processButton2(ActionEvent event) throws IOException
	{
		System.out.println("Clicked - I just shaved ");
		
		ActivityMgr am = new ActivityMgr("src/txt/Shaved.txt");
		am.save("Shaved " + reportDate);
		switchScene(event,"/application/View2.fxml");
	}
	
	@FXML
	private void processButton3(ActionEvent event) throws IOException
	{
		System.out.println("Clicked -  I am cooking ");
		
		ActivityMgr am = new ActivityMgr("src/txt/Cooked.txt");
		am.save("Cooked " + reportDate);
		switchScene(event,"/application/View2.fxml");
	}
	
	

}
