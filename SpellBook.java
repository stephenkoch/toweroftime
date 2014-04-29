import java.util.ArrayList;
import java.util.Scanner;


public class SpellBook {
	
	protected ArrayList<Spell> spells;
	
	SpellBook() {
		spells = new ArrayList<Spell>();
		spells.add(new Spell("Fire ball", 'a', "Burn your enemy", 8));
		spells.add(new Spell("Heal", 'b', "Heal your wounds", 4));
	}

	
	public static void CastSpell(Spell spell) {
		if (TowerOfTime.GAME.PLAYER.getMp() >= spell.getCost()) {
			if (TowerOfTime.GAME.inCombat) {
				TowerOfTime.GAME.PLAYER.setMp(TowerOfTime.GAME.PLAYER.getMp()-spell.getCost());

				Game.LEVEL.grid[Game.LEVEL.playerLocation.x][Game.LEVEL.playerLocation.y].getEncounter().getCombat().castSpell(spell);
			}
			else if (!TowerOfTime.GAME.inCombat) {
				if (spell.getEffect() == 'a') {
					String update = ("You canot cast this outside of combat.");
					TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);
				}
				if (spell.getEffect() == 'b') {
					TowerOfTime.GAME.PLAYER.setMp(TowerOfTime.GAME.PLAYER.getMp()-spell.getCost());
					int heal = spell.getCost() + (TowerOfTime.GAME.PLAYER.getCurrentIntelligence()/3);
					TowerOfTime.GAME.PLAYER.setHp(TowerOfTime.GAME.PLAYER.getHp()+heal);
					String update = ("You healed yourself for "+ heal + " health!");
					TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);		
				}
			}
		}
		else {
			String update = ("You do not have enough mana");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);		
		}
	
	}
}
