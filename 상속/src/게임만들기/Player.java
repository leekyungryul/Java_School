package 게임만들기;

public abstract class Player extends Base{

	public abstract void attack(Base enemy1);
		// 적을 공격하는 방법을 구현
		// power, defense 를 고려
}
