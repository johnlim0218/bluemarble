package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import blueMarble.BlueMarbleMap;
import blueMarble.Player;

public class StartMenuEventHandler {

}

class StartEventHandler implements ActionListener {

	Frame gFrame = new Frame();

	@Override
	public void actionPerformed(ActionEvent e) {

		String inputPlayerMaxIdx = JOptionPane.showInputDialog(Frame.gameFrame, "참가할 플레이어의 수를 입력하세요", "플레이어 수",
				JOptionPane.QUESTION_MESSAGE);
		int playerMaxIdx = Integer.parseInt(inputPlayerMaxIdx);

		if (playerMaxIdx > 4) {
			System.exit(0);
		} else if (playerMaxIdx < 2) {
			System.exit(0);
		}

		Player player = new Player();
		player.setPlayerMaxIdx(playerMaxIdx);
		int getPlayerMaxIdx = player.getPlayerMaxIdx();

		Player.playerList.add(0, player);

		// 플레이어 생성 반복문
		for (int playerIdx = 1; playerIdx < getPlayerMaxIdx + 1; playerIdx++) {
			String playerName = JOptionPane.showInputDialog(Frame.gameFrame, "플레이어" + playerIdx + "의 이름을 입력해주세요",
					"플레이어" + playerIdx + "의 이름", JOptionPane.QUESTION_MESSAGE);

			player = new Player();

			if (playerMaxIdx == 4 || playerMaxIdx == 3) {
				player.setProperty(GMain.startingMoneyForFourThree);
				player.setTotalProperty(GMain.startingMoneyForFourThree);
			} else if (playerMaxIdx == 2) {
				player.setProperty(GMain.startingMoneyForTwo);
				player.setTotalProperty(GMain.startingMoneyForFourThree);
			}
			
			player.setName(playerName); // 플레이어 이름 확정
			player.setTheNumberOfTravel(0); // 맵 순환 횟수
			player.setTrappedOnTheInhabitedIsland(0); // 무인도에 갇히지 않은 상태
			player.setmapIdxOfPlayer(0); // 출발
			player.setBankrupt(false);
			player.setSpaceTravel(false);

			Player.playerList.add(playerIdx, player);

			System.out.println("[Player][createPlayer]플레이어" + playerIdx + "의 이름은 "
					+ Player.playerList.get(playerIdx).getName() + "입니다.");
		}
		BlueMarbleMap.mapInitial();

		new GamePnl().initPlayersSpirit();

		new Frame().switchPnl(); // 화면 전환

	}

}

class ExitEventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);

	}

}
