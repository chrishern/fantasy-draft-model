/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import java.io.Serializable;
import java.math.BigDecimal;

import net.blackcat.fantasy.draft.player.types.Position;

/**
 * Object representing a player who is selected within a team in the fantasy draft.
 * 
 * @author Chris
 *
 */
public class SelectedPlayer implements Serializable {

	private static final long serialVersionUID = -3001502246826062271L;

	private int id;
	private String forename;
	private String surname;
	private String team;
	private int pointsScored;
	private BigDecimal cost;
	private Position position;
	
	public SelectedPlayer() {
		
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
	 * @return the pointsScored
	 */
	public int getPointsScored() {
		return pointsScored;
	}
	/**
	 * @param pointsScored the pointsScored to set
	 */
	public void setPointsScored(int pointsScored) {
		this.pointsScored = pointsScored;
	}
	/**
	 * @return the cost
	 */
	public BigDecimal getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
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
}
