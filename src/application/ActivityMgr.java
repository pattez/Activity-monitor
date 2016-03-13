package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ActivityMgr 
{
	private String pathName;

	public ActivityMgr(String pathName) {
		this.pathName = pathName;
	}

	public List<Activity> load()
	{
		String read = "";
		List<Activity> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathName)))
		{
			while((read = br.readLine()) != null)
			{
				String[] rowArray =  read.split("\\s+");	
				
				if(rowArray.length > 1)
				{
					String activity = rowArray[0];
					String date = rowArray[1] + " " + rowArray[2];
					list.add(new Activity(activity,date));
				}
			}
			
			br.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;	
	}
	
	public void save(String activity)
	{		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathName,true)))
		{
			bw.append(activity);
			bw.newLine();

			bw.close();
		} 
		catch (IOException e) {
				e.printStackTrace();
			}
	}
}
