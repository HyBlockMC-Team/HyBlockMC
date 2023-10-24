
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hyblockmc.block.VoidgloomspawnerblockBlock;
import net.mcreator.hyblockmc.block.TarantulaspawnerblockBlock;
import net.mcreator.hyblockmc.block.SvenspawnerblockBlock;
import net.mcreator.hyblockmc.block.RevenantspawnerblockBlock;
import net.mcreator.hyblockmc.block.InfernodemonspawnerblockBlock;
import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HyblockMod.MODID);
	public static final RegistryObject<Block> REVENANTSPAWNERBLOCK = REGISTRY.register("revenantspawnerblock", () -> new RevenantspawnerblockBlock());
	public static final RegistryObject<Block> TARANTULASPAWNERBLOCK = REGISTRY.register("tarantulaspawnerblock", () -> new TarantulaspawnerblockBlock());
	public static final RegistryObject<Block> SVENSPAWNERBLOCK = REGISTRY.register("svenspawnerblock", () -> new SvenspawnerblockBlock());
	public static final RegistryObject<Block> VOIDGLOOMSPAWNERBLOCK = REGISTRY.register("voidgloomspawnerblock", () -> new VoidgloomspawnerblockBlock());
	public static final RegistryObject<Block> INFERNODEMONSPAWNERBLOCK = REGISTRY.register("infernodemonspawnerblock", () -> new InfernodemonspawnerblockBlock());
}
