
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
import net.mcreator.hyblockmc.block.SlayerspawnerkeystoneblockBlock;
import net.mcreator.hyblockmc.block.RiftstalkerspawnerblockBlock;
import net.mcreator.hyblockmc.block.RevenantspawnerblockBlock;
import net.mcreator.hyblockmc.block.RevHollowGenBlock;
import net.mcreator.hyblockmc.block.MidasStaffMoldenGoldBlock;
import net.mcreator.hyblockmc.block.InfernodemonspawnerblockBlock;
import net.mcreator.hyblockmc.block.EnchantedGoldBlockBlock;
import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HyblockMod.MODID);
	public static final RegistryObject<Block> REVENANTSPAWNERBLOCK = REGISTRY.register("revenantspawnerblock", () -> new RevenantspawnerblockBlock());
	public static final RegistryObject<Block> TARANTULASPAWNERBLOCK = REGISTRY.register("tarantulaspawnerblock", () -> new TarantulaspawnerblockBlock());
	public static final RegistryObject<Block> SVENSPAWNERBLOCK = REGISTRY.register("svenspawnerblock", () -> new SvenspawnerblockBlock());
	public static final RegistryObject<Block> VOIDGLOOMSPAWNERBLOCK = REGISTRY.register("voidgloomspawnerblock", () -> new VoidgloomspawnerblockBlock());
	public static final RegistryObject<Block> INFERNODEMONSPAWNERBLOCK = REGISTRY.register("infernodemonspawnerblock", () -> new InfernodemonspawnerblockBlock());
	public static final RegistryObject<Block> RIFTSTALKERSPAWNERBLOCK = REGISTRY.register("riftstalkerspawnerblock", () -> new RiftstalkerspawnerblockBlock());
	public static final RegistryObject<Block> SLAYERSPAWNERKEYSTONEBLOCK = REGISTRY.register("slayerspawnerkeystoneblock", () -> new SlayerspawnerkeystoneblockBlock());
	public static final RegistryObject<Block> MIDAS_STAFF_MOLDEN_GOLD = REGISTRY.register("midas_staff_molden_gold", () -> new MidasStaffMoldenGoldBlock());
	public static final RegistryObject<Block> REV_HOLLOW_GEN = REGISTRY.register("rev_hollow_gen", () -> new RevHollowGenBlock());
	public static final RegistryObject<Block> ENCHANTED_GOLD_BLOCK = REGISTRY.register("enchanted_gold_block", () -> new EnchantedGoldBlockBlock());
}
