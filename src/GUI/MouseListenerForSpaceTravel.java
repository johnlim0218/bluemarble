package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import blueMarble.BlueMarbleMap;
import blueMarble.Control;
import blueMarble.GoldenCard;
import blueMarble.Player;

public class MouseListenerForSpaceTravel implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		int playerIdx = GMain.playerIdx;

		if (Player.playerList.get(playerIdx).getSpaceTravel() == true) {
			
			int mouseX = e.getX();
			int mouseY = e.getY();

			int minX;
			int maxX;
			int minY;
			int maxY;

			for (int i = 0; i < 40; i++) {
				minX = BlueMarbleMap.map.get(i).getMinX();
				maxX = BlueMarbleMap.map.get(i).getMaxX();
				minY = BlueMarbleMap.map.get(i).getMinY();
				maxY = BlueMarbleMap.map.get(i).getMaxY();
				if (mouseX >= BlueMarbleMap.map.get(i).getMinX() && mouseX <= BlueMarbleMap.map.get(i).getMaxX()
						&& mouseY >= BlueMarbleMap.map.get(i).getMinY()
						&& mouseY <= BlueMarbleMap.map.get(i).getMaxY()) {

					Player.playerList.get(playerIdx).setmapIdxOfPlayer(i);
					
				}
			}
			
			Player.playerList.get(playerIdx).setSpaceTravel(false);
			
			new PlayersSpirit().jump(playerIdx);	
			
			new Control().eventsTrigger(playerIdx);

			new Player().turnPlayer(playerIdx);

		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		

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
