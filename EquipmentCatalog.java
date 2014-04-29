import java.util.ArrayList;

public class EquipmentCatalog 
{
	//Armor(String name, String desc, int slot, int defense)
	
	public static Armor LeatherTunic = new Armor("Leather Tunic", "A regular leather tunic.","Chest", 5);
	public static Armor BronzeCuriass = new Armor("Bronze Curiass", "A curiass made of bronze.","Chest", 10);
	
	public static Armor IronCuriass  = new Armor("Iron Curiass", "A curiass made of Iron.", "Chest", 15);
	public static Armor SteelCuriass  = new Armor("Steel Curiass", "A curiass made of Steel.","Chest", 20);
	
	//MODERN ARMOR
	public static Armor BulletproofVest = new Armor("Leather Tunic", "You better hope this works.", "Chest",25);
	public static Armor BallisticVest = new Armor("Ballistic Vest", "He went ballistic.", "Chest",30);
	
	
	public static Armor Buckler = new Armor("Buckler", "Not a belt buckle","Shield",5);
	public static Armor Agis    = new Armor("Agis", "A shield of the ages.","Shield",10);
	public static Armor SquareShield = new Armor("Square Shield","Its a square.","Shield",15);
	public static Armor KiteShield = new Armor("Kite Shield","Pull the boss.", "Sheild",20);
	public static Armor HeatShield = new Armor("Heat Shield","For the heat of battle","Shield",25);
	public static Armor TowerShield = new Armor("Tower Shield", "Tower above the rest","Shield",30);
	public static Armor LightRiotShield = new Armor("Light Riot Shield", "Riot no more", "Shield",35);
	public static Armor HeavyRiotShield = new Armor("Heavy Riot Shield", "Riot no more", "Shield",40);
	public static Armor EnergyShield = new Armor("Energy Shield", "Absorbs Kenetic Energy", "Shield",45);
	public static Armor ParticleShield = new Armor("Energy Shield", "Dissolves Matter", "Shield",50);
	
	//String PowerDescription = "Lesser";
	//int Power = 1;
	//public static Accessory lesserRingofFireResistance = new Accessory(PowerDescription + "Ring of Fire Resistance", "Ring with Fire Enchantment","Ring","Fire",Power);
	
	public static Accessory lesserRingofFireResistance = new Accessory("Lesser Ring of Fire Resistance", "Resists 5% of Fire Damage","Ring","Fire",1);
	public static Accessory RingofFireResistance = new Accessory("Ring of Fire Resistance", "Resists 10% of Fire Damaget","Ring","Fire",2);
	public static Accessory GreaterRingofFireResistance = new Accessory("Greater Ring of Fire Resistance", "Resists 15% of Fire Damage","Ring","Fire",3);
	
	public static Accessory lesserRingofIceResistance = new Accessory("Lesser Ring of Ice Resistance", "Resists 5% of Ice Damage","Ring","Ice",1);
	public static Accessory RingofIceResistance = new Accessory("Ring of Ice Resistance", "Resists 10% of Ice Damaget","Ring","Ice",2);
	public static Accessory GreaterRingofIceResistance = new Accessory("Greater Ring of Ice Resistance", "Resists 15% of Ice Damage","Ring","Ice",3);
	
	
	
	public static Accessory getRings(String itemName)
	{
		ArrayList <Accessory> rings = new ArrayList<Accessory>();
		
		rings.add(lesserRingofFireResistance);
		rings.add(RingofFireResistance);
		rings.add(GreaterRingofFireResistance);
		
		rings.add(lesserRingofIceResistance);
		rings.add(RingofIceResistance);
		rings.add(GreaterRingofIceResistance);
		
		for(Accessory ring : rings)
        {
            if(ring.getName().equals(itemName))
            {
            System.out.println(ring.name); 
            return ring;
            }
        }
        Accessory ring = new Accessory();
    	return ring;	
	}
	
	public static Armor getShields(String itemName)
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
		
		for(Armor shield : shields)
        {
            if(shield.getName().equals(itemName))
            {
            System.out.println(shield.name); 
            return shield;
            }
        }
		
        Armor shield = new Armor();
		return shield;
		
	}
	
	public static Weapon getWeapons(String itemName)
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
				        for(Weapon weapon : weapons)
				        {
				            if(weapon.getName().equals(itemName))
				            {

				            System.out.println(weapon.name); 
				            return weapon;
				            }
				        }
				        Weapon weapon = new Weapon();
						return weapon;
	}

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
}
