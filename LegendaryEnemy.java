
public class LegendaryEnemy extends Character{
	
	LegendaryEnemy() {
		super();
		super.setRole("Legendary Enemy");
	}
	LegendaryEnemy(String name, String race, int level, int hp, int str, int dex, int sta, int inte, int def) {
		super();
		super.setRole("Legendary Enemy");
		super.setName(name);
		super.setRace(race);
		super.setLevel(level);
		super.setMaxHp(hp);
		super.setHp(hp);
		super.setStrength(str);
		super.setDexterity(dex);
		super.setStamina(sta);
		super.setIntelligence(inte);
		super.setDefense(def);
	}

}
