/**
 * 
 */
package net.blackcat.fantasy.draft.auction;

import java.io.Serializable;
import java.util.List;

import net.blackcat.fantasy.draft.player.Player;

/**
 * Object representing the results of the bids for a player in an auction round.
 * 
 * @author Chris
 *
 */
public class AuctionPlayerResult implements Serializable {

	private static final long serialVersionUID = -1478840468430168035L;

	private Player player;
	private AuctionPlayerBid successfulBid;
	private List<AuctionPlayerBid> matchingHighBids;
	private List<AuctionPlayerBid> unsuccessfulBids;
	
	public AuctionPlayerResult() {
		
	}
	
	public AuctionPlayerResult(final Player player) {
		this.player = player;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}


	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}


	/**
	 * @return the successfulBid
	 */
	public AuctionPlayerBid getSuccessfulBid() {
		return successfulBid;
	}

	/**
	 * @param successfulBid the successfulBid to set
	 */
	public void setSuccessfulBid(final AuctionPlayerBid successfulBid) {
		this.successfulBid = successfulBid;
	}

	/**
	 * @return the unsuccessfulBids
	 */
	public List<AuctionPlayerBid> getUnsuccessfulBids() {
		return unsuccessfulBids;
	}

	/**
	 * @param unsuccessfulBids the unsuccessfulBids to set
	 */
	public void setUnsuccessfulBids(final List<AuctionPlayerBid> unsuccessfulBids) {
		this.unsuccessfulBids = unsuccessfulBids;
	}

	/**
	 * @return the matchingHighBids
	 */
	public List<AuctionPlayerBid> getMatchingHighBids() {
		return matchingHighBids;
	}

	/**
	 * @param matchingHighBids the matchingHighBids to set
	 */
	public void setMatchingHighBids(List<AuctionPlayerBid> matchingHighBids) {
		this.matchingHighBids = matchingHighBids;
	}
}
