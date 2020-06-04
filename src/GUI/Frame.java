package GUI;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import blueMarble.Player;

public class Frame {

	static public int flag = 0;
	static public JFrame gameFrame = new JFrame();
	static public JLayeredPane startMenuPane = new JLayeredPane();
	static public JLayeredPane gamePane = new JLayeredPane();
	
	
	public void setUpGameFrame() {
		
		ManuPnl startMenuPnl = new ManuPnl();
			
		startMenuPane.setLayout(null);
		startMenuPane.setBounds(0, 0, GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		startMenuPane.add(startMenuPnl);
		
		gameFrame.add(startMenuPane);
		
		gameFrame.setLayout(null);
		gameFrame.setBounds(0, 0, GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		gameFrame.setVisible(true);
		gameFrame.setResizable(false);
		gameFrame.setDefaultCloseOperation(gameFrame.EXIT_ON_CLOSE);

	}

	public void switchPnl() { // 메인 메뉴에서 본 게임으로 화면을 전환시키는 메소드
				
		GoldenKeyCardFrame goldenKeyCard = new GoldenKeyCardFrame();
		ManuPnl startMenuPnl = new ManuPnl();
		GamePnl gamePnl = new GamePnl();
//		CastingDice castingDice = new CastingDice();
		
		startMenuPnl.removeAll();
		startMenuPane.removeAll();
				
		gamePane.setLayout(null);
		gamePane.setBounds(0, 0, GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		
//		gamePane.add(castingDice);
		gamePane.add(gamePnl);
		
			
		gameFrame.setVisible(false);
		gameFrame.add(gamePane);
		gameFrame.setVisible(true);
		goldenKeyCard.setVisible(true);
		System.out.println("게임메뉴 pass");
	}
}
