package blueMarble;

import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.Frame;

public class Control {

	Scanner scan = new Scanner(System.in);

	Player player = new Player();

	Events events = null;
	City city = new City();
	Attraction attraction = new Attraction();
	GoldenCard goldenCard = new GoldenCard();
	InhabitedIsland inhabitedIsland = new InhabitedIsland();
	Welfare welfare = new Welfare();
	DonateWelfare donateWelfare = new DonateWelfare();
	ReceiveWelfare receiveWelfare = new ReceiveWelfare();
	Space space = new Space();

	int command;

	String playerName;
	String nameOfBlock;

	public void eventsTrigger(int playerIdx) {

		String nameOfBlock; // 칸의 이름을 가져올 변수

		int mapIdxOfPlayer; // 플레이어의 위치 mapIdx에 대응
		int eventType; // 칸의 이벤트타입을 가져올 변수
		int mapIdx;
		int ownerIdx; // 값은 cities[0]에 저장, 값이 0 이라면 소유자 없음.
						// playerIdx값으로 저장.
		int theNumberOfArrival; // (일반City의 경우, 땅의 주인이 있는 경우)
								// 해당 땅에 대한 주인의 도착 횟수

		mapIdxOfPlayer = Player.playerList.get(playerIdx).getmapIdxOfPlayer();
		playerName = Player.playerList.get(playerIdx).getName();
		nameOfBlock = BlueMarbleMap.map.get(mapIdxOfPlayer).getName();
		eventType = BlueMarbleMap.map.get(mapIdxOfPlayer).getType();
		mapIdx = BlueMarbleMap.map.get(mapIdxOfPlayer).getMapIdx();

		ownerIdx = BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer]; // mapIdxOfplayer는 현재 플레이어의 위치 값.

		theNumberOfArrival = BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[mapIdxOfPlayer];

		System.out.println("[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]에 도착했습니다.");
		
		if (eventType == 1) { // 일반 City
			// * eventType이 1일 경우(일반 City일 경우)
			// 1. 가장 먼저, 누군가가 소유하고 있는가를 확인해야 함
			// 2. 소유자가 없는 땅이라면 땅을 살지 여부를 물어야 함
			// 3. 소유자가 있는 땅에 소유자가 도착했다면, 소유자의 도착 횟수에 따라 땅, 집, 콘도, 호텔 순으로 구입

			// 4. 소유자가 있는 땅에 해당 땅의 소유자가 아닌 플레이어가 도착했다면, 소유자에게 통행료 지급
			// 5. 통행료 지급 후 땅을 살지 여부 확인

			System.out.println("[City][mapIdx]" + mapIdx);
			System.out.println("[Map][theNumberOfArrival]" + theNumberOfArrival);
			if (ownerIdx == 0) {
				if (theNumberOfArrival == 0) {
					
					System.out
							.println("[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]토지를 매입하시겠습니까?");
					System.out.println("[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");
//					command = scan.nextInt();

					String[] answers = { "네! 구입하겠습니다.", "아니오! 구입하지 않겠습니다." };
					command = JOptionPane.showOptionDialog(Frame.gameFrame,
							playerName + "님 " + nameOfBlock + "에 아직 주인이 없습니다. \n토지를 매입하시겠습니까?", nameOfBlock + " 토지매입",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

					if (command == 0) {
						player.buyLand(mapIdxOfPlayer, playerIdx, eventType);
						
					} else {

					}
				}
			} else if (ownerIdx == playerIdx) {

				if (theNumberOfArrival >= 3) { // 도착횟수 3회 이상일 때
					BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[mapIdxOfPlayer]++; // 땅을 소유하기 시작했을 때부터 도착횟수를
																							// 누적시킨다.
					// 땅을 매입, 매각하면 도착횟수는 초기화 된다.
					if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 1
							&& BlueMarbleMap.citiesAndAttractionsCheckConference[mapIdxOfPlayer] == 1) { // 땅 소유, 집 소유,
																											// 빌딩 소유

						System.out.println(
								"[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]호텔을 지으시겠습니까?");
						System.out
								.println("[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

						String[] answers = { "네! 호텔을 건설하겠습니다.", "아니오! 호텔을 건설하지 않겠습니다." };
						command = JOptionPane.showOptionDialog(Frame.gameFrame,
								playerName + "님 " + nameOfBlock + "에 호텔을 건설하시겠습니까?", nameOfBlock + " 호텔 건설",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

						if (command == 0) {
							player.buildHotel(mapIdxOfPlayer, playerIdx);
							
						} else {

						}
					} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 1) { // 땅 소유, 집 소유
						System.out.println(
								"[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]빌딩을 지으시겠습니까?");
						System.out
								.println("[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

						String[] answers = { "네! 콘도를 건설하겠습니다.", "아니오! 콘도를 건설하지 않겠습니다." };
						command = JOptionPane.showOptionDialog(Frame.gameFrame,
								playerName + "님 " + nameOfBlock + "에 콘도를 건설하시겠습니까?", nameOfBlock + " 콘도 건설",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

						if (command == 0) {
							player.buildConference(mapIdxOfPlayer, playerIdx);
							
						} else {

						}
					} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 0) { // 땅만 소유
						System.out.println(
								"[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]집을 지으시겠습니까?");
						System.out
								.println("[Control][eventsTrigger][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

						String[] answers = { "네! 집을 건설하겠습니다.", "아니오! 집을 건설하지 않겠습니다." };
						command = JOptionPane.showOptionDialog(Frame.gameFrame,
								playerName + "님 " + nameOfBlock + "에 집을 건설하시겠습니까?", nameOfBlock + " 집 건설",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

						if (command == 0) {
							player.buildHouse(mapIdxOfPlayer, playerIdx);
							
						} else {

						}
					}
				} else if (theNumberOfArrival == 2) { // 도착횟수가 2회 일 때(세 번 째 도착일 때)
					
					if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 1) { // 땅 소유, 집 소유
						System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]빌딩을 지으시겠습니까?");
						System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

						String[] answers = { "네! 콘도를 건설하겠습니다.", "아니오! 콘도를 건설하지 않겠습니다." };
						command = JOptionPane.showOptionDialog(Frame.gameFrame,
								playerName + "님 " + nameOfBlock + "에 콘도를 건설하시겠습니까?", nameOfBlock + " 콘도 건설",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

						if (command == 0) {
							player.buildConference(mapIdxOfPlayer, playerIdx);
							
						} else {

						}
					} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 0) { // 땅만 소유
						System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]집을 지으시겠습니까?");
						System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

						String[] answers = { "네! 집을 건설하겠습니다.", "아니오! 집을 건설하지 않겠습니다." };
						command = JOptionPane.showOptionDialog(Frame.gameFrame,
								playerName + "님 " + nameOfBlock + "에 집을 건설하시겠습니까?", nameOfBlock + " 집 건설",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

						if (command == 0) {
							player.buildHouse(mapIdxOfPlayer, playerIdx);
							
						} else {

						}
					}
				} else if (theNumberOfArrival == 1) { // 도착횟수가 1회 일 때(땅만 샀을 때, 두 번 째 도착일 때)
					
					if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 0) {
						System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]집을 지으시겠습니까?");
						System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

						String[] answers = { "네! 집을 건설하겠습니다.", "아니오! 집을 건설하지 않겠습니다." };
						command = JOptionPane.showOptionDialog(Frame.gameFrame,
								playerName + "님 " + nameOfBlock + "에 집을 건설하시겠습니까?", nameOfBlock + " 집 건설",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

						if (command == 0) {
							player.buildHouse(mapIdxOfPlayer, playerIdx);
							
						} else {

						}
					}
				}
			} else if (ownerIdx != playerIdx) {
				System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]"
						+ Player.playerList.get(ownerIdx).getName() + "님의 땅입니다.");
				player.payAToll(mapIdxOfPlayer, playerIdx); // 통행료 지불 메소드
				player.buyOthers(mapIdxOfPlayer, playerIdx); // 다른 플레이어 소유의 땅을 사는 메소드
			}

		} else if (eventType == 2) {

			if (mapIdx == 5 || mapIdx == 25 || mapIdx == 39) { // 제주,
																// 부산,
																// 서울
				if (ownerIdx == 0) {
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]매입하시겠습니까?");
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

					String[] answers = { "네! 매입하겠습니다.", "아니오! 매입하지 않겠습니다." };
					command = JOptionPane.showOptionDialog(Frame.gameFrame,
							playerName + "님 " + nameOfBlock + "에 아직 주인이 없습니다. \n관광지를 매입하시겠습니까?", nameOfBlock + " 매입",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

					if (command == 0) {
						player.buyLand(mapIdxOfPlayer, playerIdx, eventType);
						
					} else {

					}

				} else if (ownerIdx == playerIdx) {
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]당신 소유  입니다.");

				} else {
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]소유입니다.");
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]통행료를 지불해야 합니다.");
					player.payAToll(mapIdxOfPlayer, playerIdx); // 통행료 지불 메소드
					player.buyOthers(mapIdxOfPlayer, playerIdx); // 다른 플레이어 소유의 땅을 사는 메소드
				}
			} else if (mapIdx == 15) { // 콩코드
				if (ownerIdx == 0) {
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]매입하시겠습니까?");
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

					String[] answers = { "네! 매입하겠습니다.", "아니오! 매입하지 않겠습니다." };
					command = JOptionPane.showOptionDialog(Frame.gameFrame,
							playerName + "님 " + nameOfBlock + "에 아직 주인이 없습니다. \n" + nameOfBlock + "를 매입하시겠습니까?",
							nameOfBlock + " 매입", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers,
							answers[0]);

					if (command == 0) {
						player.buyLand(mapIdxOfPlayer, playerIdx, eventType);
						
					} else {

					}

				} else if (ownerIdx == playerIdx) {
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]당신 소유입니다.");

				} else {

					player.payAToll(mapIdxOfPlayer, playerIdx);
					player.buyOthers(mapIdxOfPlayer, playerIdx);
				}

			} else if (mapIdx == 32) { // 콜롬비아호
				if (ownerIdx == 0) {
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]매입하시겠습니까?");
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

					String[] answers = { "네! 매입하겠습니다.", "아니오! 매입하지 않겠습니다." };
					command = JOptionPane.showOptionDialog(Frame.gameFrame,
							playerName + "님 " + nameOfBlock + "에 아직 주인이 없습니다. \n" + nameOfBlock + "를 매입하시겠습니까?",
							nameOfBlock + " 매입", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers,
							answers[0]);

					if (command == 0) {
						player.buyLand(mapIdxOfPlayer, playerIdx, eventType);

					} else {

					}

				} else if (ownerIdx == playerIdx) {
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]당신 소유입니다.");

					String[] answers = { "네! 콜롬비아호에 탑승 하겠습니다.", "아니오! 콜롬비아호에 탑승하지 않겠습니다.." };
					command = JOptionPane.showOptionDialog(Frame.gameFrame,
							playerName + "님 콜롬비아호에 탑승 하시겠습니까?\n 콜롬비아호를 타면 어디로든 갈 수 있습니다.", "콜롬비아호",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

					if (command == 0) {
						Columbia columbia = new Columbia();
						columbia.travelForTheSpace(playerIdx);
					} else {

					}

				} else {

					player.payAToll(mapIdxOfPlayer, playerIdx);
					player.buyOthers(mapIdxOfPlayer, playerIdx);

					System.out
							.println("[Control][" + playerName + "][" + nameOfBlock + "]우주여행을 하시겠습니까?(어디로든 갈 수 있습니다)");
					System.out.println("[Control][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

					String[] answers = { "네! 콜롬비아호에 탑승 하겠습니다.", "아니오! 콜롬비아호에 탑승하지 않겠습니다.." };
					command = JOptionPane.showOptionDialog(Frame.gameFrame,
							playerName + "님 콜롬비아호에 탑승 하시겠습니까?\n 콜롬비아호를 타면 어디로든 갈 수 있습니다.", "콜롬비아호",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

					if (command == 0) {
						Columbia columbia = new Columbia();
						columbia.travelForTheSpace(playerIdx);
					} else {

					}
				}
			}

		} else if (eventType == 3) { // 황금카드
			goldenCard.goldenCard(mapIdxOfPlayer, playerIdx);

		} else if (eventType == 4) { // 우주여행

			space.space(playerIdx);

		} else if (eventType == 5) { // 무인도

			inhabitedIsland.trappedOnTheInhabitedIsland(playerIdx);

		} else if (eventType == 6) { // 사회복지기금

			if (mapIdx == 30) {

				donateWelfare.donateWelfare(playerIdx);

			} else if (mapIdx == 38) {

				receiveWelfare.receiveWelfare(playerIdx);
			}
		}

	}
}
