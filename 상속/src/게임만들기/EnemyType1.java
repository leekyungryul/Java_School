package 게임만들기;

public class EnemyType1 extends Enemy {
	public EnemyType1(String name) {
		this.hp = 100;
		this.power = 5;
		this.name = name;
		this.defense = 3;
		this.damage = 0;
	}

	@Override
	public void attack(Base player) {
		this.damage = this.power - player.defense;
		if (damage <= 0) {
			damage = 0;
			System.out.println(this.name + "님 " +  player.name + "님에게 피해를 주지 못했습니다.");			
		}
		else if(damage < 4) {
			player.hp = player.hp - damage;
			System.out.println(this.name + "님이 " + player.name + "님에게 미약한 공격을 했습니다.");
		}
		else if(damage < 6) {
			player.hp = player.hp - damage;
			System.out.println(this.name + "님이 " + player.name + "님에게 상당한 공격을 했습니다.");
		}
		else {
			player.hp = player.hp - damage;
			System.out.println(this.name + "님이 " + player.name + "님에게 치명적인 공격을 했습니다.");
		}
		
		if (!player.isLive()) {
			System.out.println(this.name + "님이 " + player.name + "님을 파괴했습니다!!!");
		}
		
//		if(player.hp < 10) {
//			System.out.println(player.name + "님이 맛탱이가 갔습니다.");
//			System.out.println("");
//		} else if(player.hp < 30) {
//			System.out.println(player.name + "님이 헤롱헤롱 합니다.");
//			System.out.println("");
//		} else if(player.hp < 60) {
//			System.out.println(player.name + "님이 살만합니다.");
//			System.out.println("");
//		} else if(player.hp < 100) {
//			System.out.println(player.name + "님이 멀쩡합니다.");
//			System.out.println("");
//		}
	}

}
