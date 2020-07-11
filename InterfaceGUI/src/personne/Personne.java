package personne;

public class Personne {

	private String nom;
	private String prenom;
	private int age;
	
	private String fonction;
	
	public Personne(String nom, String prenom,int age){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;	
	}
	public Personne(String nom, String prenom,int age,String fonction){
		this (nom,prenom,age);
		this.fonction=fonction;
		
	}
	
		
	/*
	1. Méthode 1 « calculSalaireAn » : Calculer le salaire annuel (sa) d’une personne sachant que son salaire mensuel (sm) est 10000 dh.
	
	2. Méthode 2 «calculSalaireAnFonction1» : Calculer le salaire annuel d’une personne sachant que Si sa 
	fonction est directeur sm est 15000 et  sinon.10000
	
	3. Méthode 3 «calculSalaireAnFonction2» :Calculer le salaire annuel d’une personne sachant 
	qu’il y a deux sources: le salaire et d’autres sources de revenus. 
	Ces sources de revenus sont calculées en appliquant un coefficient qui dépend de 
	la fonction des emplyes , il est 50%  de sm si fonction est directeur,30%  de sm si fonction est gestionnaire, 25% sinon, 
	
	4. Méthode 4 «calculSalaireAnPeriode3» : Calculer le salaire annuel d’une personne sachant que le coefficient 
	est de 50 % si fonction="directeur", 30% si fonction="gestionnaire", et de 25% sinon 
	*/
	
// 	1. Méthode 1 « calculSalaireAn » : Calculer le salaire annuel (sa) d’une personne sachant que son salaire mensuel (sm) est 10000 dh.
	public double calculSalaireAn(){
		double sm=10000;
		double sa=sm*12;
		return sa;
	}
	public double calculSalaireAnFonction(){
		double sa=0,sm=0;		
		if(fonction=="directeur") {
			sm=15000;
			sa=sm*12;
		}
		else {
			sm=10000;
			sa=sm*12;
		}
		return sa;		
		
	}
	// la fonction des emplyes , il est 50%  de sm si fonction est directeur,30%  de sm si fonction est gestionnaire, 25% sinon
	
	public double calculSalaireAnFonction2(String fonction){
		double sa=0;
			if(fonction=="directeur")
			{double sm=15000;
			sa=sm*12+sm*12*0.5; //50%  de sm si fonction est directeur
			}
		else 
			if (fonction=="gestionnaire")
				{double sm=10000;
				sa=sm*12+sm*12*0.3;  //30%  de sm si fonction est gestionnaire
				}
		
		else
					{double sm=5000;
					sa=sm*12+sm*12*0.25;  //25% sinon
					}
		return sa;
	}
	public double calculSalaireAnFonction3(String f){
		double sa=0;
		double sm=0;
		switch (f){
			case "directeur" :    
				sm=15000; sa=sm*12+sm*12*0.5;
				break;
			case "gestionnaire" : 
				sm=10000; sa=sm*12+sm*12*0.3;
				break;
			default :             
				sm=5000; sa=sm*12+sm*12*0.25;
		
		}
		return sa;	
	
}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", fonction=" + fonction + "]";
	}


}
