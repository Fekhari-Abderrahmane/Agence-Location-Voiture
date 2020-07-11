package GestionVoiture;

public class Client extends Personne {
	
	public Client(String nom, String prenom) {
		super(nom,prenom);
	}
	
	
	private String type;
	private Document[] documents;
	private Location location;
	
	
	
	
	public Client(String nom, String prenom, String type) {
		super(nom, prenom);
		this.type = type;
	}

	public float calculMontantClient(){
		float montant; 
		float duree=location.getDateFin().getTime()-location.getDateDebut().getTime();
		montant=duree*location.getPrix();
		return montant;
	}
	
	public void afficherDocument(){
		System.out.println("Les documents du client "+ this.getNom() +" "+this.getPrenom()+" sont :");
		for(int i=0; i<=documents.length-1;i++){
			System.out.println("Le"+documents[i].getType() +"de numéro"+ documents[i].getNumero()+".");
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Document[] getDocuments() {
		return documents;
	}

	public void setDocuments(Document[] documents) {
		this.documents = documents;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
