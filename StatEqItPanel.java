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
    JButton Agility = new JButton ("Agility");
    //-------------------------------------------
    JButton SkillPoints = new JButton("Skill Points");
    //-------------------------------------------
    JButton StrengthD = new JButton("");
    JButton StaminaD = new JButton("");
    JButton MindD = new JButton("");
    JButton IntelligenceD  = new JButton("");
    JButton DefenseD   = new JButton("");
    JButton DexterityD = new JButton ("");
    JButton AgilityD = new JButton("");
    JButton SkillPointsD = new JButton("+1");
    
    //-------------------------------------------
    JButton StrengthPlus = new JButton("+1");
    JButton StaminaPlus = new JButton("+1");
    JButton MindPlus = new JButton("+1");
    JButton IntelligencePlus = new JButton("+1");
    JButton DefensePlus = new JButton("+1");
    JButton DexterityPlus = new JButton ("+1");
    JButton AgilityPlus = new JButton("+1");
    
    JButton StrengthModifier = new JButton("+1");
    JButton StaminaModifier = new JButton("+1");
    JButton MindModifier = new JButton("+1");
    JButton IntelligenceModifier = new JButton("+1");
    JButton DefenseModifier = new JButton("+1");
    JButton DexterityModifier = new JButton ("+1");
    JButton AgilityModifier = new JButton("+1");
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
    
    
    JButton Fire = new JButton ("FIRE");
    JButton Ice = new JButton ("ICE");
    
    JButton Holy = new JButton ("HOLY");
    JButton Shadow = new JButton ("SHADOW");
   
    JButton Energy = new JButton ("ENERGY");
    JButton Earth =  new JButton ("EARTH");
    
    JButton Air = new JButton ("AIR");
    JButton Water = new JButton ("WATER");
    
    
    JButton Fire1 = new JButton ("1");
    JButton Fire2 = new JButton ("2");
    JButton Fire3 = new JButton ("3");
    JButton Fire4 = new JButton ("4");
    JButton Fire5 = new JButton ("5");
    
    JButton Ice1 = new JButton ("1");
    JButton Ice2 = new JButton ("2");
    JButton Ice3 = new JButton ("3");
    JButton Ice4 = new JButton ("4");
    JButton Ice5 = new JButton ("5");
    
    JButton Holy1 = new JButton ("1");
    JButton Holy2 = new JButton ("2");
    JButton Holy3 = new JButton ("3");
    JButton Holy4 = new JButton ("4");
    JButton Holy5 = new JButton ("5");
    
    JButton Shadow1 = new JButton ("1");
    JButton Shadow2 = new JButton ("2");
    JButton Shadow3 = new JButton ("3");
    JButton Shadow4 = new JButton ("4");
    JButton Shadow5 = new JButton ("5");
   
    JButton Energy1 = new JButton ("1");
    JButton Energy2 = new JButton ("2");
    JButton Energy3 = new JButton ("3");
    JButton Energy4 = new JButton ("4");
    JButton Energy5 = new JButton ("5");
    
    JButton Earth1 =  new JButton ("1");
    JButton Earth2 =  new JButton ("2");
    JButton Earth3 =  new JButton ("3");
    JButton Earth4 =  new JButton ("4");
    JButton Earth5 =  new JButton ("5");
    
    JButton Air1 = new JButton ("1");
    JButton Air2 = new JButton ("2");
    JButton Air3 = new JButton ("3");
    JButton Air4 = new JButton ("4");
    JButton Air5 = new JButton ("5");
    
    JButton Water1 = new JButton ("1");
    JButton Water2 = new JButton ("2");
    JButton Water3 = new JButton ("3");
    JButton Water4 = new JButton ("4");
    JButton Water5 = new JButton ("5");
    
    DefaultListModel item = new DefaultListModel();
    JList itemList = new JList(item);
    JScrollPane scroll = new JScrollPane(itemList);
    
    Game GAME;
    public StatEqItPanel(Game g) 
    {
    	GAME = g;
    	IUse.setVisible(false);

       // Creating tabs
    	setBounds(0, 160, 400, 400);

       JPanel StatsPanel = new JPanel();//First Panel
       JPanel EquipmentPanel = new JPanel();//Second Panel
       JPanel BackpackPanel = new JPanel();//Third Panel
       JPanel SpellPanel = new JPanel();

       //Tab Creation
       addTab("Stats",StatsPanel);
       addTab("Equipment", EquipmentPanel);
       addTab("Backpack", BackpackPanel);
       addTab("Spells", SpellPanel);

       StatsPanel.setLayout(null);      //Custom button placement for first panel
       EquipmentPanel.setLayout(null);  //Reference line above, but for second panel
       BackpackPanel.setLayout(null);   //Backpack layout manager set to null
       SpellPanel.setLayout(null);
       
       StatsPanel.setBackground(Color.DARK_GRAY);
       EquipmentPanel.setBackground(Color.DARK_GRAY);
       BackpackPanel.setBackground(Color.DARK_GRAY);
       SpellPanel.setBackground(Color.DARK_GRAY);
       
       
       //---------------------------
       // SIZES
       //---------------------------
       
       //Stats Panel 1 Buttons Sizes
       Strength.setSize(110,30);
       Stamina.setSize(110,30);
       Intelligence.setSize(110,30);
       Mind.setSize(110,30);
       Defense.setSize(110,30);
       Dexterity.setSize(110,30);
       Agility.setSize(110,30);
       //----------------------------
       StrengthD.setSize(100,30);
       StaminaD.setSize(100,30);
       IntelligenceD.setSize(100,30);
       MindD.setSize(100,30);
       DefenseD.setSize(100,30);
       DexterityD.setSize(100,30);
       AgilityD.setSize(100,30);
       //-----------------------------
       StrengthPlus.setSize(60,30);
       StaminaPlus.setSize(60,30);
       IntelligencePlus.setSize(60,30);
       MindPlus.setSize(60,30);
       DefensePlus.setSize(60,30);
       DexterityPlus.setSize(60,30);
       AgilityPlus.setSize(60,30);
       //-----------------------------
       SkillPoints.setSize(150,50);
       SkillPointsD.setSize(100,50);
       //-----------------------------
       Unequip.setSize(150,40);
       
       StrengthModifier.setSize(100,30);
       StaminaModifier.setSize(100,30);
       IntelligenceModifier.setSize(100,30);
       MindModifier.setSize(100,30);
       DefenseModifier.setSize(100,30);
       DexterityModifier.setSize(100,30);
       AgilityModifier.setSize(100,30);
         
       
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
       
       Fire.setSize(100,20);
       Ice.setSize(100,20);
       Holy.setSize(100,20);
       Shadow.setSize(100,20);
       Energy.setSize(100,20);
       Earth.setSize(100,20);
       Air.setSize(100,20);
       Water.setSize(100,20);
       
       
       Ice1.setSize(50,20);
       Ice2.setSize(50,20);
       Ice3.setSize(50,20);
       Ice4.setSize(50,20);
       Ice5.setSize(50,20);
       
       Holy1.setSize(50,20);
       Holy2.setSize(50,20);
       Holy3.setSize(50,20);
       Holy4.setSize(50,20);
       Holy5.setSize(50,20);
       
       Fire1.setSize(50,20);
       Fire2.setSize(50,20);
       Fire3.setSize(50,20);
       Fire4.setSize(50,20);
       Fire5.setSize(50,20);
       

      
       Shadow1.setSize(50,20);
       Shadow2.setSize(50,20);
       Shadow3.setSize(50,20);
       Shadow4.setSize(50,20);
       Shadow5.setSize(50,20);
       
       Energy1.setSize(50,20);
       Energy2.setSize(50,20);
       Energy3.setSize(50,20);
       Energy4.setSize(50,20);
       Energy5.setSize(50,20);
       
       Earth1.setSize(50,20);
       Earth2.setSize(50,20);
       Earth3.setSize(50,20);
       Earth4.setSize(50,20);
       Earth5.setSize(50,20);
       
       Air1.setSize(50,20);
       Air2.setSize(50,20);
       Air3.setSize(50,20);
       Air4.setSize(50,20);
       Air5.setSize(50,20);
       
       Water1.setSize(50,20);
       Water2.setSize(50,20);
       Water3.setSize(50,20);
       Water4.setSize(50,20);
       Water5.setSize(50,20);
       
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
       Strength.setLocation(5,20);
       Stamina.setLocation(5,60);
       Mind.setLocation(5,100);
       Intelligence.setLocation(5,140);
       Defense.setLocation(5,180);
       Dexterity.setLocation(5,220);
       Agility.setLocation(5,260);
       //-----------------------------------
       StrengthD.setLocation(215,20);
       StaminaD.setLocation(215,60);
       MindD.setLocation(215,100);
       IntelligenceD.setLocation(215,140);
       DefenseD.setLocation(215,180);
       DexterityD.setLocation(215,220);
       AgilityD.setLocation(215,260);
       //-----------------------------------
       StrengthModifier.setLocation(115,20);
       StaminaModifier.setLocation(115,60);
       MindModifier.setLocation(115,100);
       IntelligenceModifier.setLocation(115,140);
       DefenseModifier.setLocation(115,180);
       DexterityModifier.setLocation(115,220);
       AgilityModifier.setLocation(115,260);
       //----------------------------------
       
       StrengthPlus.setLocation(315,20);
       StaminaPlus.setLocation(315,60);
       MindPlus.setLocation(315,100);
       IntelligencePlus.setLocation(315,140);
       DefensePlus.setLocation(315,180);
       DexterityPlus.setLocation(315,220);
       AgilityPlus.setLocation(315,260);
       
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
       
       
       Fire.setLocation(10,10);
       Ice.setLocation(10,40);
       Holy.setLocation(10,70);
       Shadow.setLocation(10,100);     
       Energy.setLocation(10,130);
       Earth.setLocation(10,160);
       Air.setLocation(10,190);
       Water.setLocation(10,220);
       
       Fire1.setLocation(110,10);
       Fire2.setLocation(160,10);
       Fire3.setLocation(210,10);
       Fire4.setLocation(260,10);
       Fire5.setLocation(310,10);
       
       Ice1.setLocation(110,40);
       Ice2.setLocation(160,40);
       Ice3.setLocation(210,40);
       Ice4.setLocation(260,40);
       Ice5.setLocation(310,40);
       
       Holy1.setLocation(110,70);
       Holy2.setLocation(160,70);
       Holy3.setLocation(210,70);
       Holy4.setLocation(260,70);
       Holy5.setLocation(310,70);
       

      
       Shadow1.setLocation(110,100);
       Shadow2.setLocation(160,100);
       Shadow3.setLocation(210,100);
       Shadow4.setLocation(260,100);
       Shadow5.setLocation(310,100);
       
       Energy1.setLocation(110,130);
       Energy2.setLocation(160,130);
       Energy3.setLocation(210,130);
       Energy4.setLocation(260,130);
       Energy5.setLocation(310,130);
       
       Earth1.setLocation(110,160);
       Earth2.setLocation(160,160);
       Earth3.setLocation(210,160);
       Earth4.setLocation(260,160);
       Earth5.setLocation(310,160);
       
       Air1.setLocation(110,190);
       Air2.setLocation(160,190);
       Air3.setLocation(210,190);
       Air4.setLocation(260,190);
       Air5.setLocation(310,190);
       
       Water1.setLocation(110,220);
       Water2.setLocation(160,220);
       Water3.setLocation(210,220);
       Water4.setLocation(260,220);
       Water5.setLocation(310,220);
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
       Agility.setBackground(Color.yellow);
       //--------------------------------------
       SkillPoints.setBackground(Color.orange);
       //-------------------------------------
       SkillPointsD.setBackground(Color.orange);
       StrengthPlus.setBackground(Color.red);
       StaminaPlus.setBackground(Color.red);
       IntelligencePlus.setBackground(Color.red);
       DefensePlus.setBackground(Color.red);
       MindPlus.setBackground(Color.red);
       DexterityPlus.setBackground(Color.red);
       AgilityPlus.setBackground(Color.red);
       //-------------------------------------
       StrengthPlus.setForeground(Color.white);
       StaminaPlus.setForeground(Color.white);
       IntelligencePlus.setForeground(Color.white);
       DefensePlus.setForeground(Color.white);
       MindPlus.setForeground(Color.white);
       DexterityPlus.setForeground(Color.white);
       AgilityPlus.setForeground(Color.white);
       //--------------------------------------
       StrengthModifier.setBackground(Color.green);
       StaminaModifier.setBackground(Color.green);
       IntelligenceModifier.setBackground(Color.green);
       DefenseModifier.setBackground(Color.green);
       MindModifier.setBackground(Color.green);
       DexterityModifier.setBackground(Color.green);
       AgilityModifier.setBackground(Color.green);
       
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

       Fire.setBackground(Color.YELLOW);
       Ice.setBackground(Color.YELLOW);
       Holy.setBackground(Color.YELLOW);
       Shadow.setBackground(Color.YELLOW);
       Energy.setBackground(Color.YELLOW);
       Earth.setBackground(Color.YELLOW);
       Air.setBackground(Color.YELLOW);
       Water.setBackground(Color.YELLOW);
       //---------------------------------
       //ADD TO PANEL
       //---------------------------------
       StatsPanel.add(Strength);
       StatsPanel.add(Stamina);
       StatsPanel.add(Mind);
       StatsPanel.add(Intelligence);
       StatsPanel.add(Defense);
       StatsPanel.add(Dexterity);
       StatsPanel.add(Agility);
       //--------------------------
       StatsPanel.add(StrengthD);
       StatsPanel.add(StaminaD);
       StatsPanel.add(MindD);
       StatsPanel.add(IntelligenceD);
       StatsPanel.add(DefenseD);
       StatsPanel.add(DexterityD);
       StatsPanel.add(AgilityD);
       //--------------------------
       StatsPanel.add(StrengthPlus);
       StatsPanel.add(StaminaPlus);
       StatsPanel.add(MindPlus);
       StatsPanel.add(IntelligencePlus);
       StatsPanel.add(DefensePlus);
       StatsPanel.add(DexterityPlus);
       StatsPanel.add(AgilityPlus);
       
       StatsPanel.add(StrengthModifier);
       StatsPanel.add(StaminaModifier);
       StatsPanel.add(MindModifier);
       StatsPanel.add(IntelligenceModifier);
       StatsPanel.add(DefenseModifier);
       StatsPanel.add(DexterityModifier);
       StatsPanel.add(AgilityModifier);
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
       
       
       SpellPanel.add(Fire);
       SpellPanel.add(Ice);
       SpellPanel.add(Holy);
       SpellPanel.add(Shadow);
       SpellPanel.add(Energy);
       SpellPanel.add(Earth);
       SpellPanel.add(Air);
       SpellPanel.add(Water);
       
       SpellPanel.add(Fire1);
       SpellPanel.add(Fire2);
       SpellPanel.add(Fire3);
       SpellPanel.add(Fire4);
       SpellPanel.add(Fire5);
       
       SpellPanel.add(Ice1);
       SpellPanel.add(Ice2);
       SpellPanel.add(Ice3);
       SpellPanel.add(Ice4);
       SpellPanel.add(Ice5);
       
       SpellPanel.add(Holy1);
       SpellPanel.add(Holy2);
       SpellPanel.add(Holy3);
       SpellPanel.add(Holy4);
       SpellPanel.add(Holy5);
       
       SpellPanel.add(Shadow1);
       SpellPanel.add(Shadow2);
       SpellPanel.add(Shadow3);
       SpellPanel.add(Shadow4);
       SpellPanel.add(Shadow5);
       
       SpellPanel.add(Energy1);
       SpellPanel.add(Energy2);
       SpellPanel.add(Energy3);
       SpellPanel.add(Energy4);
       SpellPanel.add(Energy5);
       
       SpellPanel.add(Earth1);
       SpellPanel.add(Earth2);
       SpellPanel.add(Earth3);
       SpellPanel.add(Earth4);
       SpellPanel.add(Earth5);
       
       SpellPanel.add(Air1);
       SpellPanel.add(Air2);
       SpellPanel.add(Air3);
       SpellPanel.add(Air4);
       SpellPanel.add(Air5);
       
       SpellPanel.add(Water1);
       SpellPanel.add(Water2);
       SpellPanel.add(Water3);
       SpellPanel.add(Water4);
       SpellPanel.add(Water5);
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
        AgilityPlus.addActionListener(phandler);
        
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
    public void updatePanel() 
    {
    	StrengthD.setText(Integer.toString(Game.PLAYER.getStrength()));
    	StaminaD.setText(Integer.toString(Game.PLAYER.getStamina()));
    	MindD.setText(Integer.toString(Game.PLAYER.getMind()));
    	IntelligenceD.setText(Integer.toString(Game.PLAYER.getIntelligence()));
    	DefenseD.setText(Integer.toString(Game.PLAYER.getDefense()));
    	DexterityD.setText(Integer.toString(Game.PLAYER.getDexterity()));
    	AgilityD.setText(Integer.toString(Game.PLAYER.getAgility()));
    	//-------------------------------------------------------------------
    	SkillPointsD.setText(Integer.toString(Game.PLAYER.getSkillPoints()));
    	//-------------------------------------------------------------------
    	StrengthModifier.setText(Integer.toString(Game.PLAYER.getCurrentStrength()));
    	StaminaModifier.setText(Integer.toString(Game.PLAYER.getCurrentStamina()));
    	MindModifier.setText(Integer.toString(Game.PLAYER.getCurrentMind()));
    	IntelligenceModifier.setText(Integer.toString(Game.PLAYER.getCurrentIntelligence()));
    	DefenseModifier.setText(Integer.toString(Game.PLAYER.getCurrentDefense()));
    	DexterityModifier.setText(Integer.toString(Game.PLAYER.getCurrentDexterity()));
    	AgilityModifier.setText(Integer.toString(Game.PLAYER.getCurrentAgility()));
    	
    	if((TowerOfTime.GAME.PLAYER.getSkillPoints()) > 0)
		{
    		StrengthPlus.setEnabled(true);
    		StaminaPlus.setEnabled(true);
    		IntelligencePlus.setEnabled(true);
    		MindPlus.setEnabled(true);
    		DefensePlus.setEnabled(true);
    		DexterityPlus.setEnabled(true);
    		AgilityPlus.setEnabled(true);
    		
    		StrengthPlus.setBackground(Color.red);
    		StaminaPlus.setBackground(Color.red);
    		IntelligencePlus.setBackground(Color.red);
    		MindPlus.setBackground(Color.red);
    		DefensePlus.setBackground(Color.red);
    		SkillPointsD.setBackground(Color.orange);
    		SkillPoints.setBackground(Color.orange);
    		DexterityPlus.setBackground(Color.red);
    		AgilityPlus.setBackground(Color.red);
		}
    	if((TowerOfTime.GAME.PLAYER.getSkillPoints()) == 0)
		{
		StrengthPlus.setEnabled(false);
		StaminaPlus.setEnabled(false);
		IntelligencePlus.setEnabled(false);
		MindPlus.setEnabled(false);
		DefensePlus.setEnabled(false);
		DexterityPlus.setEnabled(false);
		AgilityPlus.setEnabled(false);
		
		StrengthPlus.setBackground(Color.gray);
		StaminaPlus.setBackground(Color.gray);
		IntelligencePlus.setBackground(Color.gray);
		MindPlus.setBackground(Color.gray);
		DefensePlus.setBackground(Color.gray);
		SkillPointsD.setBackground(Color.gray);
		SkillPoints.setBackground(Color.gray);
		DexterityPlus.setBackground(Color.gray);
		AgilityPlus.setBackground(Color.gray);
		}
    	
    }
    //EVERYTHING ABOVE THIS IS IMPORTANT!!!!
    
    
	public class ButtonHandler implements ActionListener
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
        		if((TowerOfTime.GAME.PLAYER.getSkillPoints()) > 0)
        		{
        		if(e.getSource() == StrengthPlus){TowerOfTime.GAME.PLAYER.setStrength(TowerOfTime.GAME.PLAYER.getStrength()+1);
        		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have chose to increase STRENGTH! (+1)");}
        		
        		if(e.getSource() == StaminaPlus){TowerOfTime.GAME.PLAYER.setStamina(TowerOfTime.GAME.PLAYER.getStamina()+1);
        		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have chose to increase STAMINA! (+1)");
        		TowerOfTime.GAME.PLAYER.setMaxHp(TowerOfTime.GAME.PLAYER.getMaxHp()+ TowerOfTime.GAME.PLAYER.getStamina()/3);}
        		
        		if(e.getSource() == IntelligencePlus){TowerOfTime.GAME.PLAYER.setIntelligence(TowerOfTime.GAME.PLAYER.getIntelligence()+1);
        		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have chose to increase INTELLIGENCE! (+1)");}
        		
        		if(e.getSource() == MindPlus){TowerOfTime.GAME.PLAYER.setMind(TowerOfTime.GAME.PLAYER.getMind()+1);
        		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have chose to increase MIND! (+1)");
        		TowerOfTime.GAME.PLAYER.setMaxMp(TowerOfTime.GAME.PLAYER.getMaxMp()+ TowerOfTime.GAME.PLAYER.getMind()/3);}
        		
        		if(e.getSource() == DefensePlus){TowerOfTime.GAME.PLAYER.setDefense(TowerOfTime.GAME.PLAYER.getDefense()+1);
        		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have chose to increase DEFENSE! (+1)");}
            	
        		if(e.getSource() == DexterityPlus){TowerOfTime.GAME.PLAYER.setDexterity(TowerOfTime.GAME.PLAYER.getDexterity()+1);
        		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have chose to increase DEXTERITY! (+1)");}
            	
        		if(e.getSource() == AgilityPlus){TowerOfTime.GAME.PLAYER.setAgility(TowerOfTime.GAME.PLAYER.getAgility()+1);
        		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have chose to increase AGILITY! (+1)");}
        		
        		TowerOfTime.GAME.PLAYER.setSkillPoints(TowerOfTime.GAME.PLAYER.getSkillPoints() -1);
        		
        		TowerOfTime.GAME.THEGAMEFRAME.update();
        		}
        		
            	if((TowerOfTime.GAME.PLAYER.getSkillPoints()) == 0)
        		{
        		StrengthPlus.setEnabled(false);
        		StaminaPlus.setEnabled(false);
        		IntelligencePlus.setEnabled(false);
        		MindPlus.setEnabled(false);
        		DefensePlus.setEnabled(false);
        		DexterityPlus.setEnabled(false);
        		
        		StrengthPlus.setBackground(Color.gray);
        		StaminaPlus.setBackground(Color.gray);
        		IntelligencePlus.setBackground(Color.gray);
        		MindPlus.setBackground(Color.gray);
        		DefensePlus.setBackground(Color.gray);
        		SkillPointsD.setBackground(Color.gray);
        		SkillPoints.setBackground(Color.gray);
        		DexterityPlus.setBackground(Color.gray);
        		TowerOfTime.GAME.THEGAMEFRAME.update();
        		}
        		   
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
