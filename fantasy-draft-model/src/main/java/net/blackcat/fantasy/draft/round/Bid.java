/**
 * 
 */
package net.blackcat.fantasy.draft.round;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Model class representing a bid that has been made.
 * 
 * @author Chris
 *
 */
public class Bid implements Serializable {

	private static final long serialVersionUID = 1740864495806152404L;

	private int playerId;
	private BigDecimal amount;
	
	public Bid(final int playerId, final BigDecimal amount) {
		this.playerId = playerId;
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
	public void setPlayerId(final int playerId) {
		this.playerId = playerId;
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
	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}
}
