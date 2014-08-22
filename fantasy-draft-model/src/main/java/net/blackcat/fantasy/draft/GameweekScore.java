/**
 * 
 */
package net.blackcat.fantasy.draft;

import java.io.Serializable;

/**
 * Object representing a total points score within a single gameweek.
 * 
 * @author Chris
 *
 */
public class GameweekScore implements Serializable {
	
	private static final long serialVersionUID = 4477581724416564633L;

	private int gameweek;
	private int score;
	
	/**
	 * @return the gameweek
	 */
	public int getGameweek() {
		return gameweek;
	}
	
	/**
	 * @param gameweek the gameweek to set
	 */
	public void setGameweek(int gameweek) {
		this.gameweek = gameweek;
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
