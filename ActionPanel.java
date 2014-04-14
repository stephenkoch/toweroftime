import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class ActionPanel extends JPanel implements MouseListener{

	
	JButton attackButton;
	JButton spellsButton;
	JButton itemsButton;
	public DefaultListModel actionLog; 
    JList actionLogList; 
    JScrollPane actionLogScroll;
	
	Game GAME;
	ActionPanel(Game g) {
	
		setBounds(510,600,690, 200);
		setLayout(null);
		setBackground(Color.cyan);
		
		attackButton = new JButton("Attack");
		attackButton.setLocation(45, 25);
		attackButton.setSize(150,50);
		attackButton.setVisible(true);
		
		spellsButton = new JButton("Spells");
		spellsButton.setLocation(270, 25);
		spellsButton.setSize(150,50);
		spellsButton.setVisible(true);
		
		itemsButton = new JButton("Items");
		itemsButton.setLocation(495, 25);
		itemsButton.setSize(150,50);
		itemsButton.setVisible(true);
		
		
		
		actionLog = new DefaultListModel();
		actionLogList = new JList(actionLog);
		actionLogScroll = new JScrollPane(actionLogList);
		actionLogScroll.setSize(650, 80);
		actionLogScroll.setLocation(20, 100);
		actionLogScroll.setVisible(true);
		//actionLogScroll.set

		GAME = g;
		
		add(attackButton);
		add(spellsButton);
		add(itemsButton);
		add(actionLogScroll);
		actionLog.addElement("lol");
		actionLog.addElement("loaaal");
		actionLog.addElement("losssl");
		actionLog.addElement("lol");
		actionLog.addElement("lodddl");
		actionLog.addElement("lol");
		actionLog.addElement("lol");
		actionLog.addElement("lofffl");
		actionLog.addElement("lol");
		actionLog.addElement("logggl");
		
		
		setVisible(true);
	}
	public void updatePanel() {
		if(GAME.inCombat) {
			attackButton.setVisible(true);
			spellsButton.setVisible(true);
			itemsButton.setVisible(true);
			actionLogScroll.setSize(650, 80);
			actionLogScroll.setLocation(20, 100);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == attackButton) {
			
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
