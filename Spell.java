import java.util.Random;


public class Spell {
	private String name;
	private char effect;
	private String description;
	private int cost;
	
	Spell() {
		
	}
	
	Spell(String name, char effect, String description, int cost) {
		this.name = name;
		this.effect = effect;
		this.description = description;
		this.cost = cost;
	}
	
	public String getName() { return name; }
	public char getEffect() { return effect; }
	public String getDescription() { return description; }
	public int getCost() { return cost; }
	
	public void setName(String name) { this.name = name; }
	public void setEffect(char effect) { this.effect = effect; }
	public void setDescription(String description) { this.description = description; }
	public void setCost(int cost) { this.cost = cost; }
	

	public void useSpell(Character player, Character opponent) {
		Random dice = new Random();
		switch(effect) {
			case 'a': {
				opponent.setHp(opponent.getHp()-(player.getIntelligence()+(dice.nextInt(7)+1)));
				break;
			}
			case 'b': {
				player.setHp(player.getHp()+(player.getIntelligence()/3)+(dice.nextInt(3)+1));
				if(player.getHp() > player.getMaxHp()) {
					player.setHp(player.getMaxHp());
				}
				break;
			}
		}
	}
	
	public void useSpell(Character player) {
		Random dice = new Random();
		switch(effect) {
			case 'a': {
				System.out.println("This spell can only be used in combat");
				break;
		}
			case 'b': {
				player.setHp(player.getHp()+(player.getIntelligence()/3)+(dice.nextInt(3)+1));
				if(player.getHp() > player.getMaxHp()) {
					player.setHp(player.getMaxHp());
				}
				break;
		}
	}
	}

}
