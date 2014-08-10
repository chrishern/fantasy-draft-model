/**
 * 
 */
package net.blackcat.fantasy.draft.round;

import java.io.Serializable;
import java.util.List;

/**
 * @author Chris
 *
 */
public class TeamBids implements Serializable {

	private static final long serialVersionUID = -8630280544053188363L;

	private int teamId;
	private List<Bid> bids;
	
	public TeamBids() {
	}

	public TeamBids(final int teamId, final List<Bid> bids) {
		this.teamId = teamId;
		this.bids = bids;
	}
	/**
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}
	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	/**
	 * @return the bids
	 */
	public List<Bid> getBids() {
		return bids;
	}
	/**
	 * @param bids the bids to set
	 */
	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}
}
