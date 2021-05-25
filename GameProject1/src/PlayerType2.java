import java.util.Random;

public class PlayerType2 extends Player {
//Base 클래스에서 만들어진 클래스를 Player를 넘겨 여기서 오버라이드 처리
	PlayerType2(String name){
		this.name = name;
		this.hp = 10;
		this.defense = 1;
		this.power = 1;
		this.type = "힐러";
	}
	@Override
	public void action(Base[] player, Base[] enemy) {
		Random r = new Random();
		System.out.println(this.name + "은(는) 전체회복 마법을 썼다.");
		for(int i = 0; i< player.length; i++) {
			if (player[i].isLive()) {
				player[i].hp = player[i].hp + r.nextInt(10);
			}
		}
	}
	
}
