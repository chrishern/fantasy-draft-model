package net.blackcat.fantasy.draft.auction;

import java.io.Serializable;
import java.math.BigDecimal;

import net.blackcat.fantasy.draft.team.Team;

/**
 * Model object representing the bid for a player during an auction.
 * 
 * @author Chris
 *
 */
public class AuctionPlayerBid implements Serializable {

	private static final long serialVersionUID = 2172971419466358383L;

	private Team team;
	private BigDecimal amount;
	
	public AuctionPlayerBid() {
		
	}
	
	public AuctionPlayerBid(final Team team, final BigDecimal amount) {
		this.team = team;
		this.amount = amount;
	}
	
	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}
	
	/**
	 * @param team the team to set
	 */
	public void setTeam(final Team team) {
		this.team = team;
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
