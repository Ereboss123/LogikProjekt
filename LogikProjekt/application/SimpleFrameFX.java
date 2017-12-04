package application;


import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SimpleFrameFX extends Stage {

	// buttons
	final private Button startBTN;
	final private Button stopBTN;
	
	// menu items
	final MenuItem gatter;
	

	final private SimpleActionListenerFX simpleListener;	

	public SimpleFrameFX(){		
	Group root = new Group();
	simpleListener=new SimpleActionListenerFX(this);
	stopBTN = new Button("Stop");
	startBTN = new Button("Start");
	gatter = new MenuItem();
	
	GridPane g = new GridPane();
	g.add(stopBTN, 3, 3);
	root.getChildren().add(g);
	root.getChildren()
	AnimationTimer gl = new AnimationTimer() {

		@Override
		public void handle(long now) {
			update();
			render();
		
		}

		private void render() {
			// TODO Auto-generated method stub
			
		}

		private void update() {
			// TODO Auto-generated method stub
			
		}
	};
	gl.start();
	Scene scene=new Scene(root, 700, 600);
	setScene(scene);
	
	show();

	}
}
