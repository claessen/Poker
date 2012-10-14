package com.poker;

import java.util.Comparator;

public class HandComparator implements Comparator<Hand> {
	/**
	 * Just a stub for now, more thinking needs to go into what needs to happen here.  For example, is 33 better than AK ?  
	 * Maybe there needs to be a switch to indicate whether or not standard ranking rules go into effect or not
	 * This reduces to a simple pair comparator for cases where the hand size is 2.  Only when the hand size is 5 or greater 
	 * is the check for straight,flush, 
	 * 2 cards: check for pair
	 */
	public int compare(Hand arg0, Hand arg1) {
		// TODO Auto-generated method stub
		return 0;
	}


}