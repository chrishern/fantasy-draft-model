/**
 * 
 */
package net.blackcat.fantasy.draft.player.types;

import java.util.Arrays;
import java.util.List;

/**
 * Enum storing the list of different selected player status' within the game.
 * 
 * @author Chris
 *
 */
public enum SelectedPlayerStatus {

	CAPTAIN,
	VICE_CAPTAIN,
	PICKED,
	SUB_1,
	SUB_2,
	SUB_3,
	SUB_4,
	SUB_5;
	
	public static List<SelectedPlayerStatus> SUBSTITUTE_POSITIONS = Arrays.asList(SUB_1, SUB_2, SUB_3, SUB_4, SUB_5);
}
