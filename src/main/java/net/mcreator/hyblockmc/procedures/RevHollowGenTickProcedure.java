package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.hyblockmc.init.HyblockModBlocks;

public class RevHollowGenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y - 15, z), HyblockModBlocks.REV_HOLLOW_GEN.get().defaultBlockState(), 3);
		world.scheduleTick(BlockPos.containing(x, y - 15, z), world.getBlockState(BlockPos.containing(x, y - 15, z)).getBlock(), 20);
	}
}
