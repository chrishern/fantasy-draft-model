package net.blackcat.fantasy.draft.transfer;

import java.io.Serializable;
import java.util.List;

import net.blackcat.fantasy.draft.auction.AuctionRoundResults;

/**
 * Object containing the summary of a transfer window for a league.
 * 
 * @author Chris
 *
 */
public class LeagueTransferWindowSummary implements Serializable {
	
	private static final long serialVersionUID = -8283397937424893521L;

	private List<LeagueTransferSummary> transfers;
	private List<AuctionRoundResults> auctions;

	/**
	 * @return the transfers
	 */
	public List<LeagueTransferSummary> getTransfers() {
		return transfers;
	}

	/**
	 * @param transfers the transfers to set
	 */
	public void setTransfers(List<LeagueTransferSummary> transfers) {
		this.transfers = transfers;
	}

	/**
	 * @return the auctions
	 */
	public List<AuctionRoundResults> getAuctions() {
		return auctions;
	}

	/**
	 * @param auctions the auctions to set
	 */
	public void setAuctions(List<AuctionRoundResults> auctions) {
		this.auctions = auctions;
	}
}
