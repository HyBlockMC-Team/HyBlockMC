package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DebugHarpAllProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		DebugHarpYellowProcedure.execute(world, entity);
		DebugHarpLimeProcedure.execute(world, entity);
		DebugHarpGreenProcedure.execute(world, entity);
		DebugHarpPurpleProcedure.execute(world, entity);
		DebugHarpPinkProcedure.execute(world, entity);
	}
}
