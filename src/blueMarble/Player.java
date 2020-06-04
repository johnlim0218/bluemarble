package blueMarble;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.Frame;
import GUI.GMain;
import GUI.GamePnl;
import GUI.MouseListenerForDisposalRealProperty;
import GUI.PlayersOccupyMark;
import GUI.PlayersSpirit;
import GUI.Status;

public class Player {

	public static ArrayList<Player> playerList = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	private String playerName; // static으로 하면 이름이 마지막에 입력한 값으로 고정됨(static에 대한 이해도가 현저하게 떨어진다.)
	private int theNumberOfTravel; // 말판 회전 수, 회전 수가 증가하면 20만원 획득
//	private int playerMaxIdx;
	private int chanceOfRollingDice; // 같은 수의 주사위가 나왔을 때를 위한 변수
										// 주사위를 굴렸을 때 두 주사위에서 같은 수가 나온다면
										// chanceOfRollingDice가 1이 된다.

	private int property; // 현금자산, property가 0이 되면 부동산 매각
	private int totalProperty; // 현금자산 + 부동산 , totalProperty가 0이 되면 게임오버

	private int mapIdxOfPlayer; // 0~39 플레이어의 현재 위치

	private int trappedOnTheInhabitedIsland;

	private int radioEscapingFromTheInhabitedIslandOfGoldenCard; // 황금 카드 중 무인도 탈출용 무전기
	private int specialPassOfGoldenCard; // 황금 카드 중 우대권

	private int posXForMove;
	private int posYForMove;

	private boolean disposal;
	private boolean unavailabelBuyOthers;
	private int tempForGiveMoney;
	private int tempForTakeMoney;
	private int tempForSender;
	private int tempForReceiver;

	private boolean spaceTravel;

	private boolean bankrupt;

	public String getName() {
		return playerName;
	}

	public void setName(String name) {
		this.playerName = name;
	}

	public int getTheNumberOfTravel() {
		return theNumberOfTravel;
	}

	public void setTheNumberOfTravel(int theNumberOfTravel) {
		this.theNumberOfTravel = theNumberOfTravel;
	}

//	public int getPlayerMaxIdx() {
//		return playerMaxIdx;
//	}
//
//	public void setPlayerMaxIdx(int playerMaxIdx) {
//		this.playerMaxIdx = playerMaxIdx;
//	}

	public int getChanceOfRollingDice() {
		return chanceOfRollingDice;
	}

	public void setChanceOfRollingDice(int chanceOfRollingDice) {
		this.chanceOfRollingDice = chanceOfRollingDice;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}

	public int getTotalProperty() {
		return totalProperty;
	}

	public void setTotalProperty(int totalProperty) {
		this.totalProperty = totalProperty;
	}

	public int getmapIdxOfPlayer() {
		return mapIdxOfPlayer;
	}

	public void setmapIdxOfPlayer(int mapIdxOfPlayer) {
		this.mapIdxOfPlayer = mapIdxOfPlayer;
	}

	public int getTrappedOnTheInhabitedIsland() {
		return trappedOnTheInhabitedIsland;
	}

	public void setTrappedOnTheInhabitedIsland(int trappedOnTheInhabitedIsland) {
		this.trappedOnTheInhabitedIsland = trappedOnTheInhabitedIsland;
	}

	public int getRadioEscapingFromTheInhabitedIslandOfGoldenCard() {
		return radioEscapingFromTheInhabitedIslandOfGoldenCard;
	}

	public void setRadioEscapingFromTheInhabitedIslandOfGoldenCard(
			int radioEscapingFromTheInhabitedIslandOfGoldenCard) {
		this.radioEscapingFromTheInhabitedIslandOfGoldenCard = radioEscapingFromTheInhabitedIslandOfGoldenCard;
	}

	public int getSpecialPassOfGoldenCard() {
		return specialPassOfGoldenCard;
	}

	public void setSpecialPassOfGoldenCard(int specialPassOfGoldenCard) {
		this.specialPassOfGoldenCard = specialPassOfGoldenCard;
	}

	public int getPosXForMove() {
		return posXForMove;
	}

	public void setPosXForMove(int posXForMove) {
		this.posXForMove = posXForMove;
	}

	public int getPosYForMove() {
		return posYForMove;
	}

	public void setPosYForMove(int posYForMove) {
		this.posYForMove = posYForMove;
	}

	public boolean getDisposal() {
		return disposal;
	}

	public void setDisposal(boolean disposal) {
		this.disposal = disposal;
	}

	public boolean getUnavailabelBuyOthers() {
		return unavailabelBuyOthers;
	}

	public void setUnavailabelBuyOthers(boolean unavailabelBuyOthers) {
		this.unavailabelBuyOthers = unavailabelBuyOthers;
	}

	public int getTempForGiveMoney() {
		return tempForGiveMoney;
	}

	public void setTempForGiveMoney(int tempForGiveMoney) {
		this.tempForGiveMoney = tempForGiveMoney;
	}

	public int getTempForTakeMoney() {
		return tempForTakeMoney;
	}

	public void setTempForTakeMoney(int tempForTakeMoney) {
		this.tempForTakeMoney = tempForTakeMoney;
	}

	public int getTempForSender() {
		return tempForSender;
	}

	public void setTempForSender(int tempForSender) {
		this.tempForSender = tempForSender;
	}

	public int getTempForReceiver() {
		return tempForReceiver;
	}

	public void setTempForReceiver(int tempForReceiver) {
		this.tempForReceiver = tempForReceiver;
	}

	public boolean getSpaceTravel() {
		return spaceTravel;
	}

	public void setSpaceTravel(boolean spaceTravel) {
		this.spaceTravel = spaceTravel;
	}

	public boolean getBankrupt() {
		return bankrupt;
	}

	public void setBankrupt(boolean bankrupt) {
		this.bankrupt = bankrupt;
	}

	public void movePlayer(int playerIdx, int diceA, int diceB) { // 플레이어 이동 메소드

		String playerName = Player.playerList.get(playerIdx).getName();

		int sumOfDices = diceA + diceB;

		if (diceA != diceB) {
			Player.playerList.get(playerIdx).setChanceOfRollingDice(0);
			System.out.println("[Player][movePlayer][" + playerName + "]" + diceA + "와 " + diceB + "가(이) 나왔습니다.");
			System.out.println("[Player][movePlayer][" + playerName + "]" + sumOfDices + "칸 이동합니다.");

			new BlueMarbleMap().checkForCircumnavigation(playerIdx, sumOfDices); // 플레이어가 맵을 1회전 했는가

		} else if (diceA == diceB) {
			Player.playerList.get(playerIdx).setChanceOfRollingDice(1);
			System.out.println("[Player][movePlayer][" + playerName + "]" + "더블!!!");
			System.out.println("[Player][movePlayer][" + playerName + "]" + diceA + "와 " + diceB + "가(이) 나왔습니다.");
			System.out.println("[Player][movePlayer][" + playerName + "]" + sumOfDices + "칸 이동합니다.");

			new BlueMarbleMap().checkForCircumnavigation(playerIdx, sumOfDices); // 플레이어가 맵을 1회전 했는가

		}

	}

	public void turnPlayer(int playerIdx) {

		while (true) {

			if (Player.playerList.get(playerIdx).getDisposal() == false
					&& Player.playerList.get(playerIdx).getSpaceTravel() == false) {

				// 더블이 나오면 플레이어 순서가 변하지 않는다.
				if (Player.playerList.get(playerIdx).getChanceOfRollingDice() == 1) {

					// 더블이 나오지 않으면 다음 순서로 넘어간다.
				} else if (Player.playerList.get(playerIdx).getChanceOfRollingDice() == 0) {

					playerIdx++;

				}

				if (playerIdx >= Player.playerList.size()) { // 플레이어 순환

					playerIdx = 1;
				}

				if (Player.playerList.get(playerIdx).getBankrupt() == false) {
					GamePnl.pleaseWait = false;
					break;
				}

			} else {
				break;
			}
		}

		GMain.playerIdx = playerIdx;
	}

	public void buyLand(int mapIdxOfPlayer, int playerIdx, int eventType) {
		String playerName = Player.playerList.get(playerIdx).getName();
		int PriceOfLand = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfLand();

		int playersProperty = Player.playerList.get(playerIdx).getProperty();

		boolean affordable = checkAffordableForBuy(playerIdx, PriceOfLand);

		if (affordable == true) {

			int playersPropertyAfterBuyLand = playersProperty - PriceOfLand;

			if (eventType == 1) {
				BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer] = playerIdx;
				BlueMarbleMap.citiesAndAttractionsCheckLand[mapIdxOfPlayer] = 1; // 땅 소유 1
			} else if (eventType == 2) {
				BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer] = playerIdx;
			}

			BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer] = playerIdx; // 부동산 장부 (소유자 기록 - playerIdx)
			BlueMarbleMap.realPropertyPriceOfLand[mapIdxOfPlayer] = PriceOfLand; // 부동산 장부 (대지 가격 기록)

			sumOfRealProperty(mapIdxOfPlayer);

			Player.playerList.get(playerIdx).setProperty(playersPropertyAfterBuyLand);

			BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[mapIdxOfPlayer] = 1; // 땅을 소유하기 시작했을 때부터 도착횟수를
			// 누적시킨다.

			System.out.println("[Player][buyLand][" + playerName + "]땅을 샀습니다.");
		}

	}

	public void buildHouse(int mapIdxOfPlayer, int playerIdx) {
		String playerName = Player.playerList.get(playerIdx).getName();
		int PriceOfHouse = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfHouse();
		int playersProperty = Player.playerList.get(playerIdx).getProperty();

		boolean affordable = checkAffordableForBuy(playerIdx, PriceOfHouse);

		if (affordable == true) {

			int playersPropertyAfterBuildHouse = playersProperty - PriceOfHouse;

			BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] = 1; // 집 소유 1
			BlueMarbleMap.realPropertyPriceOfHouse[mapIdxOfPlayer] = PriceOfHouse; // 부동산 장부(집 건설 가격 기록)
			sumOfRealProperty(mapIdxOfPlayer);

			Player.playerList.get(playerIdx).setProperty(playersPropertyAfterBuildHouse);
			BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[mapIdxOfPlayer] = 2;

			System.out.println("[Player][buildHouse][" + playerName + "]집을 지었습니다.");
		}
	}

	public void buildConference(int mapIdxOfPlayer, int playerIdx) {
		String playerName = Player.playerList.get(playerIdx).getName();
		int PriceOfConference = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfConference();
		int playersProperty = Player.playerList.get(playerIdx).getProperty();

		boolean affordable = checkAffordableForBuy(playerIdx, PriceOfConference);

		if (affordable == true) {

			int playersPropertyAfterBuildConference = playersProperty - PriceOfConference;

			BlueMarbleMap.citiesAndAttractionsCheckConference[mapIdxOfPlayer] = 1; // 빌딩 소유 1
			BlueMarbleMap.realPropertyPriceOfConference[mapIdxOfPlayer] = PriceOfConference; // 부동산 장부(빌딩 건설 가격 기록)
			sumOfRealProperty(mapIdxOfPlayer);

			Player.playerList.get(playerIdx).setProperty(playersPropertyAfterBuildConference);
			BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[mapIdxOfPlayer] = 3;

			System.out.println("[Player][buildConference][" + playerName + "]빌딩을 지었습니다.");
		}
	}

	public void buildHotel(int mapIdxOfPlayer, int playerIdx) {
		String playerName = Player.playerList.get(playerIdx).getName();
		int PriceOfHotel = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfHotel();
		int playersProperty = Player.playerList.get(playerIdx).getProperty();

		boolean affordable = checkAffordableForBuy(playerIdx, PriceOfHotel);

		if (affordable == true) {

			int playersPropertyAfterBuildHotel = playersProperty - PriceOfHotel;

			BlueMarbleMap.citiesAndAttractionsCheckHotel[mapIdxOfPlayer] = 1; // 호텔 소유 1
			BlueMarbleMap.realPropertyPriceOfHotel[mapIdxOfPlayer] = PriceOfHotel; // 부동산 장부(호텔 건설 가격 기록)
			sumOfRealProperty(mapIdxOfPlayer);

			Player.playerList.get(playerIdx).setProperty(playersPropertyAfterBuildHotel);

			System.out.println("[Player][buildHotel][" + playerName + "]호텔을 지었습니다.");
		}
	}

	public void sumOfRealProperty(int mapIdxOfPlayer) { // realProperty[5]에 들어갈 땅 별 합계를 계산

		int tempSum = 0;

		tempSum = BlueMarbleMap.realPropertyPriceOfLand[mapIdxOfPlayer]
				+ BlueMarbleMap.realPropertyPriceOfHouse[mapIdxOfPlayer]
				+ BlueMarbleMap.realPropertyPriceOfConference[mapIdxOfPlayer]
				+ BlueMarbleMap.realPropertyPriceOfHotel[mapIdxOfPlayer];

		BlueMarbleMap.realPropertySum[mapIdxOfPlayer] = tempSum;

		sumOfTotalProperty();

	}

	public void sumOfTotalProperty() {

		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;

		for (int i = 1; i < Player.playerList.size(); i++) {
			Player.playerList.get(i).setTotalProperty(Player.playerList.get(i).getProperty());
		}

		for (int i = 0; i < BlueMarbleMap.map.size(); i++) {

			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 1) {
				temp1 += BlueMarbleMap.realPropertySum[i];
				Player.playerList.get(1).setTotalProperty(temp1 + Player.playerList.get(1).getProperty());
			}
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 2) {
				temp2 += BlueMarbleMap.realPropertySum[i];
				Player.playerList.get(2).setTotalProperty(temp2 + Player.playerList.get(2).getProperty());
			}
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 3) {
				temp3 += BlueMarbleMap.realPropertySum[i];
				Player.playerList.get(3).setTotalProperty(temp3 + Player.playerList.get(3).getProperty());
			}
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 4) {
				temp4 += BlueMarbleMap.realPropertySum[i];
				Player.playerList.get(4).setTotalProperty(temp4 + Player.playerList.get(4).getProperty());
			}
		}

		for (int i = 1; i < Player.playerList.size(); i++) {
			System.out
					.println("[sumOfTotalProperty] " + i + " getProperty : " + Player.playerList.get(i).getProperty());
			System.out.println(
					"[sumOfTotalProperty] " + i + " getTotalProperty : " + Player.playerList.get(i).getTotalProperty());

		}

	}

	public void payAToll(int mapIdxOfPlayer, int playerIdx) { // 통행료를 내는 메소드

		int sender = playerIdx; // 통행료를 내는 플레이어
		int receiver = BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer]; // 통행료를 받는 플레이어 (도시의 경우)
		String ownerName = Player.playerList.get(receiver).getName();
		String playerName = Player.playerList.get(playerIdx).getName();
		int eventType = BlueMarbleMap.map.get(mapIdxOfPlayer).getType();
		boolean checkSpecialPass;
		int sumOfToll = 0;

		boolean giveMoney = false;
		boolean takeMoney = false;

		checkSpecialPass = checkSpecialPass(playerIdx); // 우대권 확인

		if (checkSpecialPass == false) {

			if (eventType == 1) { // 도시

				int tollOfLand = BlueMarbleMap.map.get(mapIdxOfPlayer).getTollOfLand();
				int tollOfHouse = BlueMarbleMap.map.get(mapIdxOfPlayer).getTollOfHouse();
				int tollOfConference = BlueMarbleMap.map.get(mapIdxOfPlayer).getTollOfConference();
				int tollOfHotel = BlueMarbleMap.map.get(mapIdxOfPlayer).getTollOfHotel();

				if (BlueMarbleMap.citiesAndAttractionsCheckHotel[mapIdxOfPlayer] == 1) {
					sumOfToll = tollOfLand + tollOfHouse + tollOfConference + tollOfHotel;

				} else if (BlueMarbleMap.citiesAndAttractionsCheckConference[mapIdxOfPlayer] == 1) {
					sumOfToll = tollOfLand + tollOfHouse + tollOfConference;

				} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 1) {
					sumOfToll = tollOfLand + tollOfHouse;

				} else if (BlueMarbleMap.citiesAndAttractionsCheckLand[mapIdxOfPlayer] == 1) {
					sumOfToll = tollOfLand;

				}

				int remainder = checkBankrupt(sender, receiver, sumOfToll);

				if (remainder == 0) {

					giveMoney = giveMoney(sender, receiver, sumOfToll);
					takeMoney = takeMoney(sender, receiver, sumOfToll);

				} else {

					takeMoney(sender, receiver, remainder);
				}

			} else if (eventType == 2) { // 관광지

				int tollOfLand = BlueMarbleMap.map.get(mapIdxOfPlayer).getTollOfLand();
				sumOfToll = tollOfLand;

				int remainder = checkBankrupt(sender, receiver, sumOfToll);

				if (remainder == 0) {

					giveMoney = giveMoney(sender, receiver, sumOfToll);
					takeMoney = takeMoney(sender, receiver, sumOfToll);

				} else {

					takeMoney(sender, receiver, remainder);
				}
			}

			if (giveMoney == true && takeMoney == true) {

				System.out.println("[Player][payAtoll][" + playerName + "]통행료 " + sumOfToll + "를(을) 지불했습니다.");

				JOptionPane.showMessageDialog(Frame.gameFrame,
						playerName + "님\n통행료 " + sumOfToll + "원을 " + ownerName + "님에게 지불했습니다.", "통행료 지불",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public boolean checkSpecialPass(int playerIdx) {

		int command;
		boolean checkSpecialPass = false;
		int specialPassOfGoldenCard = Player.playerList.get(playerIdx).getSpecialPassOfGoldenCard();
		String playerName = Player.playerList.get(playerIdx).getName();

		if (specialPassOfGoldenCard >= 1) {
			System.out.println("[Player][checkSpecialPass]통행료 우대권이 있습니다.");
			System.out.println("[Player][checkSpecialPass]우대권을 사용하시겠습니까.");
			System.out.println("[Player][checkSpecialPass]1.네  2.아니오");

			String[] answers = { "네! 사용하겠습니다.", "아니오! 사용하지 않겠습니다." };
			command = JOptionPane.showOptionDialog(Frame.gameFrame, playerName + "님 통행료 우대권이 있습니다. \n우대권을 사용하시겠습니까?",
					"통행료 우대권 사용", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

			if (command == 0) {
				System.out.println("[Player][checkSpecialPass]우대권을 사용했습니다.");
				JOptionPane.showMessageDialog(Frame.gameFrame, playerName + "우대권을 사용했습니다.", "우대권 사용",
						JOptionPane.INFORMATION_MESSAGE);

				specialPassOfGoldenCard--;
				Player.playerList.get(playerIdx).setSpecialPassOfGoldenCard(specialPassOfGoldenCard);
				checkSpecialPass = true;
				return checkSpecialPass;
			} else if (command == 1) {
				System.out.println("[Player][checkSpecialPass]우대권을 사용하지 않았습니다.");
				JOptionPane.showMessageDialog(Frame.gameFrame, playerName + "우대권을 사용하지 않았습니다.", "우대권 사용",
						JOptionPane.INFORMATION_MESSAGE);
				checkSpecialPass = false;
				return checkSpecialPass;
			}
		} else if (specialPassOfGoldenCard == 0) {
			checkSpecialPass = false;
			return checkSpecialPass;
		}
		return checkSpecialPass;

	}

	public void buyOthers(int mapIdxOfPlayer, int playerIdx) { // 다른 플레이어의 땅을 사는 메소드

		if (Player.playerList.get(playerIdx).getDisposal() == false
				&& Player.playerList.get(playerIdx).getUnavailabelBuyOthers() == false) {

			int command;
			String playerName = Player.playerList.get(playerIdx).getName();
			int idxForOpponent = BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer];
			String opponentName = Player.playerList.get(idxForOpponent).getName();
			String nameOfBlock = BlueMarbleMap.map.get(mapIdxOfPlayer).getName();

			System.out.println("[Player][buyOthers][" + playerName + "][" + opponentName + "]소유의 땅을 매입하시겠습니까?");
			System.out.println("[Player][buyOthers][" + playerName + "]1.네  2.아니오");

			String[] answers = { "네! 매입하겠습니다.", "아니오! 매입하지 않겠습니다." };
			command = JOptionPane.showOptionDialog(Frame.gameFrame,
					playerName + "님 " + nameOfBlock + "는(은) " + opponentName + "님 소유의 땅입니다.\n" + opponentName
							+ "님 소유의 땅을 매입하시겠습니까?",
					nameOfBlock + " 매입", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers,
					answers[0]);

			if (command == 0) {

				int sender = playerIdx; // 땅을 매입하는 플레이어
				int receiverOfCity = BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer]; // 땅을 매각하는 플레이어

				int PriceOfLand = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfLand();
				int PriceOfHouse = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfHouse();
				int PriceOfConference = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfConference();
				int PriceOfHotel = BlueMarbleMap.map.get(mapIdxOfPlayer).getPriceOfHotel();

				int sumOfPrice = 0;

				if (BlueMarbleMap.citiesAndAttractionsCheckHotel[mapIdxOfPlayer] == 1) {
					sumOfPrice = PriceOfLand + PriceOfHouse + PriceOfConference + PriceOfHotel;

				} else if (BlueMarbleMap.citiesAndAttractionsCheckConference[mapIdxOfPlayer] == 1) {
					sumOfPrice = PriceOfLand + PriceOfHouse + PriceOfConference;

				} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[mapIdxOfPlayer] == 1) {
					sumOfPrice = PriceOfLand + PriceOfHouse;

				} else if (BlueMarbleMap.citiesAndAttractionsCheckLand[mapIdxOfPlayer] == 1) {
					sumOfPrice = PriceOfLand;

				}

				boolean affordable = checkAffordableForBuy(playerIdx, sumOfPrice);

				if (affordable == true) {
					BlueMarbleMap.citiesAndAttractionsOwner[mapIdxOfPlayer] = playerIdx;
					giveMoney(sender, receiverOfCity, sumOfPrice);
					takeMoney(sender, receiverOfCity, sumOfPrice);
					sumOfRealProperty(mapIdxOfPlayer);

					System.out.println("[Player][buyOthers][" + playerName + "][" + opponentName + "]소유의 땅을 매입했습니다.");

					JOptionPane.showMessageDialog(Frame.gameFrame, opponentName + "님 소유의 땅을 매입했습니다.",
							nameOfBlock + " 매입", JOptionPane.INFORMATION_MESSAGE);

				}

			} else if (command == 1) {
				JOptionPane.showMessageDialog(Frame.gameFrame, opponentName + "님 소유의 땅을 매입하지 않았습니다.",
						nameOfBlock + " 매입", JOptionPane.INFORMATION_MESSAGE);
			}
		}

		Player.playerList.get(playerIdx).setUnavailabelBuyOthers(false);

	}

	public boolean giveMoney(int sender, int receiver, int money) { // playerIdx(sender)가 돈을 다른 플레이어(receiver)에게 주는 메소드

		checkAffordableForToll(sender, receiver, money);

		Player.playerList.get(sender).setTempForTakeMoney(0);
		Player.playerList.get(sender).setTempForGiveMoney(money);
		Player.playerList.get(sender).setTempForSender(sender);
		Player.playerList.get(sender).setTempForReceiver(receiver);

		if (Player.playerList.get(sender).getDisposal() == false) {

			int tempForGiveMoney = Player.playerList.get(sender).getProperty();

			Player.playerList.get(sender).setProperty(tempForGiveMoney - money);

			return true;
		} else {

			return false;
		}
	}

	public boolean takeMoney(int sender, int receiver, int money) { // playerIdx(receiver)가 돈을 받는 메소드(통행료, 매각, 월급 등등)

		Player.playerList.get(receiver).setTempForGiveMoney(0);
		Player.playerList.get(receiver).setTempForTakeMoney(money);

		if (Player.playerList.get(sender).getDisposal() == false) {

			int tempForTakeMoney = Player.playerList.get(receiver).getProperty();

			Player.playerList.get(receiver).setProperty(tempForTakeMoney + money);

			return true;
		} else {

			return false;
		}
	}

	public void checkAffordableForToll(int sender, int receiver, int money) {

		if (Player.playerList.get(sender).getProperty() < money) {
			// 매각 (마우스 리스너)
			int shortage = money - Player.playerList.get(sender).getProperty();

			JOptionPane.showMessageDialog(Frame.gameFrame, shortage + "원이 부족합니다.\n부동산을 팔아 현금 자산을 마련하세요.", "유동성 확보",
					JOptionPane.INFORMATION_MESSAGE);

			Player.playerList.get(sender).setDisposal(true);
			Player.playerList.get(sender).setUnavailabelBuyOthers(true);

		} else {

			Player.playerList.get(sender).setDisposal(false); // *********************************
			Player.playerList.get(sender).setUnavailabelBuyOthers(false);
		}

	}

	public boolean checkAffordableForBuy(int playerIdx, int price) {

		if (Player.playerList.get(playerIdx).getProperty() < price) {

			JOptionPane.showMessageDialog(Frame.gameFrame, "현금 자산이 부족합니다.\n땅을 매입하거나 건물을 지을 수 없습니다.", "현금 자산 부족",
					JOptionPane.INFORMATION_MESSAGE);

			return false;

		} else {

			return true;
		}
	}

	public int checkBankrupt(int sender, int receiver, int money) {

		if (Player.playerList.get(sender).getTotalProperty() <= money) {
			System.out.println(Player.playerList.get(sender).getName() + "파산");

			int remainder = Player.playerList.get(sender).getTotalProperty();

			Player.playerList.get(sender).setProperty(0);
			Player.playerList.get(sender).setTotalProperty(0);
			Player.playerList.get(sender).setUnavailabelBuyOthers(true);

			JOptionPane.showMessageDialog(Frame.gameFrame, Player.playerList.get(sender).getName() + "님이 파산했습니다.", "파산",
					JOptionPane.INFORMATION_MESSAGE);

			Player.playerList.get(sender).setBankrupt(true);

			for (int i = 0; i < 40; i++) {
				if (BlueMarbleMap.citiesAndAttractionsOwner[i] == sender) {
					BlueMarbleMap.citiesAndAttractionsOwner[i] = 0;
					BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[i] = 0;
					BlueMarbleMap.citiesAndAttractionsCheckLand[i] = 0;
					BlueMarbleMap.citiesAndAttractionsCheckHouse[i] = 0;
					BlueMarbleMap.citiesAndAttractionsCheckConference[i] = 0;
					BlueMarbleMap.citiesAndAttractionsCheckHotel[i] = 0;
					BlueMarbleMap.realPropertyPriceOfLand[i] = 0;
					BlueMarbleMap.realPropertyPriceOfHouse[i] = 0;
					BlueMarbleMap.realPropertyPriceOfConference[i] = 0;
					BlueMarbleMap.realPropertyPriceOfHotel[i] = 0;
					BlueMarbleMap.realPropertySum[i] = 0;
				}
			}

			return remainder;
		}
		return 0;

	}

	public void print() {

		String playerName;
		int property;

		for (int i = 1; i < playerList.size(); i++) {
			playerName = playerList.get(i).getName();
			property = playerList.get(i).getProperty();

			System.out.println("[Player][print][" + playerName + "][property]현금자산 " + property);
		}
	}

}
