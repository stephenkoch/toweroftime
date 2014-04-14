import javax.imageio.ImageIO;
import javax.swing.*;

import com.sun.media.sound.Toolkit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class StatEqItPanel extends JTabbedPane
{
	JLabel piclabel;
	
    JButton Weapon = new JButton("Weapon");
    JButton Shield = new JButton("Shield");
    JButton Helmet = new JButton("Helmet");
    JButton Chest = new JButton("Chest");
    JButton Legs  = new JButton("Legs");
    JButton Amulet = new JButton("Amulet");
    JButton Hands = new JButton("Hands");
    JButton Belt  = new JButton("Belt");
    JButton Ring1 = new JButton("Ring 1");
    JButton Ring2 = new JButton("Ring 2");
    JButton Feet  = new JButton("Feet");
    
    // Add all Labels
    JButton Item = new JButton("Item");
    JButton Description = new JButton("Description");
    JButton Speed = new JButton("Speed");
    JButton Damage = new JButton("Damage");
    JButton ArmorDefense = new JButton("Defense"); 
    JButton Element = new JButton("Element");
    JButton Power = new JButton("Power");
    //------------------------------------------
    JButton Stats = new JButton("Statistics");
    JButton ItemD = new JButton("-");
    JButton DescriptionD = new JButton("-");
    JButton SpeedD = new JButton("-");
    JButton DamageD = new JButton("-");
    JButton ArmorDefenseD = new JButton("-"); 
    JButton ElementD = new JButton("-");
    JButton PowerD = new JButton("-");
    //-------------------------------------------
    JButton Strength = new JButton("Strength");
    JButton Stamina = new JButton("Stamina");
    JButton Mind = new JButton("Mind");
    JButton Intelligence = new JButton("Intelligence");
    JButton Defense  = new JButton("Defense");
    JButton Dexterity = new JButton ("Dexterity");
    //-------------------------------------------
    JButton SkillPoints = new JButton("Skill Points");
    
    int skillPoints = 4;
    int strengthPoints = 21;
    int staminaPoints = 23;
    int mindPoints = 12;
    int intelligencePoints = 17;
    int defensePoints = 32;
    //-------------------------------------------
    JButton StrengthD = new JButton("");
    JButton StaminaD = new JButton("");
    JButton MindD = new JButton("");
    JButton IntelligenceD  = new JButton("");
    JButton DefenseD   = new JButton("");
    JButton DexterityD = new JButton ("");
    JButton SkillPointsD = new JButton("+1");
    
    //-------------------------------------------
    JButton StrengthPlus = new JButton("+1");
    JButton StaminaPlus = new JButton("+1");
    JButton MindPlus = new JButton("+1");
    JButton IntelligencePlus = new JButton("+1");
    JButton DefensePlus = new JButton("+1");
    JButton DexterityPlus = new JButton ("+1");
    
    JButton StrengthModifier = new JButton("+1");
    JButton StaminaModifier = new JButton("+1");
    JButton MindModifier = new JButton("+1");
    JButton IntelligenceModifier = new JButton("+1");
    JButton DefenseModifier = new JButton("+1");
    JButton DexterityModifier = new JButton ("+1");
    
    //------------------------------------------
    JButton Unequip = new JButton("UNEQUIP");
    //------------------------------------------
    //Backpack Panel
    //------------------------------------------
    JButton Title = new JButton("Inventory");
    JButton IWeapon = new JButton("Weapons");
    JButton IArmor = new JButton("Armor");
    JButton IRings = new JButton("Rings");
    JButton IPotion = new JButton("Potions");
    JButton IShield = new JButton("Shield");
    
    JButton IItem = new JButton("Item");
    JButton IDescription = new JButton("Description");
    JButton IItemD = new JButton();
    JButton IDescriptionD = new JButton();
    
    JButton IDamage  = new JButton("Damage");
    JButton ISpeed   = new JButton("Speed");
    JButton IDefense = new JButton("Defense");
    JButton IElement = new JButton("Element");
    JButton IPower   = new JButton("Power");
    
    JButton IDamageD  = new JButton("1");
    JButton ISpeedD   = new JButton("2");
    JButton IDefenseD = new JButton("3");
    JButton IElementD = new JButton("4");
    JButton IPowerD   = new JButton("5");
    
    JButton IEquip   = new JButton("EQUIP");
    JButton IUse   = new JButton("USE");
    
    
    DefaultListModel item = new DefaultListModel();
    JList itemList = new JList(item);
    JScrollPane scroll = new JScrollPane(itemList);
    
    public StatEqItPanel() 
    {
    	IUse.setVisible(false);

       // Creating tabs
    	setBounds(0, 160, 400, 400);

       JPanel StatsPanel = new JPanel();//First Panel
       JPanel EquipmentPanel = new JPanel();//Second Panel
       JPanel BackpackPanel = new JPanel();//Third Panel

       //Tab Creation
       addTab("Stats",StatsPanel);
       addTab("Equipment", EquipmentPanel);
       addTab("Backpack", BackpackPanel);

       StatsPanel.setLayout(null);      //Custom button placement for first panel
       EquipmentPanel.setLayout(null);  //Reference line above, but for second panel
       BackpackPanel.setLayout(null);   //Backpack layout manager set to null
       
       StatsPanel.setBackground(Color.DARK_GRAY);
       EquipmentPanel.setBackground(Color.DARK_GRAY);
       BackpackPanel.setBackground(Color.DARK_GRAY);
       
       StrengthD.setText(String.valueOf(strengthPoints));
       StaminaD.setText(String.valueOf(staminaPoints));
       IntelligenceD.setText(String.valueOf(intelligencePoints));
       MindD.setText(String.valueOf(mindPoints));
       DefenseD.setText(String.valueOf(defensePoints));
       SkillPointsD.setText(String.valueOf(skillPoints));
       
       
       //---------------------------
       // SIZES
       //---------------------------
       
       //Stats Panel 1 Buttons Sizes
       Strength.setSize(150,40);
       Stamina.setSize(150,40);
       Intelligence.setSize(150,40);
       Mind.setSize(150,40);
       Defense.setSize(150,40);
       Dexterity.setSize(150,40);
       //----------------------------
       StrengthD.setSize(100,40);
       StaminaD.setSize(100,40);
       IntelligenceD.setSize(100,40);
       MindD.setSize(100,40);
       DefenseD.setSize(100,40);
       DexterityD.setSize(100,40);
       //-----------------------------
       StrengthPlus.setSize(60,40);
       StaminaPlus.setSize(60,40);
       IntelligencePlus.setSize(60,40);
       MindPlus.setSize(60,40);
       DefensePlus.setSize(60,40);
       DexterityPlus.setSize(60,40);
       //-----------------------------
       SkillPoints.setSize(150,50);
       SkillPointsD.setSize(100,50);
       //-----------------------------
       Unequip.setSize(150,40);
       
       StrengthModifier.setSize(60,40);
       StaminaModifier.setSize(60,40);
       IntelligenceModifier.setSize(60,40);
       MindModifier.setSize(60,40);
       DefenseModifier.setSize(60,40);
       DexterityModifier.setSize(60,40);
         
       
       //Equipment Panel 2 Buttons Sizes
       Weapon.setSize(90,80);
       Shield.setSize(90,80);
       Helmet.setSize(80,50);
       Chest.setSize(80,70);
       Legs.setSize(80,70);
       Amulet.setSize(80,50);
       Belt.setSize(80,40);
       Hands.setSize(80,60);
       Ring1.setSize(80,35);
       Ring2.setSize(80,35);
       Feet.setSize(80,50);
       //-------------------------
       Stats.setSize(125,30);
       Item.setSize(400,25);
       Description.setSize(400,25);
       Speed.setSize(125, 20);
       Damage.setSize(125, 20);
       ArmorDefense.setSize(125, 20);
       Element.setSize(125, 20); 
       Power.setSize(125, 20);
       //-------------------------
       ItemD.setSize(400,20);
       DescriptionD.setSize(400,20);
       SpeedD.setSize(125,20);
       DamageD.setSize(125,20);
       ArmorDefenseD.setSize(125,20);
       ElementD.setSize(125,20);
       PowerD.setSize(125,20);
       //--------------------
       //Panel 3
       //--------------------
       scroll.setSize(200,180);
       
       Title.setSize(200,30);
       IWeapon.setSize(90,30);
       IArmor.setSize(90,30);
       IRings.setSize(90,30);
       IPotion.setSize(90,30);
       IShield.setSize(90,30);
       
       IItem.setSize(400,30);
       IDescription.setSize(400,30);
       IItemD.setSize(400,20);
       IDescriptionD.setSize(400,20);
       
       IDamage.setSize(90,20);
       ISpeed.setSize(90,20);
       IDefense.setSize(90,20);
       IElement.setSize(90,20);
       IPower.setSize(90,20);
       
       IDamageD.setSize(90,20);
       ISpeedD.setSize(90,20);
       IDefenseD.setSize(90,20);
       IElementD.setSize(90,20);
       IPowerD.setSize(90,20);
       
       IEquip.setSize(150,40);
       IUse.setSize(150,40);
       
       //------------------------------------
       // LOCATION
       //------------------------------------
       Weapon.setLocation(5,10);
       Shield.setLocation(5,95);
       Helmet.setLocation(100,10);
       Chest.setLocation(100,70);
       Legs.setLocation(100,145);
       Amulet.setLocation(190,10);
       Hands.setLocation(190,70);
       Belt.setLocation(190,135);
       Ring1.setLocation(190,180);
       Ring2.setLocation(10,180);
       Feet.setLocation(100,220); 
       Unequip.setLocation(200,230);  
       //-----------------------------
       Item.setLocation(0,275);
       Description.setLocation(0,325);
       //------------------------------
       ItemD.setLocation(0,300);
       DescriptionD.setLocation(0,350);
       //------------------------------
       Stats.setLocation(280,10);
       //------------------------------
       Element.setLocation(280,40);
       ElementD.setLocation(280,60); 
       Power.setLocation(280,80);
       PowerD.setLocation(280,100);
       Speed.setLocation(280,120);
       SpeedD.setLocation(280,140);
       Damage.setLocation(280,160);
       DamageD.setLocation(280,180);
       ArmorDefense.setLocation(280,120);
       ArmorDefenseD.setLocation(280,140);
       Element.setVisible(false);
       ElementD.setVisible(false);
       Speed.setVisible(false);
       SpeedD.setVisible(false);
       Damage.setVisible(false);
       DamageD.setVisible(false);
       ArmorDefense.setVisible(false);
       ArmorDefenseD.setVisible(false);
       Power.setVisible(false);
       PowerD.setVisible(false);
       
      

       //-----------------------------------
       Strength.setLocation(5,10);
       Stamina.setLocation(5,60);
       Mind.setLocation(5,110);
       Intelligence.setLocation(5,160);
       Defense.setLocation(5,210);
       Dexterity.setLocation(5,260);
       //-----------------------------------
       StrengthD.setLocation(155,10);
       StaminaD.setLocation(155,60);
       MindD.setLocation(155,110);
       IntelligenceD.setLocation(155,160);
       DefenseD.setLocation(155,210);
       DexterityD.setLocation(155,260);
       //-----------------------------------
       StrengthModifier.setLocation(255,10);
       StaminaModifier.setLocation(255,60);
       MindModifier.setLocation(255,110);
       IntelligenceModifier.setLocation(255,160);
       DefenseModifier.setLocation(255,210);
       DexterityModifier.setLocation(255,260);
       //----------------------------------
       
       StrengthPlus.setLocation(315,10);
       StaminaPlus.setLocation(315,60);
       MindPlus.setLocation(315,110);
       IntelligencePlus.setLocation(315,160);
       DefensePlus.setLocation(315,210);
       DexterityPlus.setLocation(315,260);
       
       SkillPoints.setLocation(50,310);
       SkillPointsD.setLocation(195,310);
       //-----------------------------------
       scroll.setLocation(105,40);
       
       Title.setLocation(105,10);
       
       IWeapon.setLocation(10,10);
       IArmor.setLocation(10,60);
       IRings.setLocation(10,110);
       IPotion.setLocation(10,160);
       IShield.setLocation(10,210);
       
       IItem.setLocation(0,270);
       IItemD.setLocation(0,300);
       IDescription.setLocation(0,320);
       IDescriptionD.setLocation(0,350);
       
       IDamage.setLocation(305,10);
       IDamageD.setLocation(305,30);
       
       ISpeed.setLocation(305,50);
       ISpeedD.setLocation(305,70);
       
       IDefense.setLocation(305,90);
       IDefenseD.setLocation(305,110);
       
       IElement.setLocation(305,130);
       IElementD.setLocation(305,150);
       
       IPower.setLocation(305,170);
       IPowerD.setLocation(305,190);
       
       IEquip.setLocation(130,225);
       IUse.setLocation(130,225);
       //------------------------------------
       // COLORS
       //------------------------------------
       // PANEL 1
       Strength.setBackground(Color.yellow);
       Stamina.setBackground(Color.yellow);
       Intelligence.setBackground(Color.yellow);
       Mind.setBackground(Color.yellow);
       Defense.setBackground(Color.yellow);
       Dexterity.setBackground(Color.yellow);
       SkillPoints.setBackground(Color.orange);
       //-------------------------------------
       SkillPointsD.setBackground(Color.orange);
       StrengthPlus.setBackground(Color.red);
       StaminaPlus.setBackground(Color.red);
       IntelligencePlus.setBackground(Color.red);
       DefensePlus.setBackground(Color.red);
       MindPlus.setBackground(Color.red);
       DexterityPlus.setBackground(Color.red);
       //-------------------------------------
       StrengthPlus.setForeground(Color.white);
       StaminaPlus.setForeground(Color.white);
       IntelligencePlus.setForeground(Color.white);
       DefensePlus.setForeground(Color.white);
       MindPlus.setForeground(Color.white);
       DexterityPlus.setForeground(Color.white);
       
       StrengthModifier.setBackground(Color.green);
       StaminaModifier.setBackground(Color.green);
       IntelligenceModifier.setBackground(Color.green);
       DefenseModifier.setBackground(Color.green);
       MindModifier.setBackground(Color.green);
       DexterityModifier.setBackground(Color.green);
       
       IDamage.setBackground(Color.yellow);
       ISpeed.setBackground(Color.yellow);
       IDefense.setBackground(Color.yellow);
       IElement.setBackground(Color.yellow);
       IPower.setBackground(Color.yellow);
       Title.setBackground(Color.orange);
       IItem.setBackground(Color.yellow);
       IDescription.setBackground(Color.yellow);
       //-------------------------------------

       Item.setForeground(Color.black);
       Description.setForeground(Color.black);
       Speed.setForeground(Color.black);
       Damage.setForeground(Color.black);
       ArmorDefense.setForeground(Color.black);
       Element.setForeground(Color.black);
       Power.setForeground(Color.black);
       //-------------------------------------
       
       // PANEL 2
       Weapon.setBackground(Color.LIGHT_GRAY);
       Shield.setBackground(Color.LIGHT_GRAY);
       Helmet.setBackground(Color.LIGHT_GRAY);
       Chest.setBackground(Color.LIGHT_GRAY);
       Legs.setBackground(Color.LIGHT_GRAY);
       Amulet.setBackground(Color.LIGHT_GRAY);
       Belt.setBackground(Color.LIGHT_GRAY);
       Hands.setBackground(Color.LIGHT_GRAY);
       Ring1.setBackground(Color.LIGHT_GRAY);
       Ring2.setBackground(Color.LIGHT_GRAY);
       Feet.setBackground(Color.LIGHT_GRAY);
       //----------------------------------
       Stats.setBackground(Color.orange);
       Item.setBackground(Color.ORANGE);
       Description.setBackground(Color.ORANGE);
       Speed.setBackground(Color.yellow);
       Damage.setBackground(Color.YELLOW);
       ArmorDefense.setBackground(Color.YELLOW);
       Element.setBackground(Color.YELLOW);
       Power.setBackground(Color.YELLOW);
       //----------------------------------
       Unequip.setBackground(Color.yellow);
       
       IWeapon.setBackground(Color.LIGHT_GRAY);
       IArmor.setBackground(Color.LIGHT_GRAY);
       IPotion.setBackground(Color.LIGHT_GRAY);
       IShield.setBackground(Color.LIGHT_GRAY);
       IRings.setBackground(Color.LIGHT_GRAY);
       IEquip.setBackground(Color.orange);
       IUse.setBackground(Color.orange);

       //---------------------------------
       //ADD TO PANEL
       //---------------------------------
       StatsPanel.add(Strength);
       StatsPanel.add(Stamina);
       StatsPanel.add(Mind);
       StatsPanel.add(Intelligence);
       StatsPanel.add(Defense);
       StatsPanel.add(Dexterity);
       //--------------------------
       StatsPanel.add(StrengthD);
       StatsPanel.add(StaminaD);
       StatsPanel.add(MindD);
       StatsPanel.add(IntelligenceD);
       StatsPanel.add(DefenseD);
       StatsPanel.add(DexterityD);
       //--------------------------
       StatsPanel.add(StrengthPlus);
       StatsPanel.add(StaminaPlus);
       StatsPanel.add(MindPlus);
       StatsPanel.add(IntelligencePlus);
       StatsPanel.add(DefensePlus);
       StatsPanel.add(DexterityPlus);
       
       StatsPanel.add(StrengthModifier);
       StatsPanel.add(StaminaModifier);
       StatsPanel.add(MindModifier);
       StatsPanel.add(IntelligenceModifier);
       StatsPanel.add(DefenseModifier);
       StatsPanel.add(DexterityModifier);
       //--------------------------
       StatsPanel.add(SkillPoints);
       StatsPanel.add(SkillPointsD);
       
       
       //PANEL 2
       EquipmentPanel.add(Weapon);
       EquipmentPanel.add(Shield);
       EquipmentPanel.add(Helmet);
       EquipmentPanel.add(Chest);
       EquipmentPanel.add(Legs);
       EquipmentPanel.add(Amulet);
       EquipmentPanel.add(Hands);
       EquipmentPanel.add(Belt);
       EquipmentPanel.add(Ring1);
       EquipmentPanel.add(Ring2);
       EquipmentPanel.add(Feet);
       //---------------------------
       EquipmentPanel.add(Stats);
       EquipmentPanel.add(Item);
       EquipmentPanel.add(Description); 
       EquipmentPanel.add(Speed);
       EquipmentPanel.add(Damage);
       EquipmentPanel.add(ArmorDefense);
       EquipmentPanel.add(Element);
       EquipmentPanel.add(Power);
       //---------------------------
       EquipmentPanel.add(ItemD);
       EquipmentPanel.add(DescriptionD); 
       EquipmentPanel.add(SpeedD);
       EquipmentPanel.add(DamageD);
       EquipmentPanel.add(ArmorDefenseD);
       EquipmentPanel.add(ElementD);
       EquipmentPanel.add(PowerD);
       EquipmentPanel.add(Unequip);

       BackpackPanel.add(scroll);
       
       BackpackPanel.add(Title);
       BackpackPanel.add(IWeapon);
       BackpackPanel.add(IArmor);
       BackpackPanel.add(IRings);
       BackpackPanel.add(IShield);
       BackpackPanel.add(IItem);
       BackpackPanel.add(IDescription);
       BackpackPanel.add(IItemD);
       BackpackPanel.add(IDescriptionD);
       BackpackPanel.add(IPotion);
       
       BackpackPanel.add(IDamage);
       BackpackPanel.add(ISpeed);
       BackpackPanel.add(IDefense);
       BackpackPanel.add(IElement);
       BackpackPanel.add(IPower);
       
       BackpackPanel.add(IDamageD);
       BackpackPanel.add(ISpeedD);
       BackpackPanel.add(IDefenseD);
       BackpackPanel.add(IElementD);
       BackpackPanel.add(IPowerD);
       
       BackpackPanel.add(IEquip);
       BackpackPanel.add(IUse);
        //-----------------------------------
        // ADD ACTION LISTENERS
        //-----------------------------------
       
        // Create action listener and Button Handler
        ButtonHandler phandler = new ButtonHandler();
        Weapon.addActionListener(phandler);
        Shield.addActionListener(phandler);
        Helmet.addActionListener(phandler);
        Chest.addActionListener(phandler);
        Legs.addActionListener(phandler);
        Amulet.addActionListener(phandler);
        Hands.addActionListener(phandler);
        Belt.addActionListener(phandler);
        Ring1.addActionListener(phandler);
        Ring2.addActionListener(phandler);
        Feet.addActionListener(phandler);
        Unequip.addActionListener(phandler);
        StrengthPlus.addActionListener(phandler);
        StaminaPlus.addActionListener(phandler);
        MindPlus.addActionListener(phandler);
        IntelligencePlus.addActionListener(phandler);
        DefensePlus.addActionListener(phandler);
        DexterityPlus.addActionListener(phandler);
        SkillPointsD.addActionListener(phandler);
        
        IWeapon.addActionListener(phandler);
        IArmor.addActionListener(phandler);
        IRings.addActionListener(phandler);
        IPotion.addActionListener(phandler);
        IShield.addActionListener(phandler);
        IEquip.addActionListener(phandler);
        IUse.addActionListener(phandler);
        
        setVisible(true);
       updatePanel();
    }
    

    //UPDATE EVERYTHING ON THIS PANEL!!!!!!!
    private void updatePanel() 
    {
    	StrengthD.setText(Integer.toString(Game.PLAYER.getStrength()));
    	StaminaD.setText(Integer.toString(Game.PLAYER.getStamina()));
    	MindD.setText(Integer.toString(Game.PLAYER.getMind()));
    	IntelligenceD.setText(Integer.toString(Game.PLAYER.getIntelligence()));
    	DefenseD.setText(Integer.toString(Game.PLAYER.getDefense()));
    	DexterityD.setText(Integer.toString(Game.PLAYER.getDexterity()));
    	
    }
    //EVERYTHING ABOVE THIS IS IMPORTANT!!!!
    
    
	class ButtonHandler implements ActionListener
    {
           public void actionPerformed(ActionEvent e)
           {
        	   if(e.getSource() != Unequip)
        	   {
        	    Weapon.setBackground(Color.LIGHT_GRAY);
        	    Shield.setBackground(Color.LIGHT_GRAY);
        	    Helmet.setBackground(Color.LIGHT_GRAY);
        	    Chest.setBackground(Color.LIGHT_GRAY);
        	    Legs.setBackground(Color.LIGHT_GRAY);
        	    Amulet.setBackground(Color.LIGHT_GRAY);
        	    Belt.setBackground(Color.LIGHT_GRAY);
        	    Hands.setBackground(Color.LIGHT_GRAY);
        	    Ring1.setBackground(Color.LIGHT_GRAY);
        	    Ring2.setBackground(Color.LIGHT_GRAY);
        	    Feet.setBackground(Color.LIGHT_GRAY);
        	   }
        	    if(e.getSource() != IEquip)
        	    {
        	    IWeapon.setBackground(Color.LIGHT_GRAY);
        	    IArmor.setBackground(Color.LIGHT_GRAY);
        	    IPotion.setBackground(Color.LIGHT_GRAY);
        	    IShield.setBackground(Color.LIGHT_GRAY);
        	    IRings.setBackground(Color.LIGHT_GRAY);
        	    }
        	   
        		if(e.getSource() == Weapon)
        		{
        		Element.setVisible(true);
        		ElementD.setVisible(true);
        		Speed.setVisible(true);
        		SpeedD.setVisible(true);
        		Damage.setVisible(true);
        	    DamageD.setVisible(true);
        	    ArmorDefense.setVisible(false);
        		ArmorDefenseD.setVisible(false);
        		Power.setVisible(true);
    			PowerD.setVisible(true);
        		
        		Weapon.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getWeapon().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getWeapon().getDescription());
        	    SpeedD.setText(Integer.toString(Game.PLAYER.equipped.getWeapon().getWeaponSpeed()));
        	    DamageD.setText(Integer.toString(Game.PLAYER.equipped.getWeapon().getWeaponDamage()));
        	    ArmorDefenseD.setText("-");
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Shield)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(true);
            		ArmorDefenseD.setVisible(true);	
        			Power.setVisible(true);
        			PowerD.setVisible(true);
        		Shield.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getShield().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getShield().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText(Integer.toString(Game.PLAYER.equipped.getShield().getArmorDefense()));
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Helmet)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(true);
            		ArmorDefenseD.setVisible(true);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        		Helmet.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getHelmet().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getHelmet().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText(Integer.toString(Game.PLAYER.equipped.getHelmet().getArmorDefense()));
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Chest)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(true);
            		ArmorDefenseD.setVisible(true);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        		Chest.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getChest().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getChest().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText(Integer.toString(Game.PLAYER.equipped.getChest().getArmorDefense()));
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Legs)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(true);
                    ArmorDefenseD.setVisible(true);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        		Legs.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getLegs().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getLegs().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText(Integer.toString(Game.PLAYER.equipped.getLegs().getArmorDefense()));
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Amulet)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(false);
            		ArmorDefenseD.setVisible(false);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        		Amulet.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getAmulet().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getAmulet().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText("-");
        	    ElementD.setText(Game.PLAYER.equipped.getAmulet().getAccessoryEffect());
        	    PowerD.setText(Integer.toString(Game.PLAYER.equipped.getAmulet().getAccessoryEffectStrength()));
        		}
        		
        		if(e.getSource() == Belt)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(false);
            		ArmorDefenseD.setVisible(false);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        			
        		Belt.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getBelt().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getBelt().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText("-");
        	    ElementD.setText(Game.PLAYER.equipped.getBelt().getAccessoryEffect());
        	    PowerD.setText(Integer.toString(Game.PLAYER.equipped.getBelt().getAccessoryEffectStrength()));
        		}
        		
        		if(e.getSource() == Hands)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(true);
            		ArmorDefenseD.setVisible(true);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
            		Hands.setBackground(Color.yellow);
            	    ItemD.setText(Game.PLAYER.equipped.getHands().getName());
            	    DescriptionD.setText(Game.PLAYER.equipped.getHands().getDescription());
            	    SpeedD.setText("-");
            	    DamageD.setText("-");
            	    ArmorDefenseD.setText(Integer.toString(Game.PLAYER.equipped.getHands().getArmorDefense()));
            	    ElementD.setText("-");
            	    PowerD.setText("-");
        		}
        		
        		if(e.getSource() == Ring1)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(false);
            		ArmorDefenseD.setVisible(false);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        	    Ring1.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getRing1().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getRing1().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText("-");
        	    ElementD.setText(Game.PLAYER.equipped.getRing1().getAccessoryEffect());
        	    PowerD.setText(Integer.toString(Game.PLAYER.equipped.getRing1().getAccessoryEffectStrength()));
        		}
        		
        		if(e.getSource() == Ring2)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(false);
            		ArmorDefenseD.setVisible(false);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        	    Ring2.setBackground(Color.yellow);
        	    ItemD.setText(Game.PLAYER.equipped.getRing2().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getRing2().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText("-");
        	    ElementD.setText(Game.PLAYER.equipped.getRing2().getAccessoryEffect());
        	    PowerD.setText(Integer.toString(Game.PLAYER.equipped.getRing2().getAccessoryEffectStrength()));
        		}
        		
        		if(e.getSource() == Feet)
        		{
            		Element.setVisible(true);
            		ElementD.setVisible(true);
            		Speed.setVisible(false);
            		SpeedD.setVisible(false);
            		Damage.setVisible(false);
            	    DamageD.setVisible(false);
            	    ArmorDefense.setVisible(true);
            		ArmorDefenseD.setVisible(true);
            		Power.setVisible(true);
        			PowerD.setVisible(true);
        	    Feet.setBackground(Color.yellow);
           	    ItemD.setText(Game.PLAYER.equipped.getFeet().getName());
        	    DescriptionD.setText(Game.PLAYER.equipped.getFeet().getDescription());
        	    SpeedD.setText("-");
        	    DamageD.setText("-");
        	    ArmorDefenseD.setText(Integer.toString(Game.PLAYER.equipped.getFeet().getArmorDefense()));
        	    ElementD.setText("-");
        	    PowerD.setText("-");
        		}
        		
        		////////////STATS\\\\\\\\\\\\\\\\\
        		if(e.getSource() == StrengthPlus)
        		{
        		if(skillPoints > 0)
        		{
        		skillPoints --;
        		strengthPoints ++;
        		}

        	    }
        		
        		if(e.getSource() == StaminaPlus)
        		{
        		if(skillPoints > 0)
            		{
            		skillPoints --;
            		staminaPoints ++;
            		}
        	    }
        		
        		if(e.getSource() == IntelligencePlus)
        		{
        			if(skillPoints > 0)
            		{
            		skillPoints --;
            		intelligencePoints ++;
            		}
        	    }
        		
        		if(e.getSource() == MindPlus)
        		{
        			if(skillPoints > 0)
            		{
            		skillPoints --;
            		mindPoints ++;
            		}
            	
        	    }
    
        		if(e.getSource() == DefensePlus)
        		{
        			if(skillPoints > 0)
            		{
            		skillPoints --;
            		defensePoints ++;
            		}
        		}
            	if(e.getSource() == DexterityPlus)
            	{
            	if(skillPoints > 0)
                {
                skillPoints --;
                defensePoints ++;
                }
        	    }
        		if(skillPoints == 0)
        		{
        		StrengthPlus.setEnabled(false);
        		StaminaPlus.setEnabled(false);
        		IntelligencePlus.setEnabled(false);
        		MindPlus.setEnabled(false);
        		DefensePlus.setEnabled(false);
        		SkillPointsD.setEnabled(false);
        		SkillPoints.setEnabled(false);
        		DexterityPlus.setEnabled(false);
        		
        		StrengthPlus.setBackground(Color.gray);
        		StaminaPlus.setBackground(Color.gray);
        		IntelligencePlus.setBackground(Color.gray);
        		MindPlus.setBackground(Color.gray);
        		DefensePlus.setBackground(Color.gray);
        		SkillPointsD.setBackground(Color.gray);
        		SkillPoints.setBackground(Color.gray);
        		DexterityPlus.setBackground(Color.gray);
        		}
        		   
        		  // StrengthD.setText(String.valueOf(strengthPoints));
        	       StaminaD.setText(String.valueOf(staminaPoints));
        	       IntelligenceD.setText(String.valueOf(intelligencePoints));
        	       MindD.setText(String.valueOf(mindPoints));
        	       DefenseD.setText(String.valueOf(defensePoints));
        	       SkillPointsD.setText(String.valueOf(skillPoints));
           //////////////BACKPACK\\\\\\\\\\\\

           if(e.getSource() == IWeapon)
           {
           IWeapon.setBackground(Color.yellow);
           Title.setText("Weapons");
           item.clear();
           item.addElement("Mace");
           item.addElement("Axe");
           }
           
           if(e.getSource() == IArmor)
           {
           IArmor.setBackground(Color.yellow);
           Title.setText("Armor");
           item.clear();
           item.addElement("Curiass");
           item.addElement("Bulletproof Vest");
           }
           
           if(e.getSource() == IRings)
           {
           IRings.setBackground(Color.yellow);
           Title.setText("Rings");
           item.clear();
           item.addElement("Golden Ring of Fire");
           item.addElement("Silver Ring of Healing");
           }
           
           if(e.getSource() != IUse)
           {
       		IEquip.setVisible(true);
    		IUse.setVisible(false);
           }
           
           if(e.getSource() == IUse)
           {
           if(item.getSize() > 0)
           {
           int index = itemList.getSelectedIndex();
           IItemD.setText((String) item.getElementAt(index));
           item.remove(index);
           }
           IPotion.setBackground(Color.yellow);
           }
           
           if(e.getSource() == IEquip)
           {
           if(item.getSize() > 0)
           {
           int index = itemList.getSelectedIndex();
           IItemD.setText((String) item.getElementAt(index));
           item.remove(index);
           }
           }
           
           if(e.getSource() == IPotion)
           {
           IUse.setVisible(true);
           IEquip.setVisible(false);
           IPotion.setBackground(Color.yellow);
           Title.setText("Potions");
           item.clear();
           item.addElement("Potion of Healing");
           item.addElement("Potion of Mana");
           }
           
           if(e.getSource() == IShield)
           {
           IShield.setBackground(Color.yellow);
           Title.setText("Shields");
           item.clear();
           item.addElement("Riot Shield");
           item.addElement("Buckler");
           item.addElement("Agis");
           }
           updatePanel();
       }
           
    }


}