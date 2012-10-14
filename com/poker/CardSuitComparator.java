package com.poker;

import java.util.Comparator;

public class CardSuitComparator implements Comparator<Card> {

	public int compare(Card o1, Card o2) {
		return o1.suit().suit - o2.suit().suit;
	}


}
