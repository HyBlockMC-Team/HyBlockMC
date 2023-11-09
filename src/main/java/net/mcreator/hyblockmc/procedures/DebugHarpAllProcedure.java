package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class DebugHarpAllProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		DebugHarpYellowProcedure.execute(world, entity);
		DebugHarpLimeProcedure.execute(world, entity);
		DebugHarpGreenProcedure.execute(world, entity);
		DebugHarpPurpleProcedure.execute(world, entity);
		DebugHarpBlueProcedure.execute(world, entity);
		DebugHarpLightBlueProcedure.execute(world, entity);
		DebugHarpPinkProcedure.execute(world, entity);
	}
}
