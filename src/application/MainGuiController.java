package application;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainGuiController extends SceneSwitch
{
	@FXML
	private void processButton1(ActionEvent event) throws IOException
	{		
		System.out.println("Clicked - Add activity ");	
		switchScene(event,"/application/View.fxml");
	}
	
	@FXML
	private void processButton2(ActionEvent event) throws IOException
	{
		System.out.println("Clicked - Check activites ");
		switchScene(event,"/application/View3.fxml");
	}
	
	@FXML
	private void processButton3(ActionEvent event) throws IOException
	{
		System.out.println("Clicked - Info ");
		switchScene(event, "/application/View4.fxml");
	}
	
	@FXML
	private void processButton4(ActionEvent event)
	{
		System.out.println("Clicked - Exit ");
		Platform.exit();
	}
}
