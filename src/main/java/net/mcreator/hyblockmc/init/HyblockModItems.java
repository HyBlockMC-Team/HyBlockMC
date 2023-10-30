
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

import net.mcreator.hyblockmc.item.YellowmelodyItem;
import net.mcreator.hyblockmc.item.SpiderbootsItem;
import net.mcreator.hyblockmc.item.SkeletonsHelmetItem;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT5Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT4Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT3Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT2Item;
import net.mcreator.hyblockmc.item.RevenantkeystonetabletT1Item;
import net.mcreator.hyblockmc.item.RevenantItem;
import net.mcreator.hyblockmc.item.PurplemelodyItem;
import net.mcreator.hyblockmc.item.PinkmelodyItem;
import net.mcreator.hyblockmc.item.MidasStaffT5Item;
import net.mcreator.hyblockmc.item.MidasStaffT4Item;
import net.mcreator.hyblockmc.item.MidasStaffT3Item;
import net.mcreator.hyblockmc.item.MidasStaffT2Item;
import net.mcreator.hyblockmc.item.MidasStaffItem;
import net.mcreator.hyblockmc.item.MelodyTipsTorchItem;
import net.mcreator.hyblockmc.item.LimemelodyItem;
import net.mcreator.hyblockmc.item.LightbluemelodyItem;
import net.mcreator.hyblockmc.item.HyBlockMCiconItem;
import net.mcreator.hyblockmc.item.GuardianChestplateItem;
import net.mcreator.hyblockmc.item.GreenmelodyItem;
import net.mcreator.hyblockmc.item.EnchantedGoldItem;
import net.mcreator.hyblockmc.item.CreeperPantsItem;
import net.mcreator.hyblockmc.item.BookSongLockedItem;
import net.mcreator.hyblockmc.item.BookSongIncompleteItem;
import net.mcreator.hyblockmc.item.BookSongCompleteItem;
import net.mcreator.hyblockmc.item.BluemelodyItem;
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
	public static final RegistryObject<Item> MIDAS_STAFF_MOLDEN_GOLD = block(HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD);
	public static final RegistryObject<Item> MIDAS_STAFF = REGISTRY.register("midas_staff", () -> new MidasStaffItem());
	public static final RegistryObject<Item> MIDAS_STAFF_T_2 = REGISTRY.register("midas_staff_t_2", () -> new MidasStaffT2Item());
	public static final RegistryObject<Item> MIDAS_STAFF_T_3 = REGISTRY.register("midas_staff_t_3", () -> new MidasStaffT3Item());
	public static final RegistryObject<Item> MIDAS_STAFF_T_4 = REGISTRY.register("midas_staff_t_4", () -> new MidasStaffT4Item());
	public static final RegistryObject<Item> HY_BLOCK_M_CICON = REGISTRY.register("hy_block_m_cicon", () -> new HyBlockMCiconItem());
	public static final RegistryObject<Item> REVENANT_HELMET = REGISTRY.register("revenant_helmet", () -> new RevenantItem.Helmet());
	public static final RegistryObject<Item> REV_HOLLOW_GEN = block(HyblockModBlocks.REV_HOLLOW_GEN);
	public static final RegistryObject<Item> MIDAS_STAFF_T_5 = REGISTRY.register("midas_staff_t_5", () -> new MidasStaffT5Item());
	public static final RegistryObject<Item> ENCHANTED_GOLD = REGISTRY.register("enchanted_gold", () -> new EnchantedGoldItem());
	public static final RegistryObject<Item> ENCHANTED_GOLD_BLOCK = block(HyblockModBlocks.ENCHANTED_GOLD_BLOCK);
	public static final RegistryObject<Item> MELODY_HARP = block(HyblockModBlocks.MELODY_HARP);
	public static final RegistryObject<Item> MELODY_TIPS_TORCH = REGISTRY.register("melody_tips_torch", () -> new MelodyTipsTorchItem());
	public static final RegistryObject<Item> BOOK_SONG_INCOMPLETE = REGISTRY.register("book_song_incomplete", () -> new BookSongIncompleteItem());
	public static final RegistryObject<Item> BOOK_SONG_LOCKED = REGISTRY.register("book_song_locked", () -> new BookSongLockedItem());
	public static final RegistryObject<Item> BOOK_SONG_COMPLETE = REGISTRY.register("book_song_complete", () -> new BookSongCompleteItem());
	public static final RegistryObject<Item> PINKMELODY = REGISTRY.register("pinkmelody", () -> new PinkmelodyItem());
	public static final RegistryObject<Item> YELLOWMELODY = REGISTRY.register("yellowmelody", () -> new YellowmelodyItem());
	public static final RegistryObject<Item> LIMEMELODY = REGISTRY.register("limemelody", () -> new LimemelodyItem());
	public static final RegistryObject<Item> GREENMELODY = REGISTRY.register("greenmelody", () -> new GreenmelodyItem());
	public static final RegistryObject<Item> PURPLEMELODY = REGISTRY.register("purplemelody", () -> new PurplemelodyItem());
	public static final RegistryObject<Item> BLUEMELODY = REGISTRY.register("bluemelody", () -> new BluemelodyItem());
	public static final RegistryObject<Item> LIGHTBLUEMELODY = REGISTRY.register("lightbluemelody", () -> new LightbluemelodyItem());
	public static final RegistryObject<Item> PINK_CLICK_MELODY = block(HyblockModBlocks.PINK_CLICK_MELODY);
	public static final RegistryObject<Item> YELLOW_CLICK_MELODY = block(HyblockModBlocks.YELLOW_CLICK_MELODY);
	public static final RegistryObject<Item> LIME_CLICK_MELODY = block(HyblockModBlocks.LIME_CLICK_MELODY);
	public static final RegistryObject<Item> GREEN_CLICK_MELODY = block(HyblockModBlocks.GREEN_CLICK_MELODY);
	public static final RegistryObject<Item> PURPLE_CLICK_MELODY = block(HyblockModBlocks.PURPLE_CLICK_MELODY);
	public static final RegistryObject<Item> BLUE_CLICK_MELODY = block(HyblockModBlocks.BLUE_CLICK_MELODY);
	public static final RegistryObject<Item> LIGHTBLUE_CLICK_MELODY = block(HyblockModBlocks.LIGHTBLUE_CLICK_MELODY);
	public static final RegistryObject<Item> PINK_FALLING_MELODY = block(HyblockModBlocks.PINK_FALLING_MELODY);
	public static final RegistryObject<Item> YELLOW_FALLING_MELODY = block(HyblockModBlocks.YELLOW_FALLING_MELODY);
	public static final RegistryObject<Item> LIME_FALLING_MELODY = block(HyblockModBlocks.LIME_FALLING_MELODY);
	public static final RegistryObject<Item> GREEN_FALLING_MELODY = block(HyblockModBlocks.GREEN_FALLING_MELODY);
	public static final RegistryObject<Item> PURPLE_FALLING_MELODY = block(HyblockModBlocks.PURPLE_FALLING_MELODY);
	public static final RegistryObject<Item> BLUE_FALLING_MELODY = block(HyblockModBlocks.BLUE_FALLING_MELODY);
	public static final RegistryObject<Item> LIGHTBLUE_FALLING_MELODY = block(HyblockModBlocks.LIGHTBLUE_FALLING_MELODY);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
