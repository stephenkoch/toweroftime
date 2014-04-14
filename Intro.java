import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Intro extends JFrame implements ActionListener
{

    int NextText = 0;
    String personname, sex, race;
    JButton Next = new JButton("->");
    JButton Continue = new JButton("Continue");
    
    JButton M 	 = new JButton("Male");
    JButton F	 = new JButton("Female");
    JLabel Text = new JLabel("Welcome to the Tower of Time. It is a game, and you are playing it.");
    JPanel TextBox = new JPanel();
    JLabel RaceSelection = new JLabel();
    JButton ELF = new JButton("ELF");
    JButton ORC = new JButton("ORC");
    JButton HUMAN = new JButton("HUMAN");
    JButton DWARF = new JButton("DWARF");
    JButton GNOME = new JButton("GNOME");
    JButton HALFLING = new JButton("HALFLING");
    JButton MARKSMAN = new JButton("MARKSMAN");
    JButton MAGE = new JButton("MAGE");
    JButton WARRIOR = new JButton("WARRIOR");

    JTextField Name = new JTextField("Type Name");
    Game GAME;

    JComboBox Race = new JComboBox();
    
    
    // Creating Custom Font
    Font ft = new Font("Times New Roman", Font.BOLD,16);
    
    
    public Intro(Game g) throws IOException
    {


    	
    	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    	this.setLocation(dim.width/5-this.getSize().width/5, dim.height/4-this.getSize().height/4);
    	GAME = g;
        setTitle("Introduction");
        setSize(800,220);
       
       getContentPane().add(TextBox);
       TextBox.setLayout(null);
       RaceSelection.setText("Human");
       // Add all Action Listeners
       // Set all Sizes
       Next.setSize(80,20);
       Continue.setSize(120,20);
       Text.setSize(800,100);
       Text.setForeground(Color.black);
       Text.setFont(ft);
       
       
       Next.setLocation(600,150);
       Continue.setLocation(300,150);
       Text.setLocation(10,10);
      

       // Add all Items to Panel
       TextBox.add(Next);
       TextBox.add(Continue);
       TextBox.add(Text);
       TextBox.add(RaceSelection);
       TextBox.add(Name);

        //Action Listeners
        Next.addActionListener(this);
        Continue.addActionListener(this);
        ELF.addActionListener(this);
        ORC.addActionListener(this);
        HUMAN.addActionListener(this);
        DWARF.addActionListener(this);
        GNOME.addActionListener(this);
        HALFLING.addActionListener(this);
        M.addActionListener(this);
        F.addActionListener(this);
        Name.addActionListener(this);
        MARKSMAN.addActionListener(this);
        MAGE.addActionListener(this);
        WARRIOR.addActionListener(this);

       
        // showing stuff
        setVisible(true);
    Continue.setVisible(false);
    }

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Name.setVisible(false);
		M.setVisible(false);
		F.setVisible(false);
		ELF.setVisible(false);
		ORC.setVisible(false);
		HUMAN.setVisible(false);
		DWARF.setVisible(false);
		GNOME.setVisible(false);
		HALFLING.setVisible(false);
		MARKSMAN.setVisible(false);
		MAGE.setVisible(false);
		WARRIOR.setVisible(false);
		Continue.setVisible(false);


		//All buttons are hidden until they are needed

		if((e.getSource() == Next) ||(e.getSource() == Continue) ||(e.getSource() == ELF)||(e.getSource() == ORC)||(e.getSource() == HUMAN)||(e.getSource() == DWARF)||(e.getSource() == GNOME)||(e.getSource() == HALFLING)||(e.getSource() == M)||(e.getSource() == F)||(e.getSource() == MARKSMAN)||(e.getSource() == MAGE)||(e.getSource() == WARRIOR)){

			// getting the persons name
			if(NextText==3){
				personname = Name.getText();
				System.out.print(personname);}

			// getting M or F choice
			if(NextText==4){
				if(e.getSource() == M){
					sex="MALE";
					System.out.print("MALE");}
				else
					sex = "FEMALE";
					System.out.print("FEMALE");}

			// getting Race choice
			if(NextText==5){
				if(e.getSource()==ELF){
					race="ELF";
					System.out.print("ELF");}

				if(e.getSource()==ORC){
					race="ORC";
					System.out.print("ORC");}

				if(e.getSource()==HUMAN){
						race="HUMAN";
						System.out.print("HUMAN");}

				if(e.getSource()==DWARF){
					race="DWARF";
					System.out.print("DWARF");}

				if(e.getSource()==GNOME){
					race="GNOME";
					System.out.print("GNOME");}

				if(e.getSource()==HALFLING){
					race="HALFLING";
					System.out.print("HALFLING");}
			}

			if(NextText==6){
				if(e.getSource()==MARKSMAN){
					race="MARKSMAN";
					System.out.print("MARKSMAN");}
				if(e.getSource()==MAGE){
					race="MAGE";
					System.out.print("MAGE");}
				if(e.getSource()==WARRIOR){
						race="WARRIOR";
						System.out.print("WARRIOR");}

			}


		NextText++;	
		}

		  if(NextText == 1)
		  {
			  Text.setText("You wake up. A hobbled old man, with a cane, is peering down at you.");
		  }

		  if(NextText == 2)
		  {
			Text.setText("He clears his throat.");  
		  }

	      if(NextText == 3)
	      {
	      Text.setText("I am the one they call Mushroom, and you are?");
	      Name.setSize(200,20);
	      Name.setLocation(00,80);
	      Name.setVisible(true);
	      Next.setVisible(false);
	      Continue.setVisible(true);
	      }

	      if(NextText == 4)
	      {
	      Next.setVisible(true);
	      Game.PLAYER.setName(Name.getText());
	      Text.setText("He laughs before stating, Your voice is rather high pitched, pardon my intrusion, but are you male or female?");
	      //hid the next button
	      Next.setSize(0,0);

	      //Make Male and Female appear on screen
	       M.setSize(80,20);
           F.setSize(80,20);
           M.setLocation(100,90);
           F.setLocation(10,90);
           TextBox.add(M);
		   TextBox.add(F);
		   M.setVisible(true);
		   F.setVisible(true);
	      }

	      if(NextText == 5)
	      {    
	      Text.setText(" He exclaims, Excellent! Using my intuition, I can say that you are an Elf. Am I correct?");
	      // Selecting ethnicity 
	       ELF.setSize(80,20);
	       ORC.setSize(80,20);
	       HUMAN.setSize(80,20);
	       DWARF.setSize(80,20);
	       GNOME.setSize(80,20);
	       HALFLING.setSize(120,20);

	       ELF.setLocation(10,90);
	       ORC.setLocation(100,90);
	       HUMAN.setLocation(200,90);
	       DWARF.setLocation(300,90);
	       GNOME.setLocation(400,90);
	       HALFLING.setLocation(500,90);

	       ELF.setVisible(true);
	       ORC.setVisible(true);
	       HUMAN.setVisible(true);
	       DWARF.setVisible(true);
	       GNOME.setVisible(true);
	       HALFLING.setVisible(true);

	       TextBox.add(ELF);
	       TextBox.add(ORC);
	       TextBox.add(HUMAN);
	       TextBox.add(DWARF);
	       TextBox.add(GNOME);
	       TextBox.add(HALFLING);

	      }

	      if(NextText ==6){
	    	  Text.setText("He responds, Ah, I see... What do you do for a living? You seem quite classy.");

	    	   MARKSMAN.setSize(120,20);
		       MAGE.setSize(120,20);
		       WARRIOR.setSize(120,20);

		       MARKSMAN.setLocation(10,90);
		       MAGE.setLocation(140,90);
		       WARRIOR.setLocation(270,90);

		       MARKSMAN.setVisible(true);
		       MAGE.setVisible(true);
		       WARRIOR.setVisible(true);

		       TextBox.add(MARKSMAN);
		       TextBox.add(MAGE);
		       TextBox.add(WARRIOR);
	      }

	      if(NextText == 7)
	      {
	    	  dispose();
	    	  try {
				GameFrame newGame = new GameFrame(GAME);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	      }
	}
}