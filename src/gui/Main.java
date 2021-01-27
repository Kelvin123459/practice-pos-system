package gui;

import gui.handler.LoginHandler;
import javafx.application.*;
import javafx.scene.control.Button;

public class Main{
	
	Button log;
	LoginHandler login = new LoginHandler();
	
	public static void main(String[] args) {
		Application.launch(LoginHandler.class, args);
	}
    
}
