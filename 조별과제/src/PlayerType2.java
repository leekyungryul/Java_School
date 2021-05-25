import java.util.Random;

public class PlayerType2 extends Player {
	public PlayerType2(String name) {
		Random r = new Random();
		this.hp = 100;
		this.power = r.nextInt(100) + 1;
		this.name = name;
		this.defense = 30;
	}

	@Override
	public void attack(Base enemy) {
		int damage = this.power - enemy.defense;
		int reflexAttack = (enemy.defense - this.power)/2;
		if (damage <= 0) {
			this.hp = this.hp - reflexAttack;
			System.out.println(this.name + "님이 " + enemy.name +  "님에 대한 공격이 실패하여 " 
							+ this.name + "님의 체력이 " + reflexAttack +"만큼 감소하였습니다.");
			if (this.hp < 0) {
				this.hp = 0;
			}
			System.out.println(this.name + "의 남은 체력 " + this.hp);
		} else if (damage < 40) {
			enemy.hp = enemy.hp - damage;
			if (enemy.hp < 0) {
				enemy.hp = 0;
			}
			System.out.println(this.name + "님이 " + enemy.name + "님에게 미약한(" + damage + ") 공격을 했습니다.");
			System.out.println(enemy.name + "의 남은 체력 " + enemy.hp);
		} else if (damage < 60) {
			enemy.hp = enemy.hp - damage;
			if (enemy.hp < 0) {
				enemy.hp = 0;
			}
			System.out.println(this.name + "님이 " + enemy.name + "님에게 상당한(" + damage + ") 공격을 했습니다.");
			System.out.println(enemy.name + "의 남은 체력 " + enemy.hp);
		} else {
			enemy.hp = enemy.hp - damage;
			if (enemy.hp < 0) {
				enemy.hp = 0;
			}
			System.out.println(this.name + "님이 " + enemy.name + "님에게 치명적(" + damage + ") 공격을 했습니다.\n");
			}
		if (!enemy.isLive()) {
			System.out.println(this.name + "님이 " + enemy.name + "님을 파괴했습니다!!!");
		}
	}
}