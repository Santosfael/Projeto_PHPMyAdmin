package View;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgScreen extends Application{
	
	static VBox root = new VBox(10); 
	
	public static void main(String[] args){
		launch();

	}

	@Override
	public void start(Stage palco) throws Exception {
		
		Screen_Search screen = new Screen_Search();
		
		screen.start(palco);
		
		palco.show();
		
	}

}
