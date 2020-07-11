package GestionVoiture;
import java.util.Date;
import GestionVoiture.Voiture;
import GestionVoiture.Client;

public class Location {
	
	public Location(Date date, Voiture voiture, Client client) {
		super();
		this.date = date;
		this.voiture = voiture;
		this.client = client;
	}
	public Location(Voiture voiture, Client client) {
		super();
		this.voiture = voiture;
		this.client = client;
	}
	
	private Date date;
	private float prix;
	private Date dateDebut;
	private Date dateFin;
	private float garantie;
	private String typePaiment;
	private Voiture voiture;
	private Client client;
	
	public float calculMontant(){
		float montant;
		float duree=dateFin.getTime()-dateDebut.getTime();
		montant=duree*prix/86400000;
		return montant;			
	}
	
	public float getDuree(){
		float duree=dateFin.getTime()-dateDebut.getTime();
		duree=duree/86400000;
		return duree;			
	}
	
	
	
	public float calculGarantie(){
		float garantie;
		
		switch (voiture.getType()){
		case "Lux":
			garantie=prix*30/100;
			break;
		case "4*4":
			garantie=prix*20/100;
			break;
			
		case "Sport":
			garantie=prix*10/100;
			break;
			
		default:
			garantie=prix*5/100;
		}
		return garantie;	
	}	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public float getGarantie() {
		return garantie;
	}

	public void setGarantie(float garantie) {
		this.garantie = garantie;
	}

	public String getTypePaiment() {
		return typePaiment;
	}

	public void setTypePaiment(String typePaiment) {
		this.typePaiment = typePaiment;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
}	
	