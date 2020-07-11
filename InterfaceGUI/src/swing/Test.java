package swing;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import personne.Personne;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Test {
	
	public Test(){
		
		JFrame f;
f= new JFrame("FEKHARI && YAKINE");
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//panel info agence
		JPanel pinfo=new JPanel( new GridBagLayout());
		pinfo.setBackground(Color.PINK );
		pinfo.setBorder(BorderFactory.createTitledBorder("Informations sur l'agence"));
		
		JLabel nom=new JLabel("Nom de l'agence : ");;
		JLabel nomValeur=new JLabel("Agence RENT_STAR");;
		JLabel adrese=new JLabel("L'adresse : ");;
		JLabel adresseValeur=new JLabel("INSEA-RABAT");;
		JLabel nomdirecteur=new JLabel("Nom de directeur :");;
		JLabel nomdirecteurValeur=new JLabel("Mr XXXX ");;
		//////////////////////////////////////////////////////////////////////////:
		  
		
		
		
		
        //////////////////////////////////////////
		///Panel de l'information du client p1
		JPanel p1=new JPanel( new GridBagLayout());
		p1.setBackground(new Color(200, 111, 211) );
		
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
		JTextField tmatricule=new JTextField(10);
		
		JButton bajouter=new JButton("Ajouter client");
		JButton bcalcul=new JButton("Calcul montant de la location");
		////////////////////////////////////////
		
		
		//////////////////////////////////////////////////
		//Panel p2 voitures
		
		JPanel p2=new JPanel( new GridBagLayout());
		
		p2.setBackground(new Color(102, 178, 255));
		p2.setBorder(BorderFactory.createTitledBorder("Autres actions: "));
		((TitledBorder)p2.getBorder()).setTitleColor(Color.white);
		
		
		JButton afficherV= new JButton("afficher voitures");
		JButton afficherVL= new JButton("afficher Voiture Louées");
		JButton reinitialiser= new JButton("Réinitialiser les champs");
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
		
		//Checkbox pour type client
			Checkbox professionel = new Checkbox("Professionel");
			c.gridx=1;
			c.gridy=4;
			p1.add(professionel,c);
			Checkbox normal = new Checkbox("Normal");
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
		Checkbox espece = new Checkbox("Espèce");
		c.gridx=1;
		c.gridy=12;
		p1.add(espece,c);
		Checkbox carte = new Checkbox("Carte");
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
		c.gridx=0;
		c.gridy=14;
		p1.add(bajouter,c);
		
		c.gridx=1;
		c.gridy=14;
		p1.add(bcalcul,c);
		
		c.gridx=0;
		c.gridy=20;
		p1.add(reinitialiser,c);
		
		
		
		///////////////////////////////////////////////
		
		/////////// poistion du panel p2
		c.gridx=1;
		c.gridy=0;
		p2.add(afficherV,c);
		
		c.gridx=2;
		c.gridy=0;
		p2.add(afficherVL,c);
		
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
		/*
		 String path ="logo.jpg";
		 File file =new File(path);
	     BufferedImage image = ImageIO.read(file);
	     Image Nimage = image.getScaledInstance(180, 100, Image.SCALE_DEFAULT);
	     JLabel logo = new JLabel(new ImageIcon(Nimage));
	     c.gridx=0;
	     c.gridy=10;
	     pinfo.add(logo,c);
	     */
	     
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
		   c.gridx=15;
		   c.gridy=15;
		   pinfo.add(todaydate,c);
		   c.gridx=15;
		   c.gridy=14;
		   pinfo.add(ldate,c);
	     
	     
		//JImageComponent ic = new JImageComponent("aq");
		//imagePanel.add(ic);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		   
		   //////
		   /**
			  * 9-1 Declaration de tous les attributs relatifs a la creation d'une table
			  */
			JScrollPane p3;  // panel dans lequel on va mettre la table
			JTable tpersonnes; 
			final String[] row; //Les lignes d'une table
			String []cols={"Nom","Prenom","Age"};   //les colonnes d'une table : trois colonnes
			
			/**
			 * 9-2 Creation d'une table
			 */
				tpersonnes=new JTable();
				final DefaultTableModel model= new DefaultTableModel();
				model.setColumnIdentifiers(cols);  // je passes les colonnes deja creer, voir section des declarations
			    row=new String[10];	         // table avec 4 lignes
			    tpersonnes.setModel(model);
			    tpersonnes.setBackground(new Color(176,196,222));
				
			    p3= new JScrollPane(tpersonnes);
			    p3.setPreferredSize(new Dimension(20, 60));
			    p3.setBorder(BorderFactory.createTitledBorder("Tableau des personnes"));
			    p3.setBackground(new Color(95,158,160));
	
			    /**
				 * 9-3 Ajout des enregistrements d'une table: au button b1 ajouter l'action suivante
				 */
	
				bajouter.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						String nom=tnom.getText();
						String prenom=tprenom.getText();
						String age=tage.getText();
					//	ajoutNom.setText(nom);
					//	ajoutPrenom.setText(prenom);
					//	ajoutAge.setText(age);
						row[0]=nom;
						row[1]=prenom;
						row[2]=age;
						model.addRow(row);
						new PageGUIModelePersonne();
					   
						 //int f=Integer.parseInt(t21.getText());
						// m=new Personne(t11.getText(),t12.getText(),f);
						// produits.addElement(m);
					}
				});
		
		/////////////////////////////////////////// Ajout des panels dans f 
		
		//f.add(pinfo,BorderLayout.PAGE_START );
		f.add(p1,BorderLayout.CENTER );
		f.add(p2,BorderLayout.EAST);
		
		f.add(p3,BorderLayout.PAGE_START );
		
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.setSize(800, 700);
		//positionner l image dans le centre de l'ecran
		f.setLocationRelativeTo(null);
		f.setVisible(true);		
	}
		
	
	

	public static void main(String[] args) {
		
		new Test();
		// TODO Auto-generated method stub

	}

}
