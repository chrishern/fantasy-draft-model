/**
 * 
 */
package net.blackcat.fantasy.draft.team;

/**
 * Type storing the valid formations in the draft game,
 * 
 * @author Chris
 *
 */
public enum ValidFormations {

	F_3_5_2(3, 5, 2),
	F_3_4_3(3, 4, 3),
	F_4_5_1(4, 5, 1),
	F_4_4_2(4, 4, 2),
	F_4_3_3(4, 3, 3),
	F_5_2_3(5, 2, 3),
	F_5_3_2(5, 3, 2),
	F_5_4_1(5, 4, 1);
	
	private int noOfDefenders;
	private int noOfMidfielders;
	private int noOfStrikers;
	
	private ValidFormations(final int noOfDefenders, final int noOfMidfielders, final int noOfStrikers) {
		this.noOfDefenders = noOfDefenders;
		this.noOfMidfielders = noOfMidfielders;
		this.noOfStrikers = noOfStrikers;
	}

	/**
	 * @return the no of goalkeepers
	 */
	public int getNoOfGoalkeepers() {
		return 1;
	}
	
	/**
	 * @return the noOfDefenders
	 */
	public int getNoOfDefenders() {
		return noOfDefenders;
	}

	/**
	 * @return the noOfMidfielders
	 */
	public int getNoOfMidfielders() {
		return noOfMidfielders;
	}

	/**
	 * @return the noOfStrikers
	 */
	public int getNoOfStrikers() {
		return noOfStrikers;
	}
}
