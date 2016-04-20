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
}
