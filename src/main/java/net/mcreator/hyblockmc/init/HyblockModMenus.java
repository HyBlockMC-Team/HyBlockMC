
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.hyblockmc.world.inventory.Song9GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song8GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song7GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song6GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song5GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song4GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song3GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song2GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song1GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song13GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song12GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song11GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song10GUIMenu;
import net.mcreator.hyblockmc.world.inventory.HarpSelectionMenu;
import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HyblockMod.MODID);
	public static final RegistryObject<MenuType<HarpSelectionMenu>> HARP_SELECTION = REGISTRY.register("harp_selection", () -> IForgeMenuType.create(HarpSelectionMenu::new));
	public static final RegistryObject<MenuType<Song1GUIMenu>> SONG_1_GUI = REGISTRY.register("song_1_gui", () -> IForgeMenuType.create(Song1GUIMenu::new));
	public static final RegistryObject<MenuType<Song2GUIMenu>> SONG_2_GUI = REGISTRY.register("song_2_gui", () -> IForgeMenuType.create(Song2GUIMenu::new));
	public static final RegistryObject<MenuType<Song3GUIMenu>> SONG_3_GUI = REGISTRY.register("song_3_gui", () -> IForgeMenuType.create(Song3GUIMenu::new));
	public static final RegistryObject<MenuType<Song4GUIMenu>> SONG_4_GUI = REGISTRY.register("song_4_gui", () -> IForgeMenuType.create(Song4GUIMenu::new));
	public static final RegistryObject<MenuType<Song5GUIMenu>> SONG_5_GUI = REGISTRY.register("song_5_gui", () -> IForgeMenuType.create(Song5GUIMenu::new));
	public static final RegistryObject<MenuType<Song6GUIMenu>> SONG_6_GUI = REGISTRY.register("song_6_gui", () -> IForgeMenuType.create(Song6GUIMenu::new));
	public static final RegistryObject<MenuType<Song7GUIMenu>> SONG_7_GUI = REGISTRY.register("song_7_gui", () -> IForgeMenuType.create(Song7GUIMenu::new));
	public static final RegistryObject<MenuType<Song8GUIMenu>> SONG_8_GUI = REGISTRY.register("song_8_gui", () -> IForgeMenuType.create(Song8GUIMenu::new));
	public static final RegistryObject<MenuType<Song9GUIMenu>> SONG_9_GUI = REGISTRY.register("song_9_gui", () -> IForgeMenuType.create(Song9GUIMenu::new));
	public static final RegistryObject<MenuType<Song10GUIMenu>> SONG_10_GUI = REGISTRY.register("song_10_gui", () -> IForgeMenuType.create(Song10GUIMenu::new));
	public static final RegistryObject<MenuType<Song11GUIMenu>> SONG_11_GUI = REGISTRY.register("song_11_gui", () -> IForgeMenuType.create(Song11GUIMenu::new));
	public static final RegistryObject<MenuType<Song12GUIMenu>> SONG_12_GUI = REGISTRY.register("song_12_gui", () -> IForgeMenuType.create(Song12GUIMenu::new));
	public static final RegistryObject<MenuType<Song13GUIMenu>> SONG_13_GUI = REGISTRY.register("song_13_gui", () -> IForgeMenuType.create(Song13GUIMenu::new));
}
