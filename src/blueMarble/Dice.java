package blueMarble;

import java.util.Random;

import GUI.GamePnl;

public class Dice {

	static Random diceRandom = new Random();
	int diceA;
	int diceB;

	static public int diceA() {

		int diceA = diceRandom.nextInt(6) + 1;
		new GamePnl().setDiceAForPrint(diceA); // 화면 출력용
		return diceA;

	}

	static public int diceB() {

		int diceB = diceRandom.nextInt(6) + 1;
		new GamePnl().setDiceBForPrint(diceB); // 화면 출력용
		return diceB;
	}
	
	
}
