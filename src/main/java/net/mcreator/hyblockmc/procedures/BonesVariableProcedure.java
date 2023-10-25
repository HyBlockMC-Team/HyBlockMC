package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.hyblockmc.network.HyblockModVariables;

public class BonesVariableProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).skeleton_helmet_bones) + "/"
				+ new java.text.DecimalFormat("##").format((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).skeleton_helmet_max_bones) + " Bone Shields";
	}
}
