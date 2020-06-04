package blueMarble;

public class Welfare extends Events { // 사회복지기금
	// #30 지불
	// #38 회수

	private int type = 6; // 6-복지기금

	private String name;
	private String region;
	private int mapIdx;

	private int minX;
	private int maxX;
	private int minY;
	private int maxY;
	private int gap;

	public int getType() {
		return type;
	}

	public String getName() {
		return name;
	}

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

	public int getGap() {
		return gap;
	}

}

class DonateWelfare extends Welfare { // #30

	private String name = "사회복지기금 기부처";
	private String region = "north";
	private int mapIdx = 30;

	private int minX = 860;
	private int maxX = 980;
	private int minY = 5;
	private int maxY = 140;
	private int gap = 10;

	private int aDonation = 150000;
	public static int theTotalOfDonations;

	public String getName() {
		return name;
	}

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

	public int getGap() {
		return gap;
	}

	public int getADonation() {
		return aDonation;
	}

	public void donateWelfare(int playerIdx) { // 사회복지기금 기부처로 연결

		String playerName = Player.playerList.get(playerIdx).getName();
		String nameOfBlock = name;
		Player player = new Player();
		ReceiveWelfare receiveWelfare = new ReceiveWelfare();

		System.out.println("[Control][donateWelfare][" + playerName + "][" + nameOfBlock + "]사회복지기금기부처입니다."); // 사회복지기금
																												// 기부처에
																												// 도착한
																												// 플레이어는
																												// 사회복지기금으로
																												// 15만
																												// 원을
																												// 기부한다.
		int tempForTheTotalOfDonations = DonateWelfare.theTotalOfDonations;
	
		int aDonations = getADonation();
		
		int bankrup = new Player().checkBankrupt(playerIdx, 0, aDonations);
		if (bankrup == 0) {

			System.out.println("[DonateWelfare][donateWelfare]사회복지기금으로" + aDonations + "원 을 기부했습니다.");
			
			player.giveMoney(playerIdx, 0, aDonations);
						
			DonateWelfare.theTotalOfDonations = tempForTheTotalOfDonations + aDonations;
						
			System.out.println("[Welfare]적립금 : " + DonateWelfare.theTotalOfDonations);
		
		} else {
					
			DonateWelfare.theTotalOfDonations = tempForTheTotalOfDonations;
			
			System.out.println("[Welfare]적립금 : " + DonateWelfare.theTotalOfDonations);
			
		}
	}
}

class ReceiveWelfare extends Welfare { // #38

	private String name = "사회복지기금 수령처";
	private String region = "east";
	private int mapIdx = 38;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 690;
	private int maxY = 760;
	private int gap = 5;
	
	public String getName() {
		return name;
	}

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
	
	public void receiveWelfare(int playerIdx) {

		String playerName = Player.playerList.get(playerIdx).getName();
		String nameOfBlock = name;
		Player player = new Player();
				
		System.out.println("[Control][receiveWelfare][" + playerName + "][" + nameOfBlock + "]사회복지기금수령처입니다.");

		if (DonateWelfare.theTotalOfDonations == 0) {
			System.out.println("[ReceiveWelfare][receiveWelfare]받을 수 있는 사회복지기금이 없습니다.");
		} else if (DonateWelfare.theTotalOfDonations > 0) {
			System.out.println("[ReceiveWelfare][receiveWelfare]사회복지기금 " + DonateWelfare.theTotalOfDonations + "원을 수령했습니다.");
			player.takeMoney(0, playerIdx, DonateWelfare.theTotalOfDonations);
			DonateWelfare.theTotalOfDonations = 0;
		}
	}
}
