package GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import blueMarble.BlueMarbleMap;

public class Card extends JFrame implements WindowListener{

	JFrame cardFrame;
	JLabel cardLabel;

	private Image[] card = new GetImg().getLandCard();
	private ImageIcon[] cardImageIcon;

	int mapIdx;

	Card(int mapIdx, int mouseX, int mouseY) {

		addWindowListener(this);
		cardImageIcon = new ImageIcon[40];
		for (int i = 0; i < 40; i++) {
			cardImageIcon[i] = new ImageIcon(card[i]);
		}
		cardLabel = new JLabel(cardImageIcon[mapIdx]);
		cardLabel.setLayout(null);
		cardLabel.setBounds(0, 0, 300, 400);
			
		add(cardLabel);
		setUndecorated(true);
	
		setLayout(null);
		
		if(BlueMarbleMap.map.get(mapIdx).getRegion().equals("south")) {
		setBounds(mouseX, mouseY-300, 300, 400);
		} else if(BlueMarbleMap.map.get(mapIdx).getRegion().equals("north")) {
			setBounds(mouseX, mouseY, 300, 400);
		} else {
			setBounds(mouseX, mouseY-150, 300, 400);
		}
		
		setResizable(true);
		setVisible(true);

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		removeAll();
		setVisible(false);
		
	}

}
