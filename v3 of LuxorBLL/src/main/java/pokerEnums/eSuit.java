package pokerEnums;


/**
 * an enum representing the four types of suits as a value
 * @author Charles Cheung, Adam Caulfield, Khalid Al-Sarhan, Morgan Sanchez
 */
public enum eSuit {

	HEARTS(1), SPADES(2), CLUBS(3), DIAMONDS(4), JOKER(99);
	
	/**
	 * the suit of the card
	 */
	private int iSuitNum;

	/**
	 * a constructor for the suit of a card
	 * @param iSuitNum
	 */
	private eSuit(int iSuitNum) {
		this.iSuitNum = iSuitNum;
	}

	/**
	 * a getter for the suit of the card
	 * @return
	 */
	public int getiSuitNum() {
		return iSuitNum;
	}
	
	
}
