package blueMarble;

public abstract class Events { // City, Attraction, GoldenCard, Space, Inhabited, Welfare, Start 가 상속

	private int type; // 0-출발, 1-도시, 2-관광지, 3-황금카드, 4-우주여행, 5-무인도, 6-복지기금
	private String name;

	private String region;

	private int mapIdx;

	private int minX;
	private int maxX;
	private int minY;
	private int maxY;
	
	private int land;
	private int house;
	private int conference;
	private int hotel;

	private int PriceOfLand;
	private int PriceOfHouse;
	private int PriceOfConference;
	private int PriceOfHotel;

	private int tollOfLand;
	private int tollOfHouse;
	private int tollOfConference;
	private int tollOfHotel;

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
	
	public int getLand() {
		return land;
	}

	public void setLand(int land) {
		this.land = land;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public int getConference() {
		return conference;
	}

	public void setConference(int conference) {
		this.conference = conference;
	}

	public int getHotel() {
		return hotel;
	}

	public void setHotel(int hotel) {
		this.hotel = hotel;
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
