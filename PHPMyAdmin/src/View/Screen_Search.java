package View;

import java.io.IOException;

import Model.Variables_Connection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Screen_Search extends Application{
	private VBox root = new VBox(20);
	Variables_Connection information = new Variables_Connection();
	private TextArea text_Search = new TextArea();
	private Button button_Run = new Button("Executar");
	private Scene scene_Search = new Scene(root, 600, 420);
	
	public Screen_Search() {
		
	}
	
	@Override
	public void start(Stage stage_Search) throws Exception {
		stage_Search.setTitle("SQL");
		
		root.setAlignment(Pos.BASELINE_CENTER);
		
		text_Search.setMaxSize(500, 200);
		button_Run.setTranslateX(200);
		button_Run.setTranslateY(100);
		
		root.getChildren().addAll(text_Search, button_Run);
		
		stage_Search.setScene(scene_Search);
		stage_Search.show();
		
		button_Run.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Screen_Result screen_Result = new Screen_Result();
				
				//information.setWord_Reserved(text_Search.getText());
				try {
					information.seach_Text(text_Search.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//System.out.println("Texte: "+information);
				
				
				try {
					screen_Result.start(stage_Search);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
	}

}
