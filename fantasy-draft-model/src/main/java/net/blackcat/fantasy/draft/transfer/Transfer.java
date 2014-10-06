/**
 * 
 */
package net.blackcat.fantasy.draft.transfer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import net.blackcat.fantasy.draft.transfer.types.TransferType;

/**
 * Model object representing a transfer submitted by a manager,
 * 
 * @author Chris
 *
 */
public class Transfer implements Serializable {

	private static final long serialVersionUID = -7463902517330621045L;

	private int buyingTeam;
	private int sellingTeam;
	private TransferType type;
	private List<Integer> players;
	private List<Integer> exchangedPlayers;
	private BigDecimal amount;
	
	public Transfer() {
	}

	public Transfer(final int buyingTeam, final int sellingTeam, final TransferType type, final List<Integer> players, final BigDecimal amount) {
		this.buyingTeam = buyingTeam;
		this.sellingTeam = sellingTeam;
		this.type = type;
		this.players = players;
		this.amount = amount;
	}
	
	public Transfer(
			final int buyingTeam, final int sellingTeam, final TransferType type, final List<Integer> players, final List<Integer> exchangedPlayers, final BigDecimal amount) {
		this.buyingTeam = buyingTeam;
		this.sellingTeam = sellingTeam;
		this.type = type;
		this.players = players;
		this.exchangedPlayers = exchangedPlayers;
		this.amount = amount;
	}
	
	/**
	 * @return the thisTeam
	 */
	public int getBuyingTeam() {
		return buyingTeam;
	}
	/**
	 * @param thisTeam the thisTeam to set
	 */
	public void setBuyingTeam(int thisTeam) {
		this.buyingTeam = thisTeam;
	}
	/**
	 * @return the otherTeam
	 */
	public int getSellingTeam() {
		return sellingTeam;
	}
	/**
	 * @param otherTeam the otherTeam to set
	 */
	public void setSellingTeam(int otherTeam) {
		this.sellingTeam = otherTeam;
	}
	/**
	 * @return the type
	 */
	public TransferType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(TransferType type) {
		this.type = type;
	}
	/**
	 * @return the players
	 */
	public List<Integer> getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(List<Integer> players) {
		this.players = players;
	}
	/**
	 * @return the exchangedPlayers
	 */
	public List<Integer> getExchangedPlayers() {
		return exchangedPlayers;
	}
	/**
	 * @param exchangedPlayers the exchangedPlayers to set
	 */
	public void setExchangedPlayers(List<Integer> exchangedPlayers) {
		this.exchangedPlayers = exchangedPlayers;
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
