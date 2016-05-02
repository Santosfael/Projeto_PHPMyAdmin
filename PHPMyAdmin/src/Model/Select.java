package Model;

import java.io.IOException;
import java.util.ArrayList;

public class Select {
	
	Manipulate_File manipulate = new Manipulate_File();
	
	public Select(){
		
	}
	
	public void takeInformation(String information){
		ArrayList<Table_View> lista = new ArrayList();
		Table_View teste = new Table_View();
		String[] dates = null;
		int cont = 0;
		String dados = "";
		String id = "", nome = "";
		System.out.println(information);
		dates = information.split(" ");
		if((dates[3].equals("Cliente")) || (dates[3].equals("cliente")) || (dates[3].equals("CLIENTE"))){
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
		for (int i = 0; i < dados.length(); i++) {
			if((dados.charAt(i) == '0') || (dados.charAt(i) == '1') || (dados.charAt(i) == '0') || (dados.charAt(i) == '2')
					|| (dados.charAt(i) == '3') || (dados.charAt(i) == '4') || (dados.charAt(i) == '5') || (dados.charAt(i) == '6')
					|| (dados.charAt(i) == '7') || (dados.charAt(i) == '8') || (dados.charAt(i) == '9')){
				id += dados.charAt(i);
				cont++;
			}
			else if(cont == 6){
				//teste.setId(id);
				id = "";
				cont = 0;
			}
			
			else{
				nome += dados.charAt(i-1);
				//teste.setNome(nome);
			}
			
			//lista.add(nome);
		}
		System.out.println(nome+ " ");
		//for (Table_View informacao : lista) {
		//	System.out.println(informacao);
		//}
	}
}
