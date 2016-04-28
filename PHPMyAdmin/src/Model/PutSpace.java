package Model;

import java.io.IOException;

public class PutSpace {
	
	Variables_Connection information = new Variables_Connection();
	
	public PutSpace(){
		
	}
	
	public void catchData(String text) throws IOException{
		String getText = "";
		for (int i = 0; i < text.length(); i++) {

			if((text.charAt(i) == '(')){
				getText += " "+text.charAt(i)+" ";
			}
			
			else if((text.charAt(i) == ')')){
				 
				getText += " " + text.charAt(i);
			}
			else if(text.charAt(i) == ','){
				getText += " "+text.charAt(i)+" ";
			}
			else{
				getText += text.charAt(i);
			}
		}
		
		information.seach_Text(getText);
	}
}
