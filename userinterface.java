package Critical_Thinking;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.*; 
import javafx.stage.Stage; 
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class userinterface extends Application {
	
	int call = 0;
	List<String> list = new ArrayList<>();
	
	


  
    public static void main(String args[]) 
    { 
        launch(args); 
    }
    
    public String getRandomElement(List<String> list)
    {
    	list.add("#99ff66");
        list.add("#8cff66");
        list.add("#66ff66");
        list.add("#66ff8c");
        list.add("#70db70");
        Random rand = new Random();
        return list.get( (int) rand.nextLong(list.size()));
        
    }
    
    public void start(Stage s) 
    { 
    	
         userinterface obj = new userinterface();
        Date d1 = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");  
        s.setTitle("Menu"); 
  
        Menu m = new Menu("Menu"); 
  
        MenuItem m1 = new MenuItem("Date and Time"); 
        MenuItem m2 = new MenuItem("Print to Text"); 
        MenuItem m3 = new MenuItem("Random Color");
        MenuItem m4 = new MenuItem("Close Program");
  
        m.getItems().add(m1); 
        m.getItems().add(m2); 
        m.getItems().add(m3);
        m.getItems().add(m4);
        
        Label l = new Label(""); 
  

        
  
        MenuBar mb = new MenuBar(); 
  
        mb.getMenus().add(m); 
  
        VBox vb = new VBox(mb, l); 
  
        Scene sc = new Scene(vb, 500, 300);
        
        
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            {
            	if (((MenuItem)e.getSource()).getText().equals("Date and Time")) {
            		l.setText("\t\t\t\t"+ dateFormat.format(d1));
            		
            	} else if (((MenuItem)e.getSource()).getText().equals("Print to Text")) {
            		try {
            		      File myObj = new File("C:\\Users\\logan\\Desktop\\userinfo.txt");
            		      if (myObj.createNewFile()) {
            		    	  l.setText("File created: " + myObj.getName());           		       
            		      } else {
            		      }
            		    } catch (IOException e1) {           		     
            		    	e1.printStackTrace();
            		    }
            	    try {
            	        FileWriter myWriter = new FileWriter("C:\\\\Users\\\\logan\\\\Desktop\\\\userinfo.txt");     
            	        String lab = l.getText();
            	        myWriter.write(lab);
            	        myWriter.close();
            	        l.setText("\t\t\t\t" + "Successfully created and wrote to userinfo.txt");
            	      } catch (IOException e1) {
            	        System.out.println("An error occurred.");
            	        e1.printStackTrace();
            	      } 
            		
            	} else if (((MenuItem)e.getSource()).getText().equals("Random Color")) {
            		vb.setStyle("-fx-background-color: " + obj.getRandomElement(list) + ";");
            		call++;
            	} else if (((MenuItem)e.getSource()).getText().equals("Close Program")) {
            		Platform.exit();
            	}
            		
            		
            	
        		  	
   		  	 
            	        
            	
            } 
        }; 
  
        m1.setOnAction(event); 
        m2.setOnAction(event); 
        m3.setOnAction(event);
        m4.setOnAction(event);
        
  
        s.setScene(sc); 
  
        s.show(); 
    }
    

} 