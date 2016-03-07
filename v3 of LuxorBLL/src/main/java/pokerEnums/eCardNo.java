package pokerEnums;

/**
 * an enum for the card number
 * @author Charles Cheung, Adam Caulfield, Khalid Al-Sarhan, Morgan Sanchez
 *
 */
public enum eCardNo {

	FirstCard(0), SecondCard(1), ThirdCard(2), FourthCard(3), FifthCard(4);
	
	private eCardNo(final int CardNo){
		this.CardNo = CardNo;
	}

	private int CardNo;
	
	public int getCardNo(){
		return CardNo;
	}
	
}
