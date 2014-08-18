/**
 * 
 */
package net.blackcat.fantasy.draft.player;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.blackcat.fantasy.draft.player.types.Position;

import org.junit.Test;

/**
 * Unit tests for {@link SelectedPlayer}.
 * 
 * @author Chris
 *
 */
public class SelectedPlayerTest {

	@Test
	public void testEquals() {
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

}
