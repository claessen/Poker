package com.poker;

public class Converter {
	
	public static String ProbabilityToOdds(double probability) {
		/*
		 * Given a probability (0-1); return this as an odds ratio in term of the number of negative events that 
		 * must occur in order to yield one positive event
		 * Expressed as rounded to nearest tenth
		 * 
		 * i.e. 0.5      returns  1
		 *      0.00452  returns  220  (specific pair odds)
		 */
		String odds = String.format("%4.2f", (float) (1.0/probability - 1));		return odds;
	}
	

}
