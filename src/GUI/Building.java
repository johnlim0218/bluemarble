package GUI;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import blueMarble.BlueMarbleMap;

public class Building {

	private Image imgHouse = new ImageIcon(new GetImg().getHouseImg()).getImage();
	private Image imgCondo = new ImageIcon(new GetImg().getCondoImg()).getImage();
	private Image[] imgHotel = new GetImg().getHotelImg();

	public void screenDraw(Graphics2D g) {

		int minX;
		int maxX;
		int minY;
		int maxY;

		for (int i = 1; i < 10; i++) {
			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();

			if (BlueMarbleMap.citiesAndAttractionsCheckHotel[i] == 1) {
				g.drawImage(imgHotel[0], minX + 15, minY + 60, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckConference[i] == 1) {
				g.drawImage(imgCondo, minX + 15, minY + 60, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[i] == 1) {
				g.drawImage(imgHouse, minX + 15, minY + 60, null);
			}

		}

		////////////////////////////////////////////////////////////////////////

		for (int i = 11; i < 20; i++) {
			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();

			if (BlueMarbleMap.citiesAndAttractionsCheckHotel[i] == 1) {
				g.drawImage(imgHotel[1], minX + 35, minY + 15, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckConference[i] == 1) {
				g.drawImage(imgCondo, minX + 35, minY + 15, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[i] == 1) {
				g.drawImage(imgHouse, minX + 35, minY + 15, null);
			}

		}

		////////////////////////////////////////////////////////////////////////

		for (int i = 21; i < 30; i++) {
			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();

			if (BlueMarbleMap.citiesAndAttractionsCheckHotel[i] == 1) {
				g.drawImage(imgHotel[2], minX + 15, minY + 40, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckConference[i] == 1) {
				g.drawImage(imgCondo, minX + 15, minY + 40, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[i] == 1) {
				g.drawImage(imgHouse, minX + 15, minY + 40, null);
			}

		}

		////////////////////////////////////////////////////////////////////////

		for (int i = 31; i < 40; i++) {
			minX = BlueMarbleMap.map.get(i).getMinX();
			maxX = BlueMarbleMap.map.get(i).getMaxX();
			minY = BlueMarbleMap.map.get(i).getMinY();
			maxY = BlueMarbleMap.map.get(i).getMaxY();

			if (BlueMarbleMap.citiesAndAttractionsCheckHotel[i] == 1) {
				g.drawImage(imgHotel[3], minX + 55, minY + 10, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckConference[i] == 1) {
				g.drawImage(imgCondo, minX + 55, minY + 10, null);
			} else if (BlueMarbleMap.citiesAndAttractionsCheckHouse[i] == 1) {
				g.drawImage(imgHouse, minX + 55, minY + 10, null);
			}

		}

		////////////////////////////////////////////////////////////////////////
	}

}
