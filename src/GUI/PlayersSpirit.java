package GUI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import blueMarble.BlueMarbleMap;
import blueMarble.Control;
import blueMarble.InhabitedIsland;
import blueMarble.Player;

public class PlayersSpirit implements Runnable {

	static public ArrayList<PlayersSpirit> arrForPlayersSpirit = new ArrayList<>();

	private Image imgPlayer1SouthEast = new ImageIcon(new GetImg().getPlayer1SouthEastImg()).getImage();
	private Image imgPlayer1NorthWest = new ImageIcon(new GetImg().getPlayer1NorthWestImg()).getImage();

	private Image imgPlayer2SouthEast = new ImageIcon(new GetImg().getPlayer2SouthEastImg()).getImage();
	private Image imgPlayer2NorthWest = new ImageIcon(new GetImg().getPlayer2NorthWestImg()).getImage();

	private Image imgPlayer3SouthEast = new ImageIcon(new GetImg().getPlayer3SouthEastImg()).getImage();
	private Image imgPlayer3NorthWest = new ImageIcon(new GetImg().getPlayer3NorthWestImg()).getImage();

	private Image imgPlayer4SouthEast = new ImageIcon(new GetImg().getPlayer4SouthEastImg()).getImage();
	private Image imgPlayer4NorthWest = new ImageIcon(new GetImg().getPlayer4NorthWestImg()).getImage();

	private boolean southEast = true;
	private boolean northWest = false;

	private int maxNumPlayersSpirit;

	private int x;
	private int y;

	public PlayersSpirit() {

		this.maxNumPlayersSpirit = Player.playerList.size();

	}

	public int getMaxNumPlayersSpirit() {
		return maxNumPlayersSpirit;
	}

	public void setMaxNumPlayersSpirit(int maxNumPlayersSpirit) {
		this.maxNumPlayersSpirit = maxNumPlayersSpirit;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void screenDraw(Graphics2D g) {

		if (maxNumPlayersSpirit == 5) {
			if (PlayersSpirit.arrForPlayersSpirit.get(1).southEast) {
				g.drawImage(imgPlayer1SouthEast, PlayersSpirit.arrForPlayersSpirit.get(1).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(1).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(1).northWest) {
				g.drawImage(imgPlayer1NorthWest, PlayersSpirit.arrForPlayersSpirit.get(1).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(1).getY(), null);
			}

			if (PlayersSpirit.arrForPlayersSpirit.get(2).southEast) {
				g.drawImage(imgPlayer2SouthEast, PlayersSpirit.arrForPlayersSpirit.get(2).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(2).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(2).northWest) {
				g.drawImage(imgPlayer2NorthWest, PlayersSpirit.arrForPlayersSpirit.get(2).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(2).getY(), null);
			}

			if (PlayersSpirit.arrForPlayersSpirit.get(3).southEast) {
				g.drawImage(imgPlayer3SouthEast, PlayersSpirit.arrForPlayersSpirit.get(3).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(3).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(3).northWest) {
				g.drawImage(imgPlayer3NorthWest, PlayersSpirit.arrForPlayersSpirit.get(3).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(3).getY(), null);
			}

			if (PlayersSpirit.arrForPlayersSpirit.get(4).southEast) {
				g.drawImage(imgPlayer4SouthEast, PlayersSpirit.arrForPlayersSpirit.get(4).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(4).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(4).northWest) {
				g.drawImage(imgPlayer4NorthWest, PlayersSpirit.arrForPlayersSpirit.get(4).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(4).getY(), null);
			}

		} else if (maxNumPlayersSpirit == 4) {
			if (PlayersSpirit.arrForPlayersSpirit.get(1).southEast) {
				g.drawImage(imgPlayer1SouthEast, PlayersSpirit.arrForPlayersSpirit.get(1).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(1).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(1).northWest) {
				g.drawImage(imgPlayer1NorthWest, PlayersSpirit.arrForPlayersSpirit.get(1).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(1).getY(), null);
			}

			if (PlayersSpirit.arrForPlayersSpirit.get(2).southEast) {
				g.drawImage(imgPlayer2SouthEast, PlayersSpirit.arrForPlayersSpirit.get(2).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(2).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(2).northWest) {
				g.drawImage(imgPlayer2NorthWest, PlayersSpirit.arrForPlayersSpirit.get(2).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(2).getY(), null);
			}

			if (PlayersSpirit.arrForPlayersSpirit.get(3).southEast) {
				g.drawImage(imgPlayer3SouthEast, PlayersSpirit.arrForPlayersSpirit.get(3).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(3).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(3).northWest) {
				g.drawImage(imgPlayer3NorthWest, PlayersSpirit.arrForPlayersSpirit.get(3).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(3).getY(), null);
			}
		} else if (maxNumPlayersSpirit == 3) {
			if (PlayersSpirit.arrForPlayersSpirit.get(1).southEast) {
				g.drawImage(imgPlayer1SouthEast, PlayersSpirit.arrForPlayersSpirit.get(1).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(1).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(1).northWest) {
				g.drawImage(imgPlayer1NorthWest, PlayersSpirit.arrForPlayersSpirit.get(1).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(1).getY(), null);
			}

			if (PlayersSpirit.arrForPlayersSpirit.get(2).southEast) {
				g.drawImage(imgPlayer2SouthEast, PlayersSpirit.arrForPlayersSpirit.get(2).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(2).getY(), null);
			} else if (PlayersSpirit.arrForPlayersSpirit.get(2).northWest) {
				g.drawImage(imgPlayer2NorthWest, PlayersSpirit.arrForPlayersSpirit.get(2).getX(),
						PlayersSpirit.arrForPlayersSpirit.get(2).getY(), null);
			}
		}
	}

	public void jump(int playerIdx) { // 플레이어 말 강제이동 메소드

		int mapIdxOfPlayer = Player.playerList.get(playerIdx).getmapIdxOfPlayer();
		String region = BlueMarbleMap.map.get(mapIdxOfPlayer).getRegion();

		if (region.equals("south")) {
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setX(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinX());
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx)
					.setY(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinY() + 100);

		} else if (region.equals("west")) {
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setX(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinX());
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setY(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinY());

		} else if (region.equals("north")) {
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setX(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinX());
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setY(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinY());

		} else if (region.equals("east")) {
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setX(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinX() + 60);
			PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setY(BlueMarbleMap.map.get(mapIdxOfPlayer).getMinY() + 30);

		}

	}

	public void moveSouth(int playerIdx) { // 남부 지역 이동 (0 - 10)

		// 말의 현재위치에서 1픽셀 씩 이동
		int x = PlayersSpirit.arrForPlayersSpirit.get(playerIdx).getX() - 1;

		PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setX(x);

	}

	public void moveWest(int playerIdx) { // 서부 지역 이동 (11 - 19)

		int y = PlayersSpirit.arrForPlayersSpirit.get(playerIdx).getY() - 1;

		PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setY(y);

	}

	public void moveNorth(int playerIdx) { // 북부 지역 이동 (20 - 30)

		int x = PlayersSpirit.arrForPlayersSpirit.get(playerIdx).getX() + 1;

		PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setX(x);

	}

	public void moveEast(int playerIdx) { // 동부 지역 이동 (31 - 39)

		int y = PlayersSpirit.arrForPlayersSpirit.get(playerIdx).getY() + 1;

		PlayersSpirit.arrForPlayersSpirit.get(playerIdx).setY(y);

	}

	@Override
	public void run() {

		int playerIdx = GMain.playerIdx;

		int diceA = new GamePnl().getDiceA();
		int diceB = new GamePnl().getDiceB();
		int theNumberOfMoveBlocks = diceA + diceB;

		int playersCurrentXPixelMin;
		int playersCurrentXPixelMax;
		int playersCurrentYPixelMin;
		int playersCurrentYPixelMax;
		int minX;
		int maxX;
		int minY;
		int maxY;

		String region = "";

		if (GamePnl.trapped == false) {

			// 주사위를 굴리기 전 말의 위치
			int startMapIdxOfPlayer = Player.playerList.get(playerIdx).getmapIdxOfPlayer();
			System.out.println("[PlayersSpirit][run]출발지 " + BlueMarbleMap.map.get(startMapIdxOfPlayer).getName());

			new Player().movePlayer(playerIdx, diceA, diceB);
			new Player().sumOfTotalProperty();

			// 주사위를 굴린 후의 말의 위치
			int desMapIdxOfPlayer = Player.playerList.get(playerIdx).getmapIdxOfPlayer();
			System.out.println("[PlayersSpirit][run]도착지 " + BlueMarbleMap.map.get(desMapIdxOfPlayer).getName());

			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////////////////////

			try {

				Thread.sleep(400);
				// 이중 for문 ->
				// 바깥 for문은 이동해야하는 칸의 수를 세기위한 for문
				// 안쪽 for문은 블록마다 말이 이동해야하는 픽셀용 for문

				for (int i = 1; i <= theNumberOfMoveBlocks + 1; i++) {
					if (startMapIdxOfPlayer == 40) {
						startMapIdxOfPlayer = 0;
					}
					System.out.println("[PlayersSplirit][run]" + BlueMarbleMap.map.get(startMapIdxOfPlayer).getName()
							+ "(를)을 지나가고 있습니다.");
					playersCurrentXPixelMin = PlayersSpirit.arrForPlayersSpirit.get(playerIdx).getX();
					playersCurrentXPixelMax = playersCurrentXPixelMin + 65;
					playersCurrentYPixelMin = PlayersSpirit.arrForPlayersSpirit.get(playerIdx).getY();
					playersCurrentYPixelMax = playersCurrentYPixelMin + 38;

					minX = BlueMarbleMap.map.get(startMapIdxOfPlayer).getMinX();
					maxX = BlueMarbleMap.map.get(startMapIdxOfPlayer).getMaxX();
					minY = BlueMarbleMap.map.get(startMapIdxOfPlayer).getMinY();
					maxY = BlueMarbleMap.map.get(startMapIdxOfPlayer).getMaxY();
					region = BlueMarbleMap.map.get(startMapIdxOfPlayer).getRegion();

					if (region.equals("south")) {
						for (int j = playersCurrentXPixelMin; j > minX; j--) { // i가 1 일 때 1픽셀 이동
							Thread.sleep(3);
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).northWest = false;
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).southEast = true;
							moveSouth(playerIdx);
						}
					} else if (region.equals("west")) {
						for (int j = playersCurrentYPixelMin; j > minY; j--) { // i가 1 일 때 1픽셀 이동
							Thread.sleep(3);
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).southEast = false;
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).northWest = true;
							moveWest(playerIdx);
						}
					} else if (region.equals("north")) {
						for (int j = playersCurrentXPixelMax; j < maxX; j++) { // i가 1 일 때 1픽셀 이동
							Thread.sleep(3);
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).southEast = false;
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).northWest = true;
							moveNorth(playerIdx);
						}
					} else if (region.equals("east")) {
						for (int j = playersCurrentYPixelMax; j < maxY; j++) { // i가 1 일 때 1픽셀 이동
							Thread.sleep(3);
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).northWest = false;
							PlayersSpirit.arrForPlayersSpirit.get(playerIdx).southEast = true;
							moveEast(playerIdx);
						}
					}

					startMapIdxOfPlayer++; // 플레이어의 말이 지나간 자리를 확인하기 위해 말이 출발한 지점부터 도착 지점까지 mapIdx를 1씩 증가시킴

				}

				new Control().eventsTrigger(playerIdx);

				Thread.sleep(1500);

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (GamePnl.trapped == true) {

			new InhabitedIsland().escapeFrom(playerIdx, diceA, diceB);

		}

		new Player().turnPlayer(playerIdx);

		GamePnl.trapped = false;

	}
}
