package Model;

import java.io.IOException;

public class Variables_Connection {
	//private String word_Reserved;
	
	public Variables_Connection(){
		//this.word_Reserved = word_Reserved;
	}
	
	public void seach_Text(String word_Reserved) throws IOException{
		String nome = null;
		String content = null;
		String information = null;
		Manipulate_File file = new Manipulate_File();
		for (int i = 0; i < word_Reserved.length(); i++) {
			nome = word_Reserved.substring(0, 6);
		}
		if((nome.equals("Create")) || (nome.equals("CREATE"))|| (nome.equals("create"))){
			//System.out.println("Entrei");
			for (int i = 0; i < word_Reserved.length(); i++) {
				if(i < 14){
					content = word_Reserved.substring(i);
				}
				//if(word_Reserved.equals("Table") ||word_Reserved.equals("table")|| word_Reserved.equals("Table")){
					//name_File[i] = word_Reserved.charAt(i);
					//System.out.println(name_File[i]);
				//}
			}
			
			for (int i = 0; i < content.length(); i++) {
				if((i < 11) && (content.charAt(10) != '(')){
					information = content.substring(i);
				}
			}
			
			file.criete_File("Cliente", information);

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
