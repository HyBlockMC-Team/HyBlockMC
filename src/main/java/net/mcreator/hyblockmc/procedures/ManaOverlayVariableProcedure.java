package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.hyblockmc.network.HyblockModVariables;

public class ManaOverlayVariableProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).mana) + "/"
				+ new java.text.DecimalFormat("##").format((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).max_mana) + "\u270E Mana";
	}
}
