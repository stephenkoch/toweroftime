import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartGamePanel extends JFrame implements ActionListener {
	
    private static int WIDTH = 800;
    private static int HEIGHT = 600;
    private static int BUTTONWIDTH = 200;
    private static int BUTTONHEIGHT = 100;
    JFrame frame;
    JPanel panel;
    JButton newGameBtn, loadGameBtn, exitBtn;
    
    public StartGamePanel() { 
    	frame = new JFrame("Menu");
    	frame.setVisible(true);
    	frame.setTitle("Tower of Time");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	panel = new JPanel();
    	frame.add(panel);
    	
    	newGameBtn = new JButton("New Game");
    	newGameBtn.setSize(BUTTONWIDTH,BUTTONHEIGHT);
    	newGameBtn.addActionListener(this);
    	
    	
    	loadGameBtn = new JButton("Load Game");
    	loadGameBtn.setSize(BUTTONWIDTH,BUTTONHEIGHT);
    	loadGameBtn.addActionListener(this);
    	
    	
    	exitBtn = new JButton("Exit");
    	exitBtn.setSize(BUTTONWIDTH,BUTTONHEIGHT);
    	exitBtn.addActionListener(this);
    	
    	panel.add(newGameBtn);
    	panel.add(loadGameBtn);
    	panel.add(exitBtn);
    }
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == newGameBtn) {
    	    frame.dispose();
    	    //\StatEqItPanel test = new StatEqItPanel();
    	    GameFrame THEGAMEWINDOW = new GameFrame();
    	}
    	else if(e.getSource() == loadGameBtn) {
    		frame.disable();
    	}
    	else if(e.getSource() == exitBtn) {
    		frame.dispose();
    		frame.hide();
    	}
    }
}