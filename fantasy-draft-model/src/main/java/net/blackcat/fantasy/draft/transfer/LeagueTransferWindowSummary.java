package net.blackcat.fantasy.draft.transfer;

import java.io.Serializable;
import java.util.List;

/**
 * Object containing the summary of a transfer window for a league.
 * 
 * @author Chris
 *
 */
public class LeagueTransferWindowSummary implements Serializable {
	
	private static final long serialVersionUID = -8283397937424893521L;

	private List<LeagueTransferSummary> transfers;

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
}
