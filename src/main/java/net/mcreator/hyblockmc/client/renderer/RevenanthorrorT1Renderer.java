
package net.mcreator.hyblockmc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.hyblockmc.entity.RevenanthorrorT1Entity;

public class RevenanthorrorT1Renderer extends HumanoidMobRenderer<RevenanthorrorT1Entity, HumanoidModel<RevenanthorrorT1Entity>> {
	public RevenanthorrorT1Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RevenanthorrorT1Entity entity) {
		return new ResourceLocation("hyblock:textures/entities/revenantfix.png");
	}
}
