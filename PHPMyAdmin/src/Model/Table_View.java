package Model;

public class Table_View {
	private String nome;
	private String id;
	
	public Table_View(){
		this.nome = "";
		this.id = "";
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
		return id+", "+nome;
	}
}
