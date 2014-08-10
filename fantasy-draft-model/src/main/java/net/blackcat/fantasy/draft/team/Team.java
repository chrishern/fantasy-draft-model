/**
 * 
 */
package net.blackcat.fantasy.draft.team;

import java.io.Serializable;
import java.util.List;

import net.blackcat.fantasy.draft.player.SelectedPlayer;
import net.blackcat.fantasy.draft.team.types.TeamStatus;

/**
 * Model object representing a fantasy draft team.
 * 
 * @author Chris
 *
 */
public class Team implements Serializable {

	private static final long serialVersionUID = -6114339036617218927L;

	private String teamName;
	private List<SelectedPlayer> selectedPlayers;
	private TeamStatus status;

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
	public List<SelectedPlayer> getSelectedPlayers() {
		return selectedPlayers;
	}
	
	/**
	 * @param selectedPlayers the selectedPlayers to set
	 */
	public void setSelectedPlayers(final List<SelectedPlayer> selectedPlayers) {
		this.selectedPlayers = selectedPlayers;
	}

	/**
	 * @return the status
	 */
	public TeamStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(final TeamStatus status) {
		this.status = status;
	}
}

