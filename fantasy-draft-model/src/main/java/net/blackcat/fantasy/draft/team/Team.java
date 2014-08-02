/**
 * 
 */
package net.blackcat.fantasy.draft.team;

import java.io.Serializable;

/**
 * Model object representing a fantasy draft team.
 * 
 * @author Chris
 *
 */
public class Team implements Serializable {

	private static final long serialVersionUID = -6114339036617218927L;

	private String teamName;

	public Team(final String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(final String teamName) {
		this.teamName = teamName;
	}
}
