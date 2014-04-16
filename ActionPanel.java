import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


@SuppressWarnings("serial")
public class ActionPanel extends JPanel implements MouseListener{

	
	JButton attackButton;
	JButton spellsButton;
	JButton itemsButton;
	DefaultListModel actionLog; 
    JList actionLogList; 
    JScrollPane actionLogScroll;
    JScrollBar vertical;
	
	Game GAME;
	ActionPanel(Game g) 
	{
	
		setBounds(510,600,690, 200);
		setLayout(null);
		setBackground(Color.gray);
		

		
		attackButton = new JButton("Attack");
		attackButton.setLocation(45, 25);
		attackButton.setSize(150,50);
		attackButton.setVisible(false);
		attackButton.addMouseListener(this);
		attackButton.setBackground(Color.yellow);
		
		spellsButton = new JButton("Spells");
		spellsButton.setLocation(270, 25);
		spellsButton.setSize(150,50);
		spellsButton.setVisible(false);
		spellsButton.setBackground(Color.yellow);
		
		itemsButton = new JButton("Items");
		itemsButton.setLocation(495, 25);
		itemsButton.setSize(150,50);
		itemsButton.setVisible(false);
		itemsButton.setBackground(Color.yellow);
		
		
		actionLog = new DefaultListModel();
		actionLogList = new JList(actionLog);
		actionLogScroll = new JScrollPane(actionLogList);
		actionLogScroll.setSize(650, 160);
		actionLogScroll.setLocation(20, 20);
		actionLogScroll.setVisible(true);
		
		//actionLogScroll.set

		GAME = g;
		
		add(attackButton);
		add(spellsButton);
		add(itemsButton);
		add(actionLogScroll);
		
		
		setVisible(true);
	}
	public void updatePanel() 
	{
		if(TowerOfTime.GAME.inCombat) {
			attackButton.setVisible(true);
			spellsButton.setVisible(true);
			itemsButton.setVisible(true);
			actionLogScroll.setSize(650, 80);
			actionLogScroll.setLocation(20, 100);
		}
		else if (!TowerOfTime.GAME.inCombat) {
			attackButton.setVisible(false);
			spellsButton.setVisible(false);
			itemsButton.setVisible(false);
			actionLogScroll.setSize(650, 160);
			actionLogScroll.setLocation(20, 20);
		}
		JScrollBar vertical = actionLogScroll.getVerticalScrollBar(); 
		vertical.setValue(vertical.getMaximum());
	}
	public void updateActionLog(String s) 
	{
		actionLog.addElement(s);
		updatePanel(); 
	}
	private void attack() 
	{
		Game.LEVEL.grid[Game.LEVEL.playerLocation.x][Game.LEVEL.playerLocation.y].getEncounter().getCombat().attack();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == attackButton) {
			//Attack
			attack();
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
