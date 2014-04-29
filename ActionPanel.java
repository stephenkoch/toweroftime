import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
public class ActionPanel extends JPanel implements MouseListener, KeyListener{

	
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
	
		setBounds(410,600,800, 190);
		setLayout(null);
		setBackground(Color.gray);
		
		attackButton = new JButton("Attack");
		attackButton.setLocation(10, 20);
		attackButton.setSize(120,50);
		attackButton.setVisible(true);
		attackButton.addMouseListener(this);
		attackButton.setBackground(Color.yellow);
		
		spellsButton = new JButton("Spells");
		spellsButton.setLocation(10, 75);
		spellsButton.setSize(120,50);
		spellsButton.setVisible(true);
		spellsButton.setBackground(Color.yellow);
		
		itemsButton = new JButton("Items");
		itemsButton.setLocation(10, 130);
		itemsButton.setSize(120,50);
		itemsButton.setVisible(true);
		itemsButton.setBackground(Color.yellow);
		
		
		actionLog = new DefaultListModel();
		actionLogList = new JList(actionLog);
		actionLogScroll = new JScrollPane(actionLogList);
		actionLogScroll.setSize(650, 160);
		actionLogScroll.setLocation(140, 20);
		actionLogScroll.setVisible(true);
		
		//actionLogScroll.set

		GAME = g;
		
		add(attackButton);
		add(spellsButton);
		add(itemsButton);
		add(actionLogScroll);
		addKeyListener(this);
		
		
		setVisible(true);
	}
	public void updatePanel() 
	{
		if(TowerOfTime.GAME.inCombat) {
			attackButton.setEnabled(true);
			spellsButton.setEnabled(true);
			itemsButton.setEnabled(true);
		}
		else if (!TowerOfTime.GAME.inCombat) {
			attackButton.setEnabled(false);
			spellsButton.setEnabled(false);
			itemsButton.setEnabled(false);
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
			if (TowerOfTime.GAME.inCombat){
				this.attack();
			}
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
	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a') {
			if (TowerOfTime.GAME.inCombat) {
				attack();
			}
		}	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
