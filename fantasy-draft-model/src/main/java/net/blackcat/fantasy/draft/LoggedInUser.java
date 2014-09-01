/**
 * 
 */
package net.blackcat.fantasy.draft;

import java.io.Serializable;

/**
 * Model object storing logged in user details.
 * 
 * @author Chris
 *
 */
public class LoggedInUser implements Serializable {

	private static final long serialVersionUID = -5185297014456503822L;

	private int teamId;
	private int leagueId;
	
	public LoggedInUser(int teamId, int leagueId) {
		this.teamId = teamId;
		this.leagueId = leagueId;
	}

	/**
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}
	
	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	/**
	 * @return the leagueId
	 */
	public int getLeagueId() {
		return leagueId;
	}

	/**
	 * @param leagueId the leagueId to set
	 */
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}
}
