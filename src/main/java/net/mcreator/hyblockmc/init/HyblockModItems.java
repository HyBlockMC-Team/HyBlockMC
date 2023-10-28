
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hyblockmc.item.SpiderbootsItem;
import net.mcreator.hyblockmc.item.SkeletonsHelmetItem;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT5Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT4Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT3Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT2Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT1Item;
import net.mcreator.hyblockmc.item.RevenantItem;
import net.mcreator.hyblockmc.item.MidasStaffItem;
import net.mcreator.hyblockmc.item.HyBlockMCiconItem;
import net.mcreator.hyblockmc.item.GuardianChestplateItem;
import net.mcreator.hyblockmc.item.CreeperPantsItem;
import net.mcreator.hyblockmc.item.Adminsword2Item;
import net.mcreator.hyblockmc.item.AdminSword3Item;
import net.mcreator.hyblockmc.item.AdminSword1Item;
import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HyblockMod.MODID);
	public static final RegistryObject<Item> ADMIN_SWORD_1 = REGISTRY.register("admin_sword_1", () -> new AdminSword1Item());
	public static final RegistryObject<Item> ADMINSWORD_2 = REGISTRY.register("adminsword_2", () -> new Adminsword2Item());
	public static final RegistryObject<Item> ADMIN_SWORD_3 = REGISTRY.register("admin_sword_3", () -> new AdminSword3Item());
	public static final RegistryObject<Item> TESTDUMMY_SPAWN_EGG = REGISTRY.register("testdummy_spawn_egg", () -> new ForgeSpawnEggItem(HyblockModEntities.TESTDUMMY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SPIDERBOOTS_BOOTS = REGISTRY.register("spiderboots_boots", () -> new SpiderbootsItem.Boots());
	public static final RegistryObject<Item> CREEPER_PANTS_LEGGINGS = REGISTRY.register("creeper_pants_leggings", () -> new CreeperPantsItem.Leggings());
	public static final RegistryObject<Item> GUARDIAN_CHESTPLATE_CHESTPLATE = REGISTRY.register("guardian_chestplate_chestplate", () -> new GuardianChestplateItem.Chestplate());
	public static final RegistryObject<Item> SKELETONS_HELMET_HELMET = REGISTRY.register("skeletons_helmet_helmet", () -> new SkeletonsHelmetItem.Helmet());
	public static final RegistryObject<Item> REVENANTSPAWNERBLOCK = block(HyblockModBlocks.REVENANTSPAWNERBLOCK);
	public static final RegistryObject<Item> TARANTULASPAWNERBLOCK = block(HyblockModBlocks.TARANTULASPAWNERBLOCK);
	public static final RegistryObject<Item> SVENSPAWNERBLOCK = block(HyblockModBlocks.SVENSPAWNERBLOCK);
	public static final RegistryObject<Item> VOIDGLOOMSPAWNERBLOCK = block(HyblockModBlocks.VOIDGLOOMSPAWNERBLOCK);
	public static final RegistryObject<Item> INFERNODEMONSPAWNERBLOCK = block(HyblockModBlocks.INFERNODEMONSPAWNERBLOCK);
	public static final RegistryObject<Item> RIFTSTALKERSPAWNERBLOCK = block(HyblockModBlocks.RIFTSTALKERSPAWNERBLOCK);
	public static final RegistryObject<Item> SLAYERSPAWNERKEYSTONEBLOCK = block(HyblockModBlocks.SLAYERSPAWNERKEYSTONEBLOCK);
	public static final RegistryObject<Item> REVENANTKEYSTONETABLET_T_1 = REGISTRY.register("revenantkeystonetablet_t_1", () -> new RevenantkeystonetabletT1Item());
	public static final RegistryObject<Item> REVENANTKEYSTONETABLET_T_2 = REGISTRY.register("revenantkeystonetablet_t_2", () -> new RevenantkeystonetabletT2Item());
	public static final RegistryObject<Item> REVENANTKEYSTONETABLET_T_3 = REGISTRY.register("revenantkeystonetablet_t_3", () -> new RevenantkeystonetabletT3Item());
	public static final RegistryObject<Item> REVENANTKEYSTONETABLET_T_4 = REGISTRY.register("revenantkeystonetablet_t_4", () -> new RevenantkeystonetabletT4Item());
	public static final RegistryObject<Item> REVENANTKEYSTONETABLET_T_5 = REGISTRY.register("revenantkeystonetablet_t_5", () -> new RevenantkeystonetabletT5Item());
	public static final RegistryObject<Item> HY_BLOCK_M_CICON = REGISTRY.register("hy_block_m_cicon", () -> new HyBlockMCiconItem());
	public static final RegistryObject<Item> REVENANT_HELMET = REGISTRY.register("revenant_helmet", () -> new RevenantItem.Helmet());
	public static final RegistryObject<Item> REV_HOLLOW_GEN = block(HyblockModBlocks.REV_HOLLOW_GEN);
	public static final RegistryObject<Item> MIDAS_STAFF = REGISTRY.register("midas_staff", () -> new MidasStaffItem());
	public static final RegistryObject<Item> MIDAS_STAFF_MOLDEN_GOLD = block(HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
