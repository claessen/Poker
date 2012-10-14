package com.poker;

public class Card {

	private Rank rank;
	private Suit suit;
	
	public Card(Rank r, Suit s) {
		rank = r;
		suit = s;
	}
	
	public Rank rank() { return rank; }
	public Suit suit() { return suit; }
	
	public String toString() {
		
		return this.rank.name() + " of " + this.suit.name();
		
	}

	
	
// Works
//	@Override
//	public int compareTo(Card o) {
//		return this.myRank.rank - o.myRank.rank;
//	}
	

}
