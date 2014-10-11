/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import java.math.BigDecimal;

import net.blackcat.fantasy.draft.player.types.Position;

/**
 * Object representing a player within the fantasy draft game.  This represents a 'base' player 
 * that is not part of any team.
 * 
 * @author Chris
 *
 */
public class Player {

	private int id;
	private String forename;
	private String surname;
	private String team;
	private Position position;
	private int totalPoints;
	private BigDecimal fplCost;

	public Player() {
		
	}
	
	public Player(final int id, final String forename, final String surname, final String team,
			final Position position, final int totalPoints) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.team = team;
		this.position = position;
		this.totalPoints = totalPoints;
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
	 * @return the forename
	 */
	public String getForename() {
		return forename;
	}
	
	/**
	 * @param forename the forename to set
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}
	
	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}
	
	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}
	
	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
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
	 * @return the fplCost
	 */
	public BigDecimal getFplCost() {
		return fplCost;
	}

	/**
	 * @param fplCost the fplCost to set
	 */
	public void setFplCost(BigDecimal fplCost) {
		this.fplCost = fplCost;
	}
}
