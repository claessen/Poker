package com.poker;

import java.util.Comparator;

public class CardRankComparator implements Comparator<Card> {

	public int compare(Card o1, Card o2) {
		return o1.rank().rank - o2.rank().rank;
	}

}
