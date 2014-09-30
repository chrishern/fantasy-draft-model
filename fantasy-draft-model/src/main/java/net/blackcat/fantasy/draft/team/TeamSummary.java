/**
 * 
 */
package net.blackcat.fantasy.draft.team;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import net.blackcat.fantasy.draft.player.SelectedPlayer;

/**
 * Model object representing a team summary.  It is used on the 'Your Team' page of the UI.
 * 
 * @author Chris
 *
 */
public class TeamSummary implements Serializable {

	private static final long serialVersionUID = -1667427487631416275L;

	private String teamName;
	private int totalPoints;
	private List<SelectedPlayer> team;
	private BigDecimal remainingBudget;
	
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the totalPoints
	 */
	public int getTotalPoints() {
		return totalPoints;
	}
	/**
	 * @param totalPoints the totalPoints to set
	 */
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	/**
	 * @return the team
	 */
	public List<SelectedPlayer> getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(List<SelectedPlayer> team) {
		this.team = team;
	}
	/**
	 * @return the remainingBudget
	 */
	public BigDecimal getRemainingBudget() {
		return remainingBudget;
	}
	/**
	 * @param remainingBudget the remainingBudget to set
	 */
	public void setRemainingBudget(BigDecimal remainingBudget) {
		this.remainingBudget = remainingBudget;
	}
}
