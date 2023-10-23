
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyblockmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.hyblockmc.item.TestswordItem;
import net.mcreator.hyblockmc.HyblockMod;

public class HyblockModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HyblockMod.MODID);
	public static final RegistryObject<Item> TESTSWORD = REGISTRY.register("testsword", () -> new TestswordItem());
	public static final RegistryObject<Item> TESTDUMMY_SPAWN_EGG = REGISTRY.register("testdummy_spawn_egg", () -> new ForgeSpawnEggItem(HyblockModEntities.TESTDUMMY, -1, -1, new Item.Properties()));
}
