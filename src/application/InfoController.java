package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class InfoController extends SceneSwitch
{

	@FXML
	private void processButton(ActionEvent event) throws IOException
	{
		System.out.println("Clicked - Main Menu");
		switchScene(event, "/application/View2.fxml");
	}
	
}
