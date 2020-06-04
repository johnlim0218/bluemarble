package GUI;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import blueMarble.Player;

public class GetImg {

	public BufferedImage getTheEarthImg() {
		BufferedImage theEarthImg = null;
		try {
			theEarthImg = ImageIO.read(new File("src\\source\\menu\\theEarth.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return theEarthImg;
	}

	public BufferedImage getStartMenuBackGroundImg() {
		BufferedImage startMenuBackGroundImg = null;
		try {
			startMenuBackGroundImg = ImageIO.read(new File("src\\source\\menu\\startMenuBackGround.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return startMenuBackGroundImg;
	}

	public BufferedImage getStartImg() {
		BufferedImage startImg = null;
		try {
			startImg = ImageIO.read(new File("src\\source\\menu\\startInit.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return startImg;
	}

	public BufferedImage getStartOnMouseImg() {
		BufferedImage startOnMouseImg = null;
		try {
			startOnMouseImg = ImageIO.read(new File("src\\source\\menu\\startOnMouse.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return startOnMouseImg;
	}

	public BufferedImage getExitImg() {
		BufferedImage exitImg = null;
		try {
			exitImg = ImageIO.read(new File("src\\source\\menu\\exitInit.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return exitImg;
	}

	public BufferedImage getExitOnMouseImg() {
		BufferedImage exitOnMouseImg = null;
		try {
			exitOnMouseImg = ImageIO.read(new File("src\\source\\menu\\exitOnMouse.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return exitOnMouseImg;
	}

	public BufferedImage getPlayer1SouthEastImg() {
		BufferedImage player1SouthEastImg = null;
		try {
			player1SouthEastImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player1SouthEast.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player1SouthEastImg;

	}

	public BufferedImage getPlayer1NorthWestImg() {
		BufferedImage player1NorthWestImg = null;
		try {
			player1NorthWestImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player1NorthWest.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player1NorthWestImg;

	}

	public BufferedImage getPlayer2SouthEastImg() {
		BufferedImage player2SouthEastImg = null;
		try {
			player2SouthEastImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player2SouthEast.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player2SouthEastImg;

	}

	public BufferedImage getPlayer2NorthWestImg() {
		BufferedImage player2NorthWestImg = null;
		try {
			player2NorthWestImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player2NorthWest.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player2NorthWestImg;

	}

	public BufferedImage getPlayer3SouthEastImg() {
		BufferedImage player3SouthEastImg = null;
		try {
			player3SouthEastImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player3SouthEast.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player3SouthEastImg;

	}

	public BufferedImage getPlayer3NorthWestImg() {
		BufferedImage player3NorthWestImg = null;
		try {
			player3NorthWestImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player3NorthWest.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player3NorthWestImg;

	}

	public BufferedImage getPlayer4SouthEastImg() {
		BufferedImage player4SouthEastImg = null;
		try {
			player4SouthEastImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player4SouthEast.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player4SouthEastImg;
	}

	public BufferedImage getPlayer4NorthWestImg() {
		BufferedImage player4NorthWestImg = null;
		try {
			player4NorthWestImg = ImageIO.read(new File("src\\source\\PlayersSpirit\\Player4NorthWest.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return player4NorthWestImg;

	}

	public ArrayList<Image> getPlayerOccupyMarkSouth() {
		ArrayList<Image> playerOccupyMarkSouth = new ArrayList<>();
		int playerMaxIdx = Player.playerList.size();
		try {
			playerOccupyMarkSouth.add(0, ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player0.png")));
			for (int i = 1; i < playerMaxIdx; i++) {
				playerOccupyMarkSouth.add(i,
						ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player" + i + "_01_09.png")));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return playerOccupyMarkSouth;
	}

	public ArrayList<Image> getPlayerOccupyMarkWest() {
		ArrayList<Image> playerOccupyMarkWest = new ArrayList<>();
		int playerMaxIdx = Player.playerList.size();
		try {
			playerOccupyMarkWest.add(0, ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player0.png")));
			for (int i = 1; i < playerMaxIdx; i++) {
				playerOccupyMarkWest.add(i,
						ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player" + i + "_11_19.png")));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return playerOccupyMarkWest;
	}

	public ArrayList<Image> getPlayerOccupyMarkNorth() {
		ArrayList<Image> playerOccupyMarkNorth = new ArrayList<>();
		int playerMaxIdx = Player.playerList.size();
		try {
			playerOccupyMarkNorth.add(0, ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player0.png")));
			for (int i = 1; i < playerMaxIdx; i++) {
				playerOccupyMarkNorth.add(i,
						ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player" + i + "_21_29.png")));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return playerOccupyMarkNorth;
	}

	public ArrayList<Image> getPlayerOccupyMarkEast() {
		ArrayList<Image> playerOccupyMarkEast = new ArrayList<>();
		int playerMaxIdx = Player.playerList.size();
		try {
			playerOccupyMarkEast.add(0, ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player0.png")));
			for (int i = 1; i < playerMaxIdx; i++) {
				playerOccupyMarkEast.add(i,
						ImageIO.read(new File("src\\source\\PlayerOccupyMark\\Player" + i + "_31_39.png")));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return playerOccupyMarkEast;
	}

	public BufferedImage getHouseImg() {
		BufferedImage houseImg = null;
		try {
			houseImg = ImageIO.read(new File("src\\source\\building\\house.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return houseImg;
	}

	public BufferedImage getCondoImg() {
		BufferedImage condoImg = null;
		try {
			condoImg = ImageIO.read(new File("src\\source\\building\\condo.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return condoImg;
	}

	public Image[] getHotelImg() {
		Image[] hotelImg = new Image[4];
		try {
			for (int i = 0; i < 4; i++) {
				hotelImg[i] = ImageIO.read(new File("src\\source\\building\\hotel" + i + ".png"));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return hotelImg;
	}

	public BufferedImage getMapImg() { // 게임판 이미지 로더
		BufferedImage mapImg = null;
		try {
			mapImg = ImageIO.read(new File("src\\source\\BlueMarbleMap.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return mapImg;

	}

	public Image[] getLandCard() {
		Image[] landCard = new Image[40];
		try {

			for (int i = 0; i < 40; i++) {
				landCard[i] = ImageIO.read(new File("src\\source\\card\\" + i + ".png"));
			}

		} catch (IOException e) {
			System.exit(0);
		}

		return landCard;
	}

	public BufferedImage getStatusImg() { // 상태창 이미지 로더
		BufferedImage statusImg = null;
		int playerMaxIdx = Player.playerList.size();
		try {
			if (playerMaxIdx == 5) {
				statusImg = ImageIO.read(new File("src\\source\\statusBoard\\4.png"));
			} else if (playerMaxIdx == 4) {
				statusImg = ImageIO.read(new File("src\\source\\statusBoard\\3.png"));
			} else if (playerMaxIdx == 3) {
				statusImg = ImageIO.read(new File("src\\source\\statusBoard\\2.png"));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return statusImg;
	}

	public BufferedImage getPlayerTurnImg() {
		BufferedImage playerTurnImg = null;
		try {
			playerTurnImg = ImageIO.read(new File("src\\source\\statusBoard\\playerTurn.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return playerTurnImg;
	}

	public BufferedImage getPlusMark() {
		BufferedImage plusMark = null;
		try {
			plusMark = ImageIO.read(new File("src\\source\\number\\plus.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return plusMark;
	}

	public BufferedImage getMinusMark() {
		BufferedImage minusMark = null;
		try {
			minusMark = ImageIO.read(new File("src\\source\\number\\minus.png"));
		} catch (IOException e) {
			System.exit(0);
		}
		return minusMark;
	}

	public Image[] getNumber() {
		Image[] number = new Image[10];
		try {
			for (int i = 0; i < 10; i++) {
				number[i] = ImageIO.read(new File("src\\source\\number\\" + i + ".png"));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return number;
	}

	public Image[] getCommaNumber() {
		Image[] commaNumber = new Image[10];
		try {
			for (int i = 0; i < 10; i++) {
				commaNumber[i] = ImageIO.read(new File("src\\source\\number\\comma\\" + i + ".png"));
			}
		} catch (IOException e) {
			System.exit(0);
		}
		return commaNumber;
	}

	public BufferedImage getDiceBoardImg() { // 주사위판 이미지 로더
		BufferedImage diceBoardImg = null;
		try {
			diceBoardImg = ImageIO.read(new File("src\\source\\diceBoard.jpg"));
		} catch (IOException e) {
			System.exit(0);
		}

		return diceBoardImg;
	}

	public BufferedImage getCastDiceButtonImg() { // 주사위던지기 이미지 로더
		BufferedImage castDiceButtonImg = null;
		try {
			castDiceButtonImg = ImageIO.read(new File("src\\source\\dice\\castDice.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return castDiceButtonImg;
	}

	public BufferedImage getCastDiceButtonOnMouseImg() {
		BufferedImage castDiceButtonOnMouseImg = null;
		try {
			castDiceButtonOnMouseImg = ImageIO.read(new File("src\\source\\dice\\castDiceOnMouse.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return castDiceButtonOnMouseImg;
	}

	public Image getCastingDiceGif() {
		Image castingDiceGif = null;
		try {
			castingDiceGif = ImageIO.read(new File("src\\source\\dice\\castingdice.gif"));
		} catch (IOException e) {
			System.exit(0);
		}
		return castingDiceGif;
	}

	public BufferedImage getDice1Img() { // 주사위 1 이미지 로더
		BufferedImage dice1Img = null;
		try {
			dice1Img = ImageIO.read(new File("src\\source\\dice\\1.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return dice1Img;
	}

	public BufferedImage getDice2Img() { // 주사위 2 이미지 로더
		BufferedImage dice2Img = null;
		try {
			dice2Img = ImageIO.read(new File("src\\source\\dice\\2.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return dice2Img;
	}

	public BufferedImage getDice3Img() { // 주사위 3 이미지 로더
		BufferedImage dice3Img = null;
		try {
			dice3Img = ImageIO.read(new File("src\\source\\dice\\3.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return dice3Img;
	}

	public BufferedImage getDice4Img() { // 주사위 4 이미지 로더
		BufferedImage dice4Img = null;
		try {
			dice4Img = ImageIO.read(new File("src\\source\\dice\\4.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return dice4Img;
	}

	public BufferedImage getDice5Img() { // 주사위 5 이미지 로더
		BufferedImage dice5Img = null;
		try {
			dice5Img = ImageIO.read(new File("src\\source\\dice\\5.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return dice5Img;
	}

	public BufferedImage getDice6Img() { // 주사위 6 이미지 로더
		BufferedImage dice6Img = null;
		try {
			dice6Img = ImageIO.read(new File("src\\source\\dice\\6.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return dice6Img;
	}

	public BufferedImage getGoldenKeyOpenImg() {
		BufferedImage goldenKeyOpen = null;
		try {
			goldenKeyOpen = ImageIO.read(new File("src\\source\\goldenkey\\key.png"));
		} catch (IOException e) {
			System.exit(0);
		}

		return goldenKeyOpen;
	}

	public Image[] getGoldenKey() {
		Image[] goldenKey = new Image[28];
		try {

			for (int i = 0; i < goldenKey.length; i++) {
				goldenKey[i] = ImageIO.read(new File("src\\source\\goldenkey\\" + i + ".png"));
			}

		} catch (IOException e) {
			System.exit(0);
		}

		return goldenKey;
	}

}
