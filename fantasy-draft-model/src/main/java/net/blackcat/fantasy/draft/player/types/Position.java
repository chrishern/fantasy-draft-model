package net.blackcat.fantasy.draft.player.types;

/**
 * Type representing all available positions for a player within the fantasy draft.
 * 
 * @author Chris
 *
 */
public enum Position {

	GOALKEEPER("Goalkeeper"),
	DEFENDER("Defender"),
	MIDFIEDER("Midfielder"),
	STRIKER("Forward");
	
	private String fantasyPremierLeagueValue;
	
	private Position(final String fantasyPremiumLeagueValue) {
		this.fantasyPremierLeagueValue = fantasyPremiumLeagueValue;
	}
	
	/**
	 * @return the fantasyPremierLeagueValue
	 */
	public String getFantasyPremierLeagueValue() {
		return fantasyPremierLeagueValue;
	}
	
	/**
	 * Convert the string FPL position value to the enum value.
	 * 
	 * @param fantasyPremierLeaguePosition String value of the position from the FPL.
	 * @return Equivalent Position enum.
	 */
	public static Position fromFantasyPremierLeaguePosition(final String fantasyPremierLeaguePosition) {
		for (final Position position : Position.values()) {
			if (position.getFantasyPremierLeagueValue().equals(fantasyPremierLeaguePosition)) {
				return position;
			}
		}
		
		return null;
	}
}
