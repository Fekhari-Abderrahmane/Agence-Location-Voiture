package GestionVoiture;

public class Voiture {

	public Voiture(String matricule) {
		super();
		this.matricule = matricule;
	}
	
	private String carteGrise;
	private String type;
	private String marque;
	private String matricule;
	private boolean louee;
	private Agence agence;
	private Location location;
	
	public String getCarteGrise() {
		return carteGrise;
	}
	public void setCarteGrise(String carteGrise) {
		this.carteGrise = carteGrise;
	}
	public void setLouee(boolean louee) {
		this.louee = louee;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public boolean isLouee() {
		return louee;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
}
