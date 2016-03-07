package pokerBase;
import java.util.ArrayList;
import java.util.Collections;

import exceptions.DeckException;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

/**
 * 
 * @author Charles Cheung, Adam Caulfield, Khalid Al-Sarhan, Morgan Sanchez
 *
 */
public class Deck {

	/**
	 * 
	 */
	private ArrayList<Card> deckCards = new ArrayList<Card>();

	/**
	 * the no arg constructor for deck, will return shuffled deck of 52 cards
	 */
	public Deck()
	{
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if ((eRank != eRank.JOKER) && (eSuit != eSuit.JOKER))
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));				
			}		
		}		
		Collections.shuffle(deckCards);
	}
	
	public Deck(int iNumOfJokers)
	{
		this();
		
		for (int i = 0; i<iNumOfJokers;i++)
		{
			deckCards.add(new Card(eSuit.JOKER, eRank.JOKER, 53));
		}
		Collections.shuffle(deckCards);
	}
	
	
	public Deck (int numOfJokers, ArrayList<Card> wilds)
	{
		this(numOfJokers);
		
	}
	
	
	/**
	 * Draws a card from the instance of Deck
	 * @return
	 * @throws DeckException
	 */
	public Card Draw() throws DeckException 
	{
		if (deckCards.size() == 0)
		{
			throw new DeckException(this);
		}
		return deckCards.remove(0);
	}
	
	/**
	 * Returns the number of cards left in the deck
	 * @return
	 */
	private int GetDeckSize()
	{
		return deckCards.size();	
	}
}
