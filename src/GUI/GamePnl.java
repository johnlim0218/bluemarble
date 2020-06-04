package GUI;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import blueMarble.Dice;
import blueMarble.InhabitedIsland;
import blueMarble.Player;

public class GamePnl extends JPanel {

	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon castDiceIcon = new ImageIcon(new GetImg().getCastDiceButtonImg());
	private ImageIcon castDiceOnMouseIcon = new ImageIcon(new GetImg().getCastDiceButtonOnMouseImg());

	private ImageIcon dice1 = new ImageIcon(new GetImg().getDice1Img());
	private ImageIcon dice2 = new ImageIcon(new GetImg().getDice2Img());
	private ImageIcon dice3 = new ImageIcon(new GetImg().getDice3Img());
	private ImageIcon dice4 = new ImageIcon(new GetImg().getDice4Img());
	private ImageIcon dice5 = new ImageIcon(new GetImg().getDice5Img());
	private ImageIcon dice6 = new ImageIcon(new GetImg().getDice6Img());

	private Image blueMarbleMap = new ImageIcon(new GetImg().getMapImg()).getImage();
	private Image diceBoard = new ImageIcon(new GetImg().getDiceBoardImg()).getImage();
	private Image statusBoard = new ImageIcon(new GetImg().getStatusImg()).getImage();
	private Image playerTurn = new ImageIcon(new GetImg().getPlayerTurnImg()).getImage();

	private JButton btnCastDice;
	private JButton diceAinit;
	private JButton diceBinit;
	private JButton diceAAfterCast;
	private JButton diceBAfterCast;

	private int playerIdx;

	public static int diceA;
	public static int diceB;

	public static boolean pleaseWait = false;
	public static boolean trapped = false;

	public GamePnl() {

//		Player.playerList.get(1).setSpaceTravel(true);
//		Player.playerList.get(2).setSpaceTravel(true);
//		Player.playerList.get(3).setSpaceTravel(true);
//		Player.playerList.get(4).setSpaceTravel(true);
		
		playerIdx = GMain.playerIdx;
		
		setBounds(0, 0, GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		setLayout(null);

		addMouseListener(new MouseListenerForCard());

		addMouseListener(new MouseListenerForSpaceTravel());

		addMouseListener(new MouseListenerForDisposalRealProperty());

		castDiceButton();
		initDice();
		
		
		new InhabitedIsland().checkTrapped(playerIdx);
				
	}

	public void initDice() {

		diceAinit = new JButton(dice1);
		diceBinit = new JButton(dice1);

		diceAinit.setBounds(400, 550, dice1.getIconWidth(), dice1.getIconHeight());
		diceBinit.setBounds(525, 550, dice1.getIconWidth(), dice1.getIconHeight());

		diceAinit.setVisible(true);
		diceBinit.setVisible(true);

		diceAinit.setBorderPainted(false);
		diceAinit.setContentAreaFilled(false);
		diceAinit.setFocusPainted(false);
		diceBinit.setBorderPainted(false);
		diceBinit.setContentAreaFilled(false);
		diceBinit.setFocusPainted(false);

		diceAAfterCast = new JButton();
		diceBAfterCast = new JButton();

		diceAAfterCast.setBounds(400, 550, dice1.getIconWidth(), dice1.getIconHeight());
		diceBAfterCast.setBounds(525, 550, dice1.getIconWidth(), dice1.getIconHeight());

		diceAAfterCast.setVisible(false);
		diceBAfterCast.setVisible(false);

		diceAAfterCast.setBorderPainted(false);
		diceAAfterCast.setContentAreaFilled(false);
		diceAAfterCast.setFocusPainted(false);
		diceBAfterCast.setBorderPainted(false);
		diceBAfterCast.setContentAreaFilled(false);
		diceBAfterCast.setFocusPainted(false);

		add(diceAinit);
		add(diceBinit);

		add(diceAAfterCast);
		add(diceBAfterCast);

	}

	public void castDiceButton() {

		btnCastDice = new JButton(castDiceIcon);

		btnCastDice.setBounds(430, 675, 177, 96);
		btnCastDice.setBorderPainted(false);
		btnCastDice.setContentAreaFilled(false);
		btnCastDice.setFocusPainted(false);
		btnCastDice.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnCastDice.setIcon(castDiceOnMouseIcon);
				btnCastDice.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 마우스 포인터 변경
			}

			public void mouseExited(MouseEvent e) {
				btnCastDice.setIcon(castDiceIcon);
				btnCastDice.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 마우스 포인터 변경
			}
		});

		btnCastDice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (pleaseWait == false) {
					
					GoldenKeyCard.goldenKeyCardOpening = true;
					
					pleaseWait = true;
					
					diceAinit.setVisible(false);
					diceBinit.setVisible(false);
																		
					diceA = Dice.diceA();
					diceB = Dice.diceB();
					
//					diceA = 5;
//					diceB = 5;
					
//					diceA = 3;
//					diceB = 4;

					setDiceA(diceA);
					setDiceB(diceB);

					setDiceAForPrint(diceA);
					setDiceBForPrint(diceB);

					for(int i = 1; i < Player.playerList.size(); i++) {
						Player.playerList.get(i).setTempForGiveMoney(0);
						Player.playerList.get(i).setTempForTakeMoney(0);
					}
					
					PlayersSpirit ps = new PlayersSpirit();
					Thread thForPlayersSpirit = new Thread(ps);

					thForPlayersSpirit.start();
										
				}
			}
		});

		add(btnCastDice);
	}

	public void paint(Graphics g) {

		screenImage = createImage(GMain.SCREEN_WIDTH, GMain.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D) screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics2D g) {

		g.drawImage(diceBoard, 165, 165, null);
		g.drawImage(statusBoard, 985, 5, null);
		g.drawImage(blueMarbleMap, 5, 5, null);

		if(GMain.playerIdx == 1) {
			g.drawImage(playerTurn, 1035, 63, null);
		} else if(GMain.playerIdx == 2) {
			g.drawImage(playerTurn, 1035, 287, null);
		} else if(GMain.playerIdx == 3) {
			g.drawImage(playerTurn, 1035, 511, null);
		} else if(GMain.playerIdx == 4) {
			g.drawImage(playerTurn, 1035, 738, null);
		} 
		
		PlayersOccupyMark playersOccupyMark = new PlayersOccupyMark();
		playersOccupyMark.screenDraw(g);

		Building building = new Building();
		building.screenDraw(g);

		for (int i = 0; i < PlayersSpirit.arrForPlayersSpirit.size(); i++) {
				PlayersSpirit playersSpirit = PlayersSpirit.arrForPlayersSpirit.get(i);
				playersSpirit.screenDraw(g);
			
		}

		Status status = new Status();
		status.screenDraw(g);

		paintComponents(g);
		this.repaint();

	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void setDiceA(int diceA) {
		this.diceA = diceA;
	}

	public void setDiceB(int diceB) {
		this.diceB = diceB;
	}

	public int getDiceA() {
		return diceA;
	}

	public int getDiceB() {
		return diceB;
	}

	public void setDiceAForPrint(int diceA) {

		if (diceA == 1) {
			diceAAfterCast.setIcon(dice1);
		} else if (diceA == 2) {
			diceAAfterCast.setIcon(dice2);
		} else if (diceA == 3) {
			diceAAfterCast.setIcon(dice3);
		} else if (diceA == 4) {
			diceAAfterCast.setIcon(dice4);
		} else if (diceA == 5) {
			diceAAfterCast.setIcon(dice5);
		} else if (diceA == 6) {
			diceAAfterCast.setIcon(dice6);
		}
		diceAAfterCast.setVisible(true);

	}

	public void setDiceBForPrint(int diceB) {

		if (diceB == 1) {
			diceBAfterCast.setIcon(dice1);
		} else if (diceB == 2) {
			diceBAfterCast.setIcon(dice2);
		} else if (diceB == 3) {
			diceBAfterCast.setIcon(dice3);
		} else if (diceB == 4) {
			diceBAfterCast.setIcon(dice4);
		} else if (diceB == 5) {
			diceBAfterCast.setIcon(dice5);
		} else if (diceB == 6) {
			diceBAfterCast.setIcon(dice6);
		}
		diceBAfterCast.setVisible(true);
	}

	public void initPlayersSpirit() {

		int maxNumPlayersSpirit = Player.playerList.size();

		if (maxNumPlayersSpirit == 5) {

			PlayersSpirit player0sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player0sSpirit);

			PlayersSpirit player1sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player1sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(1).setX(880);
			PlayersSpirit.arrForPlayersSpirit.get(1).setY(840);

			PlayersSpirit player2sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player2sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(2).setX(860);
			PlayersSpirit.arrForPlayersSpirit.get(2).setY(875);

			PlayersSpirit player3sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player3sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(3).setX(880);
			PlayersSpirit.arrForPlayersSpirit.get(3).setY(910);

			PlayersSpirit player4sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player4sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(4).setX(900);
			PlayersSpirit.arrForPlayersSpirit.get(4).setY(940);

		} else if (maxNumPlayersSpirit == 4) {

			PlayersSpirit player0sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player0sSpirit);

			PlayersSpirit player1sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player1sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(1).setX(850);
			PlayersSpirit.arrForPlayersSpirit.get(1).setY(840);

			PlayersSpirit player2sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player2sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(2).setX(870);
			PlayersSpirit.arrForPlayersSpirit.get(2).setY(875);

			PlayersSpirit player3sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player3sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(3).setX(890);
			PlayersSpirit.arrForPlayersSpirit.get(3).setY(910);

		} else if (maxNumPlayersSpirit == 3) {

			PlayersSpirit player0sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player0sSpirit);

			PlayersSpirit player1sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player1sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(1).setX(860);
			PlayersSpirit.arrForPlayersSpirit.get(1).setY(850);

			PlayersSpirit player2sSpirit = new PlayersSpirit();
			PlayersSpirit.arrForPlayersSpirit.add(player2sSpirit);
			PlayersSpirit.arrForPlayersSpirit.get(2).setX(880);
			PlayersSpirit.arrForPlayersSpirit.get(2).setY(885);

		}
	}

}
