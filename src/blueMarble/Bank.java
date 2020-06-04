package blueMarble;

public class Bank {
	
	static int vault; // 금고를 만들었지만 필요가 있을까? 
	static final private int MONTHLYPAY = 200000; //월급
	
	
	static public void monthlyPayAfterCircumnavigation(int playerIdx) { // 1 순환 후 받는 월급
		
		System.out.println("[Bank][MONTHLYPAY]월급 20만원을 받았습니다.");
		Player.playerList.get(playerIdx).takeMoney(playerIdx ,playerIdx, MONTHLYPAY);
		System.out.printf("[Player][MONTHLYPAY][%s] 월급 받은 후 총 자산 : %d원\n", Player.playerList.get(playerIdx).getName(),
				Player.playerList.get(playerIdx).getProperty());
		
	}
	
}
