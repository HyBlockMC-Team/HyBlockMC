package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.hyblockmc.init.HyblockModParticleTypes;

public class SpawnerambientparticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double posY = 0;
		posY = y + 1;
		for (int index0 = 0; index0 < 5; index0++) {
			if (world.isClientSide()) {
				world.addParticle((SimpleParticleType) (HyblockModParticleTypes.AMBIENTSPAWNERPARTINCLES.get()), (x + Mth.nextDouble(RandomSource.create(), 0.3, 0.7)), (posY + Mth.nextDouble(RandomSource.create(), 0.3, 0.7)),
						(z + Mth.nextDouble(RandomSource.create(), 0.3, 0.7)), 0, 0.1, 0);
			}
			posY = y + 1;
		}
	}
}
