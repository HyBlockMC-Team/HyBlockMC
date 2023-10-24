
package net.mcreator.hyblockmc.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class HyBlockMCiconItem extends Item {
	public HyBlockMCiconItem() {
		super(new Item.Properties().stacksTo(0).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}
}
