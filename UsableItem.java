
public class UsableItem extends Item{
	protected char effect;
	
	UsableItem() {
		
	}
	UsableItem(String name, String id, char effect, String desc) {
		super.name = name;
		super.id = id;
		this.effect = effect;
		super.description = desc;
	}
	
	public void useTheItem(Player player) {
		switch(effect) {
			case 'a': {
				player.setHp(player.getHp()+10);
				if(player.getHp() > player.getMaxHp()) {
					player.setHp(player.getMaxHp());
				}
				break;
			}
			case 'b': {
				player.setMp(player.getMp()+5);
				if(player.getMp() > player.getMaxMp()) {
					player.setMp(player.getMaxMp());
				}
				break;
			}
		}
	
	}
}
