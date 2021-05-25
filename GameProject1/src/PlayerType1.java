import java.util.Random;

public class PlayerType1 extends Player {
//Base 클래스에서 만들어진 클래스를 Player를 넘겨 여기서 오버라이드 처리
	PlayerType1(String name){
		this.name = name;
		this.hp = 100;
		this.defense = 1;
		this.power = 10;
		this.type = "전사";
	}
	@Override
	public void action(Base[] player, Base[] enemy) {
		Random r = new Random();
		Base target = null;
		for(int i = 0; i < 99999; i++) {
			int randNumber = r.nextInt(enemy.length);
			if(enemy[randNumber].isLive()) {
				target = enemy[randNumber];
				break;
			}
		}
		if(target != null) {
//			객체변수에 값이 없는것
			int damage = this.power - this.defense;
			System.out.println(this.name + "이(가)" + target.name + "을(를) 공격해서 " + damage + "의 피해를 입혔다");
			target.hp = target.hp - damage;
			if(target.hp < 1) {
				System.out.println(target.name + "was destroyed");
			}
		}
	}
	
}
