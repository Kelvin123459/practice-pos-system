package gui.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
import main.DBTest;

public class LoginHandler extends Application{

	Button log;
	ResultSet rs;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("POS");
		
		log = new Button("Login");
		
		Label title = new Label("POS System");
		Label username = new Label("Username: ");
		TextField userField = new TextField();
		userField.setPromptText("Username");
		Label password = new Label("Password: ");
		TextField passField = new TextField();
		passField.setPromptText("Password");
		
		
		log.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				validate(userField.getText().toString(), passField.getText().toString());
			}
		});
		
		GridPane layout = new GridPane();
		GridPane.setConstraints(title, 0, 0);
		GridPane.setConstraints(username, 0, 1);
		GridPane.setConstraints(log, 0, 3);
		GridPane.setConstraints(userField, 1, 1);
		GridPane.setConstraints(password, 0, 2);
		GridPane.setConstraints(passField, 1, 2);
		layout.getChildren().addAll(title, username, userField, password, passField, log);
		
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public boolean validate(String user, String password) {
		Boolean result=false;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Establishing connection...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "Kelvin", "TimeFlamer111");
			System.out.println("Connection successful");
			
			Statement state = conn.createStatement();
			rs = state.executeQuery("select * from user where name = '"+ user + "' and password = '"+ password +"'");
			rs.next();
			if (user.equals(rs.getString("name")) && password.equals(rs.getString("password"))) {
				System.out.println("Correct");
				result = true;
			}
		} catch (SQLException e) {
//			Logger.getLogger(DBTest.class.getName()).log(Level.SEVERE, null, e);
			System.out.println("Illegal operation or empty result set");
		}
		return result;
		
	}


}
