
package net.mcreator.hyblockmc.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.hyblockmc.world.inventory.HarpSelectionMenu;
import net.mcreator.hyblockmc.procedures.Song9OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song8OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song7OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song6OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song5OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song4OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song3OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song2OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song1OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song13OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song12OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song11OpenProcedure;
import net.mcreator.hyblockmc.procedures.Song10OpenProcedure;
import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HarpSelectionSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public HarpSelectionSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public HarpSelectionSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(HarpSelectionSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(HarpSelectionSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = HarpSelectionMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 1 && changeType == 1) {

			Song1OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 2 && changeType == 1) {

			Song2OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 3 && changeType == 1) {

			Song3OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 4 && changeType == 1) {

			Song4OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 5 && changeType == 1) {

			Song5OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 6 && changeType == 1) {

			Song6OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 7 && changeType == 1) {

			Song7OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 8 && changeType == 1) {

			Song8OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 9 && changeType == 1) {

			Song9OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 10 && changeType == 1) {

			Song10OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 11 && changeType == 1) {

			Song11OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 12 && changeType == 1) {

			Song12OpenProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 13 && changeType == 1) {

			Song13OpenProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HyblockMod.addNetworkMessage(HarpSelectionSlotMessage.class, HarpSelectionSlotMessage::buffer, HarpSelectionSlotMessage::new, HarpSelectionSlotMessage::handler);
	}
}
