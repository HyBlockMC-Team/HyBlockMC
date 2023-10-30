
package net.mcreator.hyblockmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BookSongLockedItem extends Item {
	public BookSongLockedItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
