package InterfaceLocationVoiture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;





/*    1
 * il faut importer
 */
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;




import InterfaceLocationVoiture.Interface;
import GestionVoiture.Client;

public class TableClient {


	JFrame f;
	private JButton brevenir;
	
	JScrollPane p3;  // panel dans lequel on va mettre la table
	JTable tclients; 
	String[] row; //Les lignes d'une table
	String []cols={"Nom","Prenom","Type","CIN","Permis","JD"};   //les colonnes d'une table : trois colonnes

	public TableClient(List <Client>listClients) {
	
		f= new JFrame("Agence FEKHARI_YAKINE");
		
		brevenir= new JButton("Revenir au menu principale");
		
		tclients=new JTable();
		DefaultTableModel model= new DefaultTableModel();
		model.setColumnIdentifiers(cols);  // je passes les colonnes deja creer, voir section des declarations
	    row=new String[10];	         // table avec 4 lignes
	    
	    tclients.setModel(model);
	    tclients.setBackground(new Color(135,206,235));
		
	    p3= new JScrollPane(tclients);
	    p3.setPreferredSize(new Dimension(200, 600));
	    p3.setBorder(BorderFactory.createTitledBorder("Les client de l'agence FEKHARI_YAKINE sont:"));
	    p3.setBackground( new Color(95,158,160));	

	    for(Client p: listClients) {
	    	System.out.println(p.toString());// toString est une fonction generer automatiquemnet dans la classe Personne
	    	String nom=p.getNom();
			String prenom=p.getPrenom();
			String type=p.getType();
			String cin=String.valueOf(p.getDocuments()[0].getNumero());
			String permis=String.valueOf(p.getDocuments()[1].getNumero());
			String jd=String.valueOf(p.getDocuments()[2].getNumero());
			//String cin="111";
			row[0]=nom;
			row[1]=prenom;
			row[2]=type ;
			row[3]=cin ;
			row[4]=permis ;
			row[5]=jd ;
			model.addRow(row);
	    }
	    brevenir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				
			}
		});
			    
    /**
	 * ces lignes doivent rester a la fin
	 */
	    JPanel p1=new JPanel( new GridBagLayout());
	    p1.setBackground( new Color(95,158,160));	
	    
	    p1.add(brevenir);
	    f.add(p1,BorderLayout.SOUTH);/// Ajout du p3 au centre
	    
		f.add(p3,BorderLayout.CENTER);/// Ajout du p3 au centre

	
		f.setLocationRelativeTo(null);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.setSize(500, 400);
		//positionner l image dans le centre de l'ecran
		f.setLocationRelativeTo(null);
		f.setVisible(true);	
	}

}

