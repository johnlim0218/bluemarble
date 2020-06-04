package GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GoldenKeyCardFrame extends JFrame{
	
	GoldenKeyCard goldenKeyCard = new GoldenKeyCard();
	
	public GoldenKeyCardFrame(){
		
		add(goldenKeyCard);
		
		setBounds(1515, 700, 400, 250);
		setUndecorated(true);
		setLayout(null);
		setResizable(false);
		setFocusableWindowState(true);
		setFocusable(true);
		setAlwaysOnTop(false);
	}
}


public class GoldenKeyCard extends JPanel{

	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image[] goldenKey = new GetImg().getGoldenKey();
	private Image goldenKeyCardOpenImg = new GetImg().getGoldenKeyOpenImg();

	public static int randomNumForGoldenCard;

	public static boolean goldenKeyCardOpening = true;
	
	public GoldenKeyCard() {

		setBounds(0, 0, 400, 250);
		setLayout(null);
	}

	public void setVisibleGoldenCardVisible() {
		setVisible(true);
	}
	
	public void paint(Graphics g) {

		screenImage = createImage(400, 250);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D) screenGraphic);
		g.drawImage(screenImage, 0, 0, this);
	}


	public void screenDraw(Graphics2D g) {
		
		if (goldenKeyCardOpening == true) {
			g.drawImage(goldenKeyCardOpenImg, 0, 0, this);
		}
		if (goldenKeyCardOpening == false) {
		g.drawImage(goldenKey[randomNumForGoldenCard], 0, 0, this);
		}
		paintComponents(g);
		this.repaint();
	}


}
