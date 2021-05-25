package Middle3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> person = new ArrayList<Person>();
		ArrayList<Party> party = new ArrayList<Party>();

		for (int j = 0; j < 9999; j++) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 유권자 정보입력");
			System.out.println("2. 유권자 정보 전체출력");
			System.out.println("3. 유권자의 수를 출력");
			System.out.println("4. 유권자의 평균나이를 출력");
			System.out.println("5. 연령대별 유권자의 수");
			System.out.println("6. 선호정당을 입력");
			System.out.println("7. 정당별 선호자 수");
			System.out.println("8. 연령대별 선호 정당의 수");
			System.out.println("9. 권역대별 선호 정당의 수");
			System.out.println("10. 전체 유권자 대비 선호정당을 입력한 사람의 수");

			Scanner s = new Scanner(System.in);
			String userinput = s.nextLine();
			if (userinput.equals("1")) {
				person.add(new Person());
			} else if (userinput.equals("2")) {
				for (int i = 0; i < person.size(); i++) {
					System.out.println(person.get(i).name + "의 나이는 " + person.get(i).age + "살 이고 주소는 "
							+ person.get(i).address + "입니다.");
				}
			} else if (userinput.equals("3")) {
				System.out.println(person.size());
			} else if (userinput.equals("4")) {
				int avgAge = 0;
				int totalAge = 0;
				for (int i = 0; i < person.size(); i++) {
					avgAge = avgAge + person.get(i).age;
				}
				totalAge = avgAge / person.size();
				System.out.println(totalAge);
			} else if (userinput.equals("5")) {
				for (int i = 0; i < person.size() - 1; i++) {
					for (int k = i; k < person.size(); k++) {
						if (person.get(i).age > person.get(k).age) {
							Collections.swap(person, i, k);
						}
					}
				}
				int child = 0;
				int old = 0;
				int one = 0;
				int ten = 0;
				int two = 0;
				int three = 0;
				int four = 0;
				for (int i = 0; i < person.size(); i++) {
					if (person.get(i).age > 50) {
						old++;
					} else if (person.get(i).age >= 40) {
						four++;
					} else if (person.get(i).age >= 30) {
						three++;
					} else if (person.get(i).age >= 20) {
						two++;
					} else if (person.get(i).age >= 10) {
						one++;
					} else {
						child++;
					}
				}
				System.out.println("50대 이상은 " + old + "명 " + "40대는 " + four + "명 " + "30대는 " + three + "명 " + "20대는 "
						+ two + "명 " + "10대는 " + one + "명 " + "어린이는 " + child + "명 ");

			} else if (userinput.equals("6")) {
				System.out.println("이름을 입력하세요");
				String userinput1 = s.nextLine();
				String name = "";
				int age = 0;
				String address = "";

				for (int i = 0; i < person.size(); i++) {
					if (userinput1.equals(person.get(i).name)) {
						name = person.get(i).name;
						age = person.get(i).age;
						address = person.get(i).address;
					}
				}
				if (name.equals("")) {
					System.out.println("해당하는 사람이 없습니다.");
				} else {
					System.out.println("정당이름을 입력하세요");
					System.out.println("1. 밝은당,2. 어두운당,3. 침침한당");
					System.out.println("4. 미선택");
					String userinput2 = s.nextLine();
					String partyA = "";
					String partyB = "";
					String partyC = "";
					String partyD = "";
					if (userinput2.equals("1")) {
						partyA = "밝은당";
						party.add(new Party(name, address, age, partyA));
					} else if (userinput2.equals("2")) {
						partyB = "어두운당";
						party.add(new Party(name, address, age, partyB));
					} else if (userinput2.equals("3")) {
						partyC = "침침한당";
						party.add(new Party(name, address, age, partyC));
					} else if (userinput2.equals("4")) {
						partyD = "";
						party.add(new Party(name, address, age, partyD));
					}
				}

			} else if (userinput.equals("7")) {
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for (int p = 0; p < party.size(); p++) {
					if (party.get(p).party.equals("밝은당")) {
						a++;
					} else if (party.get(p).party.equals("어두운당")) {
						b++;
					} else if (party.get(p).party.equals("침침한당")) {
						c++;
					} else if (party.get(p).party.equals("")) {
						d++;
					}
				}
				System.out.println("밝은당 = " + a + " 어두운당 = " + b + " 침침한당 = " + c + "미선택 = " + d);

			} else if (userinput.equals("8")) {
				int a_50 = 0;
				int a_40 = 0;
				int a_30 = 0;
				int a_20 = 0;
				int a_10 = 0;
				int a_0 = 0;
				int b_50 = 0;
				int b_40 = 0;
				int b_30 = 0;
				int b_20 = 0;
				int b_10 = 0;
				int b_0 = 0;
				int c_50 = 0;
				int c_40 = 0;
				int c_30 = 0;
				int c_20 = 0;
				int c_10 = 0;
				int c_0 = 0;
				for (int i = 0; i < party.size(); i++) {
					if (party.get(i).age > 50 && party.get(i).party.equals("밝은당")) {
						a_50++;
					} else if (party.get(i).age > 50 && party.get(i).party.equals("어두운당")) {
						b_50++;
					} else if (party.get(i).age > 50 && party.get(i).party.equals("침침한당")) {
						c_50++;
					} else if (party.get(i).age >= 40 && party.get(i).party.equals("밝은당")) {
						a_40++;
					} else if (party.get(i).age >= 40 && party.get(i).party.equals("어두운당")) {
						b_40++;
					} else if (party.get(i).age >= 40 && party.get(i).party.equals("침침한당")) {
						c_40++;
					} else if (party.get(i).age >= 30 && party.get(i).party.equals("밝은당")) {
						a_30++;
					} else if (party.get(i).age >= 30 && party.get(i).party.equals("어두운당")) {
						b_30++;
					} else if (party.get(i).age >= 30 && party.get(i).party.equals("침침한당")) {
						c_30++;
					} else if (party.get(i).age >= 20 && party.get(i).party.equals("밝은당")) {
						a_20++;
					} else if (party.get(i).age >= 20 && party.get(i).party.equals("어두운당")) {
						b_20++;
					} else if (party.get(i).age >= 20 && party.get(i).party.equals("침침한당")) {
						c_20++;
					} else if (party.get(i).age >= 10 && party.get(i).party.equals("밝은당")) {
						a_10++;
					} else if (party.get(i).age >= 10 && party.get(i).party.equals("어두운당")) {
						b_10++;
					} else if (party.get(i).age >= 10 && party.get(i).party.equals("침침한당")) {
						c_10++;
					} else if (party.get(i).age < 10 && party.get(i).party.equals("밝은당")) {
						a_0++;
					} else if (party.get(i).age < 10 && party.get(i).party.equals("어두운당")) {
						b_0++;
					} else if (party.get(i).age < 10 && party.get(i).party.equals("침침한당")) {
						c_0++;
					}
				}
				System.out.println("밝은당  50대 = " + a_50 + "명 " + "  40대 = " + a_40 + "명 " + "  30대 = " + a_30 + "명 "
						+ "  20대 = " + a_20 + "명 " + "  10대 = " + a_10 + "명 " + "  어린이 = " + a_0 + "명 ");

				System.out.println("어두운당  50대 = " + b_50 + "명 " + "  40대 = " + b_40 + "명 " + "  30대 = " + b_30 + "명 "
						+ "  20대 = " + b_20 + "명 " + " 10대 = " + b_10 + "명 " + " 어린이 = " + b_0 + "명 ");

				System.out.println("침침한당  50대 = " + c_50 + "명 " + "  40대 = " + c_40 + "명 " + "  30대 = " + c_30 + "명 "
						+ "  20대 = " + c_20 + "명 " + "  10대 = " + c_10 + "명 " + "  어린이 = " + c_0 + "명 ");
			} else if (userinput.equals("9")) {
//				a = 경기도, b = 서울, c = 강원도
//				1 = 밝은당 , 2= 어두운당, 3=침침한당
				int a_1 = 0;
				int a_2 = 0;
				int a_3 = 0;
				int b_1 = 0;
				int b_2 = 0;
				int b_3 = 0;
				int c_1 = 0;
				int c_2 = 0;
				int c_3 = 0;
				for (int i = 0; i < party.size(); i++) {
					if (party.get(i).address.equals("경기도") && party.get(i).party.equals("밝은당")) {
						a_1++;
					} else if (party.get(i).address.equals("경기도") && party.get(i).party.equals("어두운당")) {
						a_2++;
					} else if (party.get(i).address.equals("경기도") && party.get(i).party.equals("침침한당")) {
						a_3++;
					} else if (party.get(i).address.equals("서울") && party.get(i).party.equals("밝은당")) {
						b_1++;
					} else if (party.get(i).address.equals("서울") && party.get(i).party.equals("어두운")) {
						b_2++;
					} else if (party.get(i).address.equals("서울") && party.get(i).party.equals("침침한")) {
						b_3++;
					} else if (party.get(i).address.equals("강원도") && party.get(i).party.equals("밝은당")) {
						c_1++;
					} else if (party.get(i).address.equals("강원도") && party.get(i).party.equals("어두운")) {
						c_2++;
					} else if (party.get(i).address.equals("강원도") && party.get(i).party.equals("침침한")) {
						c_3++;
					}
				}
				System.out.println(
						"경기도  밝은당 = " + a_1 + "명 " + "경기도  어두운당 = " + a_2 + "명 " + "경기도  침침한당 = " + a_3 + "명 ");
				System.out.println("");
				System.out.println("서울  밝은당 = " + b_1 + "명 " + "서울  어두운당 = " + b_2 + "명 " + "서울  침침한당 = " + b_3 + "명 ");
				System.out.println("");
				System.out.println(
						"강원도  밝은당 = " + c_1 + "명 " + "강원도  어두운당 = " + c_2 + "명 " + "강원도  침침한당 = " + c_3 + "명 ");
				System.out.println("");
			} else if (userinput.equals("10")) {
				double a = party.size();
				double b = person.size();
				double rate = (a / b) * 100;
				System.out.println(rate + "%");
			}
//			}
		}

	}

}
