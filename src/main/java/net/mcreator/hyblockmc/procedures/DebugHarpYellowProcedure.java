package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModItems;
import net.mcreator.hyblockmc.init.HyblockModBlocks;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;
import java.util.Map;

public class DebugHarpYellowProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_FALLING_MELODY.get());
			_setstack.setCount(1);
			((Slot) _slots.get(21)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).harp_falling_speed, () -> {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HyblockModItems.YELLOWMELODY.get());
				_setstack.setCount(1);
				((Slot) _slots.get(21)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_FALLING_MELODY.get());
				_setstack.setCount(1);
				((Slot) _slots.get(22)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).harp_falling_speed, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModItems.YELLOWMELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(22)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_FALLING_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(23)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).harp_falling_speed, () -> {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModItems.YELLOWMELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(23)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_FALLING_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(24)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).harp_falling_speed, () -> {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(HyblockModItems.YELLOWMELODY.get());
							_setstack.setCount(1);
							((Slot) _slots.get(24)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).harp_falling_speed, () -> {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_FALLING_MELODY.get());
								_setstack.setCount(1);
								((Slot) _slots.get(26)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).harp_falling_speed, () -> {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(HyblockModItems.YELLOWMELODY.get());
									_setstack.setCount(1);
									((Slot) _slots.get(26)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
							});
						});
					});
				});
			});
		});
	}
}
