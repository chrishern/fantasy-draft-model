/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import java.io.Serializable;

/**
 * Model object representing a draft player with a gameweek score.
 * 
 * @author Chris
 *
 */
public class GameweekScorePlayer implements Serializable {

	private static final long serialVersionUID = 2483457363710854276L;

	private int id;
	private int minutesPlayed;
	private int score;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the minutesPlayed
	 */
	public int getMinutesPlayed() {
		return minutesPlayed;
	}
	/**
	 * @param minutesPlayed the minutesPlayed to set
	 */
	public void setMinutesPlayed(int minutesPlayed) {
		this.minutesPlayed = minutesPlayed;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
