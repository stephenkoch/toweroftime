import javax.swing.*;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;


public class Intro extends JFrame implements ActionListener{
    int NextText = 0;
    String personname, sex, race;
    JButton Next = new JButton("->");
    JButton Back = new JButton("<-");
    JButton M 	 = new JButton("Male");
    JButton F	 = new JButton("Female");
    JLabel Text = new JLabel("Setting: You wake up in a cell that is quite dark. You hear a faint sound of footsteps walking towards you.");
    JPanel TextBox = new JPanel();
    JLabel RaceSelection = new JLabel();
    JButton R1 = new JButton("Race1");
    JButton R2 = new JButton("Race2");
    JButton R3 = new JButton("Race3");
    JButton R4 = new JButton("Race4");
    JButton R5 = new JButton("Race5");
    JButton R6 = new JButton("Race6");
    JButton C1 = new JButton("CLASS1");
    JButton C2 = new JButton("CLASS2");
    JButton C3 = new JButton("CLASS3");
    JButton C4 = new JButton("CLASS4");

    JTextField Name= new JTextField("Type Name");
    
    //Radio Buttons
    
    

    JComboBox Race = new JComboBox();
    Game GAME;
    
    // Creating Custom Font
    Font ft = new Font("Brush Script MT", Font.BOLD, 15);
    
    
    public Intro(Game g){   
    	GAME = g;
        setTitle("Character");
        setSize(800,200);
        setBackground(Color.DARK_GRAY);
       
       getContentPane().add(TextBox);
       TextBox.setLayout(null);
       Back.setVisible(false);
       RaceSelection.setText("Human");
       // Add all Action Listeners
       // Set all Sizes
       Next.setSize(80,20);
       Back.setSize(80,20);
       Text.setSize(800,100);
       Text.setForeground(Color.black);
       Text.setFont(ft);
       
       
       Next.setLocation(600,150);
       Back.setLocation(680,150);
       Text.setLocation(10,10);
      

       // Add all Items to Panel
       TextBox.add(Next);
       TextBox.add(Back);
       TextBox.add(Text);
       TextBox.add(RaceSelection);
       TextBox.add(Name);

        //Action Listeners
        Next.addActionListener(this);
        Back.addActionListener(this);
        Back.addActionListener(this);
        R1.addActionListener(this);
        R2.addActionListener(this);
        R3.addActionListener(this);
        R4.addActionListener(this);
        R5.addActionListener(this);
        R6.addActionListener(this);
        M.addActionListener(this);
        F.addActionListener(this);
        Name.addActionListener(this);
        C1.addActionListener(this);
        C2.addActionListener(this);
        C3.addActionListener(this);
        C4.addActionListener(this);


        
       
        // showing stuff
        setVisible(true);
        		
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Name.setVisible(false);
		M.setVisible(false);
		F.setVisible(false);
		R1.setVisible(false);
		R2.setVisible(false);
		R3.setVisible(false);
		R4.setVisible(false);
		R5.setVisible(false);
		R6.setVisible(false);
		Back.setVisible(false);
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		
		
		//All buttons are hidden until they are needed

		if((e.getSource() == Next) ||(e.getSource() == R1)||(e.getSource() == R2)||(e.getSource() == R3)||(e.getSource() == R4)||(e.getSource() == R5)||(e.getSource() == R6)||(e.getSource() == M)||(e.getSource() == F)||(e.getSource() == C1)||(e.getSource() == C2)||(e.getSource() == C3)||(e.getSource() == C4)){
			
			// getting the persons name
			if(NextText==3){
				personname = Name.getText();
				System.out.print(personname);}
			
			// getting M or F choice
			if(NextText==4){
				if(e.getSource() == M){
					sex="man";
					System.out.print("MALE");}
				else
					sex = "female";
					System.out.print("FEMALE");}
			
			// getting Race choice
			if(NextText==5){
				if(e.getSource()==R1){
					race="R1";
					System.out.print("RACE1");}
				if(e.getSource()==R2){
					race="R2";
					System.out.print("RACE2");}
				if(e.getSource()==R3){
						race="R3";
						System.out.print("RACE3");}
				if(e.getSource()==R4){
					race="R4";
					System.out.print("RACE4");}
				if(e.getSource()==R5){
					race="R5";
					System.out.print("RACE5");}
				if(e.getSource()==R6){
					race="R6";
					System.out.print("RACE6");}
			}
			
			if(NextText==6){
				if(e.getSource()==C1){
					race="CLASS1";
					System.out.print("CLASS");}
				if(e.getSource()==C2){
					race="CLASS2";
					System.out.print("CLASS");}
				if(e.getSource()==C3){
						race="CLASS3";
						System.out.print("CLASS3");}
				if(e.getSource()==C4){
					race="CLASS4";
					System.out.print("CLASS4");}
				
			}
			
			
		NextText++;	
		}

		if(e.getSource() == Back)
		{
		if(NextText >= 0)
		NextText--;
	    }
		  if(NextText == 1)
		  {
			  Text.setText("You see the form of a man peering through the bars of your cell.");
		  }

		  if(NextText == 2)
		  {
			Text.setText("The dark figure asks, Why are you here?... I guess it doesn't matter why you're in there. ");  
		  }

	      if(NextText == 3)
	      {
	      Text.setText("I'm Mushroom and you are?");
	      Name.setSize(200,20);
	      Name.setLocation(00,80);
	      Name.setVisible(true);
	      }

	      if(NextText == 4)
	      {
	    	  Game.PLAYER.setName(Name.getText());
	    	  Name.setSize(0,0);
	      Text.setText("I see... Is that a Man's name or a Womans's name?");
	      //hid the next button
	      Next.setSize(0,0);
	      Back.setSize(0,0);

	      //Make Male and Female appear on screen
	       M.setSize(80,20);
           F.setSize(80,20);
           M.setLocation(100,70);
           F.setLocation(10,70);
           TextBox.add(M);
		   TextBox.add(F);
		   M.setVisible(true);
		   F.setVisible(true);
	      }

	      if(NextText == 5)
	      {    
	      Text.setText("Where are you from?");
	      // Selecting ethnicity 
	       R1.setSize(80,20);
	       R2.setSize(80,20);
	       R3.setSize(80,20);
	       R4.setSize(80,20);
	       R5.setSize(80,20);
	       R6.setSize(80,20);

	       R1.setLocation(10,70);
	       R2.setLocation(100,70);
	       R3.setLocation(200,70);
	       R4.setLocation(300,70);
	       R5.setLocation(400,70);
	       R6.setLocation(500,70);

	       R1.setVisible(true);
	       R2.setVisible(true);
	       R3.setVisible(true);
	       R4.setVisible(true);
	       R5.setVisible(true);
	       R6.setVisible(true);

	       TextBox.add(R1);
	       TextBox.add(R2);
	       TextBox.add(R3);
	       TextBox.add(R4);
	       TextBox.add(R5);
	       TextBox.add(R6);

	      }
	      
	      if(NextText ==6){
	    	  Text.setText("Well, What class are you?");
	    	  
	    	   C1.setSize(80,20);
		       C2.setSize(80,20);
		       C3.setSize(80,20);
		       C4.setSize(80,20);
		    
		       C1.setLocation(10,70);
		       C2.setLocation(100,70);
		       C3.setLocation(200,70);
		       C4.setLocation(300,70);
		      
		       C1.setVisible(true);
		       C2.setVisible(true);
		       C3.setVisible(true);
		       C4.setVisible(true);
		      
		       TextBox.add(C1);
		       TextBox.add(C2);
		       TextBox.add(C3);
		       TextBox.add(C4);
		     
	      }
	      
	      if(NextText == 7)
	      {
	    	  GameFrame THEGAMEWINDOW = new GameFrame(GAME);
	   //   Next.setSize(80,20);
	     // Text.setText("Ah I see! Well, if you promise not to tell, I will let you out.");
	      }

	     
	      }
// class Marksman, warrior, mange 
	}
