package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitch 
{
	public void switchScene(ActionEvent event, String path) throws IOException
	{
		Parent parentroot = FXMLLoader.load(getClass().getResource(path));
		Scene parentscene = new Scene(parentroot);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(parentscene);
		stage.show();
	}

}
