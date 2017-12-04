package application;
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * Application
 * 
 * @author Leo Fanzott
 *
 */
public class SimpleApplicationFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {	
		System.out.println("A");
	     // instanciate frame
		 new SimpleFrameFX();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}