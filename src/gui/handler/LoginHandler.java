package gui.handler;

import gui.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class LoginHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		Button btn = (Button) event.getSource();
		
		System.out.println(btn.getText());
	}
	
	public boolean validate(String user, String password) {
		if (user == "user" && password == "test") {
			System.out.println("Correct");
			return true;
		}
		else {
			System.out.println("Incorrect");
			return false;
		}
	}

}
