package application;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class CheckActivitiesController extends SceneSwitch
{
	@FXML
    private TableView<Activity> activityTable;
    @FXML
    private TableColumn<Activity, String> activity;
    @FXML
    private TableColumn<Activity, String> date;
	
    public CheckActivitiesController() {}
    
    public void initialize()
    {
    	ActivityMgr am = new ActivityMgr("src/txt/Sick.txt");
        ActivityMgr am1 = new ActivityMgr("src/txt/Shaved.txt");
        ActivityMgr am2 = new ActivityMgr("src/txt/Cooked.txt");
        
        ObservableList<Activity> list = FXCollections.observableArrayList();
        list.addAll(am.load()); 
        list.addAll(am1.load());
        list.addAll(am2.load());
        
    	activity.setCellValueFactory(new PropertyValueFactory<Activity, String>("activity"));
    	date.setCellValueFactory(new PropertyValueFactory<Activity, String>("date"));
    	activityTable.setItems(list);
    }
	
	@FXML
	private void processButton(ActionEvent event) throws IOException
	{
		System.out.println("Clicked - Main Menu");
		switchScene(event,"/application/View2.fxml");
	}

}
