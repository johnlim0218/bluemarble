package GUI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import blueMarble.BlueMarbleMap;

public class PlayersOccupyMark {

	public static ArrayList<Image> playerOccupyMarkSouth = new ArrayList<>();
	public static ArrayList<Image> playerOccupyMarkWest = new ArrayList<>();
	public static ArrayList<Image> playerOccupyMarkNorth = new ArrayList<>();
	public static ArrayList<Image> playerOccupyMarkEast = new ArrayList<>();

	PlayersOccupyMark() {

		playerOccupyMarkSouth = new GetImg().getPlayerOccupyMarkSouth(); // region south
		playerOccupyMarkWest = new GetImg().getPlayerOccupyMarkWest(); // region west
		playerOccupyMarkNorth = new GetImg().getPlayerOccupyMarkNorth(); // region north
		playerOccupyMarkEast = new GetImg().getPlayerOccupyMarkEast(); // region east

	}

	public void screenDraw(Graphics2D g) { // !! 좌표값 넣어줘야함
	
		int minX;
		int maxX;
		int minY;
		int maxY;
		
		for (int i = 1; i < 10; i++) {

			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();
			
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 1) {
				g.drawImage(playerOccupyMarkSouth.get(1), minX, minY+110, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 2) {
				g.drawImage(playerOccupyMarkSouth.get(2), minX, minY+110, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 3) {
				g.drawImage(playerOccupyMarkSouth.get(3), minX, minY+110, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 4) {
				g.drawImage(playerOccupyMarkSouth.get(4), minX, minY+110, null);
			}
		}

		for (int i = 11; i < 20; i++) {

			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();
			
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 1) {
				g.drawImage(playerOccupyMarkWest.get(1), minX, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 2) {
				g.drawImage(playerOccupyMarkWest.get(2), minX, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 3) {
				g.drawImage(playerOccupyMarkWest.get(3), minX, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 4) {
				g.drawImage(playerOccupyMarkWest.get(4), minX, minY, null);
			}
		}

		for (int i = 21; i < 30; i++) {

			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();
			
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 1) {
				g.drawImage(playerOccupyMarkNorth.get(1), minX, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 2) {
				g.drawImage(playerOccupyMarkNorth.get(2), minX, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 3) {
				g.drawImage(playerOccupyMarkNorth.get(3), minX, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 4) {
				g.drawImage(playerOccupyMarkNorth.get(4), minX, minY, null);
			}
		}

		for (int i = 31; i < 40; i++) {

			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();
			
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 1) {
				g.drawImage(playerOccupyMarkEast.get(1), minX+100, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 2) {
				g.drawImage(playerOccupyMarkEast.get(2), minX+100, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 3) {
				g.drawImage(playerOccupyMarkEast.get(3), minX+100, minY, null);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 4) {
				g.drawImage(playerOccupyMarkEast.get(4), minX+100, minY, null);
			}
		}

	}

}
