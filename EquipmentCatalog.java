import java.util.ArrayList;

public class EquipmentCatalog 
{
	//Armor(String name, String desc, int slot, int defense)
	
	public static Armor LeatherTunic = new Armor("Leather Tunic", "A regular leather tunic.","Chest", 5);
	public static Armor BronzeCuriass = new Armor("Bronze Curiass", "A curiass made of bronze.","Chest", 10);
	public static Armor IronCuriass  = new Armor("Iron Curiass", "A curiass made of Iron.", "Chest", 15);
	public static Armor SteelCuriass  = new Armor("Steel Curiass", "A curiass made of Steel.","Chest", 20);
	public static Armor BulletproofVest = new Armor("Leather Tunic", "You better hope this works.", "Chest",25);
	public static Armor BallisticVest = new Armor("Ballistic Vest", "He went ballistic.", "Chest",30);
	public static Armor EnergyVest = new Armor("Energy Vest", "Absorbs Kenetic Energy.", "Chest",35);
	public static Armor ParticleVest = new Armor("Particle Vest", "Dissolves Matter.", "Chest",40);
	
	public static Armor LeatherHelmet = new Armor("Leather Helmet", "A regular leather Helmet.","Helmet", 5);
	public static Armor BronzeHelmet = new Armor("Bronze Helmet", "A Helmet made of bronze.","Helmet", 10);
	public static Armor IronHelmet  = new Armor("Iron Helmet", "A Helmet made of Iron.", "Helmet", 15);
	public static Armor SteelHelmet  = new Armor("Steel Helmet", "A Helmet made of Steel.","Helmet", 20);
	public static Armor BulletproofHelmet = new Armor("Bulletproof Helmet", "You better hope this works.", "Helmet",25);
	public static Armor BallisticHelmet = new Armor("Ballistic Helmet", "He went ballistic.", "Helmet",30);
	public static Armor EnergyHelmet = new Armor("Energy Helmet", "Absorbs Kenetic Energy.", "Helmet",35);
	public static Armor ParticleHelmet = new Armor("Particle Helmet", "Dissolves Matter.", "Helmet",40);

	public static Armor LeatherGloves = new Armor("Leather Gloves", "A pair regular leather gloves.","Hands", 5);
	public static Armor BronzeGauntlets = new Armor("Bronze Gauntlets", "Gloves made of bronze.","Hands", 10);
	public static Armor IronGauntlets  = new Armor("Iron Gauntlets", "Gloves made of Iron.", "Hands", 15);
	public static Armor SteelGauntlets  = new Armor("Steel Gauntlets", "Gloves made of Steel.","Hands", 20);
	public static Armor BulletproofGloves = new Armor("Leather Gloves", "You better hope this works.", "Hands",25);
	public static Armor BallisticGloves = new Armor("Ballistic Gloves", "He went ballistic.", "Hands",30);
	public static Armor EnergyGloves = new Armor("Energy Gloves", "Absorbs Kenetic Energy.", "Hands",35);
	public static Armor ParticleGloves = new Armor("Particle Gloves", "Dissolves Matter.", "Hands",40);
	
	public static Armor LeatherChaps = new Armor("Leather Chaps", "A regular pair of leather pants.","Legs", 5);
	public static Armor BronzeGreaves = new Armor("Bronze Greaves", "Greaves made of bronze.","Legs", 10);
	public static Armor IronGreaves  = new Armor("Iron Greaves", "Greaves made of Iron.", "Legs", 15);
	public static Armor SteelGreaves  = new Armor("Steel Greaves", "Greaves made of Steel.","Legs", 20);
	public static Armor BulletproofPants = new Armor("Bulletproof Pants", "You better hope this works.", "Legs",25);
	public static Armor BallisticPants = new Armor("Ballistic Greaves", "He went ballistic.", "Legs",30);
	public static Armor EnergyPants = new Armor("Energy Pants", "Absorbs Kenetic Energy.", "Legs",35);
	public static Armor ParticlePants = new Armor("Particle Pants", "Dissolves Matter.", "Legs",40);
	
	public static Armor LeatherBoots = new Armor("Leather Boots", "A pair of regular leather boots.","Feet", 5);
	public static Armor BronzeBoots = new Armor("Bronze Boots", "Boots made of bronze.","Feet", 10);
	
	public static Armor IronBoots  = new Armor("Iron Boots", "Boots made of Iron.", "Feet", 15);
	public static Armor SteelBoots  = new Armor("Steel Boots", "Boots made of Steel.","Feet", 20);
	
	public static Armor BulletproofBoots = new Armor("Leather Boots", "You better hope this works.", "Feet",25);
	public static Armor BallisticBoots = new Armor("Ballistic Boots", "He went ballistic.", "Feet",30);
	
	public static Armor EnergyBoots = new Armor("Energy Boots", "Absorbs Kenetic Energy.", "Feet",35);
	public static Armor ParticleBoots = new Armor("Particle Boots", "Dissolves Matter.", "Feet",40);
	
	public static Armor Buckler = new Armor("Buckler", "Not a belt buckle","Shield",5);
	public static Armor Agis    = new Armor("Agis", "A Shield of the ages.","Shield",10);
	public static Armor SquareShield = new Armor("Square Shield","Its a square.","Shield",15);
	public static Armor KiteShield = new Armor("Kite Shield","Pull the boss.", "Sheild",20);
	public static Armor HeatShield = new Armor("Heat Shield","For the heat of battle","Shield",25);
	public static Armor TowerShield = new Armor("Tower Shield", "Tower above the rest","Shield",30);
	public static Armor LightRiotShield = new Armor("Light Riot Shield", "Riot no more", "Shield",35);
	public static Armor HeavyRiotShield = new Armor("Heavy Riot Shield", "Riot no more", "Shield",40);
	public static Armor EnergyShield = new Armor("Energy Shield", "Absorbs Kenetic Energy", "Shield",45);
	public static Armor ParticleShield = new Armor("Energy Shield", "Dissolves Matter", "Shield",50);

	
	public static Accessory LesserRingofFireResistance = new Accessory("Lesser Ring of Fire Resistance", "Resists 5% of Fire Damage","Ring","Fire",1);
	public static Accessory RingofFireResistance = new Accessory("Ring of Fire Resistance", "Resists 10% of Fire Damage","Ring","Fire",2);
	public static Accessory GreaterRingofFireResistance = new Accessory("Greater Ring of Fire Resistance", "Resists 15% of Fire Damage","Ring","Fire",3);
	
	public static Accessory LesserRingofIceResistance = new Accessory("Lesser Ring of Ice Resistance", "Resists 5% of Ice Damage","Ring","Ice",1);
	public static Accessory RingofIceResistance = new Accessory("Ring of Ice Resistance", "Resists 10% of Ice Damage","Ring","Ice",2);
	public static Accessory GreaterRingofIceResistance = new Accessory("Greater Ring of Ice Resistance", "Resists 15% of Ice Damage","Ring","Ice",3);
	
	public static Accessory LesserBeltofFireResistance = new Accessory("Lesser Belt of Fire Resistance", "Resists 5% of Fire Damage","Belt","Fire",1);
	public static Accessory BeltofFireResistance = new Accessory("Belt of Fire Resistance", "Resists 10% of Fire Damage","Belt","Fire",2);
	public static Accessory GreaterBeltofFireResistance = new Accessory("Greater Belt of Fire Resistance", "Resists 15% of Fire Damage","Belt","Fire",3);
	
	public static Accessory LesserAmuletofIceResistance = new Accessory("Lesser Amulet of Ice Resistance", "Resists 5% of Ice Damage","Amulet","Ice",1);
	public static Accessory AmuletofIceResistance = new Accessory("Amulet of Ice Resistance", "Resists 10% of Ice Damage","Amulet","Ice",2);
	public static Accessory GreaterAmuletofIceResistance = new Accessory("Greater Amulet of Ice Resistance", "Resists 15% of Ice Damage","Amulet","Ice",3);
	
	public static Accessory LesserAmuletofFireResistance = new Accessory("Lesser Amulet of Fire Resistance", "Resists 5% of Fire Damage","Amulet","Fire",1);
	public static Accessory AmuletofFireResistance = new Accessory("Amulet of Fire Resistance", "Resists 10% of Fire Damage","Amulet","Fire",2);
	public static Accessory GreaterAmuletofFireResistance = new Accessory("Greater Amulet of Fire Resistance", "Resists 15% of Fire Damage","Amulet","Fire",3);
	
	public static Accessory LesserBeltofIceResistance = new Accessory("Lesser Belt of Ice Resistance", "Resists 5% of Ice Damage","Belt","Ice",1);
	public static Accessory BeltofIceResistance = new Accessory("Belt of Ice Resistance", "Resists 10% of Ice Damage","Belt","Ice",2);
	public static Accessory GreaterBeltofIceResistance = new Accessory("Greater Belt of Ice Resistance", "Resists 15% of Ice Damage","Belt","Ice",3);
	
	public static Weapon Dagger = new Weapon("Dagger","With moves like Dagger.","Weapon",4,3);
	public static Weapon ShortSword =new Weapon("Short Sword","It Stings?","Weapon",3,4);
	public static Weapon Axe =new Weapon("Axe","For Men.","Weapon",2,7);
	public static Weapon Quarterstaff = new Weapon("Quarter Staff","When your quartered.","Weapon",3,5);
	public static Weapon LongSword = new Weapon("Long Sword","Noun: A sword that is long.","Weapon",2,9);
	
	
	public static Weapon LongBow           = new Weapon("Long Bow","Bound to ruffle a few feathers.","Weapon",1,14);
	public static Weapon ShortBow          = new Weapon("Short Bow", "A bow that is small.","Weapon",2,6);
	public static Weapon CompositeShortBow = new Weapon("Composite Short Bow", "A bow that is small.","Weapon",2,7);
	public static Weapon CompositeLongBow  = new Weapon("Composite Long Bow","Bow before me.","Weapon",1,15);
	public static Weapon ThrowingKnife           = new Weapon ("Throwing Knife","Not for the easily startled.","Weapon",5,3);
	public static Weapon ThrowingAxe             = new Weapon ("Throwing Axe","Gimli called. He wants his axe back.","Weapon",4,4);
	
	//RENAISSANCE WEAPONRY
	public static Weapon Mace                    = new Weapon ("Mace","An aerosol self defense spray.","Weapon",2,10);
	public static Weapon Stiletto                = new Weapon ("Stiletto","Those heels look nice on you.","Weapon",4,5);
	public static Weapon Rapier                  = new Weapon ("Rapier","I challenge you to a dat-dat-dat-duel.","Weapon",4,6);
	public static Weapon Flail                   = new Weapon ("Flail","What comes with marriage? The old ball and chain.","Weapon",2,13);
	public static Weapon Scimitar                = new Weapon ("Scimitar","I am the one they call, Drizzt Do Urden.","Weapon",3,9);
	public static Weapon BattleAxe               = new Weapon ("Battle Axe","Why not call it a big axe?","Weapon",2,14);
	public static Weapon Halberd                 = new Weapon ("Halberd","For those hard to reach places.","Weapon", 2,15);
	public static Weapon TwoHand                 = new Weapon ("Two Hand","When its not a one man job.","Weapon",1,30);
	
	public static Weapon Culverin                = new Weapon ("Culverin","I CANNONt do that for you, because its a gun.","Weapon",1,20);
	public static Weapon Javelin                 = new Weapon ("Javelin","JAVAlin. Get it, because its Java. Sorry, bad joke.","Weapon",3,8);
	public static Weapon RustedMusket            = new Weapon ("Rusted Musket","Why do I always get the defective ones.","Weapon",1,25);
	public static Weapon OrganGun                = new Weapon ("Organ Gun","A musician's delight."	,"Weapon",6,5);
	public static Weapon Musket                  = new Weapon ("Musket","Where did I put those bullets?","Weapon",1,28);
	public static Weapon CrossBow                = new Weapon ("Cross Bow","Hunting vampires since 1868.","Weapon",1,30);
	
	//MODERN WEAPONRY
	public static Weapon TrenchKnife             = new Weapon ("Trench Knife","How do you expect to dig with a knife?"	,"Weapon",4,9);
	public static Weapon Machete                 = new Weapon ("Machete","For those days you forget to cut the grass."	,"Weapon",2,20);
	public static Weapon Kukri                   = new Weapon ("Kukri", "Oh no,its bent!","Weapon",1,45);
	public static Weapon Katana                  = new Weapon ("Katana","Perfect for those days when you want to be a Ninja.","Weapon", 3,25);
	public static Weapon Sledgehammer            = new Weapon ("Sledgehammer","I came in like a...","Weapon",1,80);

	public static Weapon CompoundBow             = new Weapon ("Compound Bow","Back to the basics, kinda."	,"Weapon",3,12);
	public static Weapon DesertEagle             = new Weapon ("Desert Eagle","Noun. An eagle that lives in the desert.","Weapon",4,15);
	public static Weapon Marlin                  = new Weapon ("Marlin 1894 CB","Its a rifle.","Weapon",2,40);
	public static Weapon AK47                    = new Weapon ("AK-47","It took 47 tries."	,"Weapon", 10,8);
	public static Weapon AR15                    = new Weapon ("AR-15","When you just got to hit that accelerated Reading goal.","Weapon",10,9);
	public static Weapon Remington870            = new Weapon ("Remington 870","Makes a delightful Swiss cheese.","Weapon",2,50);
	
	//FUTURISTIC WEAPONRY
	public static Weapon EnergySword             = new Weapon ("Energy Sword","Halo, good sir.","Weapon",5,30);
	public static Weapon PlasmaWhip              = new Weapon ("Plasma Whip","Whip it good.","Weapon",3,50);
	public static Weapon OmniBlade               = new Weapon ("Omni-Blade","I should go.","Weapon",6,33);
	public static Weapon GravityHammer            = new Weapon ("Gravity Hammer","Obey the law.","Weapon",1,200);
	public static Weapon LightSaber              = new Weapon ("Light Saber","Warning: Don't point at eye.","Weapon",2,100);

	public static Weapon SonicScrewdriver        = new Weapon ("Sonic Screwdriver","Is the doctor in?","Weapon",6,25);
	public static Weapon Blaster                 = new Weapon ("Blaster","Blaster? I barely even knew her.","Weapon",3,50);
	public static Weapon PhotonicPhaser          = new Weapon ("Photonic Phaser","I'm giving it all she's got.","Weapon",12,15);
	public static Weapon FushionGrendade         = new Weapon ("Fushion Grenade","It's the F-bomb.","Weapon",1,200);
	public static Weapon ParticleBurstRifle      = new Weapon ("Particle Burst Rifle","When dead, means dead.","Weapon",8,25);
	public static Weapon AntimatterRifle         = new Weapon ("Antimatter Rifle","When nothing matters.","Weapon",4,50);


	
	public static ArrayList<Accessory> getRings()
	{
		ArrayList <Accessory> rings = new ArrayList<Accessory>();
		
		rings.add(LesserRingofFireResistance);
		rings.add(RingofFireResistance);
		rings.add(GreaterRingofFireResistance);
		
		rings.add(LesserRingofIceResistance);
		rings.add(RingofIceResistance);
		rings.add(GreaterRingofIceResistance);
		
		return rings;
	}
	public static ArrayList<Accessory> getAmulets()
	{
		ArrayList <Accessory> amulets = new ArrayList<Accessory>();
		
		amulets.add(LesserAmuletofFireResistance);
		amulets.add(AmuletofFireResistance);
		amulets.add(GreaterAmuletofFireResistance);
		
		amulets.add(LesserAmuletofIceResistance);
		amulets.add(AmuletofIceResistance);
		amulets.add(GreaterAmuletofIceResistance);
		
		return amulets;
	}
	
	public static ArrayList<Accessory> getBelts()
	{
		ArrayList <Accessory> belts = new ArrayList<Accessory>();
		
		belts.add(LesserBeltofFireResistance);
		belts.add(BeltofFireResistance);
		belts.add(GreaterBeltofFireResistance);
		
		belts.add(LesserBeltofIceResistance);
		belts.add(BeltofIceResistance);
		belts.add(GreaterBeltofIceResistance);
		
		return belts;
	}
	
	public static ArrayList<Armor> getShields()
	{
		ArrayList <Armor> shields = new ArrayList<Armor>();
		
		shields.add(Buckler);
		shields.add(Agis);
		
		shields.add(SquareShield);
		shields.add(KiteShield);
		
		shields.add(HeatShield);
		shields.add(TowerShield);
		
		shields.add(LightRiotShield);
		shields.add(HeavyRiotShield);
		
		shields.add(EnergyShield);
		shields.add(ParticleShield);

		return shields;		
	}
	
	public static ArrayList<Weapon> getWeapons()
	{
		ArrayList <Weapon> weapons = new ArrayList<Weapon>();
		
		weapons.add(Dagger);
		weapons.add(ShortSword);
		weapons.add(Axe);
		weapons.add(Quarterstaff);
		weapons.add(LongSword);
		
		weapons.add(ShortBow);
		weapons.add(LongBow);
		weapons.add(CompositeLongBow);
		weapons.add(CompositeShortBow);
		weapons.add(ThrowingAxe);
		weapons.add(ThrowingKnife);
		
		weapons.add(Mace);
		weapons.add(Stiletto);
		weapons.add(Rapier);
		weapons.add(Flail);
		weapons.add(Scimitar);
		weapons.add(BattleAxe);
		weapons.add(Halberd);
		weapons.add(TwoHand);
		
		weapons.add(Culverin);
		weapons.add(Javelin);
		weapons.add(RustedMusket);
		weapons.add(OrganGun);
		weapons.add(Musket);
		weapons.add(CrossBow);
		
		weapons.add(TrenchKnife);
		weapons.add(Machete);
		weapons.add(Kukri);
		weapons.add(Katana);
		weapons.add(Sledgehammer);
		
		weapons.add(CompoundBow);
		weapons.add(DesertEagle);
		weapons.add(Marlin);
		weapons.add(AK47);
		weapons.add(AR15);
		weapons.add(Remington870);
		
		weapons.add(EnergySword);
		weapons.add(PlasmaWhip);
		weapons.add(OmniBlade);
		weapons.add(GravityHammer);
		weapons.add(LightSaber);
		
		weapons.add(SonicScrewdriver);
		weapons.add(Blaster);
		weapons.add(PhotonicPhaser);
		weapons.add(FushionGrendade);
		weapons.add(ParticleBurstRifle);
		weapons.add(AntimatterRifle);
    return weapons;
	}
	
	public static ArrayList<Armor> getChests()
	{
		ArrayList <Armor> chests = new ArrayList<Armor>();
		
		chests.add(LeatherTunic);
		chests.add(BronzeCuriass);
		
		chests.add(SteelCuriass);
		chests.add(IronCuriass);
		
		chests.add(BulletproofVest);
		chests.add(BallisticVest);
		
		chests.add(EnergyVest);
		chests.add(ParticleVest);
		return chests;		
	}
	
	
	public static ArrayList<Armor> getHands()
{
	ArrayList <Armor> hands = new ArrayList<Armor>();
	
	hands.add(LeatherGloves);
	hands.add(BronzeGauntlets);
	
	hands.add(SteelGauntlets);
	hands.add(IronGauntlets);
	
	hands.add(BulletproofGloves);
	hands.add(BallisticGloves);
	
	hands.add(EnergyGloves);
	hands.add(ParticleGloves);
	
	return hands;		
}

	public static ArrayList<Armor> getFeet()
{
	ArrayList <Armor> feet = new ArrayList<Armor>();
	
	feet.add(LeatherBoots);
	feet.add(BronzeBoots);
	
	feet.add(SteelBoots);
	feet.add(IronBoots);
	
	feet.add(BulletproofBoots);
	feet.add(BallisticBoots);
	
	feet.add(EnergyBoots);
	feet.add(ParticleBoots);
	
	return feet;		
}

	
	public static ArrayList<Armor> getLegs()
{
	ArrayList <Armor> legs = new ArrayList<Armor>();
	
	legs.add(LeatherChaps);
	legs.add(BronzeGreaves);
	
	legs.add(SteelGreaves);
	legs.add(IronGreaves);
	
	legs.add(BulletproofPants);
	legs.add(BallisticPants);
	
	legs.add(EnergyPants);
	legs.add(ParticlePants);
	
	return legs;		
}

	public static ArrayList<Armor> getHelmets()
{
	ArrayList <Armor> helmets = new ArrayList<Armor>();
	
	helmets.add(LeatherHelmet);
	helmets.add(BronzeHelmet);
	
	helmets.add(SteelHelmet);
	helmets.add(IronHelmet);
	
	helmets.add(BulletproofHelmet);
	helmets.add(BallisticHelmet);
	
	helmets.add(EnergyHelmet);
	helmets.add(ParticleHelmet);
	
	return helmets;		
}

public static Armor getShield(String itemName) 
	{
		ArrayList<Armor> shields = getShields();
		Armor shield =  new Armor();
		for(int i = 0; i<shields.size(); i++)
        {
            if(shields.get(i).getName().equals(itemName))
            {
            System.out.println(shields.get(i).getName()); 
            shield = shields.get(i);
            }         
        }
		return shield;
	}
	
 public static Armor getChest(String itemName) 
	{
		ArrayList<Armor> chests = getChests();
		Armor chest =  new Armor();
		for(int i = 0; i<chests.size(); i++)
        {
            if(chests.get(i).getName().equals(itemName))
            {
            System.out.println(chests.get(i).getName()); 
            chest = chests.get(i);
            }         
        }
		return chest;
	}

 public static Armor getLeg(String itemName) 
	{
		ArrayList<Armor> legs = getLegs();
		Armor leg =  new Armor();
		for(int i = 0; i<legs.size(); i++)
        {
            if(legs.get(i).getName().equals(itemName))
            {
            System.out.println(legs.get(i).getName()); 
            leg = legs.get(i);
            }         
        }
		return leg;
	}
public static Armor getHelmet(String itemName) 
	{
		ArrayList<Armor> helmets = getHelmets();
		Armor helmet =  new Armor();
		for(int i = 0; i<helmets.size(); i++)
        {
            if(helmets.get(i).getName().equals(itemName))
            {
            System.out.println(helmets.get(i).getName()); 
            helmet = helmets.get(i);
            }         
        }
		return helmet;
	}

public static Armor getHand(String itemName) 
	{
		ArrayList<Armor> gloves = getHands();
		Armor glove =  new Armor();
		for(int i = 0; i<gloves.size(); i++)
        {
            if(gloves.get(i).getName().equals(itemName))
            {
            System.out.println(gloves.get(i).getName()); 
            glove = gloves.get(i);
            }         
        }
		return glove;
	}
	
public static Armor getFoot(String itemName) 
{
	ArrayList<Armor> feet = getFeet();
	Armor foot =  new Armor();
	for(int i = 0; i<feet.size(); i++)
    {
        if(feet.get(i).getName().equals(itemName))
        {
        System.out.println(feet.get(i).getName()); 
        foot = feet.get(i);
        }         
    }
	return foot;
}

	//------------------------------------------------------------------
	public static Weapon getWeapon(String itemName) {
		ArrayList<Weapon> weapons = getWeapons();
		Weapon weapon =  new Weapon();
		for(int i = 0; i<weapons.size(); i++)
        {
            if(weapons.get(i).getName().equals(itemName))
            {
            System.out.println(weapons.get(i).getName()); 
            weapon = weapons.get(i);
            }         
        }
		return weapon;
	}

//------------------------------------------------------------------
	public static Accessory getRing(String itemName) {
	ArrayList<Accessory> rings = getRings();
	Accessory ring =  new Accessory();
	for(int i = 0; i<rings.size(); i++)
    {
        if(rings.get(i).getName().equals(itemName))
        {
        System.out.println(rings.get(i).getName()); 
        ring = rings.get(i);
        }         
    }
	return ring;
}
	public static Accessory getBelt(String itemName) {
	ArrayList<Accessory> belts = getBelts();
	Accessory belt =  new Accessory();
	for(int i = 0; i<belts.size(); i++)
    {
        if(belts.get(i).getName().equals(itemName))
        {
        System.out.println(belts.get(i).getName()); 
        belt = belts.get(i);
        }         
    }
	return belt;
}
	
	public static Accessory getAmulet(String itemName) {
	ArrayList<Accessory> amulets = getAmulets();
	Accessory amulet =  new Accessory();
	for(int i = 0; i<amulets.size(); i++)
    {
        if(amulets.get(i).getName().equals(itemName))
        {
        System.out.println(amulets.get(i).getName()); 
        amulet = amulets.get(i);
        }         
    }
	return amulet;
}


}


	
