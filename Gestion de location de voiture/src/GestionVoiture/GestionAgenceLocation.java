package GestionVoiture;
import java.util.Scanner;

public class GestionAgenceLocation {
	public static void main(String[] args) {
		
			String X;
			Scanner clavier = new Scanner(System.in);
			System.out.println("*******************************************************************************************************************************************************");
			System.out.println("Dans le cadre de la gestion de location de voitures, Mr Fakhari et Mme Yakine ont eu la chance de réaliser un mini projet.\n");
			System.out.println("Pour y accéder, veuillez suivre les consignes, \n ");
			System.out.print("Qu'elle est votre prenom? ");
			X= clavier.nextLine();
			System.out.println("Merci "+X+ " pour votre intéraction ^_^");
			System.out.println("			Commençant");	
			System.out.println("*******************************************************************************************************************************************************");
			
		//identification d'un objet agence 
			String nom;
			String adresse;
			System.out.print("Veuillez saisir le nom de l'agence : ");
			nom = clavier.nextLine();
			System.out.print("Veuillez saisir l'adresse de l'agence : ");
			adresse = clavier.nextLine();
			Agence agence1= new Agence(nom,adresse);
			System.out.println("----------------------------------------------------------");
			
		//identification d'un objet Directeur
			
			String nomDirecteur;
			String prenomDirecteur;
			System.out.print("Donner le nom du directeur : ");
			nomDirecteur=clavier.nextLine();
			System.out.print("\n Et puis son prénom : ");
			prenomDirecteur=clavier.nextLine();
			Directeur directeur1=new Directeur(nomDirecteur,prenomDirecteur);
			agence1.setDirecteur(directeur1);
			System.out.println("----------------------------------------------------------");
			
		//identification du gestionnaire
			
			String nomGestionnaire;
			String prenomGestionnaire;
		
			System.out.print("Donner le nom du gestionnaire de cette agence : ");
			nomGestionnaire=clavier.nextLine();
		
			System.out.print("Et puis son prénom : ");
			prenomGestionnaire=clavier.nextLine();
		
			Employe gestionnaire=new Employe(nomGestionnaire,prenomGestionnaire);
		
			agence1.setEmploye1(gestionnaire);
		
			
			System.out.println("-----------------------------Le personnel de l'agence-----------------------------");
			
			
		//identification du technicien
		
			String nomTechnicien;
			String prenomTechnicien;
		
			System.out.print("Donner le nom du technicien de cette agence : ");
			nomTechnicien=clavier.nextLine();
		
			System.out.print("Et puis son prénom : ");
			prenomTechnicien=clavier.nextLine();
			
			Employe technicien=new Employe(nomTechnicien,prenomTechnicien);
		
			agence1.setEmploye2(technicien);	
		
			
			System.out.println("-----------------------------Les voitures de l'agence-----------------------------");
		
		//identification des voitures que contient l'agence
		
			String chaine;
			int a;
			int  b;
			String nbre;
			int n;
			
			System.out.print("Maintenant on passe aux voitures, combient de voiture contient votre agence? ");
			nbre = clavier.nextLine();
			n=Integer.valueOf(nbre);
			
			Voiture[] Voitures;
			Voitures=new Voiture[n];
			
			int j;
			for(j=0;j<n;j++){
				int h=j+1;
				System.out.print("\nLe matricule de la "+ h +"ème voiture: ");
				chaine = clavier.nextLine();
				
				Voitures[j]=new Voiture(chaine);
				
				System.out.print("\nPuis son type : \n 1:Toyota \n 2:KIA \n 3:BMW \n 4:Mercedes \n Veuillez choisir un numéro: ");
				a = clavier.nextInt();
				switch(a){
				case 1:
					Voitures[j].setMarque("Toyota");
					break;
				case 2:
					Voitures[j].setMarque("KIA");
					break;
				case 3:
					Voitures[j].setMarque("BMW");
					break;
				case 4:
					Voitures[j].setMarque("Mercedes");
					break;
				default:
					Voitures[j].setMarque("Mercedes");
					break;	
				}
				
				System.out.print("\nSa marque : \n 1:Luxe \n 2:Sport \n 3:4x4 \n 4:Break \n 5:Berline \n 6:Mini \n 7:Economique\n Veuillez Choisir un numéro : ");
				b = clavier.nextInt();
				switch(b){
				case 1:
					Voitures[j].setType("Luxe");
					break;
				case 2:
					Voitures[j].setType("Sport");
					break;
				case 3:
					Voitures[j].setType("4x4");
					break;
				case 4:
					Voitures[j].setType("Break");
					break;
				case 5:
					Voitures[j].setType("Berline");
					break;
				case 6:
					Voitures[j].setType("Mini");
					break;
				case 7:
					Voitures[j].setType("Economique");
					break;
				default:
					Voitures[j].setType("Economique");
					break;
				
				}
				
				clavier.nextLine();
				
				
				System.out.print("\nEt sa carte grise : ");
				
				Voitures[j].setCarteGrise(clavier.nextLine());
				
				Voitures[j].setLouee(false);

				System.out.println("==========Les infos de la "+ h +"éme voiture son bien notées===============");
				System.out.println(" ");
			}
			
			agence1.setVoitures(Voitures);
			
		
			System.out.println("*****************Récapitulons les informations saisies!!***********************************************************************************************************");
		
			int nombreVoitures=agence1.getVoitures().length;
			System.out.println("l'agence que vous avez nommé "+agence1.getNom()+" se situe à "+agence1.getAdresse()+" son directeur est : " + directeur1.getNom()+" "+directeur1.getPrenom());
			System.out.println("Son gestionnaire est "+agence1.getEmploye1().getNom()+" "+agence1.getEmploye1().getPrenom()+" et son technicien est "+agence1.getEmploye2().getNom()+" "+agence1.getEmploye2().getPrenom()+" et a "+nombreVoitures+" voitures pour la location.");
			
			System.out.println("********************************************************************************************************************************************************************");
			System.out.println(" ");
			
			System.out.print("Pour vérifier les voitures tappez 0 :");
			int verifier =clavier.nextInt();
			clavier.nextLine();
			if(verifier==0){
				agence1.afficherVoitures();	
			}
			
			
			
			//identification des clients
			System.out.println("-----------------------------Saisie des informations de 3 clients de l'agence-----------------------------------------------------------------------------------------------");
			String N;
			String P;
			
				//locataire1
			System.out.println("=======================");
			System.out.print("Saisir le nom du 1er client : ");
			N = clavier.nextLine();

			System.out.print("Saisir le prénom du 1er client  : ");
			P = clavier.nextLine();
			Client client1 = new Client(N,P);
			
			
				//locataire2
			System.out.println("=======================");
			System.out.print("Saisir le nom du 2ème client : ");
			N = clavier.nextLine();
    
			System.out.print("Saisir le prénom du 2ème client  : ");
			P = clavier.nextLine();
			Client client2 = new Client(N,P);
			
				//locataire3
			System.out.println("=======================");
			System.out.print("Saisir le nom du 3ème client : ");
			N = clavier.nextLine();
    
			System.out.print("Saisir le prénom du 3ème client  : ");
			P = clavier.nextLine();
			Client client3 = new Client(N,P);
				
			
			
			//identification de 3 locations
			System.out.println("-----------------------------Enregistrement des opérations de locations--------------------------------------------------------------------------");
			Location[] Locations;
			Locations=new Location[3];
			
			int l=agence1.getVoitures().length;
			System.out.println(" ");
			System.out.println("******L'agence dispose des voitures suivantes:******************* ");
			agence1.afficherVoitures();
		
			
			//location 1
			System.out.println("=======================");
			
			System.out.print("Saisir un numéro entre "+1+" et "+ l +"pour la voiture à louer: ");
			int m =clavier.nextInt();
			Location location1=new Location(agence1.getVoitures()[m-1],client1);
			agence1.getVoitures()[m-1].setLouee(true);
			Locations[0]=location1;
			
			//location 2
			System.out.println("=======================");
			
			System.out.print("Saisir un numéro entre "+1+" et "+ l +"pour la voiture à louer: ");
			int p =clavier.nextInt();
			Location location2=new Location(agence1.getVoitures()[p-1],client2);
			agence1.getVoitures()[p-1].setLouee(true);
			Locations[1]=location2;
			
			//location 3
			System.out.println("=======================");
			
			System.out.print("Saisir un numéro entre "+1+" et "+ l +"pour la voiture à louer: ");
			int q =clavier.nextInt();
			Location location3=new Location(agence1.getVoitures()[q-1],client3);
			agence1.getVoitures()[q-1].setLouee(true);
			Locations[2]=location3;
			
			agence1.setLocations(Locations);
			
			System.out.println(" ");
			System.out.println("**********************************************Affichage des voitures louées:************************************************************* ");
			agence1.afficherVoituresLouees();
			System.out.println("\n\n \n************************************************************ FIN ****************************************************************************************************************** ");
	
			
			clavier.close();
					
					
	}
}


