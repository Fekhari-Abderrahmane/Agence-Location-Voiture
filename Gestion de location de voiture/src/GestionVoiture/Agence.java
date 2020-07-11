package GestionVoiture;
import GestionVoiture.Directeur;
import GestionVoiture.Employe;
import GestionVoiture.Voiture;

public class Agence {
	public Agence(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	private String nom;
	private String adresse;
	private Employe employe1;
	private Employe employe2;
	private Directeur directeur;
	private Voiture[] voitures;
	private Location[] locations;
	
	public void afficherVoitures() {
		System.out.println("Les voitures que contient l'agence "+nom+" sont : ");
		for(int i=1; i<voitures.length+1;i++){
			System.out.println("\t la "+i+"ème voiture est celle avec le matricule: "+ voitures[i-1].getMatricule()+"\t du type : "+voitures[i-1].getType()+"\t \t sa marque est "+voitures[i-1].getMarque());
		}
	}	
	public void afficherVoituresLouees() {
		System.out.println("Les voitures louées sont les suivantes: ");	
		for(int i=1; i<voitures.length+1;i++){
			if (voitures[i-1].isLouee()==true) {
				System.out.println("\t la "+i+"ème voiture est celle avec le matricule: "+ voitures[i-1].getMatricule()+"\t du type : "+voitures[i-1].getType()+"\t sa marque est "+voitures[i-1].getMarque());
			}	
		}	
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Directeur getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Directeur directeur) {
		this.directeur = directeur;
	}

	public Voiture[] getVoitures() {
		return voitures;
	}

	public void setVoitures(Voiture[] voitures) {
		this.voitures = voitures;
	}

	public Employe getEmploye1() {
		return employe1;
	}

	public void setEmploye1(Employe employe1) {
		this.employe1 = employe1;
	}

	public Employe getEmploye2() {
		return employe2;
	}

	public void setEmploye2(Employe employe2) {
		this.employe2 = employe2;
	}

	public Location[] getLocations() {
		return locations;
	}

	public void setLocations(Location[] locations) {
		this.locations = locations;
	}
	
}

