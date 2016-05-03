package Model;

import java.io.IOException;
import java.util.ArrayList;

public class Select {
	
	Manipulate_File manipulate = new Manipulate_File();
	
	public Select(){
		
	}
	
	public void takeInformation(String information){
		ArrayList<String> lista1 = new ArrayList();
		ArrayList<String> lista = new ArrayList();
		Table_View teste = new Table_View();
		String[] dates = null;
		int cont = 0, contAux = 0;
		String dados = "";
		String id = "", nome = "";
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
		for (int i = 0; i < dados.length(); i++) {
			if((dados.charAt(i) == '0') || (dados.charAt(i) == '1') || (dados.charAt(i) == '2')
					|| (dados.charAt(i) == '3') || (dados.charAt(i) == '4') || (dados.charAt(i) == '5') || (dados.charAt(i) == '6')
					|| (dados.charAt(i) == '7') || (dados.charAt(i) == '8') || (dados.charAt(i) == '9')){
				id += dados.charAt(i);
				cont++;
				
			}
			else if(cont == 6){
				lista1.add(id);
				lista.add(nome);
				nome = "";
				id = "";
				contAux = cont;
				cont = 0;
				i = i-1;
			}
			
			else{
				nome += dados.charAt(i);
			}	
		}
		//System.out.println(nome+ " ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista1.get(i)+","+lista.get(i));
		}
	}
}
