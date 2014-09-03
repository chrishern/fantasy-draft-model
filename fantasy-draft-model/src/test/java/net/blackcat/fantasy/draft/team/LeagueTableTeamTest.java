/**
 * 
 */
package net.blackcat.fantasy.draft.team;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * @author Chris
 *
 */
public class LeagueTableTeamTest {

	private static final String TEAM_NAME = "TeamName";

	@Test
	public void testCompareTo() {
		// arrange
		final LeagueTableTeam team1 = new LeagueTableTeam(TEAM_NAME);
		team1.setTotalScore(34);
		
		final LeagueTableTeam team2 = new LeagueTableTeam(TEAM_NAME);
		team2.setTotalScore(56);
		
		final LeagueTableTeam team3 = new LeagueTableTeam(TEAM_NAME);
		team3.setTotalScore(12);
		
		final LeagueTableTeam team4 = new LeagueTableTeam(TEAM_NAME);
		team4.setTotalScore(48);
		
		final List<LeagueTableTeam> teamList = Arrays.asList(team1, team2, team3, team4);
		
		// act
		Collections.sort(teamList);
		
		// assert
		assertThat(teamList.get(0).getTotalScore()).isGreaterThan(teamList.get(1).getTotalScore());
		assertThat(teamList.get(1).getTotalScore()).isGreaterThan(teamList.get(2).getTotalScore());
		assertThat(teamList.get(2).getTotalScore()).isGreaterThan(teamList.get(3).getTotalScore());
	}
}
