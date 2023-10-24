
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HyblockMod.MODID);
	public static final RegistryObject<SimpleParticleType> AMBIENTSPAWNERPARTINCLES = REGISTRY.register("ambientspawnerpartincles", () -> new SimpleParticleType(false));
}
