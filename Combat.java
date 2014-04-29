import java.util.Random;
import java.util.Scanner;


public class Combat {
	private static Enemy enemy;
	
	Combat(Enemy opponent) {
		enemy = opponent;
	}
	

	public void attack() {
		int attackerBaseAttackBonus = TowerOfTime.GAME.PLAYER.getCurrentDexterity()/3;
		int defenderArmorClass = enemy.getDefense()/3;
		String update;
		Random dice = new Random();
		for (int i = 0; i < TowerOfTime.GAME.PLAYER.equipped.getWeapon().getWeaponSpeed(); i++) {
			if ((attackerBaseAttackBonus+(dice.nextInt(19)+1)) > (defenderArmorClass+(dice.nextInt(19)+1))) {
	
				int damage = (Game.PLAYER.getCurrentStrength()/3+(dice.nextInt(4)+1)+(TowerOfTime.GAME.PLAYER.equipped.getWeapon().getWeaponDamage()));
				enemy.setHp(enemy.getHp()-damage);
				
				update = (damage +" damage to the "+enemy.getRace());
				System.out.print(damage +" damage to the "+enemy.getRace()+"!\n");
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);
			
			}
			else {
				System.out.println("Miss!");
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You missed!");
			}
		}
		TowerOfTime.GAME.THEGAMEFRAME.update();
		checkCombatWinnerPlayer();		

	}
	public void castSpell(Spell spell) {	
		if (spell.getEffect() == 'a') {
			int damage = spell.getCost() + (TowerOfTime.GAME.PLAYER.getCurrentIntelligence()/3);
			enemy.setHp((enemy.getHp()-damage));
			String update = (damage + " damage done to the "+enemy.getRace()+" with "+spell.getName());
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);
		}
		if (spell.getEffect() == 'b') {
			int heal = spell.getCost() + (TowerOfTime.GAME.PLAYER.getCurrentIntelligence()/3);
			TowerOfTime.GAME.PLAYER.setHp(TowerOfTime.GAME.PLAYER.getHp()+heal);
			String update = ("You healed yourself for "+ heal + " health!");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);					
		}
		TowerOfTime.GAME.THEGAMEFRAME.update();
		checkCombatWinnerPlayer();				
		
	}

	private static void enemyAttack() {
		int attackerBaseAttackBonus = enemy.getDexterity()/3;
		int defenderArmorClass = TowerOfTime.GAME.PLAYER.getCurrentDefense()/3;
		System.out.println("Defender " + defenderArmorClass);
		String update;
		Random dice = new Random();
		if ((attackerBaseAttackBonus+(dice.nextInt(19)+1)) > (defenderArmorClass+(dice.nextInt(19)+1))) {

			int damage = (enemy.getStrength()/3+(dice.nextInt(4)+1));
			TowerOfTime.GAME.PLAYER.setHp(TowerOfTime.GAME.PLAYER.getHp()-damage);
			
			update = (damage +" damage to you!");
			
			System.out.print(damage +" damage to you!\n");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);

		}
		else {
			System.out.println("Miss!");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("Miss!");

		}
		TowerOfTime.GAME.THEGAMEFRAME.update();
		checkCombatWinnerEnemy();
}
	
	private static void checkCombatWinnerPlayer() {
		if(Game.PLAYER.getHp() <= 0) {
			gameOver();
			TowerOfTime.GAME.THEGAMEFRAME.dispose();
		}
		else if(enemy.getHp() <= 0) {
			win();
			assignExp(enemy);
			TowerOfTime.GAME.inCombat = false;
			TowerOfTime.GAME.THEGAMEFRAME.update();
		}
		else {
			enemyAttack();
		}
		TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.AR15);
	}
	private static void checkCombatWinnerEnemy() {
		if(Game.PLAYER.getHp() <= 0) {
			gameOver();
		}
		else if(enemy.getHp() <= 0) {
			win();
			assignExp(enemy);
		}
	}
	
	public static void gameOver() {
		System.out.println("You have been slain.");
		System.exit(0);
	}
	
	public static void win() {
		System.out.println("You have slain the enemy."); //change to say "You have slain X!" where X is the enemy.
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have slain the enemy.");
	}
	
	public static void assignExp(Character enemy) 
	{
		int exp = enemy.getLevel() * 10;
		TowerOfTime.GAME.PLAYER.setExp((TowerOfTime.GAME.PLAYER.getExp()+ exp));
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have gained " + exp + " experience!");
		TowerOfTime.GAME.PLAYER.shouldLevelUp();
		loot();
	}
	public Enemy getEnemy() {return enemy;}
	 private static void loot()
	   {
			int itemType;
			int item;
			Random getType = new Random();
			Random getItem  = new Random();
			itemType = getType.nextInt(7)+1;
			
			if(itemType == 0)
			{
			item = getItem.nextInt(EquipmentCatalog.getWeapons().size());
			TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getWeapons().get(item));
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getWeapons().get(item).name);
			}
			
			if(itemType == 1)
			{
				item = getItem.nextInt(EquipmentCatalog.getShields().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getShields().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getShields().get(item).name);
			}
			if(itemType == 2)
			{
				item = getItem.nextInt(EquipmentCatalog.getHelmets().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getHelmets().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getHelmets().get(item).name);
			}
			
			if(itemType == 3)
			{
				item = getItem.nextInt(EquipmentCatalog.getChests().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getChests().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getChests().get(item).name);
			}
			if(itemType == 4)
			{
				item = getItem.nextInt(EquipmentCatalog.getLegs().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getLegs().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getLegs().get(item).name);
			}
			
			if(itemType == 5)
			{
				item = getItem.nextInt(EquipmentCatalog.getFeet().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getFeet().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getFeet().get(item).name);
			}
			
			if(itemType == 6)
			{
				item = getItem.nextInt(EquipmentCatalog.getHands().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getHands().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getHands().get(item).name);
			}
			
			if(itemType == 7)
			{
				item = getItem.nextInt(EquipmentCatalog.getBelts().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getBelts().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getBelts().get(item).name);
			}
			if(itemType == 8)
			{
				item = getItem.nextInt(EquipmentCatalog.getRings().size());
				TowerOfTime.GAME.PLAYER.backpack.addEquipment(EquipmentCatalog.getRings().get(item));
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(EquipmentCatalog.getRings().get(item).name);
			}
		TowerOfTime.GAME.THEGAMEFRAME.update();
	   }
}
