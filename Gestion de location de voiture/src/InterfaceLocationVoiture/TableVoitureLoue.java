package InterfaceLocationVoiture;

	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
	
import java.util.Date;
	
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import InterfaceLocationVoiture.Interface;
import GestionVoiture.*;

	public class TableVoitureLoue {


		JFrame f;
		private JButton brevenir;
		
		JScrollPane p3;  // panel dans lequel on va mettre la table
		JTable tclients; 
		String[] row; //Les lignes d'une table
		String []cols={"Nom_Client","Date_Début","Date_Fin","Matricule","Type de paiment","Montant(DHS)"};   //les colonnes d'une table : trois colonnes

		public TableVoitureLoue(List <Location>listLocations) {
		
			f= new JFrame("Agence FEKHARI_YAKINE");
			
			brevenir= new JButton("Revenir au menu principale");
			
			tclients=new JTable();
			
			DefaultTableModel model= new DefaultTableModel();
			model.setColumnIdentifiers(cols);  
		    row=new String[10];	         
		    
		    
		    tclients.setModel(model);
		    tclients.setBackground(new Color(135,200,200));
		    
			
			
			JPanel p2=new JPanel( new GridBagLayout());
			
			p2.setBackground(new Color(179, 119, 68));
			p2.setBorder(BorderFactory.createTitledBorder("La gestion des Locations :"));
			((TitledBorder)p2.getBorder()).setTitleColor(Color.white);
			
		    p3= new JScrollPane(tclients);

		    p3.setPreferredSize(new Dimension(200, 600));
		    p3.setBorder(BorderFactory.createTitledBorder(""));
		    p3.setBackground(new Color(179, 119, 68));	

		    for(Location l: listLocations) {
		    	String nom=l.getClient().getNom();
		    	String matricule=l.getVoiture().getMatricule();
		    	String paiment=l.getTypePaiment();
		    	String montant=String.valueOf(l.calculMontant());

				//
				Format formatter = new SimpleDateFormat("yyyy-MM-dd");
				String dateDebut = formatter.format(l.getDateDebut());
				String dateFin = formatter.format(l.getDateDebut());
				//
				row[0]=nom;
				row[1]=dateDebut;
				row[2]=dateFin ;
				row[3]=matricule ;
				row[4]=paiment ;
				row[5]=montant ;
				model.addRow(row);
		    }
		    brevenir.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					f.setVisible(false);
					
				}
			});
			
		    JPanel p1=new JPanel( new GridBagLayout());
		    p1.add(brevenir);
		    p1.setBackground(new Color(179, 119, 68));
		    f.add(p1,BorderLayout.SOUTH);

			f.add(p2,BorderLayout.PAGE_START );
			f.add(p3,BorderLayout.CENTER );
			
			f.setLocationRelativeTo(null);
			  
			f.setSize(700, 500);
			f.setLocationRelativeTo(null);
			f.setVisible(true);		
		}

	}


