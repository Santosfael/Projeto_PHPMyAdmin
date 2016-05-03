package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Screen_Result extends Application{
	private VBox root = new VBox(10);
	private HBox root_Button = new HBox(20);
	private Scene scene_Result = new Scene(root,600,420);
	private final TableView table_View = new TableView();
	private Button button_Return = new Button("Voltar");
	private Button button_Exit = new Button("Sair");
	public Screen_Result() {
		
	}
	
	@Override
	public void start(Stage stage_Result) throws Exception {
		
		root.setAlignment(Pos.TOP_CENTER);
		
		Label label_Title = new Label("Informa��es do resultado");
		label_Title.setFont(new Font("Arial",20));
		
		table_View.setVisible(true);
		
		TableColumn colunn_ID = new TableColumn<>("ID");
		TableColumn colunn_Nome = new TableColumn<>("Nome");
		TableColumn colunn_Info = new TableColumn<>("Informal��o");
		
		//Fim das Colunas
		 
		table_View.getColumns().addAll(colunn_ID, colunn_Nome, colunn_Info);
		
		
		stage_Result.setTitle("Resultados");
		
		root_Button.setAlignment(Pos.CENTER_RIGHT);
		
		button_Return.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Screen_Search screen_Search = new Screen_Search();
				try {
					screen_Search.start(stage_Result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		button_Exit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
				
			}
		});
		
		root_Button.getChildren().addAll(button_Return, button_Exit);
		root.getChildren().addAll(label_Title, table_View, root_Button);
		
		stage_Result.setScene(scene_Result);
		stage_Result.show();
		
	}

}
