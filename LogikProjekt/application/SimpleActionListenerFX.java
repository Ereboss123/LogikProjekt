package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class SimpleActionListenerFX implements EventHandler<ActionEvent> {
	final private SimpleFrameFX simpleFrame;
	

	public SimpleActionListenerFX(SimpleFrameFX simpleFrame){
		this.simpleFrame=simpleFrame;
	
		
	}
	@Override
	public void handle(ActionEvent arg0) {
		// get component which is source of the event
		Object source=arg0.getSource();
	
		
		
	}// handle


}