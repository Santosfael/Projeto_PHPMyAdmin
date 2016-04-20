package Model;

import java.io.IOException;

public class Variables_Connection {
	//private String word_Reserved;
	
	public Variables_Connection(){
		//this.word_Reserved = word_Reserved;
	}
	
	public void seach_Text(String word_Reserved) throws IOException{
		String[] nameCod = null;
		String nomeTable = null;
		String information = "";
		Manipulate_File file = new Manipulate_File();
		nameCod = word_Reserved.split(" ");
		if(nameCod[0].equals("create")|| nameCod[0].equals("Create") || nameCod[0].equals("CREATE")){
			if(nameCod[1].equals("Table")||nameCod[1].equals("TABLE") || nameCod[1].equals("table")){
				nomeTable = nameCod[2];
				if(nameCod[3].equals("(")){
					System.out.println("Entrei");
					for (int i = 4; i < nameCod.length-1; i++) {
						information += nameCod[i]+" ";
						///System.out.print(information);
					}
				}
				file.criete_File(nomeTable, information);
			}
		}
		else if(nameCod[0].equals("Select") || nameCod[0].equals("SELECT") || nameCod[0].equals("select")){
			Select informations = new Select();
			String dates = "";
			for (int i = 1; i < nameCod.length; i++) {
				dates +=nameCod[i];
			}
			informations.takeInformation(dates);
		}
		
		else if(nameCod[0].equals("Update") || nameCod[0].equals("update") || nameCod[0].equals("UPDATE")){
			System.out.println(word_Reserved);
		}
		
		else if(nameCod[0].equals("Remove") || nameCod[0].equals("remove") || nameCod[0].equals("REMOVE")){
			System.out.println(word_Reserved);
		}
		
		else if(nameCod[0].equals("Insert") || nameCod[0].equals("insert") || nameCod[0].equals("INSERT")){
			int id = 0;
			int value = 0; 
			String idFinal = "";
			//System.out.println(word_Reserved);
			if(nameCod[1].equals("Into") || nameCod[1].equals("into") || nameCod[1].equals("INTO")){
				String informationFile;
				String takeValue = "";
				int cont = 0;
				Manipulate_File file1 = new Manipulate_File();
				Insert insert = new Insert();
				
				informationFile = file1.readText(nameCod[2]+".txt");
				System.out.println(information);
				
				for (int i = 3; i < nameCod.length; i++) {
					if((nameCod[i].equals("VALUES")) || (nameCod[i].equals("Values")) || (nameCod[i].equals("values"))){
						takeValue = nameCod[i];
						cont = i;
					}
				}
				//System.out.println("Nome: "+takeValue+", posicao: "+cont);
				if((nameCod[cont].equals("VALUES")) || (nameCod[cont].equals("Values")) || (nameCod[cont].equals("values"))){
					
					for (int i = cont+2; i < nameCod.length-1; i++) {
						idFinal += nameCod[i];
					}
					
					//id = Integer.parseInt(nameCod[cont+2]);
					//idFinal = String.valueOf(id);
					//value = idFinal.length();
					//for (int i = 0; i < (6-value); i++) {
					//	idFinal = "0"+ idFinal;
					//}
				}
				insert.informationFile(informationFile, idFinal);
			}
		}
		
	}
}
