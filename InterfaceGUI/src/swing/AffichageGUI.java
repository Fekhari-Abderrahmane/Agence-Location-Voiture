package swing;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/*    1
 * il faut importer
 */
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import personne.Personne;
public class AffichageGUI {

	JFrame f;
	private JButton brevenir;
	
	JScrollPane p3;  // panel dans lequel on va mettre la table
	JTable tpersonnes; 
	String[] row; //Les lignes d'une table
	String []cols={"Nom","Prenom","Age"};   //les colonnes d'une table : trois colonnes

	public AffichageGUI(List <Personne>listPersonnes) {
	
		f= new JFrame(" Ma page swing");
		
		brevenir= new JButton("modifier");
		
		tpersonnes=new JTable();
		DefaultTableModel model= new DefaultTableModel();
		model.setColumnIdentifiers(cols);  // je passes les colonnes deja creer, voir section des declarations
	    row=new String[10];	         // table avec 4 lignes
	    
	    tpersonnes.setModel(model);
	    tpersonnes.setBackground(new Color(135,206,235));
		
	    p3= new JScrollPane(tpersonnes);
	    p3.setPreferredSize(new Dimension(200, 600));
	    p3.setBorder(BorderFactory.createTitledBorder("Tableau des personnes"));
	    p3.setBackground( new Color(95,158,160));	

	    for(Personne p: listPersonnes) {
	    	System.out.println(p.toString());// toString est une fonction generer automatiquemnet dans la classe Personne
	    	String nom=p.getNom();
			String prenom=p.getNom();
			int age=p.getAge();
			row[0]=nom;
			row[1]=prenom;
			row[2]=String.valueOf(age) ;
			model.addRow(row);
	    }
	    brevenir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 new PageGUIModelePersonne();	
				
			}
		});
			    
    /**
	 * ces lignes doivent rester a la fin
	 */
		
		f.add(p3,BorderLayout.NORTH);/// Ajout du p3 au centre

		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		f.setSize(700, 500);
		f.setVisible(true);		
	}

}
    
	