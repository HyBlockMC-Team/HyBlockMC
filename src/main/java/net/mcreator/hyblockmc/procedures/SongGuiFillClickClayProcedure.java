package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModBlocks;
import net.mcreator.hyblockmc.HyblockMod;

import javax.annotation.Nullable;

import java.util.function.Supplier;
import java.util.Map;

@Mod.EventBusSubscriber
public class SongGuiFillClickClayProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).any_song_gui_open == true) {
			HyblockMod.queueServerWork(1, () -> {
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY)
						.getItem() == HyblockModBlocks.PINK_CLICK_MELODY.get().asItem()) == false) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_CLICK_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(15)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(25)).getItem() : ItemStack.EMPTY)
						.getItem() == HyblockModBlocks.YELLOW_CLICK_MELODY.get().asItem()) == false) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_CLICK_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(25)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(35)).getItem() : ItemStack.EMPTY)
						.getItem() == HyblockModBlocks.LIME_CLICK_MELODY.get().asItem()) == false) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_CLICK_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(35)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(45)).getItem() : ItemStack.EMPTY)
						.getItem() == HyblockModBlocks.GREEN_CLICK_MELODY.get().asItem()) == false) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_CLICK_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(45)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(55)).getItem() : ItemStack.EMPTY)
						.getItem() == HyblockModBlocks.PURPLE_CLICK_MELODY.get().asItem()) == false) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_CLICK_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(55)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(65)).getItem() : ItemStack.EMPTY)
						.getItem() == HyblockModBlocks.BLUE_CLICK_MELODY.get().asItem()) == false) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_CLICK_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(65)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(75)).getItem() : ItemStack.EMPTY)
						.getItem() == HyblockModBlocks.LIGHTBLUE_CLICK_MELODY.get().asItem()) == false) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_CLICK_MELODY.get());
						_setstack.setCount(1);
						((Slot) _slots.get(75)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			});
		}
	}
}
