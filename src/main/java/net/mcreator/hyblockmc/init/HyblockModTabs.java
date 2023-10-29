
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HyblockMod.MODID);
	public static final RegistryObject<CreativeModeTab> HY_BLOCK_MC = REGISTRY.register("hy_block_mc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hyblock.hy_block_mc")).icon(() -> new ItemStack(HyblockModItems.HY_BLOCK_M_CICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HyblockModItems.ADMIN_SWORD_1.get());
				tabData.accept(HyblockModItems.ADMINSWORD_2.get());
				tabData.accept(HyblockModItems.ADMIN_SWORD_3.get());
				tabData.accept(HyblockModItems.TESTDUMMY_SPAWN_EGG.get());
				tabData.accept(HyblockModItems.SPIDERBOOTS_BOOTS.get());
				tabData.accept(HyblockModItems.CREEPER_PANTS_LEGGINGS.get());
				tabData.accept(HyblockModItems.GUARDIAN_CHESTPLATE_CHESTPLATE.get());
				tabData.accept(HyblockModItems.SKELETONS_HELMET_HELMET.get());
				tabData.accept(HyblockModBlocks.REVENANTSPAWNERBLOCK.get().asItem());
				tabData.accept(HyblockModBlocks.TARANTULASPAWNERBLOCK.get().asItem());
				tabData.accept(HyblockModBlocks.SVENSPAWNERBLOCK.get().asItem());
				tabData.accept(HyblockModBlocks.VOIDGLOOMSPAWNERBLOCK.get().asItem());
				tabData.accept(HyblockModBlocks.INFERNODEMONSPAWNERBLOCK.get().asItem());
				tabData.accept(HyblockModBlocks.RIFTSTALKERSPAWNERBLOCK.get().asItem());
				tabData.accept(HyblockModBlocks.SLAYERSPAWNERKEYSTONEBLOCK.get().asItem());
				tabData.accept(HyblockModItems.REVENANTKEYSTONETABLET_T_1.get());
				tabData.accept(HyblockModItems.REVENANTKEYSTONETABLET_T_2.get());
				tabData.accept(HyblockModItems.REVENANTKEYSTONETABLET_T_3.get());
				tabData.accept(HyblockModItems.REVENANTKEYSTONETABLET_T_4.get());
				tabData.accept(HyblockModItems.REVENANTKEYSTONETABLET_T_5.get());
				tabData.accept(HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().asItem());
				tabData.accept(HyblockModItems.MIDAS_STAFF.get());
				tabData.accept(HyblockModItems.MIDAS_STAFF_T_2.get());
				tabData.accept(HyblockModItems.MIDAS_STAFF_T_3.get());
				tabData.accept(HyblockModItems.MIDAS_STAFF_T_4.get());
				tabData.accept(HyblockModItems.MIDAS_STAFF_T_5.get());
				tabData.accept(HyblockModItems.ENCHANTED_GOLD.get());
				tabData.accept(HyblockModBlocks.ENCHANTED_GOLD_BLOCK.get().asItem());
			}).withSearchBar().build());
}
