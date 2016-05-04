package View;

import Model.Select;
import Model.Table_View;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Screen_Result extends Application{
	private VBox root = new VBox(10);
	private HBox root_Button = new HBox(20);
	private Scene scene_Result = new Scene(root,600,420);
	private TableView<Table_View> table_View;
	private Button button_Return = new Button("Voltar");
	private Button button_Exit = new Button("Sair");
	Select select = new Select();
	public Screen_Result() {
		
	}
	
	@Override
	public void start(Stage stage_Result) throws Exception {
		
		root.setAlignment(Pos.TOP_CENTER);
		
		Label label_Title = new Label("Resultado");
		label_Title.setFont(new Font("Arial",20));
		
		//TableColumn<Table_View, String> colunn_Info = new TableColumn<>("Informação");
		//colunn_Info.setCellValueFactory(new PropertyValueFactory<>("Informação"));
		
		TableColumn<Table_View, String> colunn_ID = new TableColumn<Table_View, String>("ID");
		colunn_ID.setCellValueFactory(new PropertyValueFactory<Table_View, String>("id"));
		
		TableColumn<Table_View, String> colunn_Nome = new TableColumn<Table_View, String>("Nome");
		colunn_Nome.setCellValueFactory(new PropertyValueFactory<Table_View, String>("nome"));
		//TableColumn colunn_Info = new TableColumn<>("Informa��o");
		//Fim das Colunas
		
		table_View = new TableView<>();
		table_View.setItems(FXCollections.observableArrayList(select.getInformation()));
		table_View.getColumns().addAll(colunn_ID, colunn_Nome);
		
		
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
