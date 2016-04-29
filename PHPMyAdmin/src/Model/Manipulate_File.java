package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manipulate_File {
	
	FileWriter file;
	
	public Manipulate_File(){
		
	}
	
	public void criete_File(String name_File, String infomation) throws IOException{
		file = new FileWriter(new File(name_File+".txt"), true);
		file.write(infomation+"\n");
		file.close();
	}
	
	public void write_File(String name_File, String text) throws IOException{
		//System.out.println("Estou aqui");
		file = new FileWriter(new File(name_File+".txt"), true);
		file.write(text);
		file.close();
	}
	
	public String readText(String nameFile) throws IOException{	
		String msg = null;
		File arquivo = new File(nameFile);
		if(arquivo.exists()){
			FileReader read = new FileReader(nameFile);
			BufferedReader readFile = new BufferedReader(read);
		
			msg = readFile.readLine();
			readFile.close();
		}
		else{
			System.out.println();;
		}
		return msg;
	}
}
