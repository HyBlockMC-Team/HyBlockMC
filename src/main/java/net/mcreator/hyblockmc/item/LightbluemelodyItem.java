
package net.mcreator.hyblockmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.hyblockmc.procedures.MelodyColorClearProcedure;

public class LightbluemelodyItem extends Item {
	public LightbluemelodyItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		MelodyColorClearProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}
