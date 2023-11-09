package net.mcreator.hyblockmc.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.hyblockmc.network.HyblockModVariables;

import java.util.HashMap;

public class DebugHarpChangeTickProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		{
			double _setval = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:tick_rate") ? ((EditBox) guistate.get("text:tick_rate")).getValue() : "");
			entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.harp_falling_speed = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
