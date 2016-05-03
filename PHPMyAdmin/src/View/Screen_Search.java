package View;

import java.io.IOException;

import Model.Insert;
import Model.PutSpace;
import Model.Variables_Connection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Screen_Search extends Application{
	private VBox root = new VBox(20);
	//Variables_Connection information = new Variables_Connection();
	PutSpace put_Space = new PutSpace();
	Variables_Connection returnError = new Variables_Connection();
	
	private int return_Error;
	
	private TextArea text_Search = new TextArea();
	private Button button_Run = new Button("Executar");
	private Label lbError = new Label("Erro de Sintaxe");
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
		
		//if(testRequest[0].equals("insert")){
			button_Run.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					String[] testRequest = text_Search.getText().split(" ");
	
					Screen_Result screen_Result = new Screen_Result();
					
					//information.setWord_Reserved(text_Search.getText());
					try {
						
						put_Space.catchData(text_Search.getText());
						return_Error = returnError.returnError();
								
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//System.out.println(return_Error);
					if(testRequest[0].equals("insert")){
						
						root.getChildren().clear();
						root.getChildren().addAll(text_Search, button_Run);
						stage_Search.show();
					}
					if(return_Error == 1){
						root.getChildren().clear();
						root.getChildren().addAll(text_Search, lbError, button_Run);
						stage_Search.show();
					}
					else{
						try {
							screen_Result.start(stage_Search);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
		//}
	}

}
