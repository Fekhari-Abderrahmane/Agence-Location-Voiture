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


//import personne.Personne;
import GestionVoiture.Voiture;

public class AjoutVoiture {
	JFrame f;
	JPanel p1;
	JPanel p2;
	
	JLabel ltype;
	JLabel lcartegrise;
	JLabel lmatricule;
	JLabel lmarque;
	
	JTextField ttype;
	JTextField tmatricule;	
	JTextField tcartegrise;	
	JTextField tmarque;	
	
	JButton b1;
	JButton b2;
	JButton b3;
	
	JScrollPane p3;  // panel dans lequel on va mettre la table
	JTable tvoitures; 
	String[] row; //Les lignes d'une table
	String []cols={"Matricule","Marque","Type","Carte grise","Louée ou nonlouée"};   //les colonnes d'une table : 5 colonnes

	
	///
	List<Voiture> listV;
	////
	
	final DefaultTableModel model= new DefaultTableModel();
	
	public AjoutVoiture() {
		listV=new ArrayList<Voiture>();
		
	
		f= new JFrame("Agence FEKHARI_YAKINE ");

		p1=new JPanel( new GridBagLayout());

		p1.setBackground(new Color(123, 174, 213));
		p1.setBorder(BorderFactory.createTitledBorder("La gestion des voitures :"));
		((TitledBorder)p1.getBorder()).setTitleColor(Color.black);
		
		lmatricule=new JLabel("Matricule: ");
		b1=new JButton("Ajouter");
		tmatricule=new JTextField(10);

		lcartegrise=new JLabel("Carte Grise: ");
		tcartegrise=new JTextField(10);
		
		lmarque=new JLabel("Marque: ");
		tmarque=new JTextField(10);

		ltype=new JLabel("Marque: ");
		ttype=new JTextField(10);
		
		p2=new JPanel( new GridBagLayout());
		//Ajout du style a note panel p2
		p2.setBackground(new Color(229, 157, 23));
		p2.setBorder(BorderFactory.createTitledBorder(""));
		((TitledBorder)p2.getBorder()).setTitleColor(Color.white);
		
		
		b2= new JButton("Revenir au menu principal");

		GridBagConstraints c=new GridBagConstraints();
		
		// position et ajout du lable 1 au panel
		c.gridx=0;
		c.gridy=1;
		p1.add(lmatricule, c);

		
		// position et ajout du champ de texte 1
		c.gridx=1;
		c.gridy=1;
		p1.add(tmatricule,c);

		c.gridx=0;
		c.gridy=2;
		p1.add(lmarque,c);
		
		c.gridx=1;
		c.gridy=2;
		p1.add(tmarque,c);
		
		c.gridx=0;
		c.gridy=3;
		p1.add(lcartegrise,c);
		c.gridx=1;
		c.gridy=3;
		p1.add(tcartegrise,c);

		c.gridx=0;
		c.gridy=4;
		p1.add(ltype,c);
		c.gridx=1;
		c.gridy=4;
		p1.add(ttype,c);
		
		c.gridx=4;
		c.gridy=4;
		p1.add(b1,c);
		c.gridx=1;
		c.gridy=0;
		p2.add(b2,c);
		c.gridx=2;
		c.gridy=0;
		//p2.add(b3,c);


				tvoitures=new JTable();
				//final DefaultTableModel model= new DefaultTableModel();
				model.setColumnIdentifiers(cols);  // je passes les colonnes deja creer, voir section des declarations
			    row=new String[10];	         // table avec 4 lignes
			    tvoitures.setModel(model);
			    tvoitures.setBackground(new Color(229, 157, 23));
				
			    p3= new JScrollPane(tvoitures);
			    p3.setPreferredSize(new Dimension(200, 600));
			    p3.setBorder(BorderFactory.createTitledBorder(""));
			    p3.setBackground(new Color(229, 157, 23));
			    
			    
	
				b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						String matricule=tmatricule.getText();
						String cg=tcartegrise.getText();
						String marque=tmarque.getText();
						String type=ttype.getText();

						row[0]=matricule;
						row[1]=marque;
						row[2]=type;
						row[3]=cg;
						row[4]="Non";
						
						model.addRow(row);
					   Voiture v=new Voiture(matricule);
					   v.setMarque(marque);
					   v.setType(type);
					   v.setCarteGrise(cg);
					   v.setLouee(false);
					   //listV.add(v);
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

		f.setSize(600, 500);
		f.setLocationRelativeTo(null);
	}


	public List<Voiture> getListV() {
		return listV;
	}
	
	

	public void setListV(List<Voiture> listV) {
		this.listV = listV;
		 for(Voiture v: listV) {

			 	System.out.println("hehoooooooooooooooo&&&&");

				System.out.println("Hello");
				
				String[] roww;
				
				roww=new String[10];	    
				
				roww[0]="Oui";
				model.addRow(row);
		    }
	}
	
}
