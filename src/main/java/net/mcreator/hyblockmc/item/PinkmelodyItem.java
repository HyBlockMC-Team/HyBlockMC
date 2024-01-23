
package net.mcreator.hyblockmc.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class PinkmelodyItem extends Item {
	public PinkmelodyItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		MelodyColorClearProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}