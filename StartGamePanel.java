import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class StartGamePanel extends JFrame implements MouseListener {
	
    private static int WIDTH = 600;
    private static int HEIGHT = 400;
    private static int BUTTONWIDTH = 150;
    private static int BUTTONHEIGHT = 50;
    JFrame frame;
    JPanel panel;
    JLabel picLabel;
    JButton newGameButton, loadGameButton, exitButton;
	BufferedImage STARTBACKGROUND = ImageIO.read(new File("/Users/Jose/Documents/workspace/TestMC/src/StartGameBackground.jpg"));
	BufferedImage NEWGAMEIMAGE = ImageIO.read(new File("/Users/Jose/Documents/workspace/TestMC/src/NewGameButton1.jpg"));
	BufferedImage LOADGAMEIMAGE = ImageIO.read(new File("/Users/Jose/Documents/workspace/TestMC/src/LoadGameButton1.jpg"));
	BufferedImage EXITIMAGE = ImageIO.read(new File("/Users/Jose/Documents/workspace/TestMC/src/ExitButton1.jpg"));
	BufferedImage NEWGAMEIMAGE2 = ImageIO.read(new File("/Users/Jose/Documents/workspace/TestMC/src/NewGameButton2.jpg"));
	BufferedImage LOADGAMEIMAGE2 = ImageIO.read(new File("/Users/Jose/Documents/workspace/TestMC/src/LoadGameButton2.jpg"));
	BufferedImage EXITIMAGE2 = ImageIO.read(new File("/Users/Jose/Documents/workspace/TestMC/src/ExitButton2.jpg"));
	public StartGamePanel() throws IOException {
    	frame = new JFrame("Menu");
    	frame.setVisible(true);
    	frame.setTitle("Tower of Time");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setResizable(false);
    	


    	
		
    	
    	panel = new JPanel();
    	this.setLayout(null);
    	panel.setLayout(null);
    	
    	picLabel = new JLabel(new ImageIcon(STARTBACKGROUND));
    	picLabel.setSize(600,400);
    	picLabel.setLocation(0,0);
    	
    	newGameButton = new JButton(new ImageIcon(NEWGAMEIMAGE));
    	newGameButton.setSize(BUTTONWIDTH,BUTTONHEIGHT);
    	newGameButton.setLocation(225, 50);
    	newGameButton.addMouseListener(this);
    	
    	
    	loadGameButton = new JButton(new ImageIcon(LOADGAMEIMAGE));
    	loadGameButton.setSize(BUTTONWIDTH,BUTTONHEIGHT);
    	loadGameButton.setLocation(225, 150);
    	loadGameButton.addMouseListener(this);
    	
    	
    	exitButton = new JButton(new ImageIcon(EXITIMAGE));
    	exitButton.setSize(BUTTONWIDTH,BUTTONHEIGHT);
    	exitButton.setLocation(225, 250);
    	exitButton.addMouseListener(this);
    	
    	frame.add(panel);
    	panel.add(newGameButton);
    	panel.add(loadGameButton);
    	panel.add(exitButton);
    	panel.add(picLabel);
    	
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == newGameButton) {
    	    frame.dispose();
    	    //\StatEqItPanel test = new StatEqItPanel();
    	    GameFrame THEGAMEWINDOW = new GameFrame();
    	}
    	else if(e.getSource() == loadGameButton) {
    		//frame.disable();
    	}
    	else if(e.getSource() == exitButton) {
    		frame.dispose();
    		frame.hide();
    		
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
		if (e.getSource() == newGameButton) {
    	   newGameButton.setIcon(new ImageIcon(NEWGAMEIMAGE2));
    	}
    	else if(e.getSource() == loadGameButton) {
    		loadGameButton.setIcon(new ImageIcon(LOADGAMEIMAGE2));
    	}
    	else if(e.getSource() == exitButton) {
    		exitButton.setIcon(new ImageIcon(EXITIMAGE2));
    	}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == newGameButton) {
	    	   newGameButton.setIcon(new ImageIcon(NEWGAMEIMAGE));
	    	}
	    	else if(e.getSource() == loadGameButton) {
	    		loadGameButton.setIcon(new ImageIcon(LOADGAMEIMAGE));
	    	}
	    	else if(e.getSource() == exitButton) {
	    		exitButton.setIcon(new ImageIcon(EXITIMAGE));
	    	}
		
	}
}