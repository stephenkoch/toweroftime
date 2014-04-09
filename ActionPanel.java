import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ActionPanel extends JPanel implements ActionListener{

	
	JButton Attack;
	
	ActionPanel() {
	
		setBounds(510,600,690, 200);
		setLayout(null);
		setBackground(Color.cyan);
		
		Attack = new JButton("Attack");
		Attack.setLocation(50, 50);
		Attack.setSize(100,50);
		Attack.setVisible(true);
		
		
		add(Attack);
		setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
