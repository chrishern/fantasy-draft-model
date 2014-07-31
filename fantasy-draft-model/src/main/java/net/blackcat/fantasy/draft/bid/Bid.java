/**
 * 
 */
package net.blackcat.fantasy.draft.bid;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Object representing a bid withtin the fantasy draft game.
 * 
 * @author Chris
 *
 */
public class Bid implements Serializable {

	private static final long serialVersionUID = -1478840468430168035L;

	private int playerId;
	private int teamId;
	private BigDecimal amount;
	
	public Bid(final int player, final int teamId, final BigDecimal amount) {
		this.playerId = playerId;
		this.teamId = teamId;
		this.amount = amount;
	}
	/**
	 * @return the playerId
	 */
	public int getPlayerId() {
		return playerId;
	}
	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
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
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
