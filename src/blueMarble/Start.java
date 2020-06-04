package blueMarble;

public class Start extends Events { // 출발
	// #0

	private int start; 
	private int type = 0; // 0-출발
	private String name = "출발";
	
	private String region = "east";
	
	private int mapIdx;
	
	private int minX = 860;
	private int maxX = 980;
	private int minY = 840;
	private int maxY = 980;
		
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
	
	public void start() {

	}

}
