package InterfaceLocationVoiture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import GestionVoiture.Voiture;
public class AjoutEmploye {


	JFrame f;
	JPanel p1;
	JPanel p2;
	
	JLabel lnom;
	JLabel lprenom;
	JLabel lfonction;
	
	
	JTextField tnom;
	JTextField tprenom;	
	JTextField tfonction;	
		
	
	JButton b1;
	JButton b2;
	JButton b3;
	
	JScrollPane p3;  // panel dans lequel on va mettre la table
	JTable te; 
	String[] row; //Les lignes d'une table
	String []cols={"Nom","Prénom","Fonctionn"};   //les colonnes d'une table : 5 colonnes

	
	///
	//List<Voiture> listV;
	////
	
	final DefaultTableModel model= new DefaultTableModel();
	
	public AjoutEmploye() {
		//listV=new ArrayList<Voiture>();
		
	
		f= new JFrame("Agence FEKHARI_YAKINE");

		p1=new JPanel( new GridBagLayout());

		p1.setBackground(new Color(199, 173, 180));
		p1.setBorder(BorderFactory.createTitledBorder("Employé de l'agence:"));
		
		lnom=new JLabel("Nom: ");
		b1=new JButton("Ajouter");
		tnom=new JTextField(10);

		lprenom=new JLabel("Prenom: ");
		tprenom=new JTextField(10);
		
		lfonction=new JLabel("Fonction: ");
		tfonction=new JTextField(10);

		//ltype=new JLabel("Marque: ");
		//type=new JTextField(10);
		
		p2=new JPanel( new GridBagLayout());
		//Ajout du style a note panel p2
		p2.setBackground(new Color(199, 173, 180));
		p2.setBorder(BorderFactory.createTitledBorder(""));
		((TitledBorder)p2.getBorder()).setTitleColor(Color.white);
		
		//b3= new JButton("afficher");
		b2= new JButton("Revenir au menu principal");

		GridBagConstraints c=new GridBagConstraints();
		
		// position et ajout du lable 1 au panel
		c.gridx=0;
		c.gridy=1;
		p1.add(lnom, c);
		
		// position et ajout du champ de texte 1
		c.gridx=1;
		c.gridy=1;
		p1.add(tnom,c);

		c.gridx=0;
		c.gridy=2;
		p1.add(lprenom,c);
		
		c.gridx=1;
		c.gridy=2;
		p1.add(tprenom,c);
		
		c.gridx=0;
		c.gridy=3;
		p1.add(lfonction,c);
		c.gridx=1;
		c.gridy=3;
		p1.add(tfonction,c);


		
		c.gridx=4;
		c.gridy=4;
		p1.add(b1,c);
		c.gridx=1;
		c.gridy=0;
		p2.add(b2,c);



		
			/**
			 * 9-2 Creation d'une table
			 */
				te=new JTable();
				//final DefaultTableModel model= new DefaultTableModel();
				model.setColumnIdentifiers(cols);  // je passes les colonnes deja creer, voir section des declarations
			    row=new String[10];	         // table avec 4 lignes
			    te.setModel(model);
			    te.setBackground(new Color(176,196,222));
				
			    p3= new JScrollPane(te);
			    p3.setPreferredSize(new Dimension(200, 600));
			    p3.setBorder(BorderFactory.createTitledBorder(""));
			    p3.setBackground(new Color(95,158,160));
			    
			    ///////////////////////Ajout des matricule de voitures
			    /*
			    for(Voiture v: listV) {
			    	//System.out.println(p.toString());// toString est une fonction generer automatiquemnet dans la classe Personne
			    	//String nom=p.getNom();
					//String prenom=p.getNom();
					//int age=p.getAge();
					row[0]=v.getMatricule();
					System.out.println("Hello");
					//row[1]=prenom;
					//row[2]=String.valueOf(age) ;
					
					row[4]="Oui";
					model.addRow(row);
			    }
			    */
			    
			    ////
	
				/**
				 * 9-3 Ajout des enregistrements d'une table: au button b1 ajouter l'action suivante
				 */
	
				b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						row[0]=tnom.getText();
						row[1]=tprenom.getText();

						row[2]=tfonction.getText();
						//row[3]="Non";
						
						model.addRow(row);
						/*
					   Voiture v=new Voiture(matricule);
					   v.setMarque(marque);
					   v.setType(type);
					   v.setCarteGrise(cg);
					   v.setLouee(false);
					   listV.add(v);
					   */
					}
				});
			    
				
				b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						f.setVisible(false);
					}
				});
			    
			    
    /**
	 * ces lignes doivent rester a la fin
	 */
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.SOUTH);
		f.add(p3,BorderLayout.CENTER);/// Ajout du p3 au centre
		
		f.setLocationRelativeTo(null);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.setSize(600, 500);
		f.setLocationRelativeTo(null);
		//f.setVisible(true);		
	}


	

}
