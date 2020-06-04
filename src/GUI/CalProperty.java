package GUI;

import java.awt.Image;
import java.util.ArrayList;

public class CalProperty {
	
	int property;
	int realProperty;
	int totalProperty;
	
	int moneyForTake;
	int moneyForGive;
	
	ArrayList<String> arrForSplitProperty = new ArrayList<>();
	ArrayList<String> arrForSplitTotalProperty = new ArrayList<>();
	ArrayList<String> arrForSplitTake = new ArrayList<>();
	ArrayList<String> arrForSplitGive = new ArrayList<>();
	
	ArrayList<Image> arrForPrintProperty = new ArrayList<>();
	ArrayList<Image> arrForPrintTotalProperty = new ArrayList<>();
	ArrayList<Image> arrForPrintTake = new ArrayList<>();
	ArrayList<Image> arrForPrintGive = new ArrayList<>();
		
	public int getProperty() {
		return property;
	}
	
	public void setProperty(int property) {
		this.property = property;
	}
	
	public int getRealProperty() {
		return realProperty;
	}
	
	public void setRealProperty(int realProperty) {
		this.realProperty = realProperty;
	}
	
	public int getTotalProperty() {
		return totalProperty;
	}
	
	public void setTotalProperty(int totalProperty) {
		this.totalProperty = totalProperty;
	}

	public int getMoneyForTake() {
		return moneyForTake;
	}

	public void setMoneyForTake(int moneyForTake) {
		this.moneyForTake = moneyForTake;
	}

	public int getMoneyForGive() {
		return moneyForGive;
	}

	public void setMoneyForGive(int moneyForGive) {
		this.moneyForGive = moneyForGive;
	}
	
}
