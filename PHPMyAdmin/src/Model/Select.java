package Model;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Select {
	private static String idResult = "", nomeResult = "";
	private static ObservableList<Table_View> informationDB;
	Manipulate_File manipulate = new Manipulate_File();
	
	public Select(){
		
	}
	
	public void takeInformation(String information){
		informationDB = FXCollections.observableArrayList();
		
		String[] dates = null;
		String id = "", nome = "";
		int cont = 0;
		String dados = "";
		
		System.out.println(information);
		dates = information.split(" ");
		if(dates[3].equalsIgnoreCase("cliente")){
			try {
				dados = manipulate.readText(dates[3]+".txt",1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		else{
			System.out.println("Arquivo nao existe");
		}
		
		
		
		int n = 0;
		for (int i = 0; i < dados.length(); i++) {
			
			
			if((dados.charAt(i) == '0') || (dados.charAt(i) == '1') || (dados.charAt(i) == '2')
					|| (dados.charAt(i) == '3') || (dados.charAt(i) == '4') || (dados.charAt(i) == '5') || (dados.charAt(i) == '6')
					|| (dados.charAt(i) == '7') || (dados.charAt(i) == '8') || (dados.charAt(i) == '9')){
				
				if((n > 0) && (cont == 6)){
					idResult = id;
				
					nomeResult = nome;
					informationDB.add(new Table_View(idResult, nomeResult));
					getInformation();
					nome = "";
					id = "";
					cont = 0;
				}
				
				id += dados.charAt(i);
				cont++;
				
				if(cont == 6){
					n++;
				}
			}
			else{
			
				nome += dados.charAt(i);
			}
		}
		idResult = id;
		nomeResult = nome;
		informationDB.add(new Table_View(idResult, nomeResult));
	}
	
	public ObservableList<Table_View> getInformation(){
		ObservableList<Table_View> information = FXCollections.observableArrayList();
		information = informationDB;
		return information;

	}
}
