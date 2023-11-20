
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HyblockMod.MODID);
	public static final RegistryObject<SoundEvent> HARP_INTRO = REGISTRY.register("harp_intro", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_intro")));
	public static final RegistryObject<SoundEvent> HARP_COMPLETE = REGISTRY.register("harp_complete", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_complete")));
	public static final RegistryObject<SoundEvent> HARP_BLUE_NOTE = REGISTRY.register("harp_blue_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_blue_note")));
	public static final RegistryObject<SoundEvent> HARP_GREEN_NOTE = REGISTRY.register("harp_green_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_green_note")));
	public static final RegistryObject<SoundEvent> HARP_LIGHTBLUE_NOTE = REGISTRY.register("harp_lightblue_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_lightblue_note")));
	public static final RegistryObject<SoundEvent> HARP_LIME_NOTE = REGISTRY.register("harp_lime_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_lime_note")));
	public static final RegistryObject<SoundEvent> HARP_PINK_NOTE = REGISTRY.register("harp_pink_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_pink_note")));
	public static final RegistryObject<SoundEvent> HARP_PURPLE_NOTE = REGISTRY.register("harp_purple_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_purple_note")));
	public static final RegistryObject<SoundEvent> HARP_YELLOW_NOTE = REGISTRY.register("harp_yellow_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hyblock", "harp_yellow_note")));
}
