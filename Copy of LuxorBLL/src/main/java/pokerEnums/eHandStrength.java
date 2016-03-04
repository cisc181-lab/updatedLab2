package pokerEnums;

/**
 * an enum representing the strength of a hand
 * @author Charles Cheung, Adam Caulfield, Khalid Al-Sarhan, Morgan Sanchez
 *
 */
public enum eHandStrength {

	FiveOfAKind(110, "isHandFiveOfAKind") {
		@Override
		public String toString() {
			return "Five of a Kind";
		}
	},
	RoyalFlush(100, "isHandRoyalFlush") {
		public String toString() {
			return "Royal Flush";
		}
	},
	StraightFlush(90, "isHandStraightFlush") {
		public String toString() {
			return "Straight Flush";
		}
	},
	FourOfAKind(80, "isHandFourOfAKind") {
		public String toString() {
			return "Four of a Kind";
		}
	},
	FullHouse(70, "isHandFullHouse") {
		public String toString() {
			return "Full House";
		}
	},
	Flush(60, "isHandFlush") {
		public String toString() {
			return "Flush";
		}
	},
	Straight(50, "isHandStraight") {
		public String toString() {
			return "Straight";
		}
	},
	ThreeOfAKind(40, "isHandThreeOfAKind") {
		public String toString() {
			return "Three of a Kind";
		}
	},
	TwoPair(30, "isHandTwoPair") {
		public String toString() {
			return "Two Pairs";
		}
	},

	Pair(20, "isHandPair") {
		public String toString() {
			return "One Pair";
		}
	},
	HighCard(10, "isHandHighCard") {
		public String toString() {
			return "High Card";
		}
	};

	/**
	 * a constructor for the hand strength
	 * @param handStrength the strength of the hand as a value
	 * @param strHandStrength the string that describes the hand
	 */
	private eHandStrength(final int handStrength, final String strHandStrength) {
		this.iHandStrength = handStrength;
		this.strHandStrength = strHandStrength;
	}

	/**
	 * the hand strength as a value
	 */
	private int iHandStrength;
	/**
	 * the hand strength as a string
	 */
	private String strHandStrength;

	/**
	 * a getter for the hand strength as a value
	 * @return an integer representing the hand strength
	 */
	public int getHandStrength() {
		return iHandStrength;
	}

	/**
	 * a getter for the hand strength as a string
	 * @return a string representing the hand strength
	 */
	public String getEvalMethod() {
		return this.strHandStrength;
	}

}
