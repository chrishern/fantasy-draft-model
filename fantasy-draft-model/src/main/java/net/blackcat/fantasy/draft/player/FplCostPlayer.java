/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Object containing the FPL player cost data.
 * 
 * @author Chris
 *
 */
public class FplCostPlayer implements Serializable {

	private static final long serialVersionUID = 4809588981402611380L;

	private int id;
	private BigDecimal initialCost;
	private BigDecimal currentCost;

	public FplCostPlayer(final int id, final BigDecimal initialCost, final BigDecimal currentCost) {
		this.id = id;
		this.initialCost = initialCost;
		this.currentCost = currentCost;
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
	/**
	 * @return the currentCost
	 */
	public BigDecimal getCurrentCost() {
		return currentCost;
	}
}
