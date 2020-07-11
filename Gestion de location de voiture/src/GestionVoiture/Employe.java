package GestionVoiture;

public class Employe extends Personne {
	
	public Employe(String nom, String prenom) {
		super(nom,prenom);
	}
	
	private String fonction;
	private Agence agence;
	
	
	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}
}
