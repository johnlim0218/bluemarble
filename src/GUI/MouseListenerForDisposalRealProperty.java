package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import blueMarble.BlueMarbleMap;
import blueMarble.Player;

public class MouseListenerForDisposalRealProperty implements MouseListener, Runnable {

	private boolean sell;

	public boolean getSell() {
		return sell;
	}

	public void setSell(boolean sell) {
		this.sell = sell;
	}

	@Override
	public void run() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int playerIdx = GMain.playerIdx;
		setSell(false);
		if (Player.playerList.get(playerIdx).getDisposal() == true) {

			System.out.println("[MouseListenerForDisposalRealProperty]" + playerIdx + " 작동");

			Random random = new Random();
			ArrayList<Integer> arrForPropertyList = new ArrayList<>();

			int mouseX = e.getX();
			int mouseY = e.getY();

			int minX;
			int maxX;
			int minY;
			int maxY;

			int command;
			int realPropertyPrice;
			int tempForProperty;
			String nameOfBlock;
			String playerName;

			for (int i = 0; i < 40; i++) {
				minX = BlueMarbleMap.map.get(i).getMinX();
				maxX = BlueMarbleMap.map.get(i).getMaxX();
				minY = BlueMarbleMap.map.get(i).getMinY();
				maxY = BlueMarbleMap.map.get(i).getMaxY();

				if (mouseX >= BlueMarbleMap.map.get(i).getMinX() && mouseX <= BlueMarbleMap.map.get(i).getMaxX()
						&& mouseY >= BlueMarbleMap.map.get(i).getMinY()
						&& mouseY <= BlueMarbleMap.map.get(i).getMaxY()) {

					if (BlueMarbleMap.citiesAndAttractionsOwner[i] == playerIdx) { // 클릭한 부동산이 본인 소유일 경우 매각 여부 확인
						realPropertyPrice = BlueMarbleMap.realPropertySum[i];
						nameOfBlock = BlueMarbleMap.map.get(i).getName();
						playerName = Player.playerList.get(playerIdx).getName();

						String[] answers = { "네! 매각하겠습니다.", "아니오! 매각하지 않겠습니다.", "랜덤매각" };

						command = JOptionPane.showOptionDialog(Frame.gameFrame,
								playerName + "님 소유의 " + nameOfBlock + "은 " + realPropertyPrice + "원 입니다.\n매각하시겠습니까?",
								"부동산 매각", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers,
								answers[0]);
						if (command == 0) {
							setSell(true);
							BlueMarbleMap.citiesAndAttractionsOwner[i] = 0;
							BlueMarbleMap.citiesAndAttractionsTheNumberOfArrival[i] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckLand[i] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckConference[i] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckHouse[i] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckHotel[i] = 0;

							BlueMarbleMap.realPropertyPriceOfLand[i] = 0;
							BlueMarbleMap.realPropertyPriceOfHouse[i] = 0;
							BlueMarbleMap.realPropertyPriceOfConference[i] = 0;
							BlueMarbleMap.realPropertyPriceOfHotel[i] = 0;
							BlueMarbleMap.realPropertySum[i] = 0;

							tempForProperty = Player.playerList.get(playerIdx).getProperty();
							Player.playerList.get(playerIdx).setProperty(0);
							Player.playerList.get(playerIdx).setProperty(tempForProperty + realPropertyPrice);

						} else if (command == 1) {

						} else if (command == 2) { // 랜덤 매각
							setSell(true);
							for (int j = 0; j < 40; j++) {
								if (BlueMarbleMap.citiesAndAttractionsOwner[j] == playerIdx) {
									arrForPropertyList.add(j);
								}
							}
							int[] arrForTemp = new int[arrForPropertyList.size()];
							for (int j = 0; j < arrForPropertyList.size(); j++) {
								arrForTemp[j] = arrForPropertyList.get(j);
							}

							int randomDisposal = arrForTemp[random.nextInt(arrForTemp.length)];

							BlueMarbleMap.citiesAndAttractionsOwner[randomDisposal] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckLand[randomDisposal] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckConference[randomDisposal] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckHouse[randomDisposal] = 0;
							BlueMarbleMap.citiesAndAttractionsCheckHotel[randomDisposal] = 0;

							tempForProperty = Player.playerList.get(playerIdx).getProperty();
							Player.playerList.get(playerIdx).setProperty(0);
							Player.playerList.get(playerIdx).setProperty(tempForProperty + realPropertyPrice);

							JOptionPane.showMessageDialog(Frame.gameFrame,
									BlueMarbleMap.map.get(randomDisposal).getName() + "을 매각하고 "
											+ BlueMarbleMap.realPropertySum[randomDisposal] + "원을 받았습니다.",
									"랜덤 매각", JOptionPane.INFORMATION_MESSAGE);

						}
					}

				}
			}

			if (getSell() == true) {
				setSell(false);
				int tempExpense = Player.playerList.get(GMain.playerIdx).getTempForGiveMoney();
				int tempSender = Player.playerList.get(GMain.playerIdx).getTempForSender();
				int tempReceiver = Player.playerList.get(GMain.playerIdx).getTempForReceiver();

				System.out.println("[MouseListenerForDisposalRealProperty]tempExpense " + tempExpense);
				System.out.println("[MouseListenerForDisposalRealProperty]tempSender " + tempSender);
				System.out.println("[MouseListenerForDisposalRealProperty]tempReceiver " + tempReceiver);

				new Player().giveMoney(tempSender, tempReceiver, tempExpense);
				new Player().takeMoney(tempSender, tempReceiver, tempExpense);

				new Player().turnPlayer(playerIdx);
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
