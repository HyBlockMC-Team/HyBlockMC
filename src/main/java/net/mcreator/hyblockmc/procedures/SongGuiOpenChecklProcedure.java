package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.hyblockmc.world.inventory.Song9GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song8GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song7GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song6GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song5GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song4GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song3GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song2GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song1GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song13GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song12GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song11GUIMenu;
import net.mcreator.hyblockmc.world.inventory.Song10GUIMenu;
import net.mcreator.hyblockmc.world.inventory.DebugSongGUIMenu;
import net.mcreator.hyblockmc.network.HyblockModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SongGuiOpenChecklProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof DebugSongGUIMenu) {
			{
				boolean _setval = true;
				entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.any_song_gui_open = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _plr1 && _plr1.containerMenu instanceof Song1GUIMenu) {
				{
					boolean _setval = true;
					entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.any_song_gui_open = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (entity instanceof Player _plr2 && _plr2.containerMenu instanceof Song2GUIMenu) {
					{
						boolean _setval = true;
						entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.any_song_gui_open = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (entity instanceof Player _plr3 && _plr3.containerMenu instanceof Song3GUIMenu) {
						{
							boolean _setval = true;
							entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.any_song_gui_open = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (entity instanceof Player _plr4 && _plr4.containerMenu instanceof Song4GUIMenu) {
							{
								boolean _setval = true;
								entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.any_song_gui_open = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (entity instanceof Player _plr5 && _plr5.containerMenu instanceof Song5GUIMenu) {
								{
									boolean _setval = true;
									entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.any_song_gui_open = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if (entity instanceof Player _plr6 && _plr6.containerMenu instanceof Song6GUIMenu) {
									{
										boolean _setval = true;
										entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.any_song_gui_open = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if (entity instanceof Player _plr7 && _plr7.containerMenu instanceof Song7GUIMenu) {
										{
											boolean _setval = true;
											entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.any_song_gui_open = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if (entity instanceof Player _plr8 && _plr8.containerMenu instanceof Song8GUIMenu) {
											{
												boolean _setval = true;
												entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.any_song_gui_open = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if (entity instanceof Player _plr9 && _plr9.containerMenu instanceof Song9GUIMenu) {
												{
													boolean _setval = true;
													entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.any_song_gui_open = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (entity instanceof Player _plr10 && _plr10.containerMenu instanceof Song10GUIMenu) {
													{
														boolean _setval = true;
														entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.any_song_gui_open = _setval;
															capability.syncPlayerVariables(entity);
														});
													}
												} else {
													if (entity instanceof Player _plr11 && _plr11.containerMenu instanceof Song11GUIMenu) {
														{
															boolean _setval = true;
															entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.any_song_gui_open = _setval;
																capability.syncPlayerVariables(entity);
															});
														}
													} else {
														if (entity instanceof Player _plr12 && _plr12.containerMenu instanceof Song12GUIMenu) {
															{
																boolean _setval = true;
																entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.any_song_gui_open = _setval;
																	capability.syncPlayerVariables(entity);
																});
															}
														} else {
															if (entity instanceof Player _plr13 && _plr13.containerMenu instanceof Song13GUIMenu) {
																{
																	boolean _setval = true;
																	entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.any_song_gui_open = _setval;
																		capability.syncPlayerVariables(entity);
																	});
																}
															} else {
																{
																	boolean _setval = false;
																	entity.getCapability(HyblockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.any_song_gui_open = _setval;
																		capability.syncPlayerVariables(entity);
																	});
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
