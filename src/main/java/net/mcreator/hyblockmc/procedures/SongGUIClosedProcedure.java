package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SongGUIClosedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HyblockMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/kill @e[type=item,distance=0..5]");
		});
	}
}
