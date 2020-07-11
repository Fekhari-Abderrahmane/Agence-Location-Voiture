package swing;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*    1
 * il faut importer
 */
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import personne.Personne;
public class PageGUITable {

	JFrame f;
	JPanel p1;
	JLabel l1;

	
	JLabel lprenom;
	JLabel lage;
	
	JTextField tnom;	
	JTextField tprenom;	
	JTextField tage;	
	
	JButton b1;
	JPanel p2;
	JButton b2;
	JButton b3;
	
	
	/** Etape 9:Ajout d'une table
	   9-1 Declaration de tous les attributs relatifs a la creation d'une table
	   9-2 Creation d'une table
	   9-3 Ajout des enregistrements d'une table: au button b1 
	*/

//On va remplacer ces champs par une table	
//	JTextField ajoutNom;	
//	JTextField ajoutPrenom;
//	JTextField ajoutAge;	


	 /**
	  * 9-1 Declaration de tous les attributs relatifs a la creation d'une table
	  */
	JScrollPane p3;  // panel dans lequel on va mettre la table
	JTable tpersonnes; 
	String[] row; //Les lignes d'une table
	String []cols={"Nom","Prenom","Age"};   //les colonnes d'une table : trois colonnes

	public PageGUITable() {
	
		f= new JFrame(" Ma page swing");

		p1=new JPanel( new GridBagLayout());

		p1.setBackground(Color.YELLOW);
		p1.setBorder(BorderFactory.createTitledBorder("Saisir les informations"));
		
		l1=new JLabel("Nom: ");
		b1=new JButton("Ajouter");
		tnom=new JTextField(10);

		lprenom=new JLabel("Prenom: ");
		tprenom=new JTextField(10);
		lage=new JLabel("age: ");
		tage=new JTextField(10);

		p2=new JPanel( new GridBagLayout());
		//Ajout du style a note panel p2
		p2.setBackground(new Color(102, 178, 255));
		p2.setBorder(BorderFactory.createTitledBorder("Action sur l'objet Personne"));
		((TitledBorder)p2.getBorder()).setTitleColor(Color.white);
		
		b2= new JButton("afficher");
		b3= new JButton("modifier");

		GridBagConstraints c=new GridBagConstraints();
		
		// position et ajout du lable 1 au panel
		c.gridx=0;
		c.gridy=1;
		p1.add(l1, c);
		
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
		p1.add(lage,c);
		c.gridx=1;
		c.gridy=3;
		p1.add(tage,c);

		c.gridx=1;
		c.gridy=4;
		p1.add(b1,c);
		c.gridx=1;
		c.gridy=0;
		p2.add(b2,c);
		c.gridx=2;
		c.gridy=0;
		p2.add(b3,c);

	
		//Remplace par une table voir ci dessous
		/*   p3=new JPanel();   // creation de p3
	    
		ajoutNom=new JTextField(10);
		ajoutNom.setEditable(false);  /// pour disabled
		c.gridx=2;
		c.gridy=0;
		p3.add(ajoutNom,c);
		
		ajoutPrenom=new JTextField(10);
		ajoutPrenom.setEditable(false);  /// pour disabled
		c.gridx=2;
		c.gridy=0;
		p3.add(ajoutPrenom,c);
		
		ajoutAge=new JTextField(10);
		ajoutAge.setEditable(false);  /// pour disabled
		c.gridx=2;
		c.gridy=0;
		p3.add(ajoutAge,c);
		*/
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
			    p3.setPreferredSize(new Dimension(200, 600));
			    p3.setBorder(BorderFactory.createTitledBorder("Tableau des personnes"));
			    p3.setBackground(new Color(95,158,160));
	
				/**
				 * 9-3 Ajout des enregistrements d'une table: au button b1 ajouter l'action suivante
				 */
	
				b1.addActionListener(new ActionListener() {
					
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
					   
						 //int f=Integer.parseInt(t21.getText());
						// m=new Personne(t11.getText(),t12.getText(),f);
						// produits.addElement(m);
					}
				});
			    
			    
			    
    /**
	 * ces lignes doivent rester a la fin
	 */
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.SOUTH);
		f.add(p3,BorderLayout.CENTER);/// Ajout du p3 au centre
		
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.setSize(700, 500);
		f.setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PageGUITable();
		 
	}

}
