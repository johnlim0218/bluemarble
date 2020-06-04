package blueMarble;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import GUI.GMain;

public class BlueMarbleMap {

	int num;

	public static ArrayList<Events> map = new ArrayList<>(); // 전체 맵 정보

	// 도시 소유 정보 배열
	public static int[] citiesAndAttractionsOwner = new int[40]; // 값이 0이면 소유자 없음,구입할 것인가 묻는이벤트(playerIdx가 들어갈 것)
	public static int[] citiesAndAttractionsTheNumberOfArrival = new int[40]; // 땅 구입 후 소유자의 도착 횟수 (theNumberOfArrival)
	public static int[] citiesAndAttractionsCheckLand = new int[40]; // 땅 소유 여부 (theNumberOfArrival가 0일 때 땅 구입 이벤트)
	public static int[] citiesAndAttractionsCheckHouse = new int[40]; // 집 소유 여부 (theNumberOfArrival가 1일 때 집 건설 이벤트)
	public static int[] citiesAndAttractionsCheckConference = new int[40]; // 빌딩 소유 여부 (theNumberOfArrival가 2일 때 콘도 건설 이벤트)
	public static int[] citiesAndAttractionsCheckHotel = new int[40]; // 호텔 소유 여부 (theNumberOfArrival가 3일 때 호텔 건설 이벤트)

	// 부동산 장부(구입 비용, 건설 비용 기록) - 전체 자산 관리용?
	public static int[] realPropertyPriceOfLand = new int[40]; // priceOfLand
	public static int[] realPropertyPriceOfHouse = new int[40]; // priceOfHouse
	public static int[] realPropertyPriceOfConference = new int[40]; // priceOfConference
	public static int[] realPropertyPriceOfHotel = new int[40]; // priceOfHotel
	public static int[] realPropertySum = new int[40]; // 합계(priceOfLand + priceOfHouse +
												// priceOfConference + priceOfHotel)
												// 플레이어가 땅을 구입하면 realProperty[0] 에 playerIdx가 기록되고 realProperty[1]에
												// 구입 땅값이 기록된다.
												// 플레이어가 집을 지으면 realProperty[2]에, 빌딩을 지으면 realProperty[3]에, 호텔을 지으면
												// realProperty[4]에 기록된다.

	static public void mapInitial() {

		BlueMarbleMap.setMapData();
		BlueMarbleMap.setCitiesArr();
	}

	static public void setMapData() {
		// position
		map.add(0, new Start()); // Player의 position값과 비교하면된다.
		map.add(1, new Taipei());
		map.add(2, new GoldenCard2());
		map.add(3, new HongKong());
		map.add(4, new Manila());
		map.add(5, new Jeju());
		map.add(6, new Singapole());
		map.add(7, new GoldenCard7());
		map.add(8, new Cairo());
		map.add(9, new Istanbul());
		map.add(10, new Space());
		map.add(11, new Athena());
		map.add(12, new GoldenCard12());
		map.add(13, new Copenhagen());
		map.add(14, new Stockholm());
		map.add(15, new Concord());
		map.add(16, new Zurich());
		map.add(17, new GoldenCard17());
		map.add(18, new Berlin());
		map.add(19, new Montreal());
		map.add(20, new InhabitedIsland());
		map.add(21, new BuenosAires());
		map.add(22, new GoldenCard22());
		map.add(23, new SaoPaulo());
		map.add(24, new Sydney());
		map.add(25, new Busan());
		map.add(26, new Hawaii());
		map.add(27, new Lisbon());
		map.add(28, new GoldenCard28());
		map.add(29, new Madrid());
		map.add(30, new DonateWelfare());
		map.add(31, new Tokyo());
		map.add(32, new Columbia());
		map.add(33, new Paris());
		map.add(34, new Rome());
		map.add(35, new GoldenCard35());
		map.add(36, new London());
		map.add(37, new NewYork());
		map.add(38, new ReceiveWelfare());
		map.add(39, new Seoul());

	}

	public static void setCitiesArr() { // 부동산 소유정보 배열, 장부 배열 초기화

		for (int i = 0; i < citiesAndAttractionsOwner.length; i++) {
			citiesAndAttractionsOwner[i] = 0;
			citiesAndAttractionsTheNumberOfArrival[i] = 0;
			citiesAndAttractionsCheckLand[i] = 0;
			citiesAndAttractionsCheckHouse[i] = 0;
			citiesAndAttractionsCheckConference[i] = 0;
			citiesAndAttractionsCheckHotel[i] = 0;
			realPropertyPriceOfLand[i] = 0;
			realPropertyPriceOfHouse[i] = 0;
			realPropertyPriceOfConference[i] = 0;
			realPropertyPriceOfHotel[i] = 0;
			realPropertySum[i] = 0;
		}
	}

	public void checkForCircumnavigation(int playerIdx, int sumOfDices) { // 플레이어가 1회전을 했는지 여부 확인
		// 플레이어가 맵을 순환할 수 있게하는 메소드

		int remainder; // 두 주사위를 굴려 나온 수의 합과 현재 플레이어의 위치 값의 합(sumOfDices + mapIdxOfPlayer)이
						// map 크기를 넘어설 때(Map.map.size()) 시작(start) 점을 지나서 더 가야할 값
		int mapIdxOfPlayer = Player.playerList.get(playerIdx).getmapIdxOfPlayer();
		int tempMove = mapIdxOfPlayer + sumOfDices;
		int move;
		int theNumberOfTravel = Player.playerList.get(playerIdx).getTheNumberOfTravel();

		if (tempMove >= BlueMarbleMap.map.size()) { // 주사위를 굴려서 나온 수의 합과 현재 플레이어의 위치 값을 합해서 나온 수가 맵의 크기를 넘어설 때

			remainder = (mapIdxOfPlayer + sumOfDices) - BlueMarbleMap.map.size();

			move = remainder;

			theNumberOfTravel++;

			Player.playerList.get(playerIdx).setTheNumberOfTravel(theNumberOfTravel); // 월급을 위해 플레이어의 일주 횟수를 저장한다.(근데
																						// 필요가 없네?, 필요할지도 모르니 일단 저장)

			Bank.monthlyPayAfterCircumnavigation(playerIdx); // 월급

		} else { // 주사위를 굴려서 나온 수의 합과 현재 플레이어의 위치 값을 합해서 나온 수가 맵의 크기를 넘어서지 않을 때

			move = tempMove;

		}

		Player.playerList.get(playerIdx).setmapIdxOfPlayer(move);
		

	}

	public void checkForGoBackMove(int playerIdx, int goBackMove) { // 황금카드 에서 2칸 혹은 3칸 뒤로 이동이 나왔을 때 시작 지점 이전으로 이동시,
																	// 배열 범위를 초과(0 이하)하기 때문에 이를 조정해주기 위한 메소드

		int mapIdxOfPlayer = Player.playerList.get(playerIdx).getmapIdxOfPlayer();
		int remainder = goBackMove - mapIdxOfPlayer; // ex) 현재 플레이어의 위치(mapIdxOfPlayer) 값이 2, 뒤로 이동해야하는 칸 수가 3 일때, 2에서
														// 3을 빼서 나오는 값인 -1이 remainder
		int tempMove = mapIdxOfPlayer - goBackMove; // ex) 35-3 = 32(32), 2-3 = -1(39)
		int move;

		if (tempMove < 0) {
			move = BlueMarbleMap.map.size() - remainder;

		} else {
			move = tempMove;
		}

		Player.playerList.get(playerIdx).setmapIdxOfPlayer(move);

	}

	public void checkProgress() {

		String nameOfBlocks = null;
		String nameOfStart = BlueMarbleMap.map.get(0).getName(); // 출발
		String ownerName = null;
		int owner = 0;

		System.out.println("[BlueMarbleMap][checkProgress]게임진행확인\n");

		System.out.printf("[%d.%s]", 0, nameOfStart);
		for (int i = 1; i < BlueMarbleMap.map.size(); i++) {

			owner = BlueMarbleMap.citiesAndAttractionsOwner[i];
			nameOfBlocks = BlueMarbleMap.map.get(i).getName();

			if (owner == 1) {
				ownerName = Player.playerList.get(1).getName();
			} else if (owner == 2) {
				ownerName = Player.playerList.get(2).getName();
			} else if (owner == 3) {
				ownerName = Player.playerList.get(3).getName();
			} else if (owner == 4) {
				ownerName = Player.playerList.get(4).getName();
			} else if (owner == 0) {
				ownerName = "소유주없음";
			}

			if (i % 10 != 0) {
				System.out.printf("[%d.%s-%s]", i, nameOfBlocks, ownerName);
			} else if (i % 10 == 0) {
				System.out.printf("[%d.%s-%s]", i, nameOfBlocks, ownerName);
				System.out.println();
			}

		}
		System.out.println();

	}

}
