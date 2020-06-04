package blueMarble;

import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.Frame;
import GUI.GMain;
import GUI.GamePnl;

public class InhabitedIsland extends Events { // 무인도
	// #20

	private int type = 5; // 5-무인도
	private String name = "무인도";
	private String region = "west";
	private int mapIdx = 20;

	private int minX = 5;
	private int maxX = 130;
	private int minY = 5;
	private int maxY = 140;

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

	public void trappedOnTheInhabitedIsland(int playerIdx) {

		
		String playerName = Player.playerList.get(playerIdx).getName();
		int radioEscapingFromTheInhabitedIslandOfGoldenCard = Player.playerList.get(playerIdx)
				.getRadioEscapingFromTheInhabitedIslandOfGoldenCard();

		if (radioEscapingFromTheInhabitedIslandOfGoldenCard == 1) {
			System.out.println(
					"[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]무인도 탈출용 무전기를 가지고 있습니다.");
			System.out.println("[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]무전기를 사용하시겠습니까?");
			System.out.println("[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]1.네  2.아니오");

			String[] answers = { "네! 무전기를 사용하겠습니다.", "아니오! 무전기를 사용하지 않겠습니다." };
			int command = JOptionPane.showOptionDialog(Frame.gameFrame,
					"무인도 탈출 무전기를 사용하시겠습니까??\n현재 " + Player.playerList.get(playerIdx)
							.getRadioEscapingFromTheInhabitedIslandOfGoldenCard() + "개의 무전기를 소지하고 있습니다.",
					"무전기", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);

			if (command == 0) {
				System.out.println("[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]무전기를 사용했습니다.");
				Player.playerList.get(playerIdx).setTrappedOnTheInhabitedIsland(0);
			} else if (command == 1) {
				System.out.println("[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]무인도에 갖혔습니다.");
				System.out.println(
						"[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]3턴 간 차례가 돌아오지 않습니다.");

				JOptionPane.showMessageDialog(Frame.gameFrame, playerName + "님이 무인도에 갖혔습니다.\n3턴 간 차례가 돌아오지 않습니다.",
						"무인도", JOptionPane.INFORMATION_MESSAGE);
				Player.playerList.get(playerIdx).setChanceOfRollingDice(0);
				Player.playerList.get(playerIdx).setTrappedOnTheInhabitedIsland(2);
			}
		} else if (radioEscapingFromTheInhabitedIslandOfGoldenCard == 0) {
			System.out.println("[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]무인도에 갖혔습니다.");
			System.out.println("[InhabitedIsland][trappedOnTheInhabitedIsland][" + playerName + "]3턴 간 차례가 돌아오지 않습니다.");

			JOptionPane.showMessageDialog(Frame.gameFrame, playerName + "님이 무인도에 갖혔습니다.\n3턴 간 차례가 돌아오지 않습니다.", "무인도",
					JOptionPane.INFORMATION_MESSAGE);
			Player.playerList.get(playerIdx).setChanceOfRollingDice(0);
			Player.playerList.get(playerIdx).setTrappedOnTheInhabitedIsland(2);
		}

	}

	public void checkTrapped(int playerIdx) {

		String playerName = Player.playerList.get(playerIdx).getName();
		int trappedOnTheInhabitedIsland = Player.playerList.get(playerIdx).getTrappedOnTheInhabitedIsland();
		int diceA;
		int diceB;

		if (trappedOnTheInhabitedIsland >= 1) {

			Player.playerList.get(playerIdx).setTrappedOnTheInhabitedIsland(trappedOnTheInhabitedIsland);
			System.out.println("[InhabitedIsland][checkTrapped][" + playerName + "]무인도에 갇혀있습니다.");
			System.out.println("[InhabitedIsland][checkTrapped][" + playerName + "]남은 횟수 "
					+ Player.playerList.get(playerIdx).getTrappedOnTheInhabitedIsland());
			System.out.println("[InhabitedIsland][checkTrapped][" + playerName + "]주사위를 굴려 더블이 나오면 탈출할 수 있습니다.");
		
			GamePnl.trapped = true;

		} else if (trappedOnTheInhabitedIsland == 0) {
						
			GamePnl.trapped = false;
		}

	}

	public boolean escapeFrom(int playerIdx, int diceA, int diceB) {

		String playerName = Player.playerList.get(playerIdx).getName();
		int trappedOnTheInhabitedIsland = Player.playerList.get(playerIdx).getTrappedOnTheInhabitedIsland();
		boolean escape = true;
		
		if (diceA == diceB) {
			System.out.println("[InhabitedIsland][checkTrapped][" + playerName + "]더블!");
			System.out.println(
					"[InhabitedIsland][checkTrapped][" + playerName + "]" + diceA + "과(와) " + diceB + "가(이)나왔습니다.");
			System.out.println("[InhabitedIsland][checkTrapped][" + playerName + "]무인도 탈출 성공");
			Player.playerList.get(playerIdx).setTrappedOnTheInhabitedIsland(0);
			escape = true;
			return escape;
			
		} else if (diceA != diceB) {
			System.out.println("[InhabitedIsland][checkTrapped][" + playerName + "]무인도 탈출 실패");
			System.out.println(
					"[InhabitedIsland][checkTrapped][" + playerName + "]" + diceA + "과(와) " + diceB + "가(이)나왔습니다.");
			trappedOnTheInhabitedIsland--;
			Player.playerList.get(playerIdx).setTrappedOnTheInhabitedIsland(trappedOnTheInhabitedIsland);
			escape = false;
			return escape;

		}
		return escape;
		
		
		
	}

}
