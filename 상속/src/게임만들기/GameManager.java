package 게임만들기;

import java.util.Random;

public class GameManager {
	public void play() {
		Player[] player = {new PlayerType1("아군1"), new PlayerType1("아군2"), new PlayerType1("아군3"), new PlayerType1("아군4"), new PlayerType1("아군5")};
		Enemy[] enemy = {new EnemyType1("적군1"), new EnemyType1("적군2"), new EnemyType1("적군3"), new EnemyType1("적군4"), new EnemyType1("적군5")};
		
		Random r = new Random();
		for (int i = 0; i < 999999; i++) {
			System.out.println("\n\n" + (i + 1) + "턴\n");
			// 플레이어 턴
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				int attackTarget = r.nextInt(enemy.length);
				if (player[playerIndex].isLive() && enemy[attackTarget].isLive()) {
					player[playerIndex].attack(enemy[attackTarget]);
				}
			}
			// 적 턴
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget = r.nextInt(player.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget]);
				}
			}
			//체력 잔량확인
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (player[playerIndex].hp <= 0) {
					System.out.println(player[playerIndex].name + "님이 사망했습니다.");
				} else if(player[playerIndex].hp < 10) {
					System.out.println(player[playerIndex].name + "님이 맛탱이가 갔습니다.");
				} else if(player[playerIndex].hp < 30) {
					System.out.println(player[playerIndex].name + "님이 헤롱헤롱 합니다.");
				} else if(player[playerIndex].hp < 60) {
					System.out.println(player[playerIndex].name + "님이 살만합니다.");
				} else if(player[playerIndex].hp < 100) {
					System.out.println(player[playerIndex].name + "님이 멀쩡 합니다.");
				}
			}
			
			for (int enemyIndex = 0; enemyIndex < player.length; enemyIndex++) {
				if (enemy[enemyIndex].hp <= 0) {
					System.out.println(enemy[enemyIndex].name + "님이 사망했습니다.");
				} else if(enemy[enemyIndex].hp < 10) {
					System.out.println(enemy[enemyIndex].name + "님이 맛탱이가 갔습니다.");
				} else if(enemy[enemyIndex].hp < 30) {
					System.out.println(enemy[enemyIndex].name + "님이 헤롱헤롱 합니다.");
				} else if(enemy[enemyIndex].hp < 60) {
					System.out.println(enemy[enemyIndex].name + "님이 살만합니다.");
				} else if(enemy[enemyIndex].hp < 100) {
					System.out.println(enemy[enemyIndex].name + "님이 멀쩡 합니다.");
				}
			}
//			if(E.hp < 30) {
//				System.out.println(enemy.name + "님이 맛탱이가 갔습니다.");
//			} else if(enemy.hp < 50) {
//				System.out.println(enemy.name + "님이 헤롱헤롱 합니다.");
//			} else if(enemy.hp < 70) {
//				System.out.println(enemy.name + "님이 살만합니다.");
//			} else if(enemy.hp < 100) {
//				System.out.println(enemy.name + "님이 멀쩡합니다.");
//			}
			// 게임 종료 여부 확인
			boolean isPlayerLive = false;
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (player[playerIndex].isLive()) {
					isPlayerLive = true;
				}
			}
			boolean isEnemyLive = false;
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				if (enemy[enemyIndex].isLive()) {
					isEnemyLive = true;
				}
			}
			if (isPlayerLive && !isEnemyLive) {
				System.out.println("플레이어 승리");
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("적 승리");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
