
package net.mcreator.hyblockmc.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.hyblockmc.world.inventory.Song12GUIMenu;
import net.mcreator.hyblockmc.procedures.YellowClickedProcedure;
import net.mcreator.hyblockmc.procedures.PurpleClickedProcedure;
import net.mcreator.hyblockmc.procedures.PinkClickedProcedure;
import net.mcreator.hyblockmc.procedures.LimeClickedProcedure;
import net.mcreator.hyblockmc.procedures.LightblueClickedProcedure;
import net.mcreator.hyblockmc.procedures.GreenClickedProcedure;
import net.mcreator.hyblockmc.procedures.BlueClickedProcedure;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Song12GUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public Song12GUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public Song12GUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(Song12GUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(Song12GUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = Song12GUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 15 && changeType == 1) {

			PinkClickedProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 25 && changeType == 1) {

			YellowClickedProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 35 && changeType == 1) {

			LimeClickedProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 45 && changeType == 1) {

			GreenClickedProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 55 && changeType == 1) {

			PurpleClickedProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 65 && changeType == 1) {

			BlueClickedProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 75 && changeType == 1) {

			LightblueClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HyblockMod.addNetworkMessage(Song12GUISlotMessage.class, Song12GUISlotMessage::buffer, Song12GUISlotMessage::new, Song12GUISlotMessage::handler);
	}
}
