package Model;

public class Insert {
	public Insert(){
		
	}
	
	public void informationFile(String information, String text){
		
		if(information != null){
			System.out.println("Cabeçario tabela: "+information+", informação: "+text);
		}
		else{
			System.out.println("Tabela informada não existe");
		}
	}
	
	public void catchData(String text){
		String teste = "";
		String[] teste1 = null; 
		for (int i = 0; i < text.length(); i++) {
			
			if((text.charAt(i) == '(')){
				teste += text.charAt(i)+" ";
			}
			
			else if((text.charAt(i) == ')')){
				 
				teste += " " + text.charAt(i);
			}
			else if(text.charAt(i) == ','){
				teste += " "+text.charAt(i)+" ";
			}
			else{
			teste += text.charAt(i);
			}
		}
		System.out.println("Texto: "+teste);
		
		teste1 = teste.split(" ");
		for (int i = 0; i < teste1.length; i++) {
			System.out.print(teste1[i]);
		}
		
		
		//return text;
	}
}
