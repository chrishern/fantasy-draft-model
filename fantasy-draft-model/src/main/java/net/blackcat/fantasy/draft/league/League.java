package net.blackcat.fantasy.draft.league;

import java.io.Serializable;
import java.util.List;

import net.blackcat.fantasy.draft.team.LeagueTableTeam;

/**
 * Model object representing a fantasy draft league.
 * 
 * @author Chris
 *
 */
public class League implements Serializable {

	private static final long serialVersionUID = 6474945515317795912L;

	private String name;
	private List<LeagueTableTeam> teams;
	
	public League(final String name) {
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the teams
	 */
	public List<LeagueTableTeam> getTeams() {
		return teams;
	}
	/**
	 * @param teams the teams to set
	 */
	public void setTeams(List<LeagueTableTeam> teams) {
		this.teams = teams;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof League)) {
			return false;
		}
		League other = (League) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
}
