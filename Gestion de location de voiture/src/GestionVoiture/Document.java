package GestionVoiture;

public class Document {
	
	private int numero;
	private String type;
	private Client client;

	public Document(String type, Client client) {
		super();
		this.type = type;
		this.client = client;
	}
	
	
	public Document(int numero, String type) {
		super();
		this.numero = numero;
		this.type = type;
	}



	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
		
}
