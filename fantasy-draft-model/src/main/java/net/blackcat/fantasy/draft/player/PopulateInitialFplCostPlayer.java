/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Object containing the player data required to populate the initial FPL cost of that player.
 * 
 * @author Chris
 *
 */
public class PopulateInitialFplCostPlayer implements Serializable {

	private static final long serialVersionUID = 4809588981402611380L;

	private int id;
	private BigDecimal initialCost;

	public PopulateInitialFplCostPlayer(final int id, final BigDecimal initialCost) {
		this.id = id;
		this.initialCost = initialCost;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the initialCost
	 */
	public BigDecimal getInitialCost() {
		return initialCost;
	}
}
