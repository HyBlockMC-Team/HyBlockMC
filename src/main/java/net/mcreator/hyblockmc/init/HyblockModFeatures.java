
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.hyblockmc.world.features.RevenanthollowFeature;
import net.mcreator.hyblockmc.HyblockMod;

@Mod.EventBusSubscriber
public class HyblockModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HyblockMod.MODID);
	public static final RegistryObject<Feature<?>> REVENANTHOLLOW = REGISTRY.register("revenanthollow", RevenanthollowFeature::new);
}
