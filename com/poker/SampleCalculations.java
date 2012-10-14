package com.poker;

import java.util.Arrays;

public class SampleCalculations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int iterationCount = 1000000;
		int positiveOutcome = 0;
		int negativeOutcome = 0;
		Hand myHand = new Hand();
		
		// How often does a pair of aces come up?
		for (int i = 0; i < iterationCount; i++) {
			Deck d = new Deck();
			Card c1 = d.getCard();
			Card c2 = d.getCard();
			if ((c1.rank() == Rank.ACE) && (c2.rank() == Rank.ACE)) positiveOutcome++;
		}
		
		double probability = (double)positiveOutcome/(double)iterationCount;
		
		System.out.println("Pair of aces occur " + probability*100 + "% of the time. Odds: " + Converter.ProbabilityToOdds(probability) );
		
		
		

	}

}
