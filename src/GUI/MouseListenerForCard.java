package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import blueMarble.BlueMarbleMap;
import blueMarble.Player;

public class MouseListenerForCard implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		int playerIdx = GMain.playerIdx;
		
		if (Player.playerList.get(playerIdx).getSpaceTravel() == false && Player.playerList.get(playerIdx).getDisposal() == false) { // 우주여행을 통해 플레이어가 이동을 원하는 칸을 선택할 때는 정보 카드가 뜨지 않도록 함

			int mouseX = e.getX();
			int mouseY = e.getY();

			int minX;
			int maxX;
			int minY;
			int maxY;

			Card card;

			for (int i = 0; i < 40; i++) {
				minX = BlueMarbleMap.map.get(i).getMinX();
				maxX = BlueMarbleMap.map.get(i).getMaxX();
				minY = BlueMarbleMap.map.get(i).getMinY();
				maxY = BlueMarbleMap.map.get(i).getMaxY();
				if (mouseX >= BlueMarbleMap.map.get(i).getMinX() && mouseX <= BlueMarbleMap.map.get(i).getMaxX()
						&& mouseY >= BlueMarbleMap.map.get(i).getMinY()
						&& mouseY <= BlueMarbleMap.map.get(i).getMaxY()) {
					card = new Card(i, mouseX, mouseY);

				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
