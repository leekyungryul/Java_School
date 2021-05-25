import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameManager {

	public void play() {
		Player[] player = { new PlayerType1("김하나"), new PlayerType2("박성철"), new PlayerType3("이경율"), new PlayerType4("이지효") };
		Enemy[] enemy = { new EnemyType1("김일성"), new EnemyType2("김정일"), new EnemyType3("김정은"), new EnemyType4("히틀러") };
		Random r = new Random();		
		for (int i = 0; i < 999999; i++) {
			System.out.println("--------------------------------------");
			System.out.printf("%15d  Round%n",(i + 1));
			System.out.println("--------------------------------------");
			System.out.println("<Player Attack>");
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				int attackTarget = r.nextInt(enemy.length);
				if (player[playerIndex].isLive() && enemy[attackTarget ].isLive()) {
					player[playerIndex].attack(enemy[attackTarget]);
				}
//				for(int a = 0; i< playerIndex; i++) {
//					if(player[playerIndex].isLive() && enemy[attackTarget].isDeath()) {
//						playerIndex--;
//					}
//				}
				
			}
			System.out.println();
			System.out.println("<Enemy Attack>");
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget = r.nextInt(player.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget]);
				}
//				for(int a = 0; i< enemyIndex; i++) {
//					if(enemy[enemyIndex].isLive() && player[attackTarget].isDeath()) {
//						enemyIndex--;
//					}
//				}
				
			}			
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
			if(isPlayerLive) {
				System.out.println("");
				System.out.println("[The situation of allies]");
			} 
			if(!isPlayerLive) {
				System.out.println("");
				System.out.println("[Allies were annihilated.]");
			}
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (player[playerIndex].hp > 60) {
					System.out.println(player[playerIndex].name + "님이 멀쩡합니다.(hp: " + player[playerIndex].hp + ")");
				} else if (player[playerIndex].hp > 30) {
					System.out.println(player[playerIndex].name + "님이 살만합니다.(hp: " + player[playerIndex].hp + ")");
				} else if (player[playerIndex].hp > 10) {
					System.out.println(player[playerIndex].name + "님이 헤롱헤롱합니다.(hp: " + player[playerIndex].hp + ")");
				} else if (player[playerIndex].hp > 1) {
					System.out.println(player[playerIndex].name + "님이 맛탱이 갔습니다.(hp: " + player[playerIndex].hp + ")");
				} else {
					System.out.println(player[playerIndex].name + "님 사망");
				}
			}
			if(isEnemyLive) {
				System.out.println("");
				System.out.println("[The situation of the enemy]");
			} 
			if(!isEnemyLive) {
				System.out.println("");
				System.out.println("[Enemy forces were destroyed]");
			}			
			for (int enemyIndex = 0; enemyIndex < player.length; enemyIndex++) {
				if (enemy[enemyIndex].hp > 60) {
					System.out.println(enemy[enemyIndex].name + "님이 멀쩡합니다.(hp: " + enemy[enemyIndex].hp + ")");
				} else if (enemy[enemyIndex].hp > 30) {
					System.out.println(enemy[enemyIndex].name + "님이 살만합니다.(hp: " + enemy[enemyIndex].hp + ")");
				} else if (enemy[enemyIndex].hp > 10) {
					System.out.println(enemy[enemyIndex].name + "님이 헤롱헤롱합니다.(hp: " + enemy[enemyIndex].hp + ")");
				} else if (enemy[enemyIndex].hp > 1) {
					System.out.println(enemy[enemyIndex].name + "님이 맛탱이 갔습니다.(hp: " + enemy[enemyIndex].hp + ")");
				} else {
					System.out.println(enemy[enemyIndex].name + "님 사망");
				}
			}
			String end = "Game Over";
			if (isPlayerLive && !isEnemyLive) {
				System.out.println("");
				System.out.println("Player 승리!!!");
				System.out.println("");
				System.out.println("--------------------------------------");
				System.out.printf("%23s%n", end);
				System.out.println("--------------------------------------");
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("");
				System.out.println("Player 패배...");
				System.out.println("");
				System.out.println("--------------------------------------");
				System.out.printf("%23s%n", end);
				System.out.println("--------------------------------------");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}