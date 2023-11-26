package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModBlocks;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;
import java.util.Map;

public class YellowClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(24)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.YELLOW_FALLING_MELODY
				.get().asItem()) {
			if ((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).yellow_click_cooldown == false) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hyblock:harp_yellow_note")), SoundSource.MASTER, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hyblock:harp_yellow_note")), SoundSource.MASTER, 1, 1, false);
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.yellow_click_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				HyblockMod.queueServerWork(4, () -> {
					{
						boolean _setval = false;
						entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.yellow_click_cooldown = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				});
			}
		}
	}
}
