/**
 * 
 */
package net.blackcat.fantasy.draft.auction;

import java.io.Serializable;
import java.util.List;

/**
 * Object representing the results of an auction round.
 * 
 * @author Chris
 *
 */
public class AuctionRoundResults implements Serializable {

	private static final long serialVersionUID = 6363435975174535169L;

	private int auctionPhase;
	private List<AuctionPlayerResult> playerResults;

	public AuctionRoundResults(final int auctionPhase) {
		this.auctionPhase = auctionPhase;
	}

	/**
	 * @return the auctionPhase
	 */
	public int getAuctionPhase() {
		return auctionPhase;
	}

	/**
	 * @param auctionPhase the auctionPhase to set
	 */
	public void setAuctionPhase(int auctionPhase) {
		this.auctionPhase = auctionPhase;
	}

	/**
	 * @return the playerResults
	 */
	public List<AuctionPlayerResult> getPlayerResults() {
		return playerResults;
	}

	/**
	 * @param playerResults the playerResults to set
	 */
	public void setPlayerResults(List<AuctionPlayerResult> playerResults) {
		this.playerResults = playerResults;
	}
}
