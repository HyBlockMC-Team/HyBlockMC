
package net.mcreator.hyblockmc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.network.chat.Component;

import java.util.List;

public abstract class SkeletonsHelmetItem extends ArmorItem {
	public SkeletonsHelmetItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{1, 4, 5, 1}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 0;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "skeletons_helmet";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends SkeletonsHelmetItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A76Ability: Bone Shield"));
			list.add(Component.literal("\u00A77A Bone Shield will surround you"));
			list.add(Component.literal("\u00A77nullifying damage you take but"));
			list.add(Component.literal("\u00A77consuming a bone in the process."));
			list.add(Component.literal("\u00A77Bones regenerate every \u00A7a30"));
			list.add(Component.literal("\u00A77seconds."));
			list.add(Component.literal("\u00A70."));
			list.add(Component.literal("\u00A79\u00A7lRARE HELMET"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "hyblock:textures/models/armor/monster_hunter__layer_1.png";
		}
	}
}
