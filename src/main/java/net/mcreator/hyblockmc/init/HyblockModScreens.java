
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.hyblockmc.client.gui.Song9GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song8GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song7GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song6GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song5GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song4GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song3GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song2GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song1GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song13GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song12GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song11GUIScreen;
import net.mcreator.hyblockmc.client.gui.Song10GUIScreen;
import net.mcreator.hyblockmc.client.gui.HarpSelectionScreen;
import net.mcreator.hyblockmc.client.gui.DebugSongGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HyblockModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HyblockModMenus.HARP_SELECTION.get(), HarpSelectionScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_1_GUI.get(), Song1GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_2_GUI.get(), Song2GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_3_GUI.get(), Song3GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_4_GUI.get(), Song4GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_5_GUI.get(), Song5GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_6_GUI.get(), Song6GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_7_GUI.get(), Song7GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_8_GUI.get(), Song8GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_9_GUI.get(), Song9GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_10_GUI.get(), Song10GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_11_GUI.get(), Song11GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_12_GUI.get(), Song12GUIScreen::new);
			MenuScreens.register(HyblockModMenus.SONG_13_GUI.get(), Song13GUIScreen::new);
			MenuScreens.register(HyblockModMenus.DEBUG_SONG_GUI.get(), DebugSongGUIScreen::new);
		});
	}
}
