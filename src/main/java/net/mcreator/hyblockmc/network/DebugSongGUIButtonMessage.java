
package net.mcreator.hyblockmc.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.hyblockmc.world.inventory.DebugSongGUIMenu;
import net.mcreator.hyblockmc.procedures.DebugHarpYellowProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpPurpleProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpPinkProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpLimeProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpLightBlueProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpGreenProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpChangeTickProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpBlueProcedure;
import net.mcreator.hyblockmc.procedures.DebugHarpAllProcedure;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DebugSongGUIButtonMessage {
	private final int buttonID, x, y, z;

	public DebugSongGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DebugSongGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DebugSongGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DebugSongGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = DebugSongGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			DebugHarpPinkProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			DebugHarpYellowProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			DebugHarpLimeProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			DebugHarpGreenProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			DebugHarpPurpleProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			DebugHarpBlueProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			DebugHarpLightBlueProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			DebugHarpChangeTickProcedure.execute(entity, guistate);
		}
		if (buttonID == 8) {

			DebugHarpAllProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HyblockMod.addNetworkMessage(DebugSongGUIButtonMessage.class, DebugSongGUIButtonMessage::buffer, DebugSongGUIButtonMessage::new, DebugSongGUIButtonMessage::handler);
	}
}
