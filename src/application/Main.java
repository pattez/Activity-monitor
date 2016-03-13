package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) throws IOException 
	{
		Parent root2 = (Parent) FXMLLoader.load(getClass().getResource("/application/View2.fxml"));
       	primaryStage.setScene(new Scene(root2));
        primaryStage.show(); 
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
