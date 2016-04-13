package Model;

import java.io.IOException;

public class Variables_Connection {
	//private String word_Reserved;
	
	public Variables_Connection(){
		//this.word_Reserved = word_Reserved;
	}
	
	public void seach_Text(String word_Reserved) throws IOException{
		String[] nome = null;
		String nomeTable = null;
		String content = null;
		String information = "";
		Manipulate_File file = new Manipulate_File();
		nome = word_Reserved.split(" ");
		if(nome[0].equals("create")|| nome[0].equals("Create") || nome[0].equals("CREATE")){
			if(nome[1].equals("Table")||nome[1].equals("TABLE") || nome[1].equals("table")){
				nomeTable = nome[2];
				if(nome[3].equals("(")){
					System.out.println("Entrei");
					for (int i = 4; i < nome.length-1; i++) {
						information += nome[i]+" ";
						///System.out.print(information);
					}
				}
				file.criete_File(nomeTable, information);
			}
		}
		else if(nome[0].equals("Select") || nome[0].equals("SELECT") || nome[0].equals("Select")){
			System.out.println(word_Reserved);
		}
		
		else if(nome[0].equals("Update") || nome[0].equals("update") || nome[0].equals("UPDATE")){
			System.out.println(word_Reserved);
		}
		
		else if(nome[0].equals("Remove") || nome[0].equals("remove") || nome[0].equals("REMOVE")){
			System.out.println(word_Reserved);
		}
		
		else if(nome[0].equals("Insert") || nome[0].equals("insert") || nome[0].equals("INSERT")){
			int id = 0;
			int valor = 0; 
			String idFinal = "";
			//System.out.println(word_Reserved);
			if(nome[1].equals("Into") || nome[1].equals("into") || nome[1].equals("INTO") && nome[3].equals("(")){
				id = Integer.parseInt(nome[4]);
				idFinal = String.valueOf(id);
				valor = idFinal.length();
				for (int i = 0; i < (6-valor); i++) {
					idFinal = "0"+ idFinal;
				}					
				
			}
		}
		
	}
}
