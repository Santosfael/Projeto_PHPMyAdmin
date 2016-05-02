package Model;

public class Table_View {
	private String id, nome;
	
	public Table_View(){
		
	}
	
	public Table_View(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString(){
		return this.getId()+" "+this.getNome();
	}
	
}
