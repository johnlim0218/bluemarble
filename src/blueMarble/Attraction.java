package blueMarble;

import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.Frame;
import GUI.GamePnl;
import GUI.MouseListenerForSpaceTravel;

public class Attraction extends Events {

	private int type = 2; // 2-관광지

	private String name;
	private String region;
	private int mapIdx;

	private int minX;
	private int maxX;
	private int minY;
	private int maxY;

	private int PriceOfLand;
	private int tollOfLand;

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

	public int getPriceOfLand() {
		return PriceOfLand;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

}

class Jeju extends Attraction { // #5

	private String name = "제주도";
	private String region = "south";
	private int mapIdx = 5;

	private int minX = 460;
	private int maxX = 530;
	private int minY = 840;
	private int maxY = 980;

	private int PriceOfLand = 200000;
	private int tollOfLand = 300000;

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

	public int getPriceOfLand() {
		return PriceOfLand;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}
}

class Concord extends Attraction { // #15

	private String name = "콩코드 여객기"; // 구매가 20만 원, 통행료 30만 원.
	private String region = "west";
	private int mapIdx = 15;

	private int minX = 10;
	private int maxX = 150;
	private int minY = 455;
	private int maxY = 530;

	private int PriceOfLand = 200000;
	private int tollOfLand = 300000;

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

	public int getPriceOfLand() {
		return PriceOfLand;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public void concord() {

	}
}

class Busan extends Attraction { // #25

	private String name = "부산";
	private String region = "north";
	private int mapIdx = 25;

	private int minX = 460;
	private int maxX = 530;
	private int minY = 10;
	private int maxY = 140;

	private int PriceOfLand = 500000;
	private int tollOfLand = 600000;

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

	public int getPriceOfLand() {
		return PriceOfLand;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}
}

class Columbia extends Attraction { // #32

	private String name = "콜롬비아호"; // 구매가 45만 원, 우주여행료 20만 원, 통행료 40만 원
	private String region = "east";
	private int mapIdx = 32;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 230;
	private int maxY = 290;

	private int PriceOfLand = 450000;
	private int tollOfLand = 400000;

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

	public int getPriceOfLand() {
		return PriceOfLand;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public void travelForTheSpace(int playerIdx) { // 플레이어가 원하는 곳으로 이동할 수 있다
		

		JOptionPane.showMessageDialog(Frame.gameFrame,
				"목적지를 선택해주세요.", "콜롬비아호",
				JOptionPane.INFORMATION_MESSAGE);
		
						
		Player.playerList.get(playerIdx).setSpaceTravel(true);
				

	}
}

class Seoul extends Attraction { // #39

	private String name = "서울";
	private String region = "east";
	private int mapIdx = 39;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 765;
	private int maxY = 835;

	private int PriceOfLand = 1000000;
	private int tollOfLand = 2000000;

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

	public int getPriceOfLand() {
		return PriceOfLand;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

}