package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.hyblockmc.world.inventory.Song1GUIMenu;
import net.mcreator.hyblockmc.network.HyblockModVariables;
import net.mcreator.hyblockmc.init.HyblockModItems;
import net.mcreator.hyblockmc.init.HyblockModBlocks;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;
import java.util.Map;

import io.netty.buffer.Unpooled;

public class Song1OpenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Song1GUI");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new Song1GUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
		{
			double _setval = 3;
			entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.current_song_falling_tickrate = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		SongGuiFillColoursProcedure.execute(world, x, y, z, entity);
		HyblockMod.queueServerWork(40, () -> {
			if ((entity instanceof Player _plr1 && _plr1.containerMenu instanceof Song1GUIMenu) == true) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
					_setstack.setCount(1);
					((Slot) _slots.get(31)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
					if ((entity instanceof Player _plr3 && _plr3.containerMenu instanceof Song1GUIMenu) == true) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
							_setstack.setCount(1);
							((Slot) _slots.get(31)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
							_setstack.setCount(1);
							((Slot) _slots.get(32)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
							if ((entity instanceof Player _plr6 && _plr6.containerMenu instanceof Song1GUIMenu) == true) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
									_setstack.setCount(1);
									((Slot) _slots.get(32)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
									_setstack.setCount(1);
									((Slot) _slots.get(33)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
									_setstack.setCount(1);
									((Slot) _slots.get(31)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
								HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
									if ((entity instanceof Player _plr10 && _plr10.containerMenu instanceof Song1GUIMenu) == true) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
											_setstack.setCount(1);
											((Slot) _slots.get(31)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
											_setstack.setCount(1);
											((Slot) _slots.get(33)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
											_setstack.setCount(1);
											((Slot) _slots.get(32)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
											_setstack.setCount(1);
											((Slot) _slots.get(34)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
										HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
											if ((entity instanceof Player _plr15 && _plr15.containerMenu instanceof Song1GUIMenu) == true) {
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
													_setstack.setCount(1);
													((Slot) _slots.get(34)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
													_setstack.setCount(1);
													((Slot) _slots.get(32)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
													_setstack.setCount(1);
													((Slot) _slots.get(33)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
													_setstack.setCount(1);
													((Slot) _slots.get(41)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
												HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
													if ((entity instanceof Player _plr20 && _plr20.containerMenu instanceof Song1GUIMenu) == true) {
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
															_setstack.setCount(1);
															((Slot) _slots.get(33)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
															_setstack.setCount(1);
															((Slot) _slots.get(41)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_FALLING_MELODY.get());
															_setstack.setCount(1);
															((Slot) _slots.get(34)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
															_setstack.setCount(1);
															((Slot) _slots.get(42)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
														HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																() -> {
																	if ((entity instanceof Player _plr25 && _plr25.containerMenu instanceof Song1GUIMenu) == true) {
																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																			ItemStack _setstack = new ItemStack(HyblockModItems.LIMEMELODY.get());
																			_setstack.setCount(1);
																			((Slot) _slots.get(34)).set(_setstack);
																			_player.containerMenu.broadcastChanges();
																		}
																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																			ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
																			_setstack.setCount(1);
																			((Slot) _slots.get(42)).set(_setstack);
																			_player.containerMenu.broadcastChanges();
																		}
																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																			ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																			_setstack.setCount(1);
																			((Slot) _slots.get(51)).set(_setstack);
																			_player.containerMenu.broadcastChanges();
																		}
																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																			ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
																			_setstack.setCount(1);
																			((Slot) _slots.get(43)).set(_setstack);
																			_player.containerMenu.broadcastChanges();
																		}
																		HyblockMod.queueServerWork(
																				(int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																				() -> {
																					if ((entity instanceof Player _plr30 && _plr30.containerMenu instanceof Song1GUIMenu) == true) {
																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																							ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																							_setstack.setCount(1);
																							((Slot) _slots.get(51)).set(_setstack);
																							_player.containerMenu.broadcastChanges();
																						}
																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																							ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
																							_setstack.setCount(1);
																							((Slot) _slots.get(43)).set(_setstack);
																							_player.containerMenu.broadcastChanges();
																						}
																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																							ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																							_setstack.setCount(1);
																							((Slot) _slots.get(52)).set(_setstack);
																							_player.containerMenu.broadcastChanges();
																						}
																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																							ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
																							_setstack.setCount(1);
																							((Slot) _slots.get(44)).set(_setstack);
																							_player.containerMenu.broadcastChanges();
																						}
																						HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
																									if ((entity instanceof Player _plr35 && _plr35.containerMenu instanceof Song1GUIMenu) == true) {
																										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																											ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																											_setstack.setCount(1);
																											((Slot) _slots.get(52)).set(_setstack);
																											_player.containerMenu.broadcastChanges();
																										}
																										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																											ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
																											_setstack.setCount(1);
																											((Slot) _slots.get(44)).set(_setstack);
																											_player.containerMenu.broadcastChanges();
																										}
																										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																											ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																											_setstack.setCount(1);
																											((Slot) _slots.get(53)).set(_setstack);
																											_player.containerMenu.broadcastChanges();
																										}
																										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																											ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																											_setstack.setCount(1);
																											((Slot) _slots.get(51)).set(_setstack);
																											_player.containerMenu.broadcastChanges();
																										}
																										HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
																													if ((entity instanceof Player _plr40 && _plr40.containerMenu instanceof Song1GUIMenu) == true) {
																														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																&& _current.get() instanceof Map _slots) {
																															ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																															_setstack.setCount(1);
																															((Slot) _slots.get(53)).set(_setstack);
																															_player.containerMenu.broadcastChanges();
																														}
																														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																&& _current.get() instanceof Map _slots) {
																															ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																															_setstack.setCount(1);
																															((Slot) _slots.get(51)).set(_setstack);
																															_player.containerMenu.broadcastChanges();
																														}
																														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																&& _current.get() instanceof Map _slots) {
																															ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																															_setstack.setCount(1);
																															((Slot) _slots.get(54)).set(_setstack);
																															_player.containerMenu.broadcastChanges();
																														}
																														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																&& _current.get() instanceof Map _slots) {
																															ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																															_setstack.setCount(1);
																															((Slot) _slots.get(52)).set(_setstack);
																															_player.containerMenu.broadcastChanges();
																														}
																														HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
																																	if ((entity instanceof Player _plr45 && _plr45.containerMenu instanceof Song1GUIMenu) == true) {
																																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																				&& _current.get() instanceof Map _slots) {
																																			ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																																			_setstack.setCount(1);
																																			((Slot) _slots.get(52)).set(_setstack);
																																			_player.containerMenu.broadcastChanges();
																																		}
																																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																				&& _current.get() instanceof Map _slots) {
																																			ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																																			_setstack.setCount(1);
																																			((Slot) _slots.get(54)).set(_setstack);
																																			_player.containerMenu.broadcastChanges();
																																		}
																																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																				&& _current.get() instanceof Map _slots) {
																																			ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																																			_setstack.setCount(1);
																																			((Slot) _slots.get(53)).set(_setstack);
																																			_player.containerMenu.broadcastChanges();
																																		}
																																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																				&& _current.get() instanceof Map _slots) {
																																			ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
																																			_setstack.setCount(1);
																																			((Slot) _slots.get(41)).set(_setstack);
																																			_player.containerMenu.broadcastChanges();
																																		}
																																		HyblockMod.queueServerWork((int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																				.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate, () -> {
																																					if ((entity instanceof Player _plr50 && _plr50.containerMenu instanceof Song1GUIMenu) == true) {
																																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																								&& _current.get() instanceof Map _slots) {
																																							ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																																							_setstack.setCount(1);
																																							((Slot) _slots.get(53)).set(_setstack);
																																							_player.containerMenu.broadcastChanges();
																																						}
																																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																								&& _current.get() instanceof Map _slots) {
																																							ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
																																							_setstack.setCount(1);
																																							((Slot) _slots.get(41)).set(_setstack);
																																							_player.containerMenu.broadcastChanges();
																																						}
																																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																								&& _current.get() instanceof Map _slots) {
																																							ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
																																							_setstack.setCount(1);
																																							((Slot) _slots.get(54)).set(_setstack);
																																							_player.containerMenu.broadcastChanges();
																																						}
																																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																								&& _current.get() instanceof Map _slots) {
																																							ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
																																							_setstack.setCount(1);
																																							((Slot) _slots.get(42)).set(_setstack);
																																							_player.containerMenu.broadcastChanges();
																																						}
																																						HyblockMod.queueServerWork(
																																								(int) (entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																										.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																								() -> {
																																									if ((entity instanceof Player _plr55
																																											&& _plr55.containerMenu instanceof Song1GUIMenu) == true) {
																																										if (entity instanceof Player _player
																																												&& _player.containerMenu instanceof Supplier _current
																																												&& _current.get() instanceof Map _slots) {
																																											ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
																																											_setstack.setCount(1);
																																											((Slot) _slots.get(54)).set(_setstack);
																																											_player.containerMenu.broadcastChanges();
																																										}
																																										if (entity instanceof Player _player
																																												&& _player.containerMenu instanceof Supplier _current
																																												&& _current.get() instanceof Map _slots) {
																																											ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
																																											_setstack.setCount(1);
																																											((Slot) _slots.get(42)).set(_setstack);
																																											_player.containerMenu.broadcastChanges();
																																										}
																																										if (entity instanceof Player _player
																																												&& _player.containerMenu instanceof Supplier _current
																																												&& _current.get() instanceof Map _slots) {
																																											ItemStack _setstack = new ItemStack(
																																													HyblockModBlocks.LIME_FALLING_MELODY.get());
																																											_setstack.setCount(1);
																																											((Slot) _slots.get(31)).set(_setstack);
																																											_player.containerMenu.broadcastChanges();
																																										}
																																										if (entity instanceof Player _player
																																												&& _player.containerMenu instanceof Supplier _current
																																												&& _current.get() instanceof Map _slots) {
																																											ItemStack _setstack = new ItemStack(
																																													HyblockModBlocks.GREEN_FALLING_MELODY.get());
																																											_setstack.setCount(1);
																																											((Slot) _slots.get(43)).set(_setstack);
																																											_player.containerMenu.broadcastChanges();
																																										}
																																										HyblockMod.queueServerWork((int) (entity
																																												.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																												() -> {
																																													if ((entity instanceof Player _plr60
																																															&& _plr60.containerMenu instanceof Song1GUIMenu) == true) {
																																														if (entity instanceof Player _player
																																																&& _player.containerMenu instanceof Supplier _current
																																																&& _current.get() instanceof Map _slots) {
																																															ItemStack _setstack = new ItemStack(
																																																	HyblockModItems.LIMEMELODY.get());
																																															_setstack.setCount(1);
																																															((Slot) _slots.get(31)).set(_setstack);
																																															_player.containerMenu.broadcastChanges();
																																														}
																																														if (entity instanceof Player _player
																																																&& _player.containerMenu instanceof Supplier _current
																																																&& _current.get() instanceof Map _slots) {
																																															ItemStack _setstack = new ItemStack(
																																																	HyblockModItems.GREENMELODY.get());
																																															_setstack.setCount(1);
																																															((Slot) _slots.get(43)).set(_setstack);
																																															_player.containerMenu.broadcastChanges();
																																														}
																																														if (entity instanceof Player _player
																																																&& _player.containerMenu instanceof Supplier _current
																																																&& _current.get() instanceof Map _slots) {
																																															ItemStack _setstack = new ItemStack(
																																																	HyblockModBlocks.LIME_FALLING_MELODY.get());
																																															_setstack.setCount(1);
																																															((Slot) _slots.get(32)).set(_setstack);
																																															_player.containerMenu.broadcastChanges();
																																														}
																																														if (entity instanceof Player _player
																																																&& _player.containerMenu instanceof Supplier _current
																																																&& _current.get() instanceof Map _slots) {
																																															ItemStack _setstack = new ItemStack(
																																																	HyblockModBlocks.GREEN_FALLING_MELODY.get());
																																															_setstack.setCount(1);
																																															((Slot) _slots.get(44)).set(_setstack);
																																															_player.containerMenu.broadcastChanges();
																																														}
																																														HyblockMod.queueServerWork((int) (entity.getCapability(
																																																HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																() -> {
																																																	if ((entity instanceof Player _plr65
																																																			&& _plr65.containerMenu instanceof Song1GUIMenu) == true) {
																																																		if (entity instanceof Player _player
																																																				&& _player.containerMenu instanceof Supplier _current
																																																				&& _current.get() instanceof Map _slots) {
																																																			ItemStack _setstack = new ItemStack(
																																																					HyblockModItems.LIMEMELODY.get());
																																																			_setstack.setCount(1);
																																																			((Slot) _slots.get(32)).set(_setstack);
																																																			_player.containerMenu.broadcastChanges();
																																																		}
																																																		if (entity instanceof Player _player
																																																				&& _player.containerMenu instanceof Supplier _current
																																																				&& _current.get() instanceof Map _slots) {
																																																			ItemStack _setstack = new ItemStack(
																																																					HyblockModItems.GREENMELODY.get());
																																																			_setstack.setCount(1);
																																																			((Slot) _slots.get(44)).set(_setstack);
																																																			_player.containerMenu.broadcastChanges();
																																																		}
																																																		if (entity instanceof Player _player
																																																				&& _player.containerMenu instanceof Supplier _current
																																																				&& _current.get() instanceof Map _slots) {
																																																			ItemStack _setstack = new ItemStack(
																																																					HyblockModBlocks.LIME_FALLING_MELODY
																																																							.get());
																																																			_setstack.setCount(1);
																																																			((Slot) _slots.get(33)).set(_setstack);
																																																			_player.containerMenu.broadcastChanges();
																																																		}
																																																		if (entity instanceof Player _player
																																																				&& _player.containerMenu instanceof Supplier _current
																																																				&& _current.get() instanceof Map _slots) {
																																																			ItemStack _setstack = new ItemStack(
																																																					HyblockModBlocks.YELLOW_FALLING_MELODY
																																																							.get());
																																																			_setstack.setCount(1);
																																																			((Slot) _slots.get(21)).set(_setstack);
																																																			_player.containerMenu.broadcastChanges();
																																																		}
																																																		HyblockMod.queueServerWork((int) (entity
																																																				.getCapability(
																																																						HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																						null)
																																																				.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																				() -> {
																																																					if ((entity instanceof Player _plr70
																																																							&& _plr70.containerMenu instanceof Song1GUIMenu) == true) {
																																																						if (entity instanceof Player _player
																																																								&& _player.containerMenu instanceof Supplier _current
																																																								&& _current
																																																										.get() instanceof Map _slots) {
																																																							ItemStack _setstack = new ItemStack(
																																																									HyblockModItems.LIMEMELODY
																																																											.get());
																																																							_setstack.setCount(1);
																																																							((Slot) _slots.get(33))
																																																									.set(_setstack);
																																																							_player.containerMenu
																																																									.broadcastChanges();
																																																						}
																																																						if (entity instanceof Player _player
																																																								&& _player.containerMenu instanceof Supplier _current
																																																								&& _current
																																																										.get() instanceof Map _slots) {
																																																							ItemStack _setstack = new ItemStack(
																																																									HyblockModItems.YELLOWMELODY
																																																											.get());
																																																							_setstack.setCount(1);
																																																							((Slot) _slots.get(21))
																																																									.set(_setstack);
																																																							_player.containerMenu
																																																									.broadcastChanges();
																																																						}
																																																						if (entity instanceof Player _player
																																																								&& _player.containerMenu instanceof Supplier _current
																																																								&& _current
																																																										.get() instanceof Map _slots) {
																																																							ItemStack _setstack = new ItemStack(
																																																									HyblockModBlocks.LIME_FALLING_MELODY
																																																											.get());
																																																							_setstack.setCount(1);
																																																							((Slot) _slots.get(34))
																																																									.set(_setstack);
																																																							_player.containerMenu
																																																									.broadcastChanges();
																																																						}
																																																						if (entity instanceof Player _player
																																																								&& _player.containerMenu instanceof Supplier _current
																																																								&& _current
																																																										.get() instanceof Map _slots) {
																																																							ItemStack _setstack = new ItemStack(
																																																									HyblockModBlocks.YELLOW_FALLING_MELODY
																																																											.get());
																																																							_setstack.setCount(1);
																																																							((Slot) _slots.get(22))
																																																									.set(_setstack);
																																																							_player.containerMenu
																																																									.broadcastChanges();
																																																						}
																																																						HyblockMod.queueServerWork(
																																																								(int) (entity
																																																										.getCapability(
																																																												HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																												null)
																																																										.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																								() -> {
																																																									if ((entity instanceof Player _plr75
																																																											&& _plr75.containerMenu instanceof Song1GUIMenu) == true) {
																																																										if (entity instanceof Player _player
																																																												&& _player.containerMenu instanceof Supplier _current
																																																												&& _current
																																																														.get() instanceof Map _slots) {
																																																											ItemStack _setstack = new ItemStack(
																																																													HyblockModItems.LIMEMELODY
																																																															.get());
																																																											_setstack
																																																													.setCount(
																																																															1);
																																																											((Slot) _slots
																																																													.get(34))
																																																													.set(_setstack);
																																																											_player.containerMenu
																																																													.broadcastChanges();
																																																										}
																																																										if (entity instanceof Player _player
																																																												&& _player.containerMenu instanceof Supplier _current
																																																												&& _current
																																																														.get() instanceof Map _slots) {
																																																											ItemStack _setstack = new ItemStack(
																																																													HyblockModItems.YELLOWMELODY
																																																															.get());
																																																											_setstack
																																																													.setCount(
																																																															1);
																																																											((Slot) _slots
																																																													.get(22))
																																																													.set(_setstack);
																																																											_player.containerMenu
																																																													.broadcastChanges();
																																																										}
																																																										if (entity instanceof Player _player
																																																												&& _player.containerMenu instanceof Supplier _current
																																																												&& _current
																																																														.get() instanceof Map _slots) {
																																																											ItemStack _setstack = new ItemStack(
																																																													HyblockModBlocks.PINK_FALLING_MELODY
																																																															.get());
																																																											_setstack
																																																													.setCount(
																																																															1);
																																																											((Slot) _slots
																																																													.get(11))
																																																													.set(_setstack);
																																																											_player.containerMenu
																																																													.broadcastChanges();
																																																										}
																																																										if (entity instanceof Player _player
																																																												&& _player.containerMenu instanceof Supplier _current
																																																												&& _current
																																																														.get() instanceof Map _slots) {
																																																											ItemStack _setstack = new ItemStack(
																																																													HyblockModBlocks.YELLOW_FALLING_MELODY
																																																															.get());
																																																											_setstack
																																																													.setCount(
																																																															1);
																																																											((Slot) _slots
																																																													.get(23))
																																																													.set(_setstack);
																																																											_player.containerMenu
																																																													.broadcastChanges();
																																																										}
																																																										HyblockMod
																																																												.queueServerWork(
																																																														(int) (entity
																																																																.getCapability(
																																																																		HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																		null)
																																																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																														() -> {
																																																															if ((entity instanceof Player _plr80
																																																																	&& _plr80.containerMenu instanceof Song1GUIMenu) == true) {
																																																																if (entity instanceof Player _player
																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																		&& _current
																																																																				.get() instanceof Map _slots) {
																																																																	ItemStack _setstack = new ItemStack(
																																																																			HyblockModItems.PINKMELODY
																																																																					.get());
																																																																	_setstack
																																																																			.setCount(
																																																																					1);
																																																																	((Slot) _slots
																																																																			.get(11))
																																																																			.set(_setstack);
																																																																	_player.containerMenu
																																																																			.broadcastChanges();
																																																																}
																																																																if (entity instanceof Player _player
																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																		&& _current
																																																																				.get() instanceof Map _slots) {
																																																																	ItemStack _setstack = new ItemStack(
																																																																			HyblockModItems.YELLOWMELODY
																																																																					.get());
																																																																	_setstack
																																																																			.setCount(
																																																																					1);
																																																																	((Slot) _slots
																																																																			.get(23))
																																																																			.set(_setstack);
																																																																	_player.containerMenu
																																																																			.broadcastChanges();
																																																																}
																																																																if (entity instanceof Player _player
																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																		&& _current
																																																																				.get() instanceof Map _slots) {
																																																																	ItemStack _setstack = new ItemStack(
																																																																			HyblockModBlocks.PINK_FALLING_MELODY
																																																																					.get());
																																																																	_setstack
																																																																			.setCount(
																																																																					1);
																																																																	((Slot) _slots
																																																																			.get(12))
																																																																			.set(_setstack);
																																																																	_player.containerMenu
																																																																			.broadcastChanges();
																																																																}
																																																																if (entity instanceof Player _player
																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																		&& _current
																																																																				.get() instanceof Map _slots) {
																																																																	ItemStack _setstack = new ItemStack(
																																																																			HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																					.get());
																																																																	_setstack
																																																																			.setCount(
																																																																					1);
																																																																	((Slot) _slots
																																																																			.get(24))
																																																																			.set(_setstack);
																																																																	_player.containerMenu
																																																																			.broadcastChanges();
																																																																}
																																																																HyblockMod
																																																																		.queueServerWork(
																																																																				(int) (entity
																																																																						.getCapability(
																																																																								HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																								null)
																																																																						.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																				() -> {
																																																																					if ((entity instanceof Player _plr85
																																																																							&& _plr85.containerMenu instanceof Song1GUIMenu) == true) {
																																																																						if (entity instanceof Player _player
																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																								&& _current
																																																																										.get() instanceof Map _slots) {
																																																																							ItemStack _setstack = new ItemStack(
																																																																									HyblockModItems.PINKMELODY
																																																																											.get());
																																																																							_setstack
																																																																									.setCount(
																																																																											1);
																																																																							((Slot) _slots
																																																																									.get(12))
																																																																									.set(_setstack);
																																																																							_player.containerMenu
																																																																									.broadcastChanges();
																																																																						}
																																																																						if (entity instanceof Player _player
																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																								&& _current
																																																																										.get() instanceof Map _slots) {
																																																																							ItemStack _setstack = new ItemStack(
																																																																									HyblockModItems.YELLOWMELODY
																																																																											.get());
																																																																							_setstack
																																																																									.setCount(
																																																																											1);
																																																																							((Slot) _slots
																																																																									.get(24))
																																																																									.set(_setstack);
																																																																							_player.containerMenu
																																																																									.broadcastChanges();
																																																																						}
																																																																						if (entity instanceof Player _player
																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																								&& _current
																																																																										.get() instanceof Map _slots) {
																																																																							ItemStack _setstack = new ItemStack(
																																																																									HyblockModBlocks.PINK_FALLING_MELODY
																																																																											.get());
																																																																							_setstack
																																																																									.setCount(
																																																																											1);
																																																																							((Slot) _slots
																																																																									.get(13))
																																																																									.set(_setstack);
																																																																							_player.containerMenu
																																																																									.broadcastChanges();
																																																																						}
																																																																						if (entity instanceof Player _player
																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																								&& _current
																																																																										.get() instanceof Map _slots) {
																																																																							ItemStack _setstack = new ItemStack(
																																																																									HyblockModBlocks.PINK_FALLING_MELODY
																																																																											.get());
																																																																							_setstack
																																																																									.setCount(
																																																																											1);
																																																																							((Slot) _slots
																																																																									.get(11))
																																																																									.set(_setstack);
																																																																							_player.containerMenu
																																																																									.broadcastChanges();
																																																																						}
																																																																						HyblockMod
																																																																								.queueServerWork(
																																																																										(int) (entity
																																																																												.getCapability(
																																																																														HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																														null)
																																																																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																										() -> {
																																																																											if ((entity instanceof Player _plr90
																																																																													&& _plr90.containerMenu instanceof Song1GUIMenu) == true) {
																																																																												if (entity instanceof Player _player
																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																														&& _current
																																																																																.get() instanceof Map _slots) {
																																																																													ItemStack _setstack = new ItemStack(
																																																																															HyblockModItems.PINKMELODY
																																																																																	.get());
																																																																													_setstack
																																																																															.setCount(
																																																																																	1);
																																																																													((Slot) _slots
																																																																															.get(13))
																																																																															.set(_setstack);
																																																																													_player.containerMenu
																																																																															.broadcastChanges();
																																																																												}
																																																																												if (entity instanceof Player _player
																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																														&& _current
																																																																																.get() instanceof Map _slots) {
																																																																													ItemStack _setstack = new ItemStack(
																																																																															HyblockModItems.PINKMELODY
																																																																																	.get());
																																																																													_setstack
																																																																															.setCount(
																																																																																	1);
																																																																													((Slot) _slots
																																																																															.get(11))
																																																																															.set(_setstack);
																																																																													_player.containerMenu
																																																																															.broadcastChanges();
																																																																												}
																																																																												if (entity instanceof Player _player
																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																														&& _current
																																																																																.get() instanceof Map _slots) {
																																																																													ItemStack _setstack = new ItemStack(
																																																																															HyblockModBlocks.PINK_FALLING_MELODY
																																																																																	.get());
																																																																													_setstack
																																																																															.setCount(
																																																																																	1);
																																																																													((Slot) _slots
																																																																															.get(14))
																																																																															.set(_setstack);
																																																																													_player.containerMenu
																																																																															.broadcastChanges();
																																																																												}
																																																																												if (entity instanceof Player _player
																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																														&& _current
																																																																																.get() instanceof Map _slots) {
																																																																													ItemStack _setstack = new ItemStack(
																																																																															HyblockModBlocks.PINK_FALLING_MELODY
																																																																																	.get());
																																																																													_setstack
																																																																															.setCount(
																																																																																	1);
																																																																													((Slot) _slots
																																																																															.get(12))
																																																																															.set(_setstack);
																																																																													_player.containerMenu
																																																																															.broadcastChanges();
																																																																												}
																																																																												HyblockMod
																																																																														.queueServerWork(
																																																																																(int) (entity
																																																																																		.getCapability(
																																																																																				HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																				null)
																																																																																		.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																() -> {
																																																																																	if ((entity instanceof Player _plr95
																																																																																			&& _plr95.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																		if (entity instanceof Player _player
																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																				&& _current
																																																																																						.get() instanceof Map _slots) {
																																																																																			ItemStack _setstack = new ItemStack(
																																																																																					HyblockModItems.PINKMELODY
																																																																																							.get());
																																																																																			_setstack
																																																																																					.setCount(
																																																																																							1);
																																																																																			((Slot) _slots
																																																																																					.get(14))
																																																																																					.set(_setstack);
																																																																																			_player.containerMenu
																																																																																					.broadcastChanges();
																																																																																		}
																																																																																		if (entity instanceof Player _player
																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																				&& _current
																																																																																						.get() instanceof Map _slots) {
																																																																																			ItemStack _setstack = new ItemStack(
																																																																																					HyblockModItems.PINKMELODY
																																																																																							.get());
																																																																																			_setstack
																																																																																					.setCount(
																																																																																							1);
																																																																																			((Slot) _slots
																																																																																					.get(12))
																																																																																					.set(_setstack);
																																																																																			_player.containerMenu
																																																																																					.broadcastChanges();
																																																																																		}
																																																																																		if (entity instanceof Player _player
																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																				&& _current
																																																																																						.get() instanceof Map _slots) {
																																																																																			ItemStack _setstack = new ItemStack(
																																																																																					HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																							.get());
																																																																																			_setstack
																																																																																					.setCount(
																																																																																							1);
																																																																																			((Slot) _slots
																																																																																					.get(21))
																																																																																					.set(_setstack);
																																																																																			_player.containerMenu
																																																																																					.broadcastChanges();
																																																																																		}
																																																																																		if (entity instanceof Player _player
																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																				&& _current
																																																																																						.get() instanceof Map _slots) {
																																																																																			ItemStack _setstack = new ItemStack(
																																																																																					HyblockModBlocks.PINK_FALLING_MELODY
																																																																																							.get());
																																																																																			_setstack
																																																																																					.setCount(
																																																																																							1);
																																																																																			((Slot) _slots
																																																																																					.get(13))
																																																																																					.set(_setstack);
																																																																																			_player.containerMenu
																																																																																					.broadcastChanges();
																																																																																		}
																																																																																		HyblockMod
																																																																																				.queueServerWork(
																																																																																						(int) (entity
																																																																																								.getCapability(
																																																																																										HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																										null)
																																																																																								.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																						() -> {
																																																																																							if ((entity instanceof Player _plr100
																																																																																									&& _plr100.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																								if (entity instanceof Player _player
																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																										&& _current
																																																																																												.get() instanceof Map _slots) {
																																																																																									ItemStack _setstack = new ItemStack(
																																																																																											HyblockModItems.YELLOWMELODY
																																																																																													.get());
																																																																																									_setstack
																																																																																											.setCount(
																																																																																													1);
																																																																																									((Slot) _slots
																																																																																											.get(21))
																																																																																											.set(_setstack);
																																																																																									_player.containerMenu
																																																																																											.broadcastChanges();
																																																																																								}
																																																																																								if (entity instanceof Player _player
																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																										&& _current
																																																																																												.get() instanceof Map _slots) {
																																																																																									ItemStack _setstack = new ItemStack(
																																																																																											HyblockModItems.PINKMELODY
																																																																																													.get());
																																																																																									_setstack
																																																																																											.setCount(
																																																																																													1);
																																																																																									((Slot) _slots
																																																																																											.get(13))
																																																																																											.set(_setstack);
																																																																																									_player.containerMenu
																																																																																											.broadcastChanges();
																																																																																								}
																																																																																								if (entity instanceof Player _player
																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																										&& _current
																																																																																												.get() instanceof Map _slots) {
																																																																																									ItemStack _setstack = new ItemStack(
																																																																																											HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																													.get());
																																																																																									_setstack
																																																																																											.setCount(
																																																																																													1);
																																																																																									((Slot) _slots
																																																																																											.get(22))
																																																																																											.set(_setstack);
																																																																																									_player.containerMenu
																																																																																											.broadcastChanges();
																																																																																								}
																																																																																								if (entity instanceof Player _player
																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																										&& _current
																																																																																												.get() instanceof Map _slots) {
																																																																																									ItemStack _setstack = new ItemStack(
																																																																																											HyblockModBlocks.PINK_FALLING_MELODY
																																																																																													.get());
																																																																																									_setstack
																																																																																											.setCount(
																																																																																													1);
																																																																																									((Slot) _slots
																																																																																											.get(14))
																																																																																											.set(_setstack);
																																																																																									_player.containerMenu
																																																																																											.broadcastChanges();
																																																																																								}
																																																																																								HyblockMod
																																																																																										.queueServerWork(
																																																																																												(int) (entity
																																																																																														.getCapability(
																																																																																																HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																null)
																																																																																														.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																												() -> {
																																																																																													if ((entity instanceof Player _plr105
																																																																																															&& _plr105.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																														if (entity instanceof Player _player
																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																&& _current
																																																																																																		.get() instanceof Map _slots) {
																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																	HyblockModItems.YELLOWMELODY
																																																																																																			.get());
																																																																																															_setstack
																																																																																																	.setCount(
																																																																																																			1);
																																																																																															((Slot) _slots
																																																																																																	.get(22))
																																																																																																	.set(_setstack);
																																																																																															_player.containerMenu
																																																																																																	.broadcastChanges();
																																																																																														}
																																																																																														if (entity instanceof Player _player
																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																&& _current
																																																																																																		.get() instanceof Map _slots) {
																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																	HyblockModItems.PINKMELODY
																																																																																																			.get());
																																																																																															_setstack
																																																																																																	.setCount(
																																																																																																			1);
																																																																																															((Slot) _slots
																																																																																																	.get(14))
																																																																																																	.set(_setstack);
																																																																																															_player.containerMenu
																																																																																																	.broadcastChanges();
																																																																																														}
																																																																																														if (entity instanceof Player _player
																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																&& _current
																																																																																																		.get() instanceof Map _slots) {
																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																	HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																			.get());
																																																																																															_setstack
																																																																																																	.setCount(
																																																																																																			1);
																																																																																															((Slot) _slots
																																																																																																	.get(23))
																																																																																																	.set(_setstack);
																																																																																															_player.containerMenu
																																																																																																	.broadcastChanges();
																																																																																														}
																																																																																														if (entity instanceof Player _player
																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																&& _current
																																																																																																		.get() instanceof Map _slots) {
																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																	HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																			.get());
																																																																																															_setstack
																																																																																																	.setCount(
																																																																																																			1);
																																																																																															((Slot) _slots
																																																																																																	.get(31))
																																																																																																	.set(_setstack);
																																																																																															_player.containerMenu
																																																																																																	.broadcastChanges();
																																																																																														}
																																																																																														HyblockMod
																																																																																																.queueServerWork(
																																																																																																		(int) (entity
																																																																																																				.getCapability(
																																																																																																						HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																						null)
																																																																																																				.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																		() -> {
																																																																																																			if ((entity instanceof Player _plr110
																																																																																																					&& _plr110.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																				if (entity instanceof Player _player
																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																						&& _current
																																																																																																								.get() instanceof Map _slots) {
																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																							HyblockModItems.YELLOWMELODY
																																																																																																									.get());
																																																																																																					_setstack
																																																																																																							.setCount(
																																																																																																									1);
																																																																																																					((Slot) _slots
																																																																																																							.get(23))
																																																																																																							.set(_setstack);
																																																																																																					_player.containerMenu
																																																																																																							.broadcastChanges();
																																																																																																				}
																																																																																																				if (entity instanceof Player _player
																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																						&& _current
																																																																																																								.get() instanceof Map _slots) {
																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																							HyblockModItems.LIMEMELODY
																																																																																																									.get());
																																																																																																					_setstack
																																																																																																							.setCount(
																																																																																																									1);
																																																																																																					((Slot) _slots
																																																																																																							.get(31))
																																																																																																							.set(_setstack);
																																																																																																					_player.containerMenu
																																																																																																							.broadcastChanges();
																																																																																																				}
																																																																																																				if (entity instanceof Player _player
																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																						&& _current
																																																																																																								.get() instanceof Map _slots) {
																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																							HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																									.get());
																																																																																																					_setstack
																																																																																																							.setCount(
																																																																																																									1);
																																																																																																					((Slot) _slots
																																																																																																							.get(24))
																																																																																																							.set(_setstack);
																																																																																																					_player.containerMenu
																																																																																																							.broadcastChanges();
																																																																																																				}
																																																																																																				if (entity instanceof Player _player
																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																						&& _current
																																																																																																								.get() instanceof Map _slots) {
																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																							HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																									.get());
																																																																																																					_setstack
																																																																																																							.setCount(
																																																																																																									1);
																																																																																																					((Slot) _slots
																																																																																																							.get(32))
																																																																																																							.set(_setstack);
																																																																																																					_player.containerMenu
																																																																																																							.broadcastChanges();
																																																																																																				}
																																																																																																				HyblockMod
																																																																																																						.queueServerWork(
																																																																																																								(int) (entity
																																																																																																										.getCapability(
																																																																																																												HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																												null)
																																																																																																										.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																								() -> {
																																																																																																									if ((entity instanceof Player _plr115
																																																																																																											&& _plr115.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																										if (entity instanceof Player _player
																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																												&& _current
																																																																																																														.get() instanceof Map _slots) {
																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																													HyblockModItems.YELLOWMELODY
																																																																																																															.get());
																																																																																																											_setstack
																																																																																																													.setCount(
																																																																																																															1);
																																																																																																											((Slot) _slots
																																																																																																													.get(24))
																																																																																																													.set(_setstack);
																																																																																																											_player.containerMenu
																																																																																																													.broadcastChanges();
																																																																																																										}
																																																																																																										if (entity instanceof Player _player
																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																												&& _current
																																																																																																														.get() instanceof Map _slots) {
																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																													HyblockModItems.LIMEMELODY
																																																																																																															.get());
																																																																																																											_setstack
																																																																																																													.setCount(
																																																																																																															1);
																																																																																																											((Slot) _slots
																																																																																																													.get(32))
																																																																																																													.set(_setstack);
																																																																																																											_player.containerMenu
																																																																																																													.broadcastChanges();
																																																																																																										}
																																																																																																										if (entity instanceof Player _player
																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																												&& _current
																																																																																																														.get() instanceof Map _slots) {
																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																													HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																															.get());
																																																																																																											_setstack
																																																																																																													.setCount(
																																																																																																															1);
																																																																																																											((Slot) _slots
																																																																																																													.get(31))
																																																																																																													.set(_setstack);
																																																																																																											_player.containerMenu
																																																																																																													.broadcastChanges();
																																																																																																										}
																																																																																																										if (entity instanceof Player _player
																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																												&& _current
																																																																																																														.get() instanceof Map _slots) {
																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																													HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																															.get());
																																																																																																											_setstack
																																																																																																													.setCount(
																																																																																																															1);
																																																																																																											((Slot) _slots
																																																																																																													.get(33))
																																																																																																													.set(_setstack);
																																																																																																											_player.containerMenu
																																																																																																													.broadcastChanges();
																																																																																																										}
																																																																																																										HyblockMod
																																																																																																												.queueServerWork(
																																																																																																														(int) (entity
																																																																																																																.getCapability(
																																																																																																																		HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																		null)
																																																																																																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																														() -> {
																																																																																																															if ((entity instanceof Player _plr120
																																																																																																																	&& _plr120.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																if (entity instanceof Player _player
																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																		&& _current
																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																			HyblockModItems.LIMEMELODY
																																																																																																																					.get());
																																																																																																																	_setstack
																																																																																																																			.setCount(
																																																																																																																					1);
																																																																																																																	((Slot) _slots
																																																																																																																			.get(31))
																																																																																																																			.set(_setstack);
																																																																																																																	_player.containerMenu
																																																																																																																			.broadcastChanges();
																																																																																																																}
																																																																																																																if (entity instanceof Player _player
																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																		&& _current
																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																			HyblockModItems.LIMEMELODY
																																																																																																																					.get());
																																																																																																																	_setstack
																																																																																																																			.setCount(
																																																																																																																					1);
																																																																																																																	((Slot) _slots
																																																																																																																			.get(33))
																																																																																																																			.set(_setstack);
																																																																																																																	_player.containerMenu
																																																																																																																			.broadcastChanges();
																																																																																																																}
																																																																																																																if (entity instanceof Player _player
																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																		&& _current
																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																			HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																					.get());
																																																																																																																	_setstack
																																																																																																																			.setCount(
																																																																																																																					1);
																																																																																																																	((Slot) _slots
																																																																																																																			.get(32))
																																																																																																																			.set(_setstack);
																																																																																																																	_player.containerMenu
																																																																																																																			.broadcastChanges();
																																																																																																																}
																																																																																																																if (entity instanceof Player _player
																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																		&& _current
																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																			HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																					.get());
																																																																																																																	_setstack
																																																																																																																			.setCount(
																																																																																																																					1);
																																																																																																																	((Slot) _slots
																																																																																																																			.get(34))
																																																																																																																			.set(_setstack);
																																																																																																																	_player.containerMenu
																																																																																																																			.broadcastChanges();
																																																																																																																}
																																																																																																																HyblockMod
																																																																																																																		.queueServerWork(
																																																																																																																				(int) (entity
																																																																																																																						.getCapability(
																																																																																																																								HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																								null)
																																																																																																																						.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																				() -> {
																																																																																																																					if ((entity instanceof Player _plr125
																																																																																																																							&& _plr125.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																						if (entity instanceof Player _player
																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																								&& _current
																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																									HyblockModItems.LIMEMELODY
																																																																																																																											.get());
																																																																																																																							_setstack
																																																																																																																									.setCount(
																																																																																																																											1);
																																																																																																																							((Slot) _slots
																																																																																																																									.get(32))
																																																																																																																									.set(_setstack);
																																																																																																																							_player.containerMenu
																																																																																																																									.broadcastChanges();
																																																																																																																						}
																																																																																																																						if (entity instanceof Player _player
																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																								&& _current
																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																									HyblockModItems.LIMEMELODY
																																																																																																																											.get());
																																																																																																																							_setstack
																																																																																																																									.setCount(
																																																																																																																											1);
																																																																																																																							((Slot) _slots
																																																																																																																									.get(34))
																																																																																																																									.set(_setstack);
																																																																																																																							_player.containerMenu
																																																																																																																									.broadcastChanges();
																																																																																																																						}
																																																																																																																						if (entity instanceof Player _player
																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																								&& _current
																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																									HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																											.get());
																																																																																																																							_setstack
																																																																																																																									.setCount(
																																																																																																																											1);
																																																																																																																							((Slot) _slots
																																																																																																																									.get(33))
																																																																																																																									.set(_setstack);
																																																																																																																							_player.containerMenu
																																																																																																																									.broadcastChanges();
																																																																																																																						}
																																																																																																																						HyblockMod
																																																																																																																								.queueServerWork(
																																																																																																																										(int) (entity
																																																																																																																												.getCapability(
																																																																																																																														HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																														null)
																																																																																																																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																										() -> {
																																																																																																																											if ((entity instanceof Player _plr129
																																																																																																																													&& _plr129.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																												if (entity instanceof Player _player
																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																														&& _current
																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																															HyblockModItems.LIMEMELODY
																																																																																																																																	.get());
																																																																																																																													_setstack
																																																																																																																															.setCount(
																																																																																																																																	1);
																																																																																																																													((Slot) _slots
																																																																																																																															.get(33))
																																																																																																																															.set(_setstack);
																																																																																																																													_player.containerMenu
																																																																																																																															.broadcastChanges();
																																																																																																																												}
																																																																																																																												if (entity instanceof Player _player
																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																														&& _current
																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																															HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																	.get());
																																																																																																																													_setstack
																																																																																																																															.setCount(
																																																																																																																																	1);
																																																																																																																													((Slot) _slots
																																																																																																																															.get(21))
																																																																																																																															.set(_setstack);
																																																																																																																													_player.containerMenu
																																																																																																																															.broadcastChanges();
																																																																																																																												}
																																																																																																																												if (entity instanceof Player _player
																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																														&& _current
																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																															HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																	.get());
																																																																																																																													_setstack
																																																																																																																															.setCount(
																																																																																																																																	1);
																																																																																																																													((Slot) _slots
																																																																																																																															.get(34))
																																																																																																																															.set(_setstack);
																																																																																																																													_player.containerMenu
																																																																																																																															.broadcastChanges();
																																																																																																																												}
																																																																																																																												HyblockMod
																																																																																																																														.queueServerWork(
																																																																																																																																(int) (entity
																																																																																																																																		.getCapability(
																																																																																																																																				HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																				null)
																																																																																																																																		.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																() -> {
																																																																																																																																	if ((entity instanceof Player _plr133
																																																																																																																																			&& _plr133.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																				&& _current
																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																					HyblockModItems.LIMEMELODY
																																																																																																																																							.get());
																																																																																																																																			_setstack
																																																																																																																																					.setCount(
																																																																																																																																							1);
																																																																																																																																			((Slot) _slots
																																																																																																																																					.get(34))
																																																																																																																																					.set(_setstack);
																																																																																																																																			_player.containerMenu
																																																																																																																																					.broadcastChanges();
																																																																																																																																		}
																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																				&& _current
																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																					HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																							.get());
																																																																																																																																			_setstack
																																																																																																																																					.setCount(
																																																																																																																																							1);
																																																																																																																																			((Slot) _slots
																																																																																																																																					.get(22))
																																																																																																																																					.set(_setstack);
																																																																																																																																			_player.containerMenu
																																																																																																																																					.broadcastChanges();
																																																																																																																																		}
																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																				&& _current
																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																					HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																							.get());
																																																																																																																																			_setstack
																																																																																																																																					.setCount(
																																																																																																																																							1);
																																																																																																																																			((Slot) _slots
																																																																																																																																					.get(21))
																																																																																																																																					.set(_setstack);
																																																																																																																																			_player.containerMenu
																																																																																																																																					.broadcastChanges();
																																																																																																																																		}
																																																																																																																																		HyblockMod
																																																																																																																																				.queueServerWork(
																																																																																																																																						(int) (entity
																																																																																																																																								.getCapability(
																																																																																																																																										HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																										null)
																																																																																																																																								.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																						() -> {
																																																																																																																																							if ((entity instanceof Player _plr137
																																																																																																																																									&& _plr137.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																										&& _current
																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																											HyblockModItems.YELLOWMELODY
																																																																																																																																													.get());
																																																																																																																																									_setstack
																																																																																																																																											.setCount(
																																																																																																																																													1);
																																																																																																																																									((Slot) _slots
																																																																																																																																											.get(21))
																																																																																																																																											.set(_setstack);
																																																																																																																																									_player.containerMenu
																																																																																																																																											.broadcastChanges();
																																																																																																																																								}
																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																										&& _current
																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																											HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																													.get());
																																																																																																																																									_setstack
																																																																																																																																											.setCount(
																																																																																																																																													1);
																																																																																																																																									((Slot) _slots
																																																																																																																																											.get(23))
																																																																																																																																											.set(_setstack);
																																																																																																																																									_player.containerMenu
																																																																																																																																											.broadcastChanges();
																																																																																																																																								}
																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																										&& _current
																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																											HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																													.get());
																																																																																																																																									_setstack
																																																																																																																																											.setCount(
																																																																																																																																													1);
																																																																																																																																									((Slot) _slots
																																																																																																																																											.get(22))
																																																																																																																																											.set(_setstack);
																																																																																																																																									_player.containerMenu
																																																																																																																																											.broadcastChanges();
																																																																																																																																								}
																																																																																																																																								HyblockMod
																																																																																																																																										.queueServerWork(
																																																																																																																																												(int) (entity
																																																																																																																																														.getCapability(
																																																																																																																																																HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																null)
																																																																																																																																														.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																												() -> {
																																																																																																																																													if ((entity instanceof Player _plr141
																																																																																																																																															&& _plr141.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																&& _current
																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																	HyblockModItems.YELLOWMELODY
																																																																																																																																																			.get());
																																																																																																																																															_setstack
																																																																																																																																																	.setCount(
																																																																																																																																																			1);
																																																																																																																																															((Slot) _slots
																																																																																																																																																	.get(22))
																																																																																																																																																	.set(_setstack);
																																																																																																																																															_player.containerMenu
																																																																																																																																																	.broadcastChanges();
																																																																																																																																														}
																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																&& _current
																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																	HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																			.get());
																																																																																																																																															_setstack
																																																																																																																																																	.setCount(
																																																																																																																																																			1);
																																																																																																																																															((Slot) _slots
																																																																																																																																																	.get(24))
																																																																																																																																																	.set(_setstack);
																																																																																																																																															_player.containerMenu
																																																																																																																																																	.broadcastChanges();
																																																																																																																																														}
																																																																																																																																														HyblockMod
																																																																																																																																																.queueServerWork(
																																																																																																																																																		(int) (entity
																																																																																																																																																				.getCapability(
																																																																																																																																																						HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																						null)
																																																																																																																																																				.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																		() -> {
																																																																																																																																																			if ((entity instanceof Player _plr144
																																																																																																																																																					&& _plr144.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																						&& _current
																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																							HyblockModItems.YELLOWMELODY
																																																																																																																																																									.get());
																																																																																																																																																					_setstack
																																																																																																																																																							.setCount(
																																																																																																																																																									1);
																																																																																																																																																					((Slot) _slots
																																																																																																																																																							.get(23))
																																																																																																																																																							.set(_setstack);
																																																																																																																																																					_player.containerMenu
																																																																																																																																																							.broadcastChanges();
																																																																																																																																																				}
																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																						&& _current
																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																							HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																									.get());
																																																																																																																																																					_setstack
																																																																																																																																																							.setCount(
																																																																																																																																																									1);
																																																																																																																																																					((Slot) _slots
																																																																																																																																																							.get(24))
																																																																																																																																																							.set(_setstack);
																																																																																																																																																					_player.containerMenu
																																																																																																																																																							.broadcastChanges();
																																																																																																																																																				}
																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																						&& _current
																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																							HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																									.get());
																																																																																																																																																					_setstack
																																																																																																																																																							.setCount(
																																																																																																																																																									1);
																																																																																																																																																					((Slot) _slots
																																																																																																																																																							.get(31))
																																																																																																																																																							.set(_setstack);
																																																																																																																																																					_player.containerMenu
																																																																																																																																																							.broadcastChanges();
																																																																																																																																																				}
																																																																																																																																																				HyblockMod
																																																																																																																																																						.queueServerWork(
																																																																																																																																																								(int) (entity
																																																																																																																																																										.getCapability(
																																																																																																																																																												HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																												null)
																																																																																																																																																										.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																								() -> {
																																																																																																																																																									if ((entity instanceof Player _plr148
																																																																																																																																																											&& _plr148.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																												&& _current
																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																													HyblockModItems.YELLOWMELODY
																																																																																																																																																															.get());
																																																																																																																																																											_setstack
																																																																																																																																																													.setCount(
																																																																																																																																																															1);
																																																																																																																																																											((Slot) _slots
																																																																																																																																																													.get(24))
																																																																																																																																																													.set(_setstack);
																																																																																																																																																											_player.containerMenu
																																																																																																																																																													.broadcastChanges();
																																																																																																																																																										}
																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																												&& _current
																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																													HyblockModItems.LIMEMELODY
																																																																																																																																																															.get());
																																																																																																																																																											_setstack
																																																																																																																																																													.setCount(
																																																																																																																																																															1);
																																																																																																																																																											((Slot) _slots
																																																																																																																																																													.get(31))
																																																																																																																																																													.set(_setstack);
																																																																																																																																																											_player.containerMenu
																																																																																																																																																													.broadcastChanges();
																																																																																																																																																										}
																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																												&& _current
																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																													HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																															.get());
																																																																																																																																																											_setstack
																																																																																																																																																													.setCount(
																																																																																																																																																															1);
																																																																																																																																																											((Slot) _slots
																																																																																																																																																													.get(32))
																																																																																																																																																													.set(_setstack);
																																																																																																																																																											_player.containerMenu
																																																																																																																																																													.broadcastChanges();
																																																																																																																																																										}
																																																																																																																																																										HyblockMod
																																																																																																																																																												.queueServerWork(
																																																																																																																																																														(int) (entity
																																																																																																																																																																.getCapability(
																																																																																																																																																																		HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																		null)
																																																																																																																																																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																														() -> {
																																																																																																																																																															if ((entity instanceof Player _plr152
																																																																																																																																																																	&& _plr152.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																		&& _current
																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																			HyblockModItems.LIMEMELODY
																																																																																																																																																																					.get());
																																																																																																																																																																	_setstack
																																																																																																																																																																			.setCount(
																																																																																																																																																																					1);
																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																			.get(32))
																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																}
																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																		&& _current
																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																			HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																					.get());
																																																																																																																																																																	_setstack
																																																																																																																																																																			.setCount(
																																																																																																																																																																					1);
																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																			.get(31))
																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																}
																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																		&& _current
																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																			HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																					.get());
																																																																																																																																																																	_setstack
																																																																																																																																																																			.setCount(
																																																																																																																																																																					1);
																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																			.get(33))
																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																}
																																																																																																																																																																HyblockMod
																																																																																																																																																																		.queueServerWork(
																																																																																																																																																																				(int) (entity
																																																																																																																																																																						.getCapability(
																																																																																																																																																																								HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																								null)
																																																																																																																																																																						.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																				() -> {
																																																																																																																																																																					if ((entity instanceof Player _plr156
																																																																																																																																																																							&& _plr156.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																								&& _current
																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																									HyblockModItems.LIMEMELODY
																																																																																																																																																																											.get());
																																																																																																																																																																							_setstack
																																																																																																																																																																									.setCount(
																																																																																																																																																																											1);
																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																									.get(33))
																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																						}
																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																								&& _current
																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																									HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																											.get());
																																																																																																																																																																							_setstack
																																																																																																																																																																									.setCount(
																																																																																																																																																																											1);
																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																									.get(32))
																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																						}
																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																								&& _current
																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																									HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																											.get());
																																																																																																																																																																							_setstack
																																																																																																																																																																									.setCount(
																																																																																																																																																																											1);
																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																									.get(34))
																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																						}
																																																																																																																																																																						HyblockMod
																																																																																																																																																																								.queueServerWork(
																																																																																																																																																																										(int) (entity
																																																																																																																																																																												.getCapability(
																																																																																																																																																																														HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																														null)
																																																																																																																																																																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																										() -> {
																																																																																																																																																																											if ((entity instanceof Player _plr160
																																																																																																																																																																													&& _plr160.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																														&& _current
																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																															HyblockModItems.LIMEMELODY
																																																																																																																																																																																	.get());
																																																																																																																																																																													_setstack
																																																																																																																																																																															.setCount(
																																																																																																																																																																																	1);
																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																															.get(32))
																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																												}
																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																														&& _current
																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																															HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																	.get());
																																																																																																																																																																													_setstack
																																																																																																																																																																															.setCount(
																																																																																																																																																																																	1);
																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																															.get(33))
																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																												}
																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																														&& _current
																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																															HyblockModBlocks.GREEN_FALLING_MELODY
																																																																																																																																																																																	.get());
																																																																																																																																																																													_setstack
																																																																																																																																																																															.setCount(
																																																																																																																																																																																	1);
																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																															.get(41))
																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																												}
																																																																																																																																																																												HyblockMod
																																																																																																																																																																														.queueServerWork(
																																																																																																																																																																																(int) (entity
																																																																																																																																																																																		.getCapability(
																																																																																																																																																																																				HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																				null)
																																																																																																																																																																																		.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																() -> {
																																																																																																																																																																																	if ((entity instanceof Player _plr164
																																																																																																																																																																																			&& _plr164.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																				&& _current
																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																					HyblockModItems.LIMEMELODY
																																																																																																																																																																																							.get());
																																																																																																																																																																																			_setstack
																																																																																																																																																																																					.setCount(
																																																																																																																																																																																							1);
																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																					.get(33))
																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																		}
																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																				&& _current
																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																					HyblockModItems.GREENMELODY
																																																																																																																																																																																							.get());
																																																																																																																																																																																			_setstack
																																																																																																																																																																																					.setCount(
																																																																																																																																																																																							1);
																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																					.get(41))
																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																		}
																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																				&& _current
																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																					HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																							.get());
																																																																																																																																																																																			_setstack
																																																																																																																																																																																					.setCount(
																																																																																																																																																																																							1);
																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																					.get(34))
																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																		}
																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																				&& _current
																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																					HyblockModBlocks.GREEN_FALLING_MELODY
																																																																																																																																																																																							.get());
																																																																																																																																																																																			_setstack
																																																																																																																																																																																					.setCount(
																																																																																																																																																																																							1);
																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																					.get(42))
																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																		}
																																																																																																																																																																																		HyblockMod
																																																																																																																																																																																				.queueServerWork(
																																																																																																																																																																																						(int) (entity
																																																																																																																																																																																								.getCapability(
																																																																																																																																																																																										HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																										null)
																																																																																																																																																																																								.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																						() -> {
																																																																																																																																																																																							if ((entity instanceof Player _plr169
																																																																																																																																																																																									&& _plr169.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																										&& _current
																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																											HyblockModItems.LIMEMELODY
																																																																																																																																																																																													.get());
																																																																																																																																																																																									_setstack
																																																																																																																																																																																											.setCount(
																																																																																																																																																																																													1);
																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																											.get(34))
																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																								}
																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																										&& _current
																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																											HyblockModItems.GREENMELODY
																																																																																																																																																																																													.get());
																																																																																																																																																																																									_setstack
																																																																																																																																																																																											.setCount(
																																																																																																																																																																																													1);
																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																											.get(42))
																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																								}
																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																										&& _current
																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																											HyblockModBlocks.PURPLE_FALLING_MELODY
																																																																																																																																																																																													.get());
																																																																																																																																																																																									_setstack
																																																																																																																																																																																											.setCount(
																																																																																																																																																																																													1);
																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																											.get(51))
																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																								}
																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																										&& _current
																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																											HyblockModBlocks.GREEN_FALLING_MELODY
																																																																																																																																																																																													.get());
																																																																																																																																																																																									_setstack
																																																																																																																																																																																											.setCount(
																																																																																																																																																																																													1);
																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																											.get(43))
																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																								}
																																																																																																																																																																																								HyblockMod
																																																																																																																																																																																										.queueServerWork(
																																																																																																																																																																																												(int) (entity
																																																																																																																																																																																														.getCapability(
																																																																																																																																																																																																HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																null)
																																																																																																																																																																																														.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																												() -> {
																																																																																																																																																																																													if ((entity instanceof Player _plr174
																																																																																																																																																																																															&& _plr174.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																&& _current
																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																	HyblockModItems.PURPLEMELODY
																																																																																																																																																																																																			.get());
																																																																																																																																																																																															_setstack
																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																			1);
																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																	.get(52))
																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																														}
																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																&& _current
																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																	HyblockModItems.GREENMELODY
																																																																																																																																																																																																			.get());
																																																																																																																																																																																															_setstack
																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																			1);
																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																	.get(43))
																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																														}
																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																&& _current
																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																	HyblockModBlocks.PURPLE_FALLING_MELODY
																																																																																																																																																																																																			.get());
																																																																																																																																																																																															_setstack
																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																			1);
																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																	.get(53))
																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																														}
																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																&& _current
																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																	HyblockModBlocks.PURPLE_FALLING_MELODY
																																																																																																																																																																																																			.get());
																																																																																																																																																																																															_setstack
																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																			1);
																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																	.get(51))
																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																														}
																																																																																																																																																																																														HyblockMod
																																																																																																																																																																																																.queueServerWork(
																																																																																																																																																																																																		(int) (entity
																																																																																																																																																																																																				.getCapability(
																																																																																																																																																																																																						HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																						null)
																																																																																																																																																																																																				.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																		() -> {
																																																																																																																																																																																																			if ((entity instanceof Player _plr179
																																																																																																																																																																																																					&& _plr179.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																							HyblockModItems.PURPLEMELODY
																																																																																																																																																																																																									.get());
																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																									1);
																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																							.get(51))
																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																				}
																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																							HyblockModItems.PURPLEMELODY
																																																																																																																																																																																																									.get());
																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																									1);
																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																							.get(53))
																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																				}
																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																							HyblockModBlocks.PURPLE_FALLING_MELODY
																																																																																																																																																																																																									.get());
																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																									1);
																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																							.get(52))
																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																				}
																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																							HyblockModBlocks.PURPLE_FALLING_MELODY
																																																																																																																																																																																																									.get());
																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																									1);
																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																							.get(54))
																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																				}
																																																																																																																																																																																																				HyblockMod
																																																																																																																																																																																																						.queueServerWork(
																																																																																																																																																																																																								(int) (entity
																																																																																																																																																																																																										.getCapability(
																																																																																																																																																																																																												HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																												null)
																																																																																																																																																																																																										.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																								() -> {
																																																																																																																																																																																																									if ((entity instanceof Player _plr184
																																																																																																																																																																																																											&& _plr184.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																													HyblockModItems.PURPLEMELODY
																																																																																																																																																																																																															.get());
																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																															1);
																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																													.get(52))
																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																										}
																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																													HyblockModItems.PURPLEMELODY
																																																																																																																																																																																																															.get());
																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																															1);
																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																													.get(54))
																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																										}
																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																													HyblockModBlocks.PURPLE_FALLING_MELODY
																																																																																																																																																																																																															.get());
																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																															1);
																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																													.get(53))
																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																										}
																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																													HyblockModBlocks.GREEN_FALLING_MELODY
																																																																																																																																																																																																															.get());
																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																															1);
																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																													.get(41))
																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																										}
																																																																																																																																																																																																										HyblockMod
																																																																																																																																																																																																												.queueServerWork(
																																																																																																																																																																																																														(int) (entity
																																																																																																																																																																																																																.getCapability(
																																																																																																																																																																																																																		HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																		null)
																																																																																																																																																																																																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																														() -> {
																																																																																																																																																																																																															if ((entity instanceof Player _plr189
																																																																																																																																																																																																																	&& _plr189.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																			HyblockModItems.PURPLEMELODY
																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																			.get(53))
																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																}
																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																			HyblockModItems.GREENMELODY
																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																			.get(41))
																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																}
																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																			HyblockModBlocks.PURPLE_FALLING_MELODY
																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																			.get(54))
																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																}
																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																			HyblockModBlocks.GREEN_FALLING_MELODY
																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																			.get(42))
																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																}
																																																																																																																																																																																																																HyblockMod
																																																																																																																																																																																																																		.queueServerWork(
																																																																																																																																																																																																																				(int) (entity
																																																																																																																																																																																																																						.getCapability(
																																																																																																																																																																																																																								HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																								null)
																																																																																																																																																																																																																						.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																				() -> {
																																																																																																																																																																																																																					if ((entity instanceof Player _plr194
																																																																																																																																																																																																																							&& _plr194.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																									HyblockModItems.PURPLEMELODY
																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																									.get(54))
																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																									HyblockModItems.GREENMELODY
																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																									.get(42))
																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																									HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																									.get(31))
																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																									HyblockModBlocks.GREEN_FALLING_MELODY
																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																									.get(43))
																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																						HyblockMod
																																																																																																																																																																																																																								.queueServerWork(
																																																																																																																																																																																																																										(int) (entity
																																																																																																																																																																																																																												.getCapability(
																																																																																																																																																																																																																														HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																														null)
																																																																																																																																																																																																																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																										() -> {
																																																																																																																																																																																																																											if ((entity instanceof Player _plr199
																																																																																																																																																																																																																													&& _plr199.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																															HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																															.get(31))
																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																															HyblockModItems.GREENMELODY
																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																															.get(43))
																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																															HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																															.get(32))
																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																															HyblockModBlocks.GREEN_FALLING_MELODY
																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																															.get(44))
																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																												HyblockMod
																																																																																																																																																																																																																														.queueServerWork(
																																																																																																																																																																																																																																(int) (entity
																																																																																																																																																																																																																																		.getCapability(
																																																																																																																																																																																																																																				HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																				null)
																																																																																																																																																																																																																																		.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																() -> {
																																																																																																																																																																																																																																	if ((entity instanceof Player _plr204
																																																																																																																																																																																																																																			&& _plr204.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																					HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																					.get(32))
																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																					HyblockModItems.GREENMELODY
																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																					.get(44))
																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																					HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																					.get(33))
																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																					HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																					.get(21))
																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																		HyblockMod
																																																																																																																																																																																																																																				.queueServerWork(
																																																																																																																																																																																																																																						(int) (entity
																																																																																																																																																																																																																																								.getCapability(
																																																																																																																																																																																																																																										HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																										null)
																																																																																																																																																																																																																																								.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																						() -> {
																																																																																																																																																																																																																																							if ((entity instanceof Player _plr209
																																																																																																																																																																																																																																									&& _plr209.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																											HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																											.get(33))
																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																											HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																											.get(21))
																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																											HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																											.get(34))
																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																											HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																											.get(22))
																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																								HyblockMod
																																																																																																																																																																																																																																										.queueServerWork(
																																																																																																																																																																																																																																												(int) (entity
																																																																																																																																																																																																																																														.getCapability(
																																																																																																																																																																																																																																																HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																null)
																																																																																																																																																																																																																																														.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																												() -> {
																																																																																																																																																																																																																																													if ((entity instanceof Player _plr214
																																																																																																																																																																																																																																															&& _plr214.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																	HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																	.get(34))
																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																	HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																	.get(22))
																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																	HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																	.get(11))
																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																	HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																	.get(23))
																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																														HyblockMod
																																																																																																																																																																																																																																																.queueServerWork(
																																																																																																																																																																																																																																																		(int) (entity
																																																																																																																																																																																																																																																				.getCapability(
																																																																																																																																																																																																																																																						HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																						null)
																																																																																																																																																																																																																																																				.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																		() -> {
																																																																																																																																																																																																																																																			if ((entity instanceof Player _plr219
																																																																																																																																																																																																																																																					&& _plr219.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																							HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																							.get(11))
																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																							HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																							.get(23))
																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																							HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																							.get(12))
																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																							HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																							.get(24))
																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																				HyblockMod
																																																																																																																																																																																																																																																						.queueServerWork(
																																																																																																																																																																																																																																																								(int) (entity
																																																																																																																																																																																																																																																										.getCapability(
																																																																																																																																																																																																																																																												HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																												null)
																																																																																																																																																																																																																																																										.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																								() -> {
																																																																																																																																																																																																																																																									if ((entity instanceof Player _plr224
																																																																																																																																																																																																																																																											&& _plr224.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																													HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																															.get());
																																																																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																																																																															1);
																																																																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																																																																													.get(12))
																																																																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																													HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																															.get());
																																																																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																																																																															1);
																																																																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																																																																													.get(24))
																																																																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																													HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																															.get());
																																																																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																																																																															1);
																																																																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																																																																													.get(13))
																																																																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																													HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																															.get());
																																																																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																																																																															1);
																																																																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																																																																													.get(11))
																																																																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																										HyblockMod
																																																																																																																																																																																																																																																												.queueServerWork(
																																																																																																																																																																																																																																																														(int) (entity
																																																																																																																																																																																																																																																																.getCapability(
																																																																																																																																																																																																																																																																		HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																		null)
																																																																																																																																																																																																																																																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																														() -> {
																																																																																																																																																																																																																																																															if ((entity instanceof Player _plr229
																																																																																																																																																																																																																																																																	&& _plr229.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																			HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																																																																			.get(13))
																																																																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																			HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																																																																			.get(11))
																																																																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																			HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																																																																			.get(14))
																																																																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																			HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																																																																			.get(12))
																																																																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																HyblockMod
																																																																																																																																																																																																																																																																		.queueServerWork(
																																																																																																																																																																																																																																																																				(int) (entity
																																																																																																																																																																																																																																																																						.getCapability(
																																																																																																																																																																																																																																																																								HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																								null)
																																																																																																																																																																																																																																																																						.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																				() -> {
																																																																																																																																																																																																																																																																					if ((entity instanceof Player _plr234
																																																																																																																																																																																																																																																																							&& _plr234.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																									HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																																																																									.get(14))
																																																																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																									HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																																																																									.get(12))
																																																																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																									HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																																																																									.get(21))
																																																																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																									HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																																																																									.get(13))
																																																																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																						HyblockMod
																																																																																																																																																																																																																																																																								.queueServerWork(
																																																																																																																																																																																																																																																																										(int) (entity
																																																																																																																																																																																																																																																																												.getCapability(
																																																																																																																																																																																																																																																																														HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																														null)
																																																																																																																																																																																																																																																																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																										() -> {
																																																																																																																																																																																																																																																																											if ((entity instanceof Player _plr239
																																																																																																																																																																																																																																																																													&& _plr239.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																															HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																																																																															.get(21))
																																																																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																															HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																																																																															.get(13))
																																																																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																															HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																																																																															.get(22))
																																																																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																															HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																																																																															.get(14))
																																																																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																												HyblockMod
																																																																																																																																																																																																																																																																														.queueServerWork(
																																																																																																																																																																																																																																																																																(int) (entity
																																																																																																																																																																																																																																																																																		.getCapability(
																																																																																																																																																																																																																																																																																				HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																				null)
																																																																																																																																																																																																																																																																																		.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																() -> {
																																																																																																																																																																																																																																																																																	if ((entity instanceof Player _plr244
																																																																																																																																																																																																																																																																																			&& _plr244.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																					HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																																																																					.get(22))
																																																																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																					HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																																																																					.get(14))
																																																																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																					HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																																																																					.get(23))
																																																																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																					HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																																																																					.get(31))
																																																																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																		HyblockMod
																																																																																																																																																																																																																																																																																				.queueServerWork(
																																																																																																																																																																																																																																																																																						(int) (entity
																																																																																																																																																																																																																																																																																								.getCapability(
																																																																																																																																																																																																																																																																																										HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																										null)
																																																																																																																																																																																																																																																																																								.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																						() -> {
																																																																																																																																																																																																																																																																																							if ((entity instanceof Player _plr249
																																																																																																																																																																																																																																																																																									&& _plr249.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																											HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																																																																											.get(23))
																																																																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																											HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																																																																											.get(31))
																																																																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																											HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																																																																											.get(24))
																																																																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																											HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																																																																											.get(32))
																																																																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																																																								HyblockMod
																																																																																																																																																																																																																																																																																										.queueServerWork(
																																																																																																																																																																																																																																																																																												(int) (entity
																																																																																																																																																																																																																																																																																														.getCapability(
																																																																																																																																																																																																																																																																																																HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																null)
																																																																																																																																																																																																																																																																																														.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																												() -> {
																																																																																																																																																																																																																																																																																													if ((entity instanceof Player _plr254
																																																																																																																																																																																																																																																																																															&& _plr254.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																	HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																																																																	.get(24))
																																																																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																	HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																																																																	.get(32))
																																																																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																	HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																																																																	.get(21))
																																																																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																	HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																																																																	.get(33))
																																																																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																																																														HyblockMod
																																																																																																																																																																																																																																																																																																.queueServerWork(
																																																																																																																																																																																																																																																																																																		(int) (entity
																																																																																																																																																																																																																																																																																																				.getCapability(
																																																																																																																																																																																																																																																																																																						HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																						null)
																																																																																																																																																																																																																																																																																																				.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																		() -> {
																																																																																																																																																																																																																																																																																																			if ((entity instanceof Player _plr259
																																																																																																																																																																																																																																																																																																					&& _plr259.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																							HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																																																																							.get(21))
																																																																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																							HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																																																																							.get(33))
																																																																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																							HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																																																																							.get(22))
																																																																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																																																																				if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																						&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																						&& _current
																																																																																																																																																																																																																																																																																																								.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																					ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																							HyblockModBlocks.LIME_FALLING_MELODY
																																																																																																																																																																																																																																																																																																									.get());
																																																																																																																																																																																																																																																																																																					_setstack
																																																																																																																																																																																																																																																																																																							.setCount(
																																																																																																																																																																																																																																																																																																									1);
																																																																																																																																																																																																																																																																																																					((Slot) _slots
																																																																																																																																																																																																																																																																																																							.get(34))
																																																																																																																																																																																																																																																																																																							.set(_setstack);
																																																																																																																																																																																																																																																																																																					_player.containerMenu
																																																																																																																																																																																																																																																																																																							.broadcastChanges();
																																																																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																																																																				HyblockMod
																																																																																																																																																																																																																																																																																																						.queueServerWork(
																																																																																																																																																																																																																																																																																																								(int) (entity
																																																																																																																																																																																																																																																																																																										.getCapability(
																																																																																																																																																																																																																																																																																																												HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																												null)
																																																																																																																																																																																																																																																																																																										.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																								() -> {
																																																																																																																																																																																																																																																																																																									if ((entity instanceof Player _plr264
																																																																																																																																																																																																																																																																																																											&& _plr264.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																													HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																																															.get());
																																																																																																																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																																																																																																																															1);
																																																																																																																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																																																																																																																													.get(22))
																																																																																																																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																													HyblockModItems.LIMEMELODY
																																																																																																																																																																																																																																																																																																															.get());
																																																																																																																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																																																																																																																															1);
																																																																																																																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																																																																																																																													.get(34))
																																																																																																																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																																																																										if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																												&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																												&& _current
																																																																																																																																																																																																																																																																																																														.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																											ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																													HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																																																															.get());
																																																																																																																																																																																																																																																																																																											_setstack
																																																																																																																																																																																																																																																																																																													.setCount(
																																																																																																																																																																																																																																																																																																															1);
																																																																																																																																																																																																																																																																																																											((Slot) _slots
																																																																																																																																																																																																																																																																																																													.get(23))
																																																																																																																																																																																																																																																																																																													.set(_setstack);
																																																																																																																																																																																																																																																																																																											_player.containerMenu
																																																																																																																																																																																																																																																																																																													.broadcastChanges();
																																																																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																																																																										HyblockMod
																																																																																																																																																																																																																																																																																																												.queueServerWork(
																																																																																																																																																																																																																																																																																																														(int) (entity
																																																																																																																																																																																																																																																																																																																.getCapability(
																																																																																																																																																																																																																																																																																																																		HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																																		null)
																																																																																																																																																																																																																																																																																																																.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																														() -> {
																																																																																																																																																																																																																																																																																																															if ((entity instanceof Player _plr268
																																																																																																																																																																																																																																																																																																																	&& _plr268.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																			HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																																																																																																																			.get(23))
																																																																																																																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																			HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																																																																																																																			.get(11))
																																																																																																																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																																																																if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																		&& _current
																																																																																																																																																																																																																																																																																																																				.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																	ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																			HyblockModBlocks.YELLOW_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																					.get());
																																																																																																																																																																																																																																																																																																																	_setstack
																																																																																																																																																																																																																																																																																																																			.setCount(
																																																																																																																																																																																																																																																																																																																					1);
																																																																																																																																																																																																																																																																																																																	((Slot) _slots
																																																																																																																																																																																																																																																																																																																			.get(24))
																																																																																																																																																																																																																																																																																																																			.set(_setstack);
																																																																																																																																																																																																																																																																																																																	_player.containerMenu
																																																																																																																																																																																																																																																																																																																			.broadcastChanges();
																																																																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																																																																HyblockMod
																																																																																																																																																																																																																																																																																																																		.queueServerWork(
																																																																																																																																																																																																																																																																																																																				(int) (entity
																																																																																																																																																																																																																																																																																																																						.getCapability(
																																																																																																																																																																																																																																																																																																																								HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																																								null)
																																																																																																																																																																																																																																																																																																																						.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																																				() -> {
																																																																																																																																																																																																																																																																																																																					if ((entity instanceof Player _plr272
																																																																																																																																																																																																																																																																																																																							&& _plr272.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																									HyblockModItems.YELLOWMELODY
																																																																																																																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																																																																																																																									.get(24))
																																																																																																																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																									HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																																																																																																																									.get(11))
																																																																																																																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																																																																						if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																								&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																								&& _current
																																																																																																																																																																																																																																																																																																																										.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																							ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																									HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																											.get());
																																																																																																																																																																																																																																																																																																																							_setstack
																																																																																																																																																																																																																																																																																																																									.setCount(
																																																																																																																																																																																																																																																																																																																											1);
																																																																																																																																																																																																																																																																																																																							((Slot) _slots
																																																																																																																																																																																																																																																																																																																									.get(12))
																																																																																																																																																																																																																																																																																																																									.set(_setstack);
																																																																																																																																																																																																																																																																																																																							_player.containerMenu
																																																																																																																																																																																																																																																																																																																									.broadcastChanges();
																																																																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																																																																						HyblockMod
																																																																																																																																																																																																																																																																																																																								.queueServerWork(
																																																																																																																																																																																																																																																																																																																										(int) (entity
																																																																																																																																																																																																																																																																																																																												.getCapability(
																																																																																																																																																																																																																																																																																																																														HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																																														null)
																																																																																																																																																																																																																																																																																																																												.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																																										() -> {
																																																																																																																																																																																																																																																																																																																											if ((entity instanceof Player _plr276
																																																																																																																																																																																																																																																																																																																													&& _plr276.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																															HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																																																																																																																															.get(11))
																																																																																																																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																															HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																																																																																																																															.get(13))
																																																																																																																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																																																																												if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																														&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																														&& _current
																																																																																																																																																																																																																																																																																																																																.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																													ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																															HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																																	.get());
																																																																																																																																																																																																																																																																																																																													_setstack
																																																																																																																																																																																																																																																																																																																															.setCount(
																																																																																																																																																																																																																																																																																																																																	1);
																																																																																																																																																																																																																																																																																																																													((Slot) _slots
																																																																																																																																																																																																																																																																																																																															.get(12))
																																																																																																																																																																																																																																																																																																																															.set(_setstack);
																																																																																																																																																																																																																																																																																																																													_player.containerMenu
																																																																																																																																																																																																																																																																																																																															.broadcastChanges();
																																																																																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																																																																																												HyblockMod
																																																																																																																																																																																																																																																																																																																														.queueServerWork(
																																																																																																																																																																																																																																																																																																																																(int) (entity
																																																																																																																																																																																																																																																																																																																																		.getCapability(
																																																																																																																																																																																																																																																																																																																																				HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																																																				null)
																																																																																																																																																																																																																																																																																																																																		.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																																																() -> {
																																																																																																																																																																																																																																																																																																																																	if ((entity instanceof Player _plr280
																																																																																																																																																																																																																																																																																																																																			&& _plr280.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																																					HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																																																																																																																					.get(12))
																																																																																																																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																																					HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																																																																																																																					.get(13))
																																																																																																																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																																																																		if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																																				&& _current
																																																																																																																																																																																																																																																																																																																																						.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																																			ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																																					HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																																							.get());
																																																																																																																																																																																																																																																																																																																																			_setstack
																																																																																																																																																																																																																																																																																																																																					.setCount(
																																																																																																																																																																																																																																																																																																																																							1);
																																																																																																																																																																																																																																																																																																																																			((Slot) _slots
																																																																																																																																																																																																																																																																																																																																					.get(14))
																																																																																																																																																																																																																																																																																																																																					.set(_setstack);
																																																																																																																																																																																																																																																																																																																																			_player.containerMenu
																																																																																																																																																																																																																																																																																																																																					.broadcastChanges();
																																																																																																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																																																																																																		HyblockMod
																																																																																																																																																																																																																																																																																																																																				.queueServerWork(
																																																																																																																																																																																																																																																																																																																																						(int) (entity
																																																																																																																																																																																																																																																																																																																																								.getCapability(
																																																																																																																																																																																																																																																																																																																																										HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																																																										null)
																																																																																																																																																																																																																																																																																																																																								.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																																																						() -> {
																																																																																																																																																																																																																																																																																																																																							if ((entity instanceof Player _plr284
																																																																																																																																																																																																																																																																																																																																									&& _plr284.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																																											HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																																																																																																																											.get(13))
																																																																																																																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																																																																																																								if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																																										&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																																										&& _current
																																																																																																																																																																																																																																																																																																																																												.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																																									ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																																											HyblockModBlocks.PINK_FALLING_MELODY
																																																																																																																																																																																																																																																																																																																																													.get());
																																																																																																																																																																																																																																																																																																																																									_setstack
																																																																																																																																																																																																																																																																																																																																											.setCount(
																																																																																																																																																																																																																																																																																																																																													1);
																																																																																																																																																																																																																																																																																																																																									((Slot) _slots
																																																																																																																																																																																																																																																																																																																																											.get(14))
																																																																																																																																																																																																																																																																																																																																											.set(_setstack);
																																																																																																																																																																																																																																																																																																																																									_player.containerMenu
																																																																																																																																																																																																																																																																																																																																											.broadcastChanges();
																																																																																																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																																																																																																								HyblockMod
																																																																																																																																																																																																																																																																																																																																										.queueServerWork(
																																																																																																																																																																																																																																																																																																																																												(int) (entity
																																																																																																																																																																																																																																																																																																																																														.getCapability(
																																																																																																																																																																																																																																																																																																																																																HyblockModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																																																																																																																																																																																																																																																																																																null)
																																																																																																																																																																																																																																																																																																																																														.orElse(new HyblockModVariables.PlayerVariables())).current_song_falling_tickrate,
																																																																																																																																																																																																																																																																																																																																												() -> {
																																																																																																																																																																																																																																																																																																																																													if ((entity instanceof Player _plr287
																																																																																																																																																																																																																																																																																																																																															&& _plr287.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																																																														if (entity instanceof Player _player
																																																																																																																																																																																																																																																																																																																																																&& _player.containerMenu instanceof Supplier _current
																																																																																																																																																																																																																																																																																																																																																&& _current
																																																																																																																																																																																																																																																																																																																																																		.get() instanceof Map _slots) {
																																																																																																																																																																																																																																																																																																																																															ItemStack _setstack = new ItemStack(
																																																																																																																																																																																																																																																																																																																																																	HyblockModItems.PINKMELODY
																																																																																																																																																																																																																																																																																																																																																			.get());
																																																																																																																																																																																																																																																																																																																																															_setstack
																																																																																																																																																																																																																																																																																																																																																	.setCount(
																																																																																																																																																																																																																																																																																																																																																			1);
																																																																																																																																																																																																																																																																																																																																															((Slot) _slots
																																																																																																																																																																																																																																																																																																																																																	.get(14))
																																																																																																																																																																																																																																																																																																																																																	.set(_setstack);
																																																																																																																																																																																																																																																																																																																																															_player.containerMenu
																																																																																																																																																																																																																																																																																																																																																	.broadcastChanges();
																																																																																																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																																																																																																														HyblockMod
																																																																																																																																																																																																																																																																																																																																																.queueServerWork(
																																																																																																																																																																																																																																																																																																																																																		15,
																																																																																																																																																																																																																																																																																																																																																		() -> {
																																																																																																																																																																																																																																																																																																																																																			if ((entity instanceof Player _plr289
																																																																																																																																																																																																																																																																																																																																																					&& _plr289.containerMenu instanceof Song1GUIMenu) == true) {
																																																																																																																																																																																																																																																																																																																																																				if (entity instanceof Player _player)
																																																																																																																																																																																																																																																																																																																																																					_player.closeContainer();
																																																																																																																																																																																																																																																																																																																																																				if (world instanceof ServerLevel _level)
																																																																																																																																																																																																																																																																																																																																																					_level.getServer()
																																																																																																																																																																																																																																																																																																																																																							.getCommands()
																																																																																																																																																																																																																																																																																																																																																							.performPrefixedCommand(
																																																																																																																																																																																																																																																																																																																																																									new CommandSourceStack(
																																																																																																																																																																																																																																																																																																																																																											CommandSource.NULL,
																																																																																																																																																																																																																																																																																																																																																											new Vec3(
																																																																																																																																																																																																																																																																																																																																																													x,
																																																																																																																																																																																																																																																																																																																																																													y,
																																																																																																																																																																																																																																																																																																																																																													z),
																																																																																																																																																																																																																																																																																																																																																											Vec2.ZERO,
																																																																																																																																																																																																																																																																																																																																																											_level,
																																																																																																																																																																																																																																																																																																																																																											4,
																																																																																																																																																																																																																																																																																																																																																											"",
																																																																																																																																																																																																																																																																																																																																																											Component
																																																																																																																																																																																																																																																																																																																																																													.literal(
																																																																																																																																																																																																																																																																																																																																																															""),
																																																																																																																																																																																																																																																																																																																																																											_level.getServer(),
																																																																																																																																																																																																																																																																																																																																																											null)
																																																																																																																																																																																																																																																																																																																																																											.withSuppressedOutput(),
																																																																																																																																																																																																																																																																																																																																																									"clear");
																																																																																																																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																																																																																																																		});
																																																																																																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																																																																																																												});
																																																																																																																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																																																																																																																						});
																																																																																																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																																																																																																});
																																																																																																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																																																																																																										});
																																																																																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																																																																																				});
																																																																																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																																																																																														});
																																																																																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																																																																																								});
																																																																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																																																																		});
																																																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																																																												});
																																																																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																																																																						});
																																																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																																																});
																																																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																																																										});
																																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																																				});
																																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																																														});
																																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																																								});
																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																		});
																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																												});
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						});
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																});
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										});
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				});
																																																																																																																																																																																																															}
																																																																																																																																																																																																														});
																																																																																																																																																																																																									}
																																																																																																																																																																																																								});
																																																																																																																																																																																																			}
																																																																																																																																																																																																		});
																																																																																																																																																																																													}
																																																																																																																																																																																												});
																																																																																																																																																																																							}
																																																																																																																																																																																						});
																																																																																																																																																																																	}
																																																																																																																																																																																});
																																																																																																																																																																											}
																																																																																																																																																																										});
																																																																																																																																																																					}
																																																																																																																																																																				});
																																																																																																																																																															}
																																																																																																																																																														});
																																																																																																																																																									}
																																																																																																																																																								});
																																																																																																																																																			}
																																																																																																																																																		});
																																																																																																																																													}
																																																																																																																																												});
																																																																																																																																							}
																																																																																																																																						});
																																																																																																																																	}
																																																																																																																																});
																																																																																																																											}
																																																																																																																										});
																																																																																																																					}
																																																																																																																				});
																																																																																																															}
																																																																																																														});
																																																																																																									}
																																																																																																								});
																																																																																																			}
																																																																																																		});
																																																																																													}
																																																																																												});
																																																																																							}
																																																																																						});
																																																																																	}
																																																																																});
																																																																											}
																																																																										});
																																																																					}
																																																																				});
																																																															}
																																																														});
																																																									}
																																																								});
																																																					}
																																																				});
																																																	}
																																																});
																																													}
																																												});
																																									}
																																								});
																																					}
																																				});
																																	}
																																});
																													}
																												});
																									}
																								});
																					}
																				});
																	}
																});
													}
												});
											}
										});
									}
								});
							}
						});
					}
				});
			}
		});
	}
}
