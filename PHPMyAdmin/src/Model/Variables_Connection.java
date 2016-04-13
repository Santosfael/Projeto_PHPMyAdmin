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
		
		else if((nome.equals("Select")) || (nome.equals("SELECT"))|| (nome.equals("select"))){
			System.out.println(word_Reserved);
		}
		
		else if((nome.equals("Alter ")) || (nome.equals("ALTER "))|| (nome.equals("alter "))){
			System.out.println(word_Reserved);
		}
		
		else if((nome.equals("Remove")) || (nome.equals("REMOVE"))|| (nome.equals("remove"))){
			System.out.println(word_Reserved);

		}
		
		else if((nome.equals("Insert")) || (nome.equals("INSERT"))|| (nome.equals("insert"))){
			
			file.write_File("banco", word_Reserved);
		}
	}
}
