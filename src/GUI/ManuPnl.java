package GUI;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ManuPnl extends JPanel {

	GetImg imgs = new GetImg();

	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon startIcon = new ImageIcon(new GetImg().getStartImg());
	private ImageIcon startOnMouseIcon = new ImageIcon(new GetImg().getStartOnMouseImg());
	private ImageIcon exitIcon = new ImageIcon(new GetImg().getExitImg());
	private ImageIcon exitOnMouseIcon = new ImageIcon(new GetImg().getExitOnMouseImg());

	private Image backGround = new ImageIcon(new GetImg().getStartMenuBackGroundImg()).getImage();

	private JButton btnStart = new JButton(startIcon);
	private JButton btnExit = new JButton(exitIcon);

	public ManuPnl() {

		setBounds(0, 0, GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		setLayout(null);
		btnStart.setBounds(1000, 600, 248, 61);
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setFocusPainted(false);
		btnStart.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnStart.setIcon(startOnMouseIcon);
				btnStart.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 마우스 포인터 변경
			}

			public void mouseExited(MouseEvent e) {
				btnStart.setIcon(startIcon);
				btnStart.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 마우스 포인터 변경
			}
		});
		btnStart.addActionListener(new StartEventHandler());

		// 종료하기 버튼

		btnExit.setBounds(1000, 700, 248, 61);
		btnExit.setBorderPainted(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setFocusPainted(false);
		btnExit.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				btnExit.setIcon(exitOnMouseIcon);
				btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 마우스 포인터 변경

			}

			public void mouseExited(MouseEvent e) {
				btnExit.setIcon(exitIcon);
				btnExit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 마우스 포인터 변경
			}
		});
		btnExit.addActionListener(new ExitEventHandler());

		add(btnStart);
		add(btnExit);

	}
 
	public void paint(Graphics g) {
		screenImage = createImage(GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 5, 5, null);
	}

	public void screenDraw(Graphics g) {
		
			g.drawImage(backGround, 0, 0, null);

			paintComponents(g);
			this.repaint();
		
	}
}
