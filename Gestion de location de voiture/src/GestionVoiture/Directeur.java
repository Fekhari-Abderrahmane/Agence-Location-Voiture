package GestionVoiture;

public class Directeur extends Personne {
	public Directeur(String nom, String prenom) {
		super(nom,prenom);
	}
	
	private Agence agence;
	
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
}
