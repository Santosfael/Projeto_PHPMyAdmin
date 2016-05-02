package Model;

import java.io.IOException;

public class Insert {
	
	Manipulate_File white_file = new Manipulate_File();
	
	public Insert(){
		
	}
	
	public void informationFile(String information, String text) throws IOException{
		String[] get_Text = null, get_Information = null;
		String dataInformation = "", nameFile = "";
		int cont=0, id, value, contAux = 0;
		
		
		get_Text = text.split(" ");
		get_Information = information.split(" ");
		
		if((information != null) && (text != null)){
			nameFile = get_Text[2];
			System.out.println("nome da tabela: "+nameFile);
			//System.out.println("Cabeçario tabela: "+information+", informação: "+text);
			/*for (int i = 0; i < get_Information.length; i++) {
				if((get_Information[i].equals("char"))|| (get_Information[i].equals("Char")) || (get_Information[i].equals("CHAR"))){
					if(get_Information[i+1].equals("(")){
						sizeChar = Integer.parseInt(get_Information[i+2]);
					}
				}
				else if((get_Information[i].equals("char"))|| (get_Information[i].equals("Char")) || (get_Information[i].equals("CHAR"))){
					if(get_Information[i+1].equals("(")){
						sizeChar = Integer.parseInt(get_Information[i+2]);
					}
				}
			}*/
			
			
			for (int i = 3; i < get_Text.length; i++) {
				if((get_Text[i].equals("VALUES")) || (get_Text[i].equals("Values")) || (get_Text[i].equals("values"))){
					cont = i;
				}
			}
			if((get_Text[cont].equals("VALUES")) || (get_Text[cont].equals("Values")) || (get_Text[cont].equals("values"))){
				int j = 0, cont1 = 0, cont2 = 0;
				id = Integer.parseInt(get_Text[cont+3]);
				dataInformation = String.valueOf(id);
				value = dataInformation.length();
				for (int i = 0; i < (6-value); i++) {
					dataInformation = "0"+ dataInformation;
					contAux++;
				}
				int aux2 = contAux + cont;
				for (int i = aux2; i < get_Text.length-1; i++) {
					if(get_Text[i].equals(",")){
					
					}
					else if(get_Text[i].equals("\"")){
						cont1++;
					}

					if((cont1 > 0) && (!get_Text[i].equals("\""))){
						cont2++;
						if(cont2 == 1){
							dataInformation += get_Text[i];
						}
						else{
							dataInformation += " "+get_Text[i];
						}
					}
				}
				///cont1 = 0;
				//System.out.println(dataInformation);
				white_file.write_File(nameFile, dataInformation);
			}
		}
		else{
			System.out.println("Tabela informada não existe");
		}
	}
}
