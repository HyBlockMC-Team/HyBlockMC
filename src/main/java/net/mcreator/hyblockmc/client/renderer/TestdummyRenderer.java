
package net.mcreator.hyblockmc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.hyblockmc.entity.TestdummyEntity;
import net.mcreator.hyblockmc.client.model.Modelcustom_model;

public class TestdummyRenderer extends MobRenderer<TestdummyEntity, Modelcustom_model<TestdummyEntity>> {
	public TestdummyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TestdummyEntity entity) {
		return new ResourceLocation("hyblock:textures/entities/fd811766bbba4498.png");
	}
}
