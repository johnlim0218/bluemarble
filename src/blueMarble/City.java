package blueMarble;

public class City extends Events {

	private int type = 1; // 1-도시

	private String name;
	private String region;
	private int mapIdx;

	private int minX;
	private int maxX;
	private int minY;
	private int maxY;

	private int PriceOfLand;
	private int PriceOfHouse;
	private int PriceOfConference;
	private int PriceOfHotel;

	private int tollOfLand;
	private int tollOfHouse;
	private int tollOfConference;
	private int tollOfHotel;

	private int toll; // 통행료 계산하는 메소드가 필요

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}

}

// 대지 별장 빌딩 호텔
class Taipei extends City { // #1 5만, 5만, 15만, 25만

	private String name = "타이베이";
	private String region = "south";
	private int mapIdx = 1;

	private int minX = 780;
	private int maxX = 850;
	private int minY = 840;
	private int maxY = 980;

	private int PriceOfLand = 50000;
	private int PriceOfHouse = 50000;
	private int PriceOfConference = 150000;
	private int PriceOfHotel = 250000;

	private int tollOfLand = 2000;
	private int tollOfHouse = 10000;
	private int tollOfConference = 90000;
	private int tollOfHotel = 250000;

	private int toll;

	public String getName() {
		return name;
	}

	public int getMapIdx() {
		return mapIdx;
	}

	public String getRegion() {
		return region;
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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}

}

class HongKong extends City { // #3 8만,

	private String name = "홍콩";
	private String region = "south";
	private int mapIdx = 3;

	private int minX = 620;
	private int maxX = 690;
	private int minY = 840;
	private int maxY = 980;

	private int PriceOfLand = 80000;
	private int PriceOfHouse = 50000;
	private int PriceOfConference = 150000;
	private int PriceOfHotel = 250000;

	private int tollOfLand = 4000;
	private int tollOfHouse = 20000;
	private int tollOfConference = 180000;
	private int tollOfHotel = 450000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Manila extends City { // #4

	private String name = "마닐라";
	private String region = "south";
	private int mapIdx = 4;

	private int minX = 540;
	private int maxX = 610;
	private int minY = 840;
	private int maxY = 980;

	private int PriceOfLand = 80000;
	private int PriceOfHouse = 50000;
	private int PriceOfConference = 150000;
	private int PriceOfHotel = 250000;

	private int tollOfLand = 4000;
	private int tollOfHouse = 20000;
	private int tollOfConference = 180000;
	private int tollOfHotel = 450000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Singapole extends City { // #6

	private String name = "싱가포르";
	private String region = "south";
	private int mapIdx = 6;

	private int minX = 380;
	private int maxX = 450;
	private int minY = 840;
	private int maxY = 980;

	private int PriceOfLand = 100000;
	private int PriceOfHouse = 50000;
	private int PriceOfConference = 150000;
	private int PriceOfHotel = 250000;

	private int tollOfLand = 6000;
	private int tollOfHouse = 30000;
	private int tollOfConference = 270000;
	private int tollOfHotel = 550000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Cairo extends City { // #8

	private String name = "카이로";
	private String region = "south";
	private int mapIdx = 8;

	private int minX = 220;
	private int maxX = 290;
	private int minY = 840;
	private int maxY = 980;

	private int PriceOfLand = 100000;
	private int PriceOfHouse = 50000;
	private int PriceOfConference = 150000;
	private int PriceOfHotel = 250000;

	private int tollOfLand = 6000;
	private int tollOfHouse = 30000;
	private int tollOfConference = 270000;
	private int tollOfHotel = 550000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Istanbul extends City { // #9

	private String name = "이스탄불";
	private String region = "south";
	private int mapIdx = 9;

	private int minX = 140;
	private int maxX = 210;
	private int minY = 840;
	private int maxY = 980;

	private int PriceOfLand = 120000;
	private int PriceOfHouse = 50000;
	private int PriceOfConference = 150000;
	private int PriceOfHotel = 250000;

	private int tollOfLand = 8000;
	private int tollOfHouse = 40000;
	private int tollOfConference = 300000;
	private int tollOfHotel = 600000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Athena extends City { // #11

	private String name = "아테네";
	private String region = "west";
	private int mapIdx = 11;

	private int minX = 10;
	private int maxX = 150;
	private int minY = 765;
	private int maxY = 835;

	private int PriceOfLand = 140000;
	private int PriceOfHouse = 100000;
	private int PriceOfConference = 300000;
	private int PriceOfHotel = 500000;

	private int tollOfLand = 10000;
	private int tollOfHouse = 50000;
	private int tollOfConference = 450000;
	private int tollOfHotel = 750000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Copenhagen extends City { // #13

	private String name = "코펜하겐";
	private String region = "west";
	private int mapIdx = 13;

	private int minX = 10;
	private int maxX = 150;
	private int minY = 610;
	private int maxY = 680;

	private int PriceOfLand = 160000;
	private int PriceOfHouse = 100000;
	private int PriceOfConference = 300000;
	private int PriceOfHotel = 500000;

	private int tollOfLand = 12000;
	private int tollOfHouse = 60000;
	private int tollOfConference = 500000;
	private int tollOfHotel = 900000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Stockholm extends City { // #14

	private String name = "스톡홀름";
	private String region = "west";
	private int mapIdx = 14;

	private int minX = 10;
	private int maxX = 150;
	private int minY = 535;
	private int maxY = 600;

	private int PriceOfLand = 160000;
	private int PriceOfHouse = 100000;
	private int PriceOfConference = 300000;
	private int PriceOfHotel = 500000;

	private int tollOfLand = 12000;
	private int tollOfHouse = 60000;
	private int tollOfConference = 500000;
	private int tollOfHotel = 900000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Zurich extends City { // #16

	private String name = "취리히";
	private String region = "west";
	private int mapIdx = 16;

	private int minX = 10;
	private int maxX = 150;
	private int minY = 375;
	private int maxY = 450;

	private int PriceOfLand = 180000;
	private int PriceOfHouse = 100000;
	private int PriceOfConference = 300000;
	private int PriceOfHotel = 500000;

	private int tollOfLand = 14000;
	private int tollOfHouse = 70000;
	private int tollOfConference = 500000;
	private int tollOfHotel = 950000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Berlin extends City { // #18

	private String name = "베를린";
	private String region = "west";
	private int mapIdx = 18;

	private int minX = 10;
	private int maxX = 150;
	private int minY = 215;
	private int maxY = 290;

	private int PriceOfLand = 180000;
	private int PriceOfHouse = 100000;
	private int PriceOfConference = 300000;
	private int PriceOfHotel = 500000;

	private int tollOfLand = 14000;
	private int tollOfHouse = 70000;
	private int tollOfConference = 500000;
	private int tollOfHotel = 950000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Montreal extends City { // #19

	private String name = "몬트리올";
	private String region = "west";
	private int mapIdx = 19;

	private int minX = 10;
	private int maxX = 150;
	private int minY = 140;
	private int maxY = 210;

	private int PriceOfLand = 200000;
	private int PriceOfHouse = 100000;
	private int PriceOfConference = 300000;
	private int PriceOfHotel = 500000;

	private int tollOfLand = 16000;
	private int tollOfHouse = 80000;
	private int tollOfConference = 550000;
	private int tollOfHotel = 1000000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class BuenosAires extends City { // #21

	private String name = "부에노스아이레스";
	private String region = "north";
	private int mapIdx = 21;

	private int minX = 145;
	private int maxX = 210;
	private int minY = 10;
	private int maxY = 140;

	private int PriceOfLand = 220000;
	private int PriceOfHouse = 150000;
	private int PriceOfConference = 450000;
	private int PriceOfHotel = 750000;

	private int tollOfLand = 18000;
	private int tollOfHouse = 90000;
	private int tollOfConference = 700000;
	private int tollOfHotel = 1050000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class SaoPaulo extends City { // #23

	private String name = "상파울루";
	private String region = "north";
	private int mapIdx = 23;

	private int minX = 300;
	private int maxX = 370;
	private int minY = 10;
	private int maxY = 140;

	private int PriceOfLand = 240000;
	private int PriceOfHouse = 150000;
	private int PriceOfConference = 450000;
	private int PriceOfHotel = 750000;

	private int tollOfLand = 20000;
	private int tollOfHouse = 100000;
	private int tollOfConference = 750000;
	private int tollOfHotel = 1100000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Sydney extends City { // #24

	private String name = "시드니";
	private String region = "north";
	private int mapIdx = 24;

	private int minX = 380;
	private int maxX = 450;
	private int minY = 10;
	private int maxY = 140;

	private int PriceOfLand = 240000;
	private int PriceOfHouse = 150000;
	private int PriceOfConference = 450000;
	private int PriceOfHotel = 750000;

	private int tollOfLand = 20000;
	private int tollOfHouse = 100000;
	private int tollOfConference = 750000;
	private int tollOfHotel = 1100000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Hawaii extends City { // #26

	private String name = "하와이";
	private String region = "north";
	private int mapIdx = 26;

	private int minX = 540;
	private int maxX = 610;
	private int minY = 10;
	private int maxY = 140;

	private int PriceOfLand = 260000;
	private int PriceOfHouse = 150000;
	private int PriceOfConference = 450000;
	private int PriceOfHotel = 750000;

	private int tollOfLand = 22000;
	private int tollOfHouse = 110000;
	private int tollOfConference = 800000;
	private int tollOfHotel = 1150000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Lisbon extends City { // #27

	private String name = "리스본";
	private String region = "north";
	private int mapIdx = 27;

	private int minX = 620;
	private int maxX = 685;
	private int minY = 10;
	private int maxY = 140;

	private int PriceOfLand = 260000;
	private int PriceOfHouse = 150000;
	private int PriceOfConference = 450000;
	private int PriceOfHotel = 750000;

	private int tollOfLand = 22000;
	private int tollOfHouse = 110000;
	private int tollOfConference = 800000;
	private int tollOfHotel = 1150000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Madrid extends City { // #29

	private String name = "마드리드";
	private String region = "north";
	private int mapIdx = 29;

	private int minX = 780;
	private int maxX = 850;
	private int minY = 10;
	private int maxY = 140;

	private int PriceOfLand = 280000;
	private int PriceOfHouse = 150000;
	private int PriceOfConference = 450000;
	private int PriceOfHotel = 750000;

	private int tollOfLand = 24000;
	private int tollOfHouse = 120000;
	private int tollOfConference = 850000;
	private int tollOfHotel = 1200000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Tokyo extends City { // #31

	private String name = "도쿄";
	private String region = "east";
	private int mapIdx = 31;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 155;
	private int maxY = 210;

	private int PriceOfLand = 300000;
	private int PriceOfHouse = 200000;
	private int PriceOfConference = 600000;
	private int PriceOfHotel = 1000000;

	private int tollOfLand = 26000;
	private int tollOfHouse = 130000;
	private int tollOfConference = 900000;
	private int tollOfHotel = 1270000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Paris extends City { // #33

	private String name = "파리";
	private String region = "east";
	private int mapIdx = 33;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 310;
	private int maxY = 370;

	private int PriceOfLand = 320000;
	private int PriceOfHouse = 200000;
	private int PriceOfConference = 600000;
	private int PriceOfHotel = 1000000;

	private int tollOfLand = 28000;
	private int tollOfHouse = 150000;
	private int tollOfConference = 1000000;
	private int tollOfHotel = 1400000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class Rome extends City { // #34

	private String name = "로마";
	private String region = "east";
	private int mapIdx = 34;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 385;
	private int maxY = 450;

	private int PriceOfLand = 320000;
	private int PriceOfHouse = 200000;
	private int PriceOfConference = 600000;
	private int PriceOfHotel = 1000000;

	private int tollOfLand = 28000;
	private int tollOfHouse = 150000;
	private int tollOfConference = 1000000;
	private int tollOfHotel = 1400000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class London extends City { // #36

	private String name = "런던";
	private String region = "east";
	private int mapIdx = 36;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 540;
	private int maxY = 600;

	private int PriceOfLand = 350000;
	private int PriceOfHouse = 200000;
	private int PriceOfConference = 600000;
	private int PriceOfHotel = 1000000;

	private int tollOfLand = 35000;
	private int tollOfHouse = 170000;
	private int tollOfConference = 1100000;
	private int tollOfHotel = 1500000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}

class NewYork extends City { // #37

	private String name = "뉴욕";
	private String region = "east";
	private int mapIdx = 37;

	private int minX = 850;
	private int maxX = 980;
	private int minY = 615;
	private int maxY = 680;

	private int PriceOfLand = 350000;
	private int PriceOfHouse = 200000;
	private int PriceOfConference = 600000;
	private int PriceOfHotel = 1000000;

	private int tollOfLand = 35000;
	private int tollOfHouse = 170000;
	private int tollOfConference = 1100000;
	private int tollOfHotel = 1500000;

	private int toll;

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

	public int getPriceOfHouse() {
		return PriceOfHouse;
	}

	public int getPriceOfConference() {
		return PriceOfConference;
	}

	public int getPriceOfHotel() {
		return PriceOfHotel;
	}

	public int getTollOfLand() {
		return tollOfLand;
	}

	public int getTollOfHouse() {
		return tollOfHouse;
	}

	public int getTollOfConference() {
		return tollOfConference;
	}

	public int getTollOfHotel() {
		return tollOfHotel;
	}
}
