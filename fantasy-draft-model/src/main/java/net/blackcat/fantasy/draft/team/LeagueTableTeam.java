/**
 * 
 */
package net.blackcat.fantasy.draft.team;

import java.io.Serializable;

/**
 * Model object representing a team displayed in the league table.
 * 
 * @author Chris
 *
 */
public class LeagueTableTeam implements Serializable, Comparable<LeagueTableTeam> {

	private static final long serialVersionUID = -4664705509804670197L;

	private int id;
	private String teamName;
	private int weekScore;
	private int totalScore;
	
	public LeagueTableTeam(final String teamName) {
		this.teamName = teamName;
	}
	
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
	 * @return the weekScore
	 */
	public int getWeekScore() {
		return weekScore;
	}
	/**
	 * @param weekScore the weekScore to set
	 */
	public void setWeekScore(int weekScore) {
		this.weekScore = weekScore;
	}
	/**
	 * @return the totalScore
	 */
	public int getTotalScore() {
		return totalScore;
	}
	/**
	 * @param totalScore the totalScore to set
	 */
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
	@Override
	public int compareTo(final LeagueTableTeam teamToCompare) {
		if (this.totalScore == teamToCompare.totalScore) {
			return 0;
		} else if (this.totalScore < teamToCompare.totalScore) {
			return 1;
		}
		
		return -1;
	}
}
