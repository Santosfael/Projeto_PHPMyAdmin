package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Manipulate_File {
	//private String text;
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
		file.write("\n"+text);
		file.close();
	}
}
