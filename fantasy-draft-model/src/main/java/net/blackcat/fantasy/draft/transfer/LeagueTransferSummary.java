/**
 * 
 */
package net.blackcat.fantasy.draft.transfer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import net.blackcat.fantasy.draft.player.Player;

/**
 * Object containing the summary of transfers in the transfer window of a league.
 * 
 * @author Chris
 *
 */
public class LeagueTransferSummary implements Serializable {

	private static final long serialVersionUID = -9036238182797102741L;

	private String buyingTeam;
	private String sellingTeam;
	private List<Player> players;
	private List<Player> exchangedPlayers;
	private BigDecimal cost;
	
	/**
	 * @return the buyingTeam
	 */
	public String getBuyingTeam() {
		return buyingTeam;
	}
	/**
	 * @param buyingTeam the buyingTeam to set
	 */
	public void setBuyingTeam(String buyingTeam) {
		this.buyingTeam = buyingTeam;
	}
	/**
	 * @return the sellingTeam
	 */
	public String getSellingTeam() {
		return sellingTeam;
	}
	/**
	 * @param sellingTeam the sellingTeam to set
	 */
	public void setSellingTeam(String sellingTeam) {
		this.sellingTeam = sellingTeam;
	}
	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	/**
	 * @return the exchangedPlayers
	 */
	public List<Player> getExchangedPlayers() {
		return exchangedPlayers;
	}
	/**
	 * @param exchangedPlayers the exchangedPlayers to set
	 */
	public void setExchangedPlayers(List<Player> exchangedPlayers) {
		this.exchangedPlayers = exchangedPlayers;
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
}
