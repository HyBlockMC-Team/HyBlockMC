package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

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
		} else {
			if (entity instanceof Player _plr1 && _plr1.containerMenu instanceof Song1GUIMenu) {
			} else {
				if (entity instanceof Player _plr2 && _plr2.containerMenu instanceof Song2GUIMenu) {
				} else {
					if (entity instanceof Player _plr3 && _plr3.containerMenu instanceof Song3GUIMenu) {
					} else {
						if (entity instanceof Player _plr4 && _plr4.containerMenu instanceof Song4GUIMenu) {
						} else {
							if (entity instanceof Player _plr5 && _plr5.containerMenu instanceof Song5GUIMenu) {
							} else {
								if (entity instanceof Player _plr6 && _plr6.containerMenu instanceof Song6GUIMenu) {
								} else {
									if (entity instanceof Player _plr7 && _plr7.containerMenu instanceof Song7GUIMenu) {
									} else {
										if (entity instanceof Player _plr8 && _plr8.containerMenu instanceof Song8GUIMenu) {
										} else {
											if (entity instanceof Player _plr9 && _plr9.containerMenu instanceof Song9GUIMenu) {
											} else {
												if (entity instanceof Player _plr10 && _plr10.containerMenu instanceof Song10GUIMenu) {
												} else {
													if (entity instanceof Player _plr11 && _plr11.containerMenu instanceof Song11GUIMenu) {
													} else {
														if (entity instanceof Player _plr12 && _plr12.containerMenu instanceof Song12GUIMenu) {
														} else {
															if (entity instanceof Player _plr13 && _plr13.containerMenu instanceof Song13GUIMenu) {
															} else {
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
