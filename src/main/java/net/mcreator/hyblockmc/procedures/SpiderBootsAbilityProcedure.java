package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModItems;
import net.mcreator.hyblockmc.HyblockMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpiderBootsAbilityProcedure {
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
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == HyblockModItems.SPIDERBOOTS_BOOTS.get()) {
			HyblockMod.queueServerWork(1, () -> {
				entity.fallDistance = 0;
				if (entity.isShiftKeyDown()) {
					entity.fallDistance = 0;
					entity.setShiftKeyDown(false);
					if ((entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).mana >= 20) {
						entity.fallDistance = 0;
						{
							double _setval = (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).mana - 20;
							entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.mana = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 5, 15, false, false));
					}
				}
			});
		}
	}
}
