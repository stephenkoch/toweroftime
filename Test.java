package test;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class Test extends JFrame implements ActionListener
{
    int NextText = 0;
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
    JTextField Name= new JTextField("Type Name");

    JComboBox Race = new JComboBox();
    public Test()
    {   
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
       Text.setForeground(Color.white);
       
       
       Next.setLocation(600,150);
       Back.setLocation(680,150);
       Text.setLocation(10,10);
      

       // Add all Items to Panel
       TextBox.add(Next);
       TextBox.add(Back);
       TextBox.add(Text);
       TextBox.add(RaceSelection);
       TextBox.add(Name);

        //This is an Action Listener which reacts to clicking on 
        //the test button called "Press"
   
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

        
        setVisible(true); //otherwise you won't "see" it 
        		
    }

    //example usage
     public static void main (String []args)
     {
        Test tab = new Test();
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
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
		//All buttons are hidden until they are needed
		
		if((e.getSource() == Next) ||(e.getSource() == R1)||(e.getSource() == R2)||(e.getSource() == R3)||(e.getSource() == R4)||(e.getSource() == R5)||(e.getSource() == R6)||(e.getSource() == M)||(e.getSource() == F))
		{
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
	      if(NextText == 6)
	      {
	      Next.setSize(80,20);
	      Text.setText("Ah I see! Well, if you promise not to tell, I will let you out.");
	      }
	      
	      if(NextText==7)
	      {
	    	  Text.setText("You've encounted a Monster, be prepared to battle!"); }
	      
	      if(NextText ==8){
	    	  Text.setText("You Defeted the enemy!");}
	      
	      if(NextText==9){
	    	  Text.setText("You were defeated!");}
	      
	      if(NextText==10){
	    	  Text.setText("I will teleport you up but you shall never return.");}
	      
	      if(NextText==11){
	    	  Text.setText("You found a treasure.");}
	      
	      if(NextText==12){
	    	  Text.setText("You are now facing Mafew!");}
	      
	      if(NextText==13){
	    	  Text.setText("You Defeated Mafew!");}
	    	  
	      if(NextText==14){
	    	  Text.setText("You were defeated by Mafew");}
	      
	      if(NextText==15){
	    	  Text.setText("Game Over");}
	      
	      if(NextText == 16){
	    	  Text.setText("You have entered an empty room.");
	      }
	      }
		
	}