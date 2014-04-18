public class Accessory extends Equipment{
	protected String effect;
	protected int effectStrength;
	Accessory() {
		
	}
	
	Accessory(String name, String desc, String slot, String effect, int eS) {
		super.name = name;
		this.effect = effect;
		this.effectStrength = eS;
		super.description = desc;
		super.slot = slot;

	}
	
	public String getAccessoryEffect(){return this.effect;}
	public int getAccessoryEffectStrength(){return this.effectStrength;}
	
	public void EquipEnchanted(Player player) 
	{
		if(effect.equals("Fire")){player.setCurrentStrength(player.getCurrentStrength() + 5 * effectStrength);}
		
		if(effect.equals("Holy"))
		{
			player.setCurrentStamina(player.getCurrentStamina() + 5 * effectStrength);
		}
		
		if(effect.equals("Ice"))
		{
			player.setCurrentAgility(player.getCurrentAgility() + 2 * effectStrength);
			player.setCurrentDefense(player.getCurrentDefense() + 3 * effectStrength);
			
	    }
		
		if(effect.equals("Earth"))
		{
			player.setCurrentDefense(player.getCurrentDefense() + 3 * effectStrength);
			player.setCurrentStrength(player.getCurrentStrength() + 2 * effectStrength);
		}
		
		if(effect.equals("Air"))
		{
			player.setCurrentDexterity(player.getCurrentDexterity() + 5 * effectStrength);	
		}
		
		if(effect.equals("Shadow"))
		{
			player.setCurrentIntelligence(player.getCurrentIntelligence() + 5 * effectStrength);
		}
		
		if(effect.equals("Water"))
		{
			player.setCurrentMind(player.getCurrentMind() + 5 * effectStrength);	
		}
		
	    if(effect.equals("Energy"))
	    {
	    	player.setCurrentDexterity(player.getCurrentDexterity() + 3 * effectStrength);
	    	player.setCurrentStrength(player.getCurrentStrength() + 2 * effectStrength);
	    }
	    
	    TowerOfTime.GAME.THEGAMEFRAME.update();

	}
	
	public void UnequipEnchanted(Player player) 
	{
		if(effect.equals("Fire")){player.setCurrentStrength(player.getCurrentStrength() - 5 * effectStrength);}
		
		if(effect.equals("Holy"))
		{
			player.setCurrentStamina(player.getCurrentStamina() - 5 * effectStrength);
		}
		
		
		if(effect.equals("Ice"))
		{
			player.setCurrentAgility(player.getCurrentAgility() - 2 * effectStrength);
			player.setCurrentDefense(player.getCurrentDefense() - 3 * effectStrength);
			
	    }
		
		
		if(effect.equals("Earth"))
		{
			player.setCurrentDefense(player.getCurrentDefense() - 3 * effectStrength);
			player.setCurrentStrength(player.getCurrentStrength() - 2 * effectStrength);
		}
		
		if(effect.equals("Air"))
		{
			player.setCurrentDexterity(player.getCurrentDexterity() - 5 * effectStrength);	
		}
		
		if(effect.equals("Shadow"))
		{
			player.setCurrentIntelligence(player.getCurrentIntelligence() - 5 * effectStrength);
		}
		
		if(effect.equals("Water"))
		{
			player.setCurrentMind(player.getCurrentMind() - 5 * effectStrength);	
		}
		
	    if(effect.equals("Energy"))
	    {
	    	player.setCurrentDexterity(player.getCurrentDexterity() - 3 * effectStrength);
	    	player.setCurrentStrength(player.getCurrentStrength() - 2 * effectStrength);
	    }
	    
	    TowerOfTime.GAME.THEGAMEFRAME.update();
	}
}

