/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.blackcat.fantasy.draft.player.types.Position;
import net.blackcat.fantasy.draft.player.types.SelectedPlayerStatus;

import org.junit.Test;

/**
 * Unit tests for {@link SelectedPlayer}.
 * 
 * @author Chris
 *
 */
public class SelectedPlayerTest {

	@Test
	public void testEquals_DifferentPositions() {
		// arrange
		final SelectedPlayer goalkeeper = new SelectedPlayer();
		goalkeeper.setPosition(Position.GOALKEEPER);
		
		final SelectedPlayer defender = new SelectedPlayer();
		defender.setPosition(Position.DEFENDER);
		
		final SelectedPlayer midfielder = new SelectedPlayer();
		midfielder.setPosition(Position.MIDFIEDER);
		
		final SelectedPlayer striker = new SelectedPlayer();
		striker.setPosition(Position.STRIKER);
		
		final List<SelectedPlayer> players = Arrays.asList(defender, striker, goalkeeper, midfielder);
		
		// act
		Collections.sort(players);
		
		// assert
		assertThat(players.get(0).getPosition()).isEqualTo(Position.GOALKEEPER);
		assertThat(players.get(1).getPosition()).isEqualTo(Position.DEFENDER);
		assertThat(players.get(2).getPosition()).isEqualTo(Position.MIDFIEDER);
		assertThat(players.get(3).getPosition()).isEqualTo(Position.STRIKER);
	}

	@Test
	public void testEquals_PickedTeam() {
		// arrange
		final SelectedPlayer pickedGoalkeeper = new SelectedPlayer();
		pickedGoalkeeper.setPosition(Position.GOALKEEPER);
		pickedGoalkeeper.setSelectionStatus(SelectedPlayerStatus.PICKED);
		
		final SelectedPlayer sub1 = new SelectedPlayer();
		sub1.setPosition(Position.STRIKER);
		sub1.setSelectionStatus(SelectedPlayerStatus.SUB_1);
		
		final SelectedPlayer pickedDefender = new SelectedPlayer();
		pickedDefender.setPosition(Position.DEFENDER);
		pickedDefender.setSelectionStatus(SelectedPlayerStatus.PICKED);
		
		final SelectedPlayer sub3 = new SelectedPlayer();
		sub3.setPosition(Position.DEFENDER);
		sub3.setSelectionStatus(SelectedPlayerStatus.SUB_3);
		
		final SelectedPlayer sub2 = new SelectedPlayer();
		sub2.setPosition(Position.MIDFIEDER);
		sub2.setSelectionStatus(SelectedPlayerStatus.SUB_2);
		
		final SelectedPlayer viceCaptain = new SelectedPlayer();
		viceCaptain.setPosition(Position.DEFENDER);
		viceCaptain.setSelectionStatus(SelectedPlayerStatus.VICE_CAPTAIN);
		
		final SelectedPlayer pickedMidfielder = new SelectedPlayer();
		pickedMidfielder.setPosition(Position.MIDFIEDER);
		pickedMidfielder.setSelectionStatus(SelectedPlayerStatus.PICKED);
		
		final SelectedPlayer captain = new SelectedPlayer();
		captain.setPosition(Position.MIDFIEDER);
		captain.setSelectionStatus(SelectedPlayerStatus.CAPTAIN);
		
		final SelectedPlayer sub4 = new SelectedPlayer();
		sub4.setPosition(Position.GOALKEEPER);
		sub4.setSelectionStatus(SelectedPlayerStatus.SUB_4);
		
		final SelectedPlayer pickedStriker = new SelectedPlayer();
		pickedStriker.setPosition(Position.STRIKER);
		pickedStriker.setSelectionStatus(SelectedPlayerStatus.PICKED);
		
		final List<SelectedPlayer> players = Arrays.asList(
				pickedGoalkeeper, sub1, pickedDefender, sub3, sub2, viceCaptain, pickedMidfielder, captain, sub4, pickedStriker);
		
		// act
		Collections.sort(players);
		
		// assert
		assertThat(players.get(0)).isEqualTo(pickedGoalkeeper);
		assertThat(players.get(1)).isEqualTo(pickedDefender);
		assertThat(players.get(2)).isEqualTo(viceCaptain);
		assertThat(players.get(3)).isEqualTo(pickedMidfielder);
		assertThat(players.get(4)).isEqualTo(captain);
		assertThat(players.get(5)).isEqualTo(pickedStriker);
		assertThat(players.get(6)).isEqualTo(sub1);
		assertThat(players.get(7)).isEqualTo(sub2);
		assertThat(players.get(8)).isEqualTo(sub3);
		assertThat(players.get(9)).isEqualTo(sub4);
	}
}
