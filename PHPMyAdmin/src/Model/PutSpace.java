package Model;

import java.io.IOException;

public class PutSpace {
	
	Variables_Connection information = new Variables_Connection();
	
	public PutSpace(){
		
	}
	
	public void catchData(String text) throws IOException{
		String teste = "";
		String[] teste1 = null; 
		for (int i = 0; i < text.length(); i++) {
			//teste +=text.charAt(i);
			
			if((text.charAt(i) == '(')){
				teste += " "+text.charAt(i)+" ";
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
		
		information.seach_Text(teste);
		
		//System.out.println("Texto: "+teste);
		
		teste1 = teste.split(" ");
		for (int i = 0; i < teste1.length; i++) {
			//System.out.print(teste1[i]);
		}
	}
}
