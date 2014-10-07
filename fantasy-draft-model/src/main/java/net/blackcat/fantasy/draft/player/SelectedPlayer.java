/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import net.blackcat.fantasy.draft.GameweekScore;
import net.blackcat.fantasy.draft.player.types.Position;
import net.blackcat.fantasy.draft.player.types.SelectedPlayerStartingElevenStatus;
import net.blackcat.fantasy.draft.player.types.SelectedPlayerStatus;

/**
 * Object representing a player who is selected within a team in the fantasy draft.
 * 
 * @author Chris
 *
 */
public class SelectedPlayer implements Serializable, Comparable<SelectedPlayer> {

	private static final long serialVersionUID = -3001502246826062271L;

	private int id;
	private String forename;
	private String surname;
	private String team;
	private int pointsScored;
	private BigDecimal cost;
	private Position position;
	private SelectedPlayerStartingElevenStatus selectionStatus;
	private List<GameweekScore> weekScores;
	private BigDecimal currentSellToPotPrice;
	private SelectedPlayerStatus squadStatus;
	
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

	/**
	 * @return the weekScores
	 */
	public List<GameweekScore> getWeekScores() {
		return weekScores;
	}

	/**
	 * @param weekScores the weekScores to set
	 */
	public void setWeekScores(List<GameweekScore> weekScores) {
		this.weekScores = weekScores;
	}

	/**
	 * @return the selectionStatus
	 */
	public SelectedPlayerStartingElevenStatus getSelectionStatus() {
		return selectionStatus;
	}

	/**
	 * @param selectionStatus the selectionStatus to set
	 */
	public void setSelectionStatus(SelectedPlayerStartingElevenStatus selectionStatus) {
		this.selectionStatus = selectionStatus;
	}

	/**
	 * @return the currentSellToPotPrice
	 */
	public BigDecimal getCurrentSellToPotPrice() {
		return currentSellToPotPrice;
	}

	/**
	 * @param currentSellToPotPrice the currentSellToPotPrice to set
	 */
	public void setCurrentSellToPotPrice(BigDecimal currentSellToPotPrice) {
		this.currentSellToPotPrice = currentSellToPotPrice;
	}

	/**
	 * @return the squadStatus
	 */
	public SelectedPlayerStatus getSquadStatus() {
		return squadStatus;
	}

	/**
	 * @param squadStatus the squadStatus to set
	 */
	public void setSquadStatus(SelectedPlayerStatus squadStatus) {
		this.squadStatus = squadStatus;
	}

	@Override
	public int compareTo(final SelectedPlayer o) {
		if (this.selectionStatus == null) {
			return this.position.compareTo(o.getPosition());
		}
		
		if (isPlayerASubstitute(this) && !isPlayerASubstitute(o)) {
			return 1;
		}
		
		if (!isPlayerASubstitute(this) && isPlayerASubstitute(o)) {
			return -1;
		}
		
		if (isPlayerASubstitute(this) && isPlayerASubstitute(o)) {
			return this.selectionStatus.compareTo(o.getSelectionStatus());
		}
		
		return this.position.compareTo(o.getPosition());
	}

	/**
	 * Determine if a player is a substitute or not.
	 * 
	 * @param The player to determine if they are a substitute.
	 * @return True if the player is a substitute.  False otherwise.
	 */
	private boolean isPlayerASubstitute(final SelectedPlayer player) {
		return SelectedPlayerStartingElevenStatus.SUBSTITUTE_POSITIONS.contains(player.selectionStatus);
	}
}
