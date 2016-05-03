package Model;

import java.io.IOException;

public class Variables_Connection {
	
	Manipulate_File file = new Manipulate_File();
	
	public Variables_Connection(){
		//this.word_Reserved = word_Reserved;
	}
	
	public void seach_Text(String word_Reserved) throws IOException{
		String idFinal = "";
		String takeValue = "";
		
		String[] nameCod = null;
		String nomeTable = null;
		String information = "";	
		
		nameCod = word_Reserved.split(" ");
		
		if(nameCod[0].equalsIgnoreCase("create")){
			if(nameCod[1].equalsIgnoreCase("Table")){
				nomeTable = nameCod[2];
				if(nameCod[3].equals("(")){
					for (int i = 4; i < nameCod.length-1; i++) {
						information += nameCod[i]+" ";
					}
				}
				file.criete_File(nomeTable, information);
			}
		}
		else if(nameCod[0].equalsIgnoreCase("Select")){
			Select informations = new Select();
			String dates = word_Reserved;
			//for (int i = 1; i < nameCod.length; i++) {
			//	dates +=nameCod[i];
			//}
			informations.takeInformation(dates);
		}
		
		else if(nameCod[0].equalsIgnoreCase("Update")){
			System.out.println(word_Reserved);
		}
		
		else if(nameCod[0].equalsIgnoreCase("Remove")){
			System.out.println(word_Reserved);
		}
		
		else if(nameCod[0].equalsIgnoreCase("Insert")){
			
			if(nameCod[1].equalsIgnoreCase("Into")){
				String informationFile;
				
				int cont = 0;
				Manipulate_File file1 = new Manipulate_File();
				Insert insert = new Insert();
				String codName = nameCod[2]+".txt";
				
					informationFile = file1.readText(nameCod[2]+".txt",2);

				for (int i = 3; i < nameCod.length; i++) {
					if(nameCod[i].equalsIgnoreCase("VALUES")){
						takeValue = nameCod[i];
						cont = i;
					}
				}
				
				if(nameCod[cont].equalsIgnoreCase("VALUES")){
					
					for (int i = cont+2; i < nameCod.length-1; i++) {
						idFinal += nameCod[i];
					}
					
				}
				insert.informationFile(informationFile, word_Reserved);
			}
		}
	}
}
