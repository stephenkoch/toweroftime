import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MovementPanel extends JPanel implements MouseListener{
	static int BUTTONSIZE = 70;
	JButton NORTH, SOUTH, EAST, WEST;
	
	MovementPanel() {
		this.setLayout(null);
		this.setSize(300, 300);
		this.setLocation(400, 700);
		
		NORTH = new JButton("North");
		SOUTH = new JButton("South");
		EAST = new JButton("East");
		WEST = new JButton("West");
		
		NORTH.setSize(BUTTONSIZE, BUTTONSIZE);
		SOUTH.setSize(BUTTONSIZE, BUTTONSIZE);
		EAST.setSize(BUTTONSIZE, BUTTONSIZE);
		WEST.setSize(BUTTONSIZE, BUTTONSIZE);
		
		NORTH.setLocation(470, 560);
		SOUTH.setLocation(470, 700);
		EAST.setLocation(400, 630);
		WEST.setLocation(540, 630);
		
		NORTH.addMouseListener(this);
		SOUTH.addMouseListener(this);
		EAST.addMouseListener(this);
		WEST.addMouseListener(this);
		
		NORTH.setBackground(Color.gray);
		SOUTH.setBackground(Color.gray);
		EAST.setBackground(Color.gray);
		WEST.setBackground(Color.gray);
		
		this.add(NORTH);
		this.add(SOUTH);
		this.add(EAST);
		this.add(WEST);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == NORTH) {
			//if (@TODO:there is a room) {
			NORTH.setBackground(Color.green);
			SOUTH.setBackground(Color.gray);
			EAST.setBackground(Color.gray);
			WEST.setBackground(Color.gray);
			//}
			//Else {
			//	NORTH.setBackground(Color.red);
			//	SOUTH.setBackground(Color.gray);
			//	EAST.setBackground(Color.gray);
			//	WEST.setBackground(Color.gray);
			//}
			
		}
			
		if (e.getSource() == SOUTH) {
			//if (@TODO:there is a room) {
					NORTH.setBackground(Color.gray);
					SOUTH.setBackground(Color.green);
					EAST.setBackground(Color.gray);
					WEST.setBackground(Color.gray);
					//}
					//Else {
					//	NORTH.setBackground(Color.gray);
					//	SOUTH.setBackground(Color.red);
					//	EAST.setBackground(Color.gray);
					//	WEST.setBackground(Color.gray);
					//}
			
		}

		if (e.getSource() == EAST) {
			//if (@TODO:there is a room) {
					NORTH.setBackground(Color.gray);
					SOUTH.setBackground(Color.gray);
					EAST.setBackground(Color.green);
					WEST.setBackground(Color.gray);
					//}
					//Else {
					//	NORTH.setBackground(Color.gray);
					//	SOUTH.setBackground(Color.gray);
					//	EAST.setBackground(Color.red);
					//	WEST.setBackground(Color.gray);
					//}
			
		}

		if (e.getSource() == WEST) {
			//if (@TODO:there is a room) {
					NORTH.setBackground(Color.gray);
					SOUTH.setBackground(Color.gray);
					EAST.setBackground(Color.gray);
					WEST.setBackground(Color.green);
					//}
					//Else {
					//	NORTH.setBackground(Color.gray);
					//	SOUTH.setBackground(Color.gray);
					//	EAST.setBackground(Color.gray);
					//	WEST.setBackground(Color.red);
					//}
			
		}
		
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		NORTH.setBackground(Color.gray);
		SOUTH.setBackground(Color.gray);
		EAST.setBackground(Color.gray);
		WEST.setBackground(Color.gray);
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == NORTH) {
		NORTH.setBackground(Color.yellow);
		}
		if (e.getSource() == SOUTH) {
		SOUTH.setBackground(Color.yellow);
		}
		if (e.getSource() == EAST) {
		EAST.setBackground(Color.yellow);
		}
		if (e.getSource() == WEST) {
		WEST.setBackground(Color.yellow);
		}
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		NORTH.setBackground(Color.gray);
		SOUTH.setBackground(Color.gray);
		EAST.setBackground(Color.gray);
		WEST.setBackground(Color.gray);
		
	}
}
