package net.mcreator.hyblockmc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.hyblockmc.world.inventory.DebugSongGUIMenu;
import net.mcreator.hyblockmc.network.DebugSongGUIButtonMessage;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DebugSongGUIScreen extends AbstractContainerScreen<DebugSongGUIMenu> {
	private final static HashMap<String, Object> guistate = DebugSongGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox tick_rate;
	Button button_send_pink;
	Button button_send_yellow;
	Button button_send_lime;
	Button button_send_green;
	Button button_send_purple;
	Button button_send_blue;
	Button button_send_light_blue;
	Button button_change_speed;
	Button button_send_all;

	public DebugSongGUIScreen(DebugSongGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 222;
	}

	private static final ResourceLocation texture = new ResourceLocation("hyblock:textures/screens/debug_song_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		tick_rate.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (tick_rate.isFocused())
			return tick_rate.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		tick_rate.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.hyblock.debug_song_gui.label_harp_hymn_to_the_joy"), 3, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.hyblock.debug_song_gui.label_debug_harp_only"), 177, -1, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		tick_rate = new EditBox(this.font, this.leftPos + 178, this.topPos + 18, 118, 18, Component.translatable("gui.hyblock.debug_song_gui.tick_rate")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.hyblock.debug_song_gui.tick_rate").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.hyblock.debug_song_gui.tick_rate").getString());
				else
					setSuggestion(null);
			}
		};
		tick_rate.setSuggestion(Component.translatable("gui.hyblock.debug_song_gui.tick_rate").getString());
		tick_rate.setMaxLength(32767);
		guistate.put("text:tick_rate", tick_rate);
		this.addWidget(this.tick_rate);
		button_send_pink = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_pink"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(0, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + -1, 72, 20).build();
		guistate.put("button:button_send_pink", button_send_pink);
		this.addRenderableWidget(button_send_pink);
		button_send_yellow = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_yellow"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(1, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 26, 82, 20).build();
		guistate.put("button:button_send_yellow", button_send_yellow);
		this.addRenderableWidget(button_send_yellow);
		button_send_lime = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_lime"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(2, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 53, 72, 20).build();
		guistate.put("button:button_send_lime", button_send_lime);
		this.addRenderableWidget(button_send_lime);
		button_send_green = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_green"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(3, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 80, 77, 20).build();
		guistate.put("button:button_send_green", button_send_green);
		this.addRenderableWidget(button_send_green);
		button_send_purple = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_purple"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(4, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 107, 82, 20).build();
		guistate.put("button:button_send_purple", button_send_purple);
		this.addRenderableWidget(button_send_purple);
		button_send_blue = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_blue"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(5, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 134, 72, 20).build();
		guistate.put("button:button_send_blue", button_send_blue);
		this.addRenderableWidget(button_send_blue);
		button_send_light_blue = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_light_blue"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(6, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 161, 103, 20).build();
		guistate.put("button:button_send_light_blue", button_send_light_blue);
		this.addRenderableWidget(button_send_light_blue);
		button_change_speed = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_change_speed"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(7, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 177, this.topPos + 44, 87, 20).build();
		guistate.put("button:button_change_speed", button_change_speed);
		this.addRenderableWidget(button_change_speed);
		button_send_all = Button.builder(Component.translatable("gui.hyblock.debug_song_gui.button_send_all"), e -> {
			if (true) {
				HyblockMod.PACKET_HANDLER.sendToServer(new DebugSongGUIButtonMessage(8, x, y, z));
				DebugSongGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 188, 66, 20).build();
		guistate.put("button:button_send_all", button_send_all);
		this.addRenderableWidget(button_send_all);
	}
}
