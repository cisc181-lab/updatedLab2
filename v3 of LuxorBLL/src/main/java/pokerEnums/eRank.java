package pokerEnums;


/**
 * an enum representing the values of the cards
 * @author Charles Cheung, Adam Caulfield, Khalid Al-Sarhan, Morgan Sanchez
 *
 */
public enum eRank {
	TWO(2), 
	THREE(3), 
	FOUR(4), 
	FIVE(5), 
	SIX(6), 
	SEVEN(7), 
	EIGHT(8), 
	NINE(9), 
	TEN(10), 
	JACK(11), 
	QUEEN(12), 
	KING(13), 
	ACE(14),
	JOKER(99);

	/**
	 * the rank of the card
	 */
	private int iRankNum;

	/**
	 * a constructor for the rank of a card
	 * @param iRankNum a rank number
	 */
	private eRank(int iRankNum) {
		this.iRankNum = iRankNum;
	}

	/**
	 * a getter for the rank
	 * @return the card number
	 */
	public int getiRankNum() {
		return iRankNum;
	}


	
}
