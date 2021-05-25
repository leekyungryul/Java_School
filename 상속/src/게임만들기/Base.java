package 게임만들기;

public class Base {
	int hp;
	int power;
	int defense;
	String name;
	int damage;
	
	public boolean isLive() {
		if(this.hp < 1) {
			return false;
		}
		return true;
	}
}
