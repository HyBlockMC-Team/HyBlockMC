
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.hyblockmc.world.inventory.HarpSelectionMenu;
import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HyblockMod.MODID);
	public static final RegistryObject<MenuType<HarpSelectionMenu>> HARP_SELECTION = REGISTRY.register("harp_selection", () -> IForgeMenuType.create(HarpSelectionMenu::new));
}
