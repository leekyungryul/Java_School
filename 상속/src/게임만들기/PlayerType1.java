package 게임만들기;

public class PlayerType1 extends Player{
	public PlayerType1(String name) {
		this.hp = 20;
		this.power = 10;
		this.name = name;
		this.defense = 2;
		this.damage = 0;
	}
	
	@Override
	public void attack(Base enemy) {
		this.damage = this.power - enemy.defense;
		if (damage <= 0) {
			damage = 0;
			System.out.println(this.name + "님 " +  enemy.name + "님에게 피해를 주지 못했습니다.");
			System.out.println("");
		}
		else if(damage < 4) {
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "님이 " + enemy.name + "님에게 미약한 공격을 했습니다.");
			System.out.println("");
		}
		else if(damage < 6) {
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "님이 " + enemy.name + "님에게 상당한 공격을 했습니다.");
			System.out.println("");
		}
		else {
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "님이 " + enemy.name + "님에게 치명적인 공격을 했습니다.");
			System.out.println("");
		}
		if (!enemy.isLive()) {
			System.out.println(this.name + "님이 " + enemy.name + "님을 파괴했습니다!!!");
			System.out.println("");
		}
		
//		if(enemy.hp < 10) {
//			System.out.println(enemy.name + "님이 맛탱이가 갔습니다.");
//			System.out.println("");
//		} else if(enemy.hp < 30) {
//			System.out.println(enemy.name + "님이 헤롱헤롱 합니다.");
//			System.out.println("");
//		} else if(enemy.hp < 60) {
//			System.out.println(enemy.name + "님이 살만합니다.");
//			System.out.println("");
//		} else if(enemy.hp < 100) {
//			System.out.println(enemy.name + "님이 멀쩡합니다.");
//			System.out.println("");
//		}
	}

}


