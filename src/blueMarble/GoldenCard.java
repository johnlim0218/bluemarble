package blueMarble;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.Frame;
import GUI.GoldenKeyCard;
import GUI.PlayersSpirit;

class GoldenCard2 extends GoldenCard {

	private String region = "south";
	private int mapIdx = 2;

	private int minX = 700;
	private int maxX = 770;
	private int minY = 840;
	private int maxY = 980;

	public String getRegion() {
		return region;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

}

class GoldenCard7 extends GoldenCard {

	private String region = "south";
	private int mapIdx = 7;

	private int minX = 300;
	private int maxX = 380;
	private int minY = 840;
	private int maxY = 980;

	public String getRegion() {
		return region;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

}

class GoldenCard12 extends GoldenCard {

	private String region = "west";
	private int mapIdx = 12;

	private int minX = 5;
	private int maxX = 150;
	private int minY = 690;
	private int maxY = 760;

	public String getRegion() {
		return region;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

}

class GoldenCard17 extends GoldenCard {

	private String region = "west";
	private int mapIdx = 17;

	private int minX = 5;
	private int maxX = 150;
	private int minY = 300;
	private int maxY = 370;

	public String getRegion() {
		return region;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

}

class GoldenCard22 extends GoldenCard {

	private String region = "north";
	private int mapIdx = 22;

	private int minX = 220;
	private int maxX = 290;
	private int minY = 5;
	private int maxY = 140;

	public String getRegion() {
		return region;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

}

class GoldenCard28 extends GoldenCard {

	private String region = "north";
	private int mapIdx = 28;

	private int minX = 710;
	private int maxX = 775;
	private int minY = 5;
	private int maxY = 140;

	public String getRegion() {
		return region;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

}

class GoldenCard35 extends GoldenCard {

	private String region = "east";
	private int mapIdx = 35;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 450;
	private int maxY = 530;

	public String getRegion() {
		return region;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

}

public class GoldenCard extends Events { // 황금열쇠
	// #2 ,#7 ,#12 ,#17 ,#22 ,#28 ,#35

	Scanner scan = new Scanner(System.in);
	private int type = 3; // 3-황금카드
	private String name = "황금카드";
	private String region;
	private int mapIdx;

	private int minX;
	private int maxX;
	private int minY;
	private int maxY;
	private int gap;

	Player player = new Player();

	public int getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public int getMinX() {
		return minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

	public void goldenCard(int mapIdxOfPlayer, int playerIdx) {

		Random randomForGoldenCard = new Random();
		int[] a = { 7 };
		int randomNumForGoldenCard = randomForGoldenCard.nextInt(28); // 28
//		int randomNumForGoldenCard = a[randomForGoldenCard.nextInt(1)];

		GoldenKeyCard.randomNumForGoldenCard = randomNumForGoldenCard;

		Runnable runForGoldenKeyCard = new Runnable() {
			@Override
			public void run() {
				
				try {
					
					Thread.sleep(500);
					
					GoldenKeyCard.goldenKeyCardOpening = false;
					
					Thread.sleep(3000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread thForGoldenKeyCard = new Thread(runForGoldenKeyCard);
		
		thForGoldenKeyCard.start();
		try {
			thForGoldenKeyCard.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (randomNumForGoldenCard == 0) {
			travelByTheConcord(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 1) {
			highWay(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 2) {
			goToSeoul(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 3) {
			goToBusan(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 4) {
			goToJeju(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 5) {
			goBackToBeforeTwoBlocks(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 6) {
			goBackToBeforeThreeBlocks(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 7) {
			goToInhabited(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 8) {
			takeWelfareFund(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 9) {
			worldTour(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 10) {
			spaceTour(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 11) {
			nobelPrize(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 12) {
			theOldagePension(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 13) {
			winTheLottery(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 14) {
			birthDay(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 15) {
			winTheCarRace(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 16) {
			scholorship(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 17) {
			crimePrevention(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 18) {
			repairing(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 19) {
			incomeTax(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 20) {
			speedingTicket(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 21) {
			expenseForMedical(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 22) {
			studyingAbroad(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 23) {
			radioEscapingFromTheInhabitedIsland(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 24 || randomNumForGoldenCard == 25) {
			makePlayerSellTheHighestPriceOfLandHalfPrice(mapIdxOfPlayer, playerIdx);
		} else if (randomNumForGoldenCard == 26 || randomNumForGoldenCard == 27) {
			specialPass(mapIdxOfPlayer, playerIdx);
		}

	}

	public void travelByTheConcord(int mapIdxOfPlayer, int playerIdx) { // 콩코드 여객기를 타고 타이베이로 간다.
		// 먼저 콩코드 여객기까지 간 다음 콩코드 여객기를 구입한 사람에게 객실료를 지급한 뒤 월급을 받고 타이베이로 날아간다.
		// 콩코드 여객기가 자신의 위치보다 뒤에 있는 경우 콩코드 여객기로 갈 때 월급을 받으므로 결과적으로 두 바퀴를 돈 것이 되어 월급을 두 번
		// 받을 수 있게 된다.
		// 콩코드랑 타이베이가 당 플레이어의 소유라면 최대 40만원을 공짜로 얻는셈.
		// #0

		System.out.println("[GoldenCard][travelByTheConcord]콩코드 여객기를 타고 타이베이로 갑니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(1);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
		Bank.monthlyPayAfterCircumnavigation(playerIdx);
	}

	public void highWay(int mapIdxOfPlayer, int playerIdx) { // 출발지로 이동한다.
		// 월급을 받는다.
		// #1
		System.out.println("[GoldenCard][highWay]출발지로 이동합니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(0);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
		Bank.monthlyPayAfterCircumnavigation(playerIdx);
	}

	public void goToSeoul(int mapIdxOfPlayer, int playerIdx) { // 서울로 이동한다.
		// 서울을 소유한 플레이어에게 통행료를 지불한다.
		// #2
		System.out.println("[GoldenCard][goToSeoul]서울로 이동합니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(39);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void goToBusan(int mapIdxOfPlayer, int playerIdx) { // 부산으로 이동한다.
		// 부산을 소유한 플레이어에게 통행료를 지불한다.
		// #3
		System.out.println("[GoldenCard][goToBusan]부산으로 이동합니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(25);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void goToJeju(int mapIdxOfPlayer, int playerIdx) { // 제주도로 이동한다.
		// 제주도를 소유한 플레이어에게 통행료를 지불한다.
		// #4
		System.out.println("[GoldenCard][goToJeju]제주도로 이동합니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(5);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void goBackToBeforeTwoBlocks(int mapIdxOfPlayer, int playerIdx) { // 두 칸 뒤로 이동.
		// #5
		int goBackMove = 2;
		System.out.println("[GoldenCard][goBackToBeforeTwoBlocks]두 칸 뒤로 이동합니다.");

		new BlueMarbleMap().checkForGoBackMove(playerIdx, goBackMove);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void goBackToBeforeThreeBlocks(int mapIdxOfPlayer, int playerIdx) { // 세 칸 뒤로 이동.
		// #6
		int goBackMove = 3;
		System.out.println("[GoldenCard][goBackToBeforeThreeBlocks]세 칸 뒤로 이동합니다.");

		new BlueMarbleMap().checkForGoBackMove(playerIdx, goBackMove);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void goToInhabited(int mapIdxOfPlayer, int playerIdx) { // 무인도로 간다.
		// #7
		System.out.println("[GoldenCard][goToInhabited]무인도로 이동합니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(20);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void takeWelfareFund(int mapIdxOfPlayer, int playerIdx) { // 사회복지기금 수령처로 이동해 사회복지기금을 받는다.
		// #8
		System.out.println("[GoldenCard][takeWelfareFund]사회복지기금 수령처로 이동해 사회복지기금을 수령합니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(38);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void worldTour(int mapIdxOfPlayer, int playerIdx) { // 맵을 한 바퀴 돌아 제자리로 돌아온다.
		// 월급을 받고, 사회복지기금이 있다면 사회복지기금도 받는다.
		// #9
		System.out.println("[GoldenCard][worldTour]맵을 한 바퀴 돌아 제자리로 돌아옵니다.");
		System.out.println("[GoldenCard][worldTour]월급을 받고, 사회복지기금이 있다면 사회복지기금도 받습니다.");
		new BlueMarbleMap().checkForCircumnavigation(playerIdx, 40);
		new PlayersSpirit().jump(playerIdx);
		new ReceiveWelfare().receiveWelfare(playerIdx);
	}

	public void spaceTour(int mapIdxOfPlayer, int playerIdx) { // 우주여행 승강장으로 바로 이동한다.
		// 이용료는 면제된다.
		// #10

		System.out.println("[GoldenCard][spaceTour]우주여행 승강장으로 바로 이동합니다.");
		System.out.println("[GoldenCard][spaceTour]우주여행 승강장 이용료는 면제됩니다.");
		Player.playerList.get(playerIdx).setmapIdxOfPlayer(10);
		new PlayersSpirit().jump(playerIdx);
		new Control().eventsTrigger(playerIdx);
	}

	public void nobelPrize(int mapIdxOfPlayer, int playerIdx) { // 노벨상 +30만원
		// #11
		System.out.println("[GoldenCard][nobelPrize]노벨상을 수상했습니다.");
		System.out.println("[GoldenCard][nobelPrize]상금으로 30만 원을 받습니다.");

		int prize = 300000;
		player.takeMoney(0, playerIdx, prize);
	}

	public void theOldagePension(int mapIdxOfPlayer, int playerIdx) { // 노후연금 +5만원
		// #12
		System.out.println("[GoldenCard][theOldagePension]노후연금을 받습니다.");
		System.out.println("[GoldenCard][theOldagePension]연금으로 5만 원을 수령합니다.");

		int pension = 50000;
		player.takeMoney(0, playerIdx, pension);
	}

	public void winTheLottery(int mapIdxOfPlayer, int playerIdx) { // 복권당첨 +20만원
		// #13
		System.out.println("[GoldenCard][winTheLottery]복권에 당첨됐습니다.");
		System.out.println("[GoldenCard][winTheLottery]당첨금 20만 원을 수령합니다.");

		int lottery = 200000;
		player.takeMoney(0, playerIdx, lottery);
	}

	public void birthDay(int mapIdxOfPlayer, int playerIdx) { // 생일 파티, 게임 참가자 전원에게 1천원씩 받는다.
		// #14
		System.out.println("[GoldenCard][birthDay]당신의 생일입니다.");
		System.out.println("[GoldenCard][birthDay]게임 참가자 전원에게 1천원씩 받습니다.");
		String playerName = Player.playerList.get(playerIdx).getName();
		int pocketMoney = 1000;
		Player player = new Player();
		for (int i = 1; i < Player.playerList.size(); i++) {
			if (i != playerIdx) {
				int bankrup = new Player().checkBankrupt(i, 0, pocketMoney);
				if (bankrup == 0) {
					player.giveMoney(i, 0, pocketMoney);
				}
			}
		}
		pocketMoney *= Player.playerList.size() - 2;
		player.takeMoney(0, playerIdx, pocketMoney);
		System.out.println("[GoldenCard][birthDay][" + playerName + "]" + pocketMoney + "원을 다른 플레이어들에게 받았습니다.");
	}

	public void winTheCarRace(int mapIdxOfPlayer, int playerIdx) { // 자동차 경주 우승 +10만원
		// #15
		System.out.println("[GoldenCard][winTheCarRace]자동차 경주에서 우승했습니다.");
		System.out.println("[GoldenCard][winTheCarRace]상금으로 10만 원을 받습니다.");

		int prize = 100000;
		player.takeMoney(0, playerIdx, prize);
	}

	public void scholorship(int mapIdxOfPlayer, int playerIdx) { // 장학금 +10만원
		// #16
		System.out.println("[GoldenCard][scholorship]장학금을 받았습니다.");
		System.out.println("[GoldenCard][scholorship]장학금으로 10만 원을 수령합니다.");

		int scholorship = 100000;
		player.takeMoney(0, playerIdx, scholorship);
	}

	public void crimePrevention(int mapIdxOfPlayer, int playerIdx) { // -5만원 * 호텔 수, -3만원 * 빌딩, -1만원 *집 지출
		// #17
		System.out.println("[GoldenCard][crimePrevention]범죄를 예방해야합니다.");
		System.out.println("[GoldenCard][crimePrevention]방범비를 지출합니다.");
		System.out.println("[GoldenCard][crimePrevention](소유 호텔 수 * 5만 원, 소유 빌딩 수 * 3만 원, 소유 집 수 * 1만 원)");

		String playerName = Player.playerList.get(playerIdx).getName();

		int theNumberOfHouse = 0; // *10000
		int theNumberOfConference = 0; // *30000
		int theNumberOfHotel = 0; // *50000

		int costForHouse = 0;
		int costForConference = 0;
		int costForHotel = 0;

		int sumOfCost = 0;

		for (int i = 0; i < BlueMarbleMap.citiesAndAttractionsOwner.length; i++) {
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == playerIdx) {
				if (BlueMarbleMap.citiesAndAttractionsCheckHouse[i] == 1) {
					theNumberOfHouse++; // cities[3]에 있는 데이터값이 1이라면 theNumberHouse 1씩 누적
				}
				if (BlueMarbleMap.citiesAndAttractionsCheckConference[i] == 1) {
					theNumberOfConference++; // cities[4]에 있는 데이터값이 1이라면 theNumberConference 1씩 누적
				}
				if (BlueMarbleMap.citiesAndAttractionsCheckHotel[i] == 1) {
					theNumberOfHotel++; // cities[5]에 있는 데이터값이 1이라면 theNumberHotel 1씩 누적
				}
			}
		}

		costForHouse = theNumberOfHouse * 10000;
		costForConference = theNumberOfConference * 30000;
		costForHotel = theNumberOfHotel * 50000;

		sumOfCost = costForHouse + costForConference + costForHotel;

		int bankrup = new Player().checkBankrupt(playerIdx, 0, sumOfCost);
		if (bankrup == 0) {
			new Player().giveMoney(playerIdx, 0, sumOfCost);

			System.out.println("[GoldenCard][crimePrevention][" + playerName + "]집 " + theNumberOfHouse + "개, 빌딩 "
					+ theNumberOfConference + "개, 호텔 " + theNumberOfHotel);
			System.out.println("[GoldenCard][crimePrevention][" + playerName + "]총 " + sumOfCost + "원을 지불했습니다.");

			JOptionPane.showMessageDialog(Frame.gameFrame, "방범비로 " + sumOfCost + "원을 지출했습니다.", "방범비",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void repairing(int mapIdxOfPlayer, int playerIdx) { // -10만원 * 호텔 수, -6만원 * 빌딩, -3만원 *집 지출
		// #18
		System.out.println("[GoldenCard][repairing]소유 건물을 수리해야합니다.");
		System.out.println("[GoldenCard][repairing]수리비를 지출합니다.");
		System.out.println("[GoldenCard][repairing](소유 호텔 수 * 10만 원, 소유 빌딩 수 * 6만 원, 소유 집 수 * 3만 원)");

		String playerName = Player.playerList.get(playerIdx).getName();

		int theNumberOfHouse = 0; // *30000
		int theNumberOfConference = 0; // *60000
		int theNumberOfHotel = 0; // *100000

		int costForHouse = 0;
		int costForConference = 0;
		int costForHotel = 0;

		int sumOfCost = 0;

		for (int i = 0; i < BlueMarbleMap.citiesAndAttractionsOwner.length; i++) {
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == playerIdx) {
				if (BlueMarbleMap.citiesAndAttractionsCheckHouse[i] == 1) {
					theNumberOfHouse++; // cities[3]에 있는 데이터값이 1이라면 theNumberHouse 1씩 누적
				}
				if (BlueMarbleMap.citiesAndAttractionsCheckConference[i] == 1) {
					theNumberOfConference++; // cities[4]에 있는 데이터값이 1이라면 theNumberConference 1씩 누적
				}
				if (BlueMarbleMap.citiesAndAttractionsCheckHotel[i] == 1) {
					theNumberOfHotel++; // cities[5]에 있는 데이터값이 1이라면 theNumberHotel 1씩 누적
				}
			}
		}

		costForHouse = theNumberOfHouse * 30000;
		costForConference = theNumberOfConference * 60000;
		costForHotel = theNumberOfHotel * 100000;

		sumOfCost = costForHouse + costForConference + costForHotel;

		int bankrup = new Player().checkBankrupt(playerIdx, 0, sumOfCost);
		if (bankrup == 0) {

			new Player().giveMoney(playerIdx, 0, sumOfCost);

			System.out.println("[GoldenCard][repairing][" + playerName + "]집 " + theNumberOfHouse + "개, 빌딩 "
					+ theNumberOfConference + "개, 호텔 " + theNumberOfHotel);
			System.out.println("[GoldenCard][repairing][" + playerName + "]총 " + sumOfCost + "원을 지불했습니다.");

			JOptionPane.showMessageDialog(Frame.gameFrame, "수리비로 " + sumOfCost + "원을 지출했습니다.", "수리비",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void incomeTax(int mapIdxOfPlayer, int playerIdx) { // -15만원 * 호텔 수, -10만원 * 빌딩, -3만원 *집 지출
		// #19
		System.out.println("[GoldenCard][incomeTax]소유 자산에 대한 소득세를 내야합니다.");
		System.out.println("[GoldenCard][incomeTax]소득세를 지출합니다.");
		System.out.println("[GoldenCard][incomeTax](소유 호텔 수 * 15만 원, 소유 빌딩 수 * 10만 원, 소유 집 수 * 3만 원)");

		String playerName = Player.playerList.get(playerIdx).getName();

		int theNumberOfHouse = 0; // *30000
		int theNumberOfConference = 0; // *100000
		int theNumberOfHotel = 0; // *150000

		int costForHouse = 0;
		int costForConference = 0;
		int costForHotel = 0;

		int sumOfCost = 0;

		for (int i = 0; i < BlueMarbleMap.citiesAndAttractionsOwner.length; i++) {
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == playerIdx) {
				if (BlueMarbleMap.citiesAndAttractionsCheckHouse[i] == 1) {
					theNumberOfHouse++; // cities[3]에 있는 데이터값이 1이라면 theNumberHouse 1씩 누적
				}
				if (BlueMarbleMap.citiesAndAttractionsCheckConference[i] == 1) {
					theNumberOfConference++; // cities[4]에 있는 데이터값이 1이라면 theNumberConference 1씩 누적
				}
				if (BlueMarbleMap.citiesAndAttractionsCheckHotel[i] == 1) {
					theNumberOfHotel++; // cities[5]에 있는 데이터값이 1이라면 theNumberHotel 1씩 누적
				}
			}
		}

		costForHouse = theNumberOfHouse * 30000;
		costForConference = theNumberOfConference * 100000;
		costForHotel = theNumberOfHotel * 150000;

		sumOfCost = costForHouse + costForConference + costForHotel;

		int bankrup = new Player().checkBankrupt(playerIdx, 0, sumOfCost);
		if (bankrup == 0) {
			new Player().giveMoney(playerIdx, 0, sumOfCost);

			System.out.println("[GoldenCard][crimePrevention][" + playerName + "]집 " + theNumberOfHouse + "개, 빌딩 "
					+ theNumberOfConference + "개, 호텔 " + theNumberOfHotel);
			System.out.println("[GoldenCard][crimePrevention][" + playerName + "]총 " + sumOfCost + "원을 지불했습니다.");

			JOptionPane.showMessageDialog(Frame.gameFrame, "소득세로 " + sumOfCost + "원을 지출했습니다.", "소득세",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void speedingTicket(int mapIdxOfPlayer, int playerIdx) { // 과속운전 -5만원
		// #20
		System.out.println("[GoldenCard][incomeTax]당신은 과속 운전을 했습니다.");
		System.out.println("[GoldenCard][incomeTax]벌금 5만 원을 지출합니다.");

		int ticket = 50000;

		int bankrup = new Player().checkBankrupt(playerIdx, 0, ticket);
		if (bankrup == 0) {
			player.giveMoney(playerIdx, 0, ticket);
		}

	}

	public void expenseForMedical(int mapIdxOfPlayer, int playerIdx) { // 의료비 -5만원
		// #21
		System.out.println("[GoldenCard][expenseForMedical]의료비를 내야합니다.");
		System.out.println("[GoldenCard][expenseForMedical]비용 5만 원을 지출합니다.");

		int expense = 50000;

		int bankrup = new Player().checkBankrupt(playerIdx, 0, expense);
		if (bankrup == 0) {
			player.giveMoney(playerIdx, 0, expense);
		}
	}

	public void studyingAbroad(int mapIdxOfPlayer, int playerIdx) { // 해외유학 -10만원
		// #22
		System.out.println("[GoldenCard][studyingAbroad]해외 유학 비용을 내야합니다.");
		System.out.println("[GoldenCard][studyingAbroad]비용 10만 원을 지출합니다.");

		int expense = 100000;

		int bankrup = new Player().checkBankrupt(playerIdx, 0, expense);
		if (bankrup == 0) {
			player.giveMoney(playerIdx, 0, expense);
		}
	}

	public void radioEscapingFromTheInhabitedIsland(int mapIdxOfPlayer, int playerIdx) { // 무인도 탈출용 무전기
		// #23
		System.out.println("[GoldenCard][radioForTheInhabited]무인도 탈출 무전기입니다.");
		System.out.println("[GoldenCard][radioForTheInhabited]무인도에 갇혔을 때 사용할 수 있습니다.");

		JOptionPane.showMessageDialog(Frame.gameFrame, "무인도 탈출 무전기입니다.\n무인도에 갇혔을 때 사용할 수 있습니다.", "탈출 무전기",
				JOptionPane.INFORMATION_MESSAGE);

		Player.playerList.get(playerIdx).setRadioEscapingFromTheInhabitedIslandOfGoldenCard(1);
	}

	public void makePlayerSellTheHighestPriceOfLandHalfPrice(int mapIdxOfPlayer, int playerIdx) { // 플레이어 소유의 땅 중 가장 비싼
																									// 땅을 은행에 반액에 팔게 한다.
		// #24
		// #25
		System.out.println(
				"[GoldenCard][makePlayerSellTheHighestPriceOfLandHalfPrice]플레이어가 소유한 땅 중 가장 비싼 곳을 반액에 은행에 팔아야 합니다.");
		String nameOfBlock;

		int sumOfPrice = 0;
		int tempSumOfPrice = 0;

		int mapIdx = 0;
		int tempMapIdx = 0;

		for (int i = 0; i < BlueMarbleMap.citiesAndAttractionsOwner.length; i++) {
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == playerIdx) {
				tempSumOfPrice = BlueMarbleMap.realPropertySum[i];
				tempMapIdx = i;
			}
			if (tempSumOfPrice > sumOfPrice) {
				sumOfPrice = tempSumOfPrice;
				mapIdx = tempMapIdx; // 플레이어 소유의 땅 중 가장 비싼 땅(mapIdx)
			}
		}

		BlueMarbleMap.citiesAndAttractionsOwner[mapIdx] = 0;
		BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[mapIdx] = 0;
		BlueMarbleMap.citiesAndAttractionsCheckLand[mapIdx] = 0;
		BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdx] = 0;
		BlueMarbleMap.citiesAndAttractionsCheckConference[mapIdx] = 0;
		BlueMarbleMap.citiesAndAttractionsCheckHotel[mapIdx] = 0;
		BlueMarbleMap.realPropertyPriceOfLand[mapIdx] = 0;
		BlueMarbleMap.realPropertyPriceOfHouse[mapIdx] = 0;
		BlueMarbleMap.realPropertyPriceOfConference[mapIdx] = 0;
		BlueMarbleMap.realPropertyPriceOfHotel[mapIdx] = 0;
		BlueMarbleMap.realPropertySum[mapIdx] = 0;

		nameOfBlock = BlueMarbleMap.map.get(mapIdx).getName();
		
		System.out.println(
				"[GoldenCard][makePlayerSellTheHighestPriceOfLandHalfPrice]" + nameOfBlock + "가(이) 가장 비싼 땅입니다.");
		System.out.println(
				"[GoldenCard][makePlayerSellTheHighestPriceOfLandHalfPrice]" + nameOfBlock + "를(을) 절반값에 판매합니다.");
		if (mapIdx != 0) {
			JOptionPane.showMessageDialog(Frame.gameFrame, nameOfBlock + "를(을) 매입비용의 반액에 매각합니다.", "반액 매각",
					JOptionPane.INFORMATION_MESSAGE);

			player.takeMoney(0, playerIdx, sumOfPrice / 2);
		} else if (mapIdx == 0) {
			JOptionPane.showMessageDialog(Frame.gameFrame, "소유한 땅이 없습니다.", "반액 매각",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void specialPass(int mapIdxOfPlayer, int playerIdx) { // 우대권, 다른 플레이어의 땅을 통과할 때 통행료를 지불하지 않아도 된다.
		// 필요없다면 30만원에 팔아도 된다.
		// #26
		// #27
		Player player = new Player();
		int thePriceOfSpecialPass = 300000;
		System.out.println("[GoldenCard][specialPass]우대권입니다.");
		System.out.println("[GoldenCard][specialPass]다른 플레이어의 땅을 통과할 때 통행료를 지불하지 않아도 됩니다.");
		System.out.println("[GoldenCard][specialPass]우대권은 1장만 소지할 수 있습니다.");

		if (Player.playerList.get(playerIdx).getSpecialPassOfGoldenCard() == 1) {
			System.out.println("[GoldenCard][specialPass]현재 우대권을 소지하고 있습니다.(1)");
		} else {
			System.out.println("[GoldenCard][specialPass]현재 우대권을 소지하고 있지 않습니다.(0)");
		}

		System.out.println("[GoldenCard][specialPass]필요없다면 은행에 30만 원에 팔 수 있습니다.");
		System.out.println("[GoldenCard][specialPass]우대권을 은행에 판매 하시겠습니까?");
		System.out.println("[GoldenCard][specialPass]1.네  2.아니오 ");

		String[] answers = { "아니오! 판매하지 않겠습니다.", "네! 은행에 판매하겠습니다." };
		int command = JOptionPane.showOptionDialog(Frame.gameFrame,
				"통행료 우대권을 은행에 판매하시겠습니까?\n현재 " + Player.playerList.get(playerIdx).getSpecialPassOfGoldenCard()
						+ "장의 우대권을 소지하고 있습니다.",
				"통행료 우대권", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

		if (command == 0) {
			System.out.println("[GoldenCard][specialPass]우대권을 획득했습니다.");
			Player.playerList.get(playerIdx).setSpecialPassOfGoldenCard(1);
		} else if (command == 1) {
			System.out.println("[GoldenCard][specialPass]우대권을 은행에 판매했습니다.");
			player.takeMoney(0, playerIdx, thePriceOfSpecialPass);
		}
	}
}
