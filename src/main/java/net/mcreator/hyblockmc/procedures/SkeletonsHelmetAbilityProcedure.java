package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SkeletonsHelmetAbilityProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == HyblockModItems.SKELETONS_HELMET_HELMET.get()) {
			if ((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).skeleton_helmet_bones > 0) {
				{
					double _setval = (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).skeleton_helmet_bones - 1;
					entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.skeleton_helmet_bones = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
