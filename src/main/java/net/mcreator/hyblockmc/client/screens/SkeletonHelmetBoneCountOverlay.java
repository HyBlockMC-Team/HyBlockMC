
package net.mcreator.hyblockmc.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.hyblockmc.procedures.BonesVariableProcedure;
import net.mcreator.hyblockmc.procedures.BonesEquippedProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SkeletonHelmetBoneCountOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (BonesEquippedProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						BonesVariableProcedure.execute(entity), (w/2) + 14, h - 70, -1, false);
		}
	}
}
