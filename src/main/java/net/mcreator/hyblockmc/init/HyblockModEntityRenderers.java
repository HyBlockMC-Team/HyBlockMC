
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.hyblockmc.client.renderer.TestdummyRenderer;
import net.mcreator.hyblockmc.client.renderer.RevenanthorrorT1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HyblockModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HyblockModEntities.TESTDUMMY.get(), TestdummyRenderer::new);
		event.registerEntityRenderer(HyblockModEntities.REVENANTHORROR_T_1.get(), RevenanthorrorT1Renderer::new);
	}
}
