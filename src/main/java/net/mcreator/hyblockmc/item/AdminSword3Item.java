
package net.mcreator.hyblockmc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.hyblockmc.procedures.AdminSwordSharpness3Procedure;

import java.util.List;

public class AdminSword3Item extends SwordItem {
	public AdminSword3Item() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 9997f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 1f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77Damage: \u00A7c+9,999"));
		list.add(Component.literal("\u00A70."));
		list.add(Component.literal("\u00A7d\"Only those with the power to"));
		list.add(Component.literal("\u00A7dcreate this sword can wield this"));
		list.add(Component.literal("\u00A7dblade.\""));
		list.add(Component.literal("\u00A70."));
		list.add(Component.literal("\u00A70."));
		list.add(Component.literal("\u00A74\u00A7lADMIN SWORD"));
		list.add(Component.literal("\u00A70."));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			AdminSwordSharpness3Procedure.execute(entity);
	}
}
