package gui;

import gui.handler.LoginHandler;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	Button log;
	LoginHandler login = new LoginHandler();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("POS");
		
		log = new Button("Login");
		
		Label username = new Label("Username");
		TextField userField = new TextField();
		userField.setPromptText("Username");
		Label password = new Label("Password");
		TextField passField = new TextField();
		passField.setPromptText("Password");
		
		
		log.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				validate(userField.getText().toString(), passField.getText().toString());
			}
		});
		
		GridPane layout = new GridPane();
		GridPane.setConstraints(username, 0, 0);
		GridPane.setConstraints(log, 0, 2);
		GridPane.setConstraints(userField, 1, 0);
		GridPane.setConstraints(password, 0, 1);
		GridPane.setConstraints(passField, 1, 1);
		layout.getChildren().addAll(username, userField, password, passField, log);
		
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public boolean validate(String user, String password) {
		if (user.equals("user") && password.equals("test")) {
			System.out.println("Correct");
			return true;
		}
		else {
			System.out.println("Incorrect");
			return false;
		}
	}
    
}
