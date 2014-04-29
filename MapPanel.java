import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static java.lang.System.out;

public class MapPanel extends JPanel implements ActionListener, KeyListener{

	protected Map m;
	JLabel mapPanelBackground;
	JPanel left, right;
	ImageIcon northImage = new ImageIcon("src/north.png");
	ImageIcon eastImage = new ImageIcon("src/east.png");
	ImageIcon southImage = new ImageIcon("src/south.png");
	ImageIcon westImage = new ImageIcon("src/west.png");
	ImageIcon mapPanelBackgroundImage = new ImageIcon("src/maptexture.jpg");
	JButton north = new JButton("N");
	JButton west = new JButton("W");
	JButton east = new JButton("E");
	JButton south = new JButton("S");
	Game GAME;

	public MapPanel(Map m, Game g) {
		this.m=m;
		GAME = g;
		setBounds(0, 560, 400, 400);
		JPanel left = makeMapLeft();
		JPanel right = makeRight();

		mapPanelBackground = new JLabel(mapPanelBackgroundImage);
		mapPanelBackground.setLocation(0, 0);
		mapPanelBackground.setSize(510, 400);
		
		 	north.addActionListener(this);   
		    east.addActionListener(this);     
		    south.addActionListener(this); 
		    west.addActionListener(this);  
			north.setBounds(72,5,46,60);
			north.setContentAreaFilled(true); north.setBorderPainted(true);
			west.setBounds(5,77,60,46);
			west.setContentAreaFilled(true); west.setBorderPainted(true);
			east.setBounds(125,77,60,46);
			east.setContentAreaFilled(true); east.setBorderPainted(true);
			south.setBounds(72,135,46,60);
			south.setContentAreaFilled(true); south.setBorderPainted(true);   

		setLayout(null);
		left.setBounds(0,0,210,210);
		right.setBounds(210,0,190,200);
		//add(mapPanelBackground);
		add(left);
		add(right);
	    setVisible(true);


	}
	public JPanel makeRight(){

		JPanel r = new JPanel();
		r.setLayout(null);

		//Direction Panel
		r.add(north);
		r.add(east);
		r.add(south);
		r.add(west);
		r.addKeyListener(this);
		//end Direction Panel
		return r;
	}
	public JPanel makeMapLeft(){
		JPanel l = new JPanel();
		l.setLayout(null);

		MapSquare[][] pan = new MapSquare[7][7];

		//actual game with fog of war
				for(int i=0; i<7; i++){
					for(int j=0;j<7;j++){
						String imageName = "";
						DungeonRoom room  = m.get(j, i);
						if(m.playerLocation.x==j && m.playerLocation.y==i){
							imageName+="p";
						}
						if(room!=null){
							if(room.getDiscovered()){
								for(int k=0;k<4;k++){
									if(room.getExits(k))
										imageName+="t";
									else
										imageName+="f";
								}
							}else if(room.getNearby()){
								imageName+="gggg";
							}else
								imageName+="ffff";
						}else
								imageName+="ffff";
						imageName+=".png";
						pan[i][j] = new MapSquare(j,i, imageName);
						l.add(pan[i][j]);
					}
				}
				/*
				//for demonstration purposes, shows whole map
				for(int i=0; i<7; i++){
					for(int j=0;j<7;j++){
						String imageName = "";
						DungeonRoom room  = m.get(j, i);
						if(m.playerLocation.x==j && m.playerLocation.y==i){
							imageName+="p";
						}
						if(room!=null){
							for(int k=0;k<4;k++){
								if(room.getExits(k))
									imageName+="t";
								else
									imageName+="f";
							}
							if(room.hasBoss()){
								imageName+="b";
							}
						}else
								imageName+="ffff";
						
						imageName+=".png";
						pan[i][j] = new MapSquare(j,i, imageName);
						left.add(pan[i][j]);
					}
				}*/
				return l;
	}


	public void updateMap(){
		if (!TowerOfTime.GAME.inCombat) {
		this.setVisible(false);
		this.removeAll();
		left = makeMapLeft();
		right = makeRight();
		left.setBounds(0,0,210,210);
		right.setBounds(210,0,300,200);
		add(left);
		add(right);
		this.setVisible(true);
		north.setEnabled(true);
		south.setEnabled(true);
		east.setEnabled(true);
		west.setEnabled(true);
		}
		else if (TowerOfTime.GAME.inCombat) {
			this.setVisible(false);
			this.removeAll();
			left = makeMapLeft();
			right = makeRight();
			left.setBounds(0,0,210,210);
			right.setBounds(210,0,300,200);
			add(left);
			add(right);
			this.setVisible(true);
			north.setEnabled(false);
			south.setEnabled(false);
			east.setEnabled(false);
			west.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent e) {
       if(e.getSource()==east) {
    	   m.movePlayer(1);
       }
       else if (e.getSource()==south) {
    	   m.movePlayer(2);
       }
       else if (e.getSource()==west) {
    	   m.movePlayer(3);
       }
       else {
    	   m.movePlayer(0);
       }
        TowerOfTime.GAME.THEGAMEFRAME.update();
    }
	@Override
	public void keyTyped(KeyEvent e) {
	    int keyCode = e.getKeyCode();
	    if (!TowerOfTime.GAME.inCombat) {
	    	switch( keyCode ) { 
	    		case KeyEvent.VK_UP:
	    			// handle up 
	    			break;
	    		case KeyEvent.VK_DOWN:
	    			// handle down 
	    			break;
	    		case KeyEvent.VK_LEFT:
	    			// handle left
	    			break;
	    		case KeyEvent.VK_RIGHT :
	    			// handle right
	    			break;
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
