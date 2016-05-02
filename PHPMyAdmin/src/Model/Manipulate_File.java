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
		System.out.println("Estou aqui");
		file = new FileWriter(new File(name_File+".txt"), true);
		file.write(text);
		file.close();
	}
	
	public String readText(String nameFile, int numClass) throws IOException{	
		String msg = null;
		int i = 0;
		if(numClass == 1){
			try {
				FileReader read = new FileReader(nameFile);
				BufferedReader readFile = new BufferedReader(read);
				msg = readFile.readLine();
				while (msg != null) {
					//System.out.println(msg);
					msg = readFile.readLine();
					return msg;
				}
				readFile.close();
			} catch (Exception e) {
				System.err.printf("Erro ao abrir o arquivo: %s.\n",e.getMessage());
			}
		}
		else{
			try {
				FileReader read = new FileReader(nameFile);
				BufferedReader readFile = new BufferedReader(read);
				msg = readFile.readLine();
				readFile.close();
			} catch (Exception e) {
				System.err.printf("Erro ao abrir o arquivo: %s.\n",e.getMessage());
			}
		}
		return msg;
	}
}
