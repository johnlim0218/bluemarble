package blueMarble;

import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.Frame;
import GUI.PlayersSpirit;

public class Space extends Events { // 우주여행 - 콜롬비아호를 탈지 안 탈지를 선택할 수 있다. 콜롬비아호를 타면 다음 턴에 말판 위의 칸 중 원하는 곳에 갈 수 있다.
									// 다만, 콜롬비아호를 타게 되면 통행료를 내야한다. 통행료는 콜롬비아호를 구입한 사람에게 낸다. 만약 콜롬비아호 증서를
									// 가지고 있는 사람이 없을 경우, 통행료는 은행에 낸다. 자신이 콜롬비아호의 증서를 가지고 있거나 황금열쇠를 뽑아서
									// 콜롬비아호를 타는 경우엔 통행료가 면제된다.
									// + 우주여행 칸으로는 다시 날아갈 수 없다. 무한루프 꼼수를 방지하기 위함이다.
	// #32

	private int type = 4; // 4-우주여행
	private String name = "우주여행";
	private String region = "south";
	private int mapIdx = 10;

	private int minX = 5;
	private int maxX = 130;
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

	public void space(int playerIdx) {

		Scanner scan = new Scanner(System.in);
		String playerName = Player.playerList.get(playerIdx).getName();
		int command;
		String nameOfBlock = name;
		Columbia columbia = new Columbia();

		System.out.println("[Control][space][" + playerName + "][" + nameOfBlock + "]우주여행을 하시겠습니까?");
		System.out.println("[Control][space][" + playerName + "][" + nameOfBlock + "]1.네 2.아니오");

		String[] answers = { "네! 우주여행을 하겠습니다.", "아니오! 우주여행을 하지 않겠습니다." };
		command = JOptionPane.showOptionDialog(Frame.gameFrame,
				playerName + "님 우주여행을 하시겠습니까?\n 우주여행을 하면 어디로든 갈 수 있습니다.", "우주여행",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);
		
		if (command == 0) {
			System.out.println("[Control][space][" + playerName + "][" + nameOfBlock + "]우주여행을 위해 콜롬비아호로 이동합니다.");
			Player.playerList.get(playerIdx).setmapIdxOfPlayer(32);
			new PlayersSpirit().jump(playerIdx);
			columbia.travelForTheSpace(playerIdx);
		} else if (command == 1) {
			System.out.println("[Control][space][" + playerName + "][" + nameOfBlock + "]우주여행을하지 않았습니다.");
		}

	}

}
