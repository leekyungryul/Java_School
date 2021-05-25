import java.util.Random;

public class EnemyType3 extends Enemy {
	public EnemyType3(String name) {
		Random r = new Random();
		this.hp = 100;
		this.power = r.nextInt(100) + 10;
		this.name = name;
		this.defense = 50;
	}

	@Override
	public void attack(Base player) {
		int damage = this.power - player.defense;
		int reflexAttack = (player.defense - this.power)/2;
		if (damage <= 0) {
			this.hp = this.hp - reflexAttack;
			System.out.println(this.name + "님이 " + player.name +  "님에 대한 공격이 실패하여 " 
							 + this.name + "님의 체력이 " + reflexAttack +"만큼 감소하였습니다.");
			if (this.hp < 0) {
				this.hp = 0;
			}
			System.out.println(this.name + "의 남은 체력 " + this.hp);
		} else if (damage < 40) {
			player.hp = player.hp - damage;
			if (player.hp < 0) {
				player.hp = 0;
			}
			System.out.println(this.name + "님이 " + player.name + "님에게 미약한(" + damage + ") 공격을 했습니다.");
			System.out.println(player.name + "의 남은 체력 " + player.hp);
		} else if (damage < 60) {
			player.hp = player.hp - damage;
			if (player.hp < 0) {
				player.hp = 0;
			}
			System.out.println(this.name + "님이 " + player.name + "님에게 상당한(" + damage + ") 공격을 했습니다.");
			System.out.println(player.name + "의 남은 체력 " + player.hp);
		} else {
			player.hp = player.hp - damage;
			if (player.hp < 0) {
				player.hp = 0;
			}
			System.out.println(this.name + "님이 " + player.name + "님에게 치명적(" + damage + ") 공격을 했습니다.");
			System.out.println(player.name + "의 남은 체력 " + player.hp);
		}
		if (!player.isLive()) {
			System.out.println(player.name + "님이 " + this.name + "님에게 파괴되었습니다...");		}
	}
}
