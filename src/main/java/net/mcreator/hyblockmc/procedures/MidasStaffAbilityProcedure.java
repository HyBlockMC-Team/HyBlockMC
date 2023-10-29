package net.mcreator.hyblockmc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModItems;
import net.mcreator.hyblockmc.init.HyblockModBlocks;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.List;
import java.util.Comparator;

public class MidasStaffAbilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HyblockModVariables.MapVariables.get(world).midas_rows = 0;
		HyblockModVariables.MapVariables.get(world).syncData(world);
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HyblockModItems.MIDAS_STAFF.get()) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), y,
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								String _translatekey = "death.attack." + "moltengold";
								if (this.getEntity() == null && this.getDirectEntity() == null) {
									return _msgEntity.getKillCredit() != null
											? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName());
								} else {
									Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
									ItemStack _itemstack = ItemStack.EMPTY;
									if (this.getEntity() instanceof LivingEntity _livingentity)
										_itemstack = _livingentity.getMainHandItem();
									return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
											? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
								}
							}
						}, 20);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HyblockModItems.MIDAS_STAFF_T_2.get()) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), y,
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								String _translatekey = "death.attack." + "moltengold";
								if (this.getEntity() == null && this.getDirectEntity() == null) {
									return _msgEntity.getKillCredit() != null
											? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName());
								} else {
									Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
									ItemStack _itemstack = ItemStack.EMPTY;
									if (this.getEntity() instanceof LivingEntity _livingentity)
										_itemstack = _livingentity.getMainHandItem();
									return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
											? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
								}
							}
						}, 30);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HyblockModItems.MIDAS_STAFF_T_3.get()) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), y,
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								String _translatekey = "death.attack." + "moltengold";
								if (this.getEntity() == null && this.getDirectEntity() == null) {
									return _msgEntity.getKillCredit() != null
											? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName());
								} else {
									Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
									ItemStack _itemstack = ItemStack.EMPTY;
									if (this.getEntity() instanceof LivingEntity _livingentity)
										_itemstack = _livingentity.getMainHandItem();
									return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
											? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
								}
							}
						}, 40);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HyblockModItems.MIDAS_STAFF_T_4.get()) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), y,
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								String _translatekey = "death.attack." + "moltengold";
								if (this.getEntity() == null && this.getDirectEntity() == null) {
									return _msgEntity.getKillCredit() != null
											? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName());
								} else {
									Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
									ItemStack _itemstack = ItemStack.EMPTY;
									if (this.getEntity() instanceof LivingEntity _livingentity)
										_itemstack = _livingentity.getMainHandItem();
									return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
											? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
								}
							}
						}, 50);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HyblockModItems.MIDAS_STAFF_T_5.get()) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), y,
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								String _translatekey = "death.attack." + "moltengold";
								if (this.getEntity() == null && this.getDirectEntity() == null) {
									return _msgEntity.getKillCredit() != null
											? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName());
								} else {
									Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
									ItemStack _itemstack = ItemStack.EMPTY;
									if (this.getEntity() instanceof LivingEntity _livingentity)
										_itemstack = _livingentity.getMainHandItem();
									return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
											? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
								}
							}
						}, 60);
				}
			}
		}
		HyblockMod.queueServerWork(1, () -> {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HyblockModItems.MIDAS_STAFF.get(), 300);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HyblockModItems.MIDAS_STAFF_T_2.get(), 300);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HyblockModItems.MIDAS_STAFF_T_3.get(), 300);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HyblockModItems.MIDAS_STAFF_T_4.get(), 300);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(HyblockModItems.MIDAS_STAFF_T_5.get(), 300);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
						new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(y + 2),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
						Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle minecraft:flame ~ ~ ~ 1 1 1 0 100 force");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound block.grass.break player @a[distance=..20] ~ ~ ~ 1 0.5 1");
		});
		if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
			HyblockMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level,
							BlockPos.containing(entity.getX() + 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((2 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
							HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level,
							BlockPos.containing(entity.getX(), y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((2 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
							HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level,
							BlockPos.containing(entity.getX() - 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((2 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
							HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
				HyblockMod.queueServerWork(2, () -> {
					if (world instanceof ServerLevel _level)
						FallingBlockEntity.fall(_level,
								BlockPos.containing(entity.getX() + 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((3 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
								HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
					if (world instanceof ServerLevel _level)
						FallingBlockEntity.fall(_level,
								BlockPos.containing(entity.getX(), y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((3 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
								HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
					if (world instanceof ServerLevel _level)
						FallingBlockEntity.fall(_level,
								BlockPos.containing(entity.getX() - 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((3 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
								HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
					HyblockMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, BlockPos.containing(entity.getX() + 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((4 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
									HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, BlockPos.containing(entity.getX(), y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((4 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
									HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, BlockPos.containing(entity.getX() - 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((4 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
									HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						HyblockMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, BlockPos.containing(entity.getX() + 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((5 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
										HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, BlockPos.containing(entity.getX(), y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((5 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
										HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, BlockPos.containing(entity.getX() - 1, y + 4, entity.level().clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((5 + HyblockModVariables.MapVariables.get(world).midas_rows))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
										HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						});
					});
				});
			});
		}
		if ((entity.getDirection()) == Direction.EAST || (entity.getDirection()) == Direction.WEST) {
			HyblockMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level,
							BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((2 + HyblockModVariables.MapVariables.get(world).midas_rows))),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() + 1),
							HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level,
							BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((2 + HyblockModVariables.MapVariables.get(world).midas_rows))),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ()),
							HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level,
							BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((2 + HyblockModVariables.MapVariables.get(world).midas_rows))),
									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() - 1),
							HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
				HyblockMod.queueServerWork(2, () -> {
					if (world instanceof ServerLevel _level)
						FallingBlockEntity.fall(_level,
								BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((3 + HyblockModVariables.MapVariables.get(world).midas_rows))),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() + 1),
								HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
					if (world instanceof ServerLevel _level)
						FallingBlockEntity.fall(_level,
								BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((3 + HyblockModVariables.MapVariables.get(world).midas_rows))),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ()),
								HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
					if (world instanceof ServerLevel _level)
						FallingBlockEntity.fall(_level,
								BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((3 + HyblockModVariables.MapVariables.get(world).midas_rows))),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() - 1),
								HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
					HyblockMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level,
									BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((4 + HyblockModVariables.MapVariables.get(world).midas_rows))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() + 1),
									HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level,
									BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((4 + HyblockModVariables.MapVariables.get(world).midas_rows))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ()),
									HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level,
									BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((4 + HyblockModVariables.MapVariables.get(world).midas_rows))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() - 1),
									HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						HyblockMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level,
										BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((5 + HyblockModVariables.MapVariables.get(world).midas_rows))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() + 1),
										HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level,
										BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((5 + HyblockModVariables.MapVariables.get(world).midas_rows))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ()),
										HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level,
										BlockPos.containing(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((5 + HyblockModVariables.MapVariables.get(world).midas_rows))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), y + 4, entity.getZ() - 1),
										HyblockModBlocks.MIDAS_STAFF_MOLDEN_GOLD.get().defaultBlockState());
						});
					});
				});
			});
		}
	}
}
