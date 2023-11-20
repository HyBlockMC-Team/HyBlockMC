package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModItems;
import net.mcreator.hyblockmc.init.HyblockModBlocks;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;
import java.util.Map;

public class SongGuiFillColoursProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.melody_colour_fill_thing = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		HyblockMod.queueServerWork(1, () -> {
			for (int index0 = 0; index0 < 6; index0++) {
				if ((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).any_song_gui_open == true) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.PINKMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) (11 + (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.YELLOWMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) (21 + (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) (31 + (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) (41 + (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) (51 + (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.BLUEMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) (61 + (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.LIGHTBLUEMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get((int) (71 + (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing))).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					{
						double _setval = (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).melody_colour_fill_thing + 1;
						entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.melody_colour_fill_thing = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 0;
						entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.melody_colour_fill_thing = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		});
		HyblockMod.queueServerWork(1, () -> {
			if ((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).any_song_gui_open == true) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_CLICK_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(15)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_CLICK_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(25)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_CLICK_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(35)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_CLICK_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(45)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_CLICK_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(55)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_CLICK_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(65)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_CLICK_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(75)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				{
					double _setval = 0;
					entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.melody_colour_fill_thing = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = 0;
					entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.melody_colour_fill_thing = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/playsound hyblock:harp_intro record @a ~ ~ ~ 100 1");
		});
	}
}
