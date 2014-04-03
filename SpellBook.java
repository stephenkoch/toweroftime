import java.util.ArrayList;
import java.util.Scanner;


public class SpellBook {
	
	protected ArrayList<Spell> spells;
	
	SpellBook() {
		spells = new ArrayList<Spell>();
		spells.add(new Spell("Fire ball", 'a', "Burn your enemy", 8));
		spells.add(new Spell("Heal", 'b', "Heal your wounds", 4));
	}
	
	public void showSpells() {
		System.out.println("+~~~~~SpellBook~~~~~+");
		for (int i = 0; i < spells.size(); i++) {
			System.out.println(i+": "+spells.get(i).getName());
		}
		System.out.println("+~~~~~~~~~~~~~~~~~~~+");
	}
	
	public void CastSpell(Character player, Character opponent) {
		Scanner console = new Scanner(System.in);
		System.out.println("Which spell do you want to cast?  MP: "+player.getMp()+"/"+player.getMaxMp());
		int action = console.nextInt();
		if(spells.size()-1 >= action) {
			if((player.getMp()-spells.get(action).getCost()) < 0) {
				System.out.println("Not enough MP");
				CastSpell(player, opponent);
			}
			else {
				player.setMp(player.getMp()-spells.get(action).getCost());
				spells.get(action).useSpell(player, opponent);
			}
		}
		else {
			System.out.println("Incorrect input");
		}
	}
	
	public void CastSpell(Character player) {
		Scanner console = new Scanner(System.in);
		System.out.println("Which spell do you want to cast?  MP: "+player.getMp()+"/"+player.getMaxMp());
		int action = console.nextInt();
		if(spells.size()-1 >= action) {
			if(player.getMp()-spells.get(action).getCost() < 0) {
				System.out.println("Not enough MP");
				CastSpell(player);
			}
			else {
				spells.get(action).useSpell(player);
				player.setMp(player.getMp()-spells.get(action).getCost());
			}
		}
		else {
			System.out.println("Incorrect input");
		}
	}
	
}
