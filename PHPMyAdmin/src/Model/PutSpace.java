package Model;

import java.io.IOException;

public class PutSpace {
	public static int id = 0;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		PutSpace.id = id;
	}

	Variables_Connection information = new Variables_Connection();
	Insert insert = new Insert();
	
	public PutSpace(){
		
	}
	
	public void catchData(String text) throws IOException{
		String getText = "";
		id++;
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
			
			else if(text.charAt(i) == '\"'){
				getText += " "+text.charAt(i)+" ";
			}
			
			else{
				getText += text.charAt(i);
			}
		}
		
		information.seach_Text(getText);
		
	}
}
