package GUI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CastingDice extends JPanel implements Runnable {

	private Image castingDice;
	private boolean visible = false;
	public CastingDice() {
		
		castingDice = new ImageIcon(new GetImg().getCastingDiceGif()).getImage();
		setBounds(100, 100, GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		setLayout(null);

	}

	public void screenDraw(Graphics2D g) {

		if (visible == true) {

			g.drawImage(castingDice, 200, 550, null);
			g.drawImage(castingDice, 525, 550, null);
		}
//			g.drawImage(castingDice, 0, 0, null);
//			g.drawImage(castingDice, 125, 550, null);

	}

	@Override
	public void run() {

		try {

			visible = true;

			Thread.sleep(2000);

			visible = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
