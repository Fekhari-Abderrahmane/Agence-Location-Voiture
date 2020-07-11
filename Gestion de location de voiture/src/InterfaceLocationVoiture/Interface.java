package InterfaceLocationVoiture;

import InterfaceLocationVoiture.TableClient;
import GestionVoiture.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//for reading image from your computer
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;




public class Interface  {

	
	JFrame f;
	
	public Interface() throws IOException {
		
		f= new JFrame("Agence FEKHARI_YAKINE ");
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//panel info agence
		JPanel pinfo=new JPanel( new GridBagLayout());
		pinfo.setBackground(new Color(255, 254, 140));
		pinfo.setBorder(BorderFactory.createTitledBorder("Informations sur l'agence :"));
		
		JLabel nom=new JLabel("Nom de l'agence : ");;
		JLabel nomValeur=new JLabel("Agence Yakine&Fekhari pour location des voitures");;
		JLabel adrese=new JLabel("L'adresse : ");;
		JLabel adresseValeur=new JLabel("Institut National des Statistiques et d'Economie Appliquée,RABAT");;
		JLabel nomdirecteur=new JLabel("Nom de directeur :");;
		JLabel nomdirecteurValeur=new JLabel("Alami Idrissi");;
		
		///Panel de l'information du client p1
		JPanel p1=new JPanel( new GridBagLayout());
		p1.setBackground(new Color(252, 216, 230) );
		
		p1.setBorder(BorderFactory.createTitledBorder("Enregistrer une nouvelle location : "));
		
		JLabel lnom=new JLabel("Nom Client: ");
		JLabel lprenom=new JLabel("Prenom Client: ");
		JLabel lage=new JLabel("Age : ");
		JLabel ltype=new JLabel("Type du client: ");
		
		JLabel lcin=new JLabel("CIN: ");
		JLabel lpermis=new JLabel("Permis de conduite: ");
		JLabel ljd=new JLabel("Justificatif du domicile: ");
		
		JLabel ldateD=new JLabel("Date de début: ");
		JLabel ldateF=new JLabel("Date de fin: ");
		
		JLabel lpaiment=new JLabel("Type du paiment: ");
		
		JLabel lmatricule=new JLabel("Matricule de voiture à louer: ");
		
		final JTextField tnom=new JTextField(10);
		final JTextField tprenom=new JTextField(10);
		final JTextField tage=new JTextField(10);
		//JTextField ttype=new JTextField(10);
		final JTextField tcin=new JTextField(10);
		final JTextField tpermis=new JTextField(10);
		final JTextField tjd=new JTextField(10);
		final JTextField tdateD=new JTextField(10);
		final JTextField tdateF=new JTextField(10);
		//JTextField tpaiment=new JTextField(10);
		final JTextField tmatricule=new JTextField(10);
		
		JButton bajouter=new JButton("Ajouter client");
		JButton bcalcul=new JButton("Calcul montant de la location");
		////////////////////////////////////////
		
		
		//////////////////////////////////////////////////
		//Panel p2 voitures
		
		JPanel p2=new JPanel( new GridBagLayout());
		
		p2.setBackground(new Color(91, 127, 201));
		p2.setBorder(BorderFactory.createTitledBorder("Autres actions: "));
		((TitledBorder)p2.getBorder()).setTitleColor(Color.white);
		
		
		JButton afficherE= new JButton("Afficher mes employés");
		JButton afficherV= new JButton("Afficher mes voitures");
		JButton afficherVL= new JButton("Afficher mes locations");
		JButton reinitialiser= new JButton("Réinitialiser les champs");
		JButton afficherClient= new JButton("Afficher mes clients");
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		//////////////////////////////////////////////////////////////////////////
		//Positionnement ds panels
		
		GridBagConstraints c=new GridBagConstraints();
		
		//////////////////
		// position et ajout des labels du panel d'enregistrement de location
		c.gridx=0;
		c.gridy=0;
		p1.add(lnom, c);
		c.gridx=1;
		c.gridy=0;
		p1.add(tnom,c);
		
		// position et ajout du champ de texte 1

		c.gridx=0;
		c.gridy=2;
		p1.add(lprenom,c);
		c.gridx=1;
		c.gridy=2;
		p1.add(tprenom,c);
		
		c.gridx=0;
		c.gridy=3;
		p1.add(lage,c);
		c.gridx=1;
		c.gridy=3;
		p1.add(tage,c);
		
		c.gridx=0;
		c.gridy=4;
		p1.add(ltype,c);
		c.gridx=1;
		c.gridy=4;
		//p1.add(ttype,c);
		
		
		//
		//Checkbox pour type client
		final CheckboxGroup typeclient= new CheckboxGroup();
		
		final Checkbox professionel = new Checkbox("Professionel");
		professionel.setCheckboxGroup(typeclient);
		c.gridx=1;
		c.gridy=4;
		p1.add(professionel,c);
		final Checkbox normal = new Checkbox("Normal");
		normal.setCheckboxGroup(typeclient);
		c.gridx=2;
		c.gridy=4;
		p1.add(normal,c);
		///
		
		c.gridx=0;
		c.gridy=6;
		p1.add(lcin,c);
		c.gridx=1;
		c.gridy=6;
		p1.add(tcin,c);
		
		c.gridx=0;
		c.gridy=7;
		p1.add(lpermis,c);
		c.gridx=1;
		c.gridy=7;
		p1.add(tpermis,c);
		
		c.gridx=0;
		c.gridy=8;
		p1.add(ljd,c);
		c.gridx=1;
		c.gridy=8;
		p1.add(tjd,c);
		
		c.gridx=0;
		c.gridy=10;
		p1.add(ldateD,c);
		c.gridx=1;
		c.gridy=10;
		p1.add(tdateD,c);
		
		c.gridx=0;
		c.gridy=11;
		p1.add(ldateF,c);
		c.gridx=1;
		c.gridy=11;
		p1.add(tdateF,c);
		
		c.gridx=0;
		c.gridy=12;
		p1.add(lpaiment,c);
		c.gridx=1;
		c.gridy=12;
		//p1.add(tpaiment,c);
		
		//checkbox de type de paiment
		final CheckboxGroup paiment= new CheckboxGroup(); 
		final Checkbox espece = new Checkbox("Espèce");
		espece.setCheckboxGroup(paiment);		
		c.gridx=1;
		c.gridy=12;
		p1.add(espece,c);
		final Checkbox carte = new Checkbox("Carte");
		carte.setCheckboxGroup(paiment);
		c.gridx=2;
		c.gridy=12;
		p1.add(carte,c);
		
		c.gridx=0;
		c.gridy=13;
		p1.add(lmatricule,c);
		c.gridx=1;
		c.gridy=13;
		p1.add(tmatricule,c);
		
		// position et ajout ds boutons ajouter et calculer
		c.gridx=1;
		c.gridy=20;
		p1.add(bajouter,c);
		
		c.gridx=1;
		c.gridy=14;
		//p1.add(bcalcul,c);
		
		c.gridx=1;
		c.gridy=16;
		p1.add(reinitialiser,c);
		
		
		
		///////////////////////////////////////////////
		
		/////////// poistion du panel p2
		c.gridx=0;
		c.gridy=0;
		p2.add(afficherV,c);
		
		c.gridx=11;
		c.gridy=0;
		p2.add(afficherVL,c);
		
		c.gridx=11;
		c.gridy=20;
		p2.add(afficherClient);
		
		c.gridx=0;
		c.gridy=2;
		p2.add(afficherE);
		
		//////////////////////positionnement du panel pinfo
		
		c.gridx=2;
		c.gridy=0;
		pinfo.add(nom,c);
		
		c.gridx=3;
		c.gridy=0;
		pinfo.add(nomValeur,c);
		
		c.gridx=2;
		c.gridy=1;
		pinfo.add(adrese,c);
		
		c.gridx=3;
		c.gridy=1;
		pinfo.add(adresseValeur,c);
		
		c.gridx=2;
		c.gridy=2;
		pinfo.add(nomdirecteur,c);
		
		c.gridx=3;
		c.gridy=2;
		pinfo.add(nomdirecteurValeur,c);
		
		// image
		
		 String path ="logo.jpg";
		 File file =new File(path);
	     BufferedImage image = ImageIO.read(file);
	     Image Nimage = image.getScaledInstance(120, 120, Image.SCALE_DEFAULT);
	     JLabel logo = new JLabel(new ImageIcon(Nimage));
	     //c.gridx=0;
	     c.gridx=7;
	     c.gridy=3;
	     pinfo.add(logo,c);
	     
	     
	     ////date
	       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	       //Date dateobj = new Date();
	       //System.out.println(df.format(dateobj));
	       /*getting current date time using calendar class 
	        * An Alternative of above*/
	       Calendar calobj = Calendar.getInstance();
	       //System.out.println(df.format(calobj.getTime()));
	       JLabel ldate=new JLabel("Date d'au jour d'hui : " );
	       JLabel todaydate=new JLabel(df.format(calobj.getTime()));
		   c.gridx=18;
		   //c.gridy=15;
		   c.gridy=1;
		   pinfo.add(todaydate,c);
		   c.gridx=18;
		   //c.gridy=14;
		   c.gridy=0;
		   pinfo.add(ldate,c);
	     
	     
		//JImageComponent ic = new JImageComponent("aq");
		//imagePanel.add(ic);
		
		   
		   
		   //// Liste de voiture pour afficher voiture 
		   //final AjoutVoiture a=new AjoutVoiture();
		   //final AjoutVoiture a;
		   
		   
		   final AjoutVoiture a=new AjoutVoiture();
		   
		////////////////////
		   
		   //Bouton ajouter client
		   
		   
		   final List<Client> listClients=new ArrayList<Client>();//liste pour la passer en parametre de tableau client
		   final List<Location> listLocation=new ArrayList<Location>();//liste pour la passer en parametre de tableau locations
		   
		   bajouter.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//////////////////////////////////////////////////////////partie ajout dans tableau client
					String nom=tnom.getText();
					String prenom=tprenom.getText();
					//String age=tage.getText();
					String type;
					
					if(professionel.getState()==true){type="Professionel";}
					else{type="Normal";}
					
					Client qq=new Client(nom,prenom,type);
					Document dd=new Document(Integer.parseInt(tpermis.getText()),"PERMIS");
					Document ddd=new Document(Integer.parseInt(tjd.getText()),"JD");
					Document d=new Document(Integer.parseInt(tcin.getText()),"CIN");
					
					Document[] ClientDOC;
					ClientDOC=new Document[]{d,dd,ddd};
					//ClientDOC=new Document[]{d};
					qq.setDocuments(ClientDOC);
					listClients.add(qq);
////////////////////////////////////////////////////////partie ajout dans tableau location
					//
					String matricule = tmatricule.getText();
					Voiture voiture=new Voiture(matricule);
					
					Location l=new Location(voiture,qq);
					
					//reading date from textfield
					//date debut
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					java.util.Date textFieldAsDate = null;

				    try {
						textFieldAsDate = sdf.parse(tdateD.getText());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				    //date fin
				    SimpleDateFormat sdff = new SimpleDateFormat("dd/MM/yyyy");
					java.util.Date textFieldAsDateF = null;

				    try {
						textFieldAsDateF = sdff.parse(tdateF.getText());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				    l.setDateDebut(textFieldAsDate);
				    l.setDateFin(textFieldAsDateF);
					
				    
					String paiment;
					if(espece.getState()==true){paiment="Espece";}
					else{paiment="Carte";}
					l.setTypePaiment(paiment);
					if(l.getDuree()>10){l.setTypePaiment("Carte");}
					l.setPrix(300);
					listLocation.add(l);
					
//////////////////////////////////////////////////////////////////////////////// ajouter cette voiture a la table des voitures
					//a.getListV().add(voiture);
					
					//AjoutVoiture a=new AjoutVoiture();
					
					List<Voiture> liste=new ArrayList<Voiture>();
					liste=a.getListV();
					liste.add(voiture);
					a.setListV(liste);
					
					//System.out.println("hehoooooooooooooooo");
					//System.out.println(a.getListV().toString());
					
					
					//liste=a.getListV();
					//liste.add(voiture);
					//
					
					
					
				}
			});
		   //Boutton afficherClient
		   afficherClient.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new TableClient(listClients);
				}
			});
		   
		   //Boutton afficherLocation
		   afficherVL.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new TableVoitureLoue(listLocation);
				}
			});
		   
		   //bouttonn renitialiser
		   reinitialiser.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					tnom.setText("");
					tprenom.setText("");
					tage.setText("");
					tcin.setText("");
					tpermis.setText("");
					tjd.setText("");
					tdateD.setText("");
					tdateF.setText("");
					tmatricule.setText("");
					
					typeclient.setSelectedCheckbox(null);
					paiment.setSelectedCheckbox(null);
				}
			});
		   
		   // boutton afficher voiture
		   //final List<Voiture> VL=new ArrayList<Voiture>();
		   //Voiture q=new Voiture("MATRICUL AAAA WWWW");
		   //VL.add(voiture);
		   
		   afficherV.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					AjoutVoiture a=new AjoutVoiture();
					a.f.setVisible(true);


					
				}
			});
		   //
		   //
		   //
		   //boutton afficher employee
		   afficherE.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					AjoutEmploye a=new AjoutEmploye();
					a.f.setVisible(true);


					
				}
			});

		
		/////////////////////////////////////////// Ajout des panels dans f 
		
		f.add(pinfo,BorderLayout.PAGE_START );
		f.add(p1,BorderLayout.CENTER );
		f.add(p2,BorderLayout.PAGE_END);
		
		
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.setSize(800, 700);
		//positionner l image dans le centre de l'ecran
		f.setLocationRelativeTo(null);
		f.setVisible(true);		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Interface(); 
		

	}

}
