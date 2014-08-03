/**
 * 
 */
package net.blackcat.fantasy.draft.team;

import java.io.Serializable;
import java.util.List;

import net.blackcat.fantasy.draft.player.Player;

/**
 * Model object representing a fantasy draft team.
 * 
 * @author Chris
 *
 */
public class Team implements Serializable {

	private static final long serialVersionUID = -6114339036617218927L;

	private String teamName;
	private List<Player> selectedPlayers;

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

	/**
	 * @return the selectedPlayers
	 */
	public List<Player> getSelectedPlayers() {
		return selectedPlayers;
	}
	
	/**
	 * @param selectedPlayers the selectedPlayers to set
	 */
	public void setSelectedPlayers(final List<Player> selectedPlayers) {
		this.selectedPlayers = selectedPlayers;
	}
}

