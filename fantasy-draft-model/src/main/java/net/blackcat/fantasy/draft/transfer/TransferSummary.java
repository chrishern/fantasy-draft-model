package net.blackcat.fantasy.draft.transfer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import net.blackcat.fantasy.draft.player.Player;
import net.blackcat.fantasy.draft.transfer.types.TransferStatus;
import net.blackcat.fantasy.draft.transfer.types.TransferType;

public class TransferSummary implements Serializable {

	private static final long serialVersionUID = -3510931152260681768L;

	private TransferType type;
	private TransferStatus status;
	private BigDecimal cost;
	private String opposingTeam;
	private List<Player> players;
	private List<Player> exchangedPlayers;
	
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
	 * @return the status
	 */
	public TransferStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(TransferStatus status) {
		this.status = status;
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
	 * @return the opposingTeam
	 */
	public String getOpposingTeam() {
		return opposingTeam;
	}
	/**
	 * @param opposingTeam the opposingTeam to set
	 */
	public void setOpposingTeam(String opposingTeam) {
		this.opposingTeam = opposingTeam;
	}
}
