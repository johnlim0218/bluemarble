package GUI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import blueMarble.BlueMarbleMap;
import blueMarble.Player;

public class Status {
	private Image plusMark = new GetImg().getPlusMark();
	private Image minusMark = new GetImg().getMinusMark();

	private Image[] number = new GetImg().getNumber(); // number[0]-0 number[1]-1 number[2]-2 number[3]-3 number[4]-4
														// number[5]-5
														// number[6]-6 number[7]-7 number[8]-8 number[9]-9
	private Image[] commaNumber = new GetImg().getCommaNumber();

	public ArrayList<CalProperty> arrForCalProperty = new ArrayList<>();

	public Status() {

		getPropertyInfo();
		splitForProperty();
		setNumImg();

	}

	public void getPropertyInfo() {

		for (int i = 0; i < Player.playerList.size(); i++) {
			arrForCalProperty.add(i, new CalProperty());
		}

		for (int i = 0; i < Player.playerList.size(); i++) {
			arrForCalProperty.get(i).setProperty(Player.playerList.get(i).getProperty());
		}

		for (int i = 0; i < Player.playerList.size(); i++) {
			arrForCalProperty.get(i).setMoneyForGive(Player.playerList.get(i).getTempForGiveMoney());
		}

		for (int i = 0; i < Player.playerList.size(); i++) {
			arrForCalProperty.get(i).setMoneyForTake(Player.playerList.get(i).getTempForTakeMoney());
		}

		int tempFor1 = 0;
		int tempFor2 = 0;
		int tempFor3 = 0;
		int tempFor4 = 0;

		for (int i = 0; i < BlueMarbleMap.map.size(); i++) {
			if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 1) {
				tempFor1 += BlueMarbleMap.realPropertySum[i];
				arrForCalProperty.get(1).setRealProperty(tempFor1);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 2) {
				tempFor2 += BlueMarbleMap.realPropertySum[i];
				arrForCalProperty.get(2).setRealProperty(tempFor2);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 3) {
				tempFor3 += BlueMarbleMap.realPropertySum[i];
				arrForCalProperty.get(3).setRealProperty(tempFor3);
			} else if (BlueMarbleMap.citiesAndAttractionsOwner[i] == 4) {
				tempFor4 += BlueMarbleMap.realPropertySum[i];
				arrForCalProperty.get(4).setRealProperty(tempFor4);
			}
		}

		for (int i = 0; i < Player.playerList.size(); i++) {
			arrForCalProperty.get(i).setTotalProperty(
					arrForCalProperty.get(i).getProperty() + arrForCalProperty.get(i).getRealProperty());
		}

	}

	public void splitForProperty() {

		String tempForSplitProperty = "";
		String tempForSplitTotal = "";
		String tempForSplitTake = "";
		String tempForSplitGive = "";

		for (int i = 1; i < arrForCalProperty.size(); i++) {
			tempForSplitProperty = arrForCalProperty.get(i).getProperty() + "";
			tempForSplitTotal = arrForCalProperty.get(i).getTotalProperty() + "";
			tempForSplitTake = arrForCalProperty.get(i).getMoneyForTake() + "";
			tempForSplitGive = arrForCalProperty.get(i).getMoneyForGive() + "";

			for (int j = 0; j < tempForSplitProperty.length(); j++) {
				arrForCalProperty.get(i).arrForSplitProperty.add(tempForSplitProperty.substring(j, j + 1));
			}

			for (int j = 0; j < tempForSplitTotal.length(); j++) {
				arrForCalProperty.get(i).arrForSplitTotalProperty.add(tempForSplitTotal.substring(j, j + 1));
			}

			for (int j = 0; j < tempForSplitTake.length(); j++) {
				arrForCalProperty.get(i).arrForSplitTake.add(tempForSplitTake.substring(j, j + 1));
			}

			for (int j = 0; j < tempForSplitGive.length(); j++) {
				arrForCalProperty.get(i).arrForSplitGive.add(tempForSplitGive.substring(j, j + 1));
			}
		}
	}

	public void setNumImg() {

		for (int i = 1; i < arrForCalProperty.size(); i++) {

			for (int j = 0; j < arrForCalProperty.get(i).arrForSplitProperty.size(); j++) {

				if (arrForCalProperty.get(i).arrForSplitProperty.size() - 4 == j
						|| arrForCalProperty.get(i).arrForSplitProperty.size() - 7 == j
						|| arrForCalProperty.get(i).arrForSplitProperty.size() - 10 == j
						|| arrForCalProperty.get(i).arrForSplitProperty.size() - 13 == j) {
					if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[0]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[1]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[2]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[3]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[4]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[5]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[6]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[7]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[8]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, commaNumber[9]);
					}
				} else {

					if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[0]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[1]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[2]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[3]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[4]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[5]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[6]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[7]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[8]);
					} else if (arrForCalProperty.get(i).arrForSplitProperty.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintProperty.add(j, number[9]);
					}

				}
			}

			for (int j = 0; j < arrForCalProperty.get(i).arrForSplitTotalProperty.size(); j++) {

				if (arrForCalProperty.get(i).arrForSplitTotalProperty.size() - 4 == j
						|| arrForCalProperty.get(i).arrForSplitTotalProperty.size() - 7 == j
						|| arrForCalProperty.get(i).arrForSplitTotalProperty.size() - 10 == j
						|| arrForCalProperty.get(i).arrForSplitTotalProperty.size() - 13 == j) {
					if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[0]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[1]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[2]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[3]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[4]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[5]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[6]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[7]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[8]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, commaNumber[9]);
					}

				} else {

					if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[0]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[1]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[2]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[3]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[4]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[5]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[6]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[7]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[8]);
					} else if (arrForCalProperty.get(i).arrForSplitTotalProperty.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintTotalProperty.add(j, number[9]);
					}
				}
			}
			
			for (int j = 0; j < arrForCalProperty.get(i).arrForSplitTake.size(); j++) {

				if (arrForCalProperty.get(i).arrForSplitTake.size() - 4 == j
						|| arrForCalProperty.get(i).arrForSplitTake.size() - 7 == j
						|| arrForCalProperty.get(i).arrForSplitTake.size() - 10 == j
						|| arrForCalProperty.get(i).arrForSplitTake.size() - 13 == j) {
					if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[0]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[1]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[2]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[3]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[4]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[5]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[6]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[7]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[8]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, commaNumber[9]);
					}

				} else {

					if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[0]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[1]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[2]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[3]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[4]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[5]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[6]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[7]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[8]);
					} else if (arrForCalProperty.get(i).arrForSplitTake.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintTake.add(j, number[9]);
					}
				}
			}
			for (int j = 0; j < arrForCalProperty.get(i).arrForSplitGive.size(); j++) {

				if (arrForCalProperty.get(i).arrForSplitGive.size() - 4 == j
						|| arrForCalProperty.get(i).arrForSplitGive.size() - 7 == j
						|| arrForCalProperty.get(i).arrForSplitGive.size() - 10 == j
						|| arrForCalProperty.get(i).arrForSplitGive.size() - 13 == j) {
					if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[0]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[1]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[2]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[3]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[4]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[5]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[6]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[7]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[8]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, commaNumber[9]);
					}

				} else {

					if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("0")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[0]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("1")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[1]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("2")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[2]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("3")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[3]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("4")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[4]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("5")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[5]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("6")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[6]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("7")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[7]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("8")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[8]);
					} else if (arrForCalProperty.get(i).arrForSplitGive.get(j).equals("9")) {
						arrForCalProperty.get(i).arrForPrintGive.add(j, number[9]);
					}
				}
			}
		}

	}

	public void screenDraw(Graphics2D g) {

		for (int i = 1; i < arrForCalProperty.size(); i++) {
			for (int j = 0; j < arrForCalProperty.get(i).arrForPrintProperty.size(); j++) {

				if (i == 1) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintProperty.get(j), (j * 17) + 1220, 103, null);

				} else if (i == 2) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintProperty.get(j), (j * 17) + 1220, 328, null);

				} else if (i == 3) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintProperty.get(j), (j * 17) + 1220, 550, null);

				} else if (i == 4) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintProperty.get(j), (j * 17) + 1220, 780, null);

				}
			}
		}

		for (int i = 1; i < arrForCalProperty.size(); i++) {
			for (int j = 0; j < arrForCalProperty.get(i).arrForPrintTotalProperty.size(); j++) {

				if (i == 1) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintTotalProperty.get(j), (j * 17) + 1220, 135, null);

				} else if (i == 2) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintTotalProperty.get(j), (j * 17) + 1220, 360, null);

				} else if (i == 3) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintTotalProperty.get(j), (j * 17) + 1220, 582, null);

				} else if (i == 4) {
					g.drawImage(arrForCalProperty.get(i).arrForPrintTotalProperty.get(j), (j * 17) + 1220, 812, null);

				}

			}

		}

		for (int i = 1; i < arrForCalProperty.size(); i++) {
			if (arrForCalProperty.get(i).getMoneyForTake() > 0) {
				for (int j = 0; j < arrForCalProperty.get(i).arrForPrintTake.size(); j++) {

					if (i == 1) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintTake.get(j), (j * 17) + 1220, 197, null);
						g.drawImage(plusMark, 1140, 197, null); 
					} else if (i == 2) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintTake.get(j), (j * 17) + 1220, 422, null);
						g.drawImage(plusMark, 1140, 425, null);
					} else if (i == 3) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintTake.get(j), (j * 17) + 1220, 644, null);
						g.drawImage(plusMark, 1140, 645, null);
					} else if (i == 4) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintTake.get(j), (j * 17) + 1220, 874, null);
						g.drawImage(plusMark, 1140, 875, null);
					}

				}

			}
		}

		for (int i = 1; i < arrForCalProperty.size(); i++) {
			if (arrForCalProperty.get(i).getMoneyForGive() > 0) {
				for (int j = 0; j < arrForCalProperty.get(i).arrForPrintGive.size(); j++) {

					if (i == 1) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintGive.get(j), (j * 17) + 1220, 197, null);
						g.drawImage(minusMark, 1140, 197, null);
					} else if (i == 2) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintGive.get(j), (j * 17) + 1220, 422, null);
						g.drawImage(minusMark, 1140, 425, null);
					} else if (i == 3) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintGive.get(j), (j * 17) + 1220, 644, null);
						g.drawImage(minusMark, 1140, 645, null);
					} else if (i == 4) {
						g.drawImage(arrForCalProperty.get(i).arrForPrintGive.get(j), (j * 17) + 1220, 874, null);
						g.drawImage(minusMark, 1140, 875, null);
					}
				}

			}

		}
	}
}
