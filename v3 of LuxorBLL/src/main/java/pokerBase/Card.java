package pokerBase;

import java.util.Comparator;

import pokerEnums.eRank;
import pokerEnums.eSuit;

/**
 * An implementation of a card.
 * 
 * @author Charles Cheung, Adam Caulfield, Khalid Al-Sarhan, Morgan Sanchez
 */

public class Card implements Comparable {

	/**
	 * the suit of the card.
	 */
	private eSuit eSuit;
	
	/**
	 * the rank of the card.
	 */
	private eRank eRank;
	
	/**
	 * the card number of the card. going to be used for implementing images to
	 * go along with each card
	 */
	private int iCardNum;
	
	/**
	 * a constructor to create a card given rank, suit and card number
	 * @param rank
	 * @param suit
	 * @param cardNum
	 */
	public Card(pokerEnums.eSuit eSuit, pokerEnums.eRank eRank, int iCardNum) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
		this.iCardNum = iCardNum;
	}

	/**
	 * a getter for the suit
	 * @return the suit of the card
	 */
	public eSuit geteSuit() {
		return eSuit;
	}

	/**
	 * a getter for the rank
	 * @return the rank/value of the card
	 */
	public eRank geteRank() {
		return eRank;
	}

	/**
	 * a getter for the card number
	 * @return the card number of the card
	 */
	public int getiCardNum() {
		return iCardNum;
	}

	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

		   int Cno1 = c1.geteRank().getiRankNum();
		   int Cno2 = c2.geteRank().getiRankNum();

		   /*For descending order*/
		   return Cno2 - Cno1;

	   }};

	public int compareTo(Object o) {
	    Card c = (Card) o; 
	    return c.geteRank().compareTo(this.geteRank()); 

	}
}
