package application;
	
import javafx.geometry.Insets;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try { 
			 
			primaryStage.setTitle("UI"); 
			Label nom = new Label("Nom:"); 
			TextField tnom = new TextField (); 
			HBox hb = new HBox(); 
			hb.getChildren().addAll(nom,tnom); 
			hb.setSpacing(20); 
			StackPane root = new StackPane(); 
			root.setPadding(new Insets(30, 40, 30, 40)); 
			root.getChildren().add(hb) ;
			Scene scene = new Scene(root,300,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); 
					primaryStage.setScene(scene); 
					primaryStage.show(); 
					} catch(Exception e) {e.printStackTrace(); }	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
