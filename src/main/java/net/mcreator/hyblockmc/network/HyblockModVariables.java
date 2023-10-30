package net.mcreator.hyblockmc.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.hyblockmc.HyblockMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HyblockModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		HyblockMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		HyblockMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.max_mana = original.max_mana;
			clone.mana = original.mana;
			clone.mana_tick = original.mana_tick;
			clone.creeper_pants_clock = original.creeper_pants_clock;
			clone.creeper_pants_used = original.creeper_pants_used;
			clone.guardian_chestplate_clock = original.guardian_chestplate_clock;
			clone.guardian_chestplate_used = original.guardian_chestplate_used;
			clone.skeleton_helmet_bones = original.skeleton_helmet_bones;
			clone.skeleton_helmet_max_bones = original.skeleton_helmet_max_bones;
			clone.skeleton_helmet_clock = original.skeleton_helmet_clock;
			clone.song_1_complete = original.song_1_complete;
			clone.song_2_complete = original.song_2_complete;
			clone.song_3_complete = original.song_3_complete;
			clone.song_4_complete = original.song_4_complete;
			clone.song_5_complete = original.song_5_complete;
			clone.song_6_complete = original.song_6_complete;
			clone.song_7_complete = original.song_7_complete;
			clone.song_8_complete = original.song_8_complete;
			clone.song_9_complete = original.song_9_complete;
			clone.song_10_complete = original.song_10_complete;
			clone.song_11_complete = original.song_11_complete;
			clone.song_12_complete = original.song_12_complete;
			clone.song_13_complete = original.song_13_complete;
			clone.songs_complete = original.songs_complete;
			clone.song_1_high_score = original.song_1_high_score;
			clone.song_1_last_score = original.song_1_last_score;
			clone.song_2_high_score = original.song_2_high_score;
			clone.song_2_last_score = original.song_2_last_score;
			clone.song_3_high_score = original.song_3_high_score;
			clone.song_3_last_score = original.song_3_last_score;
			clone.song_4_high_score = original.song_4_high_score;
			clone.song_4_last_score = original.song_4_last_score;
			clone.song_5_high_score = original.song_5_high_score;
			clone.song_5_last_score = original.song_5_last_score;
			clone.song_6_high_score = original.song_6_high_score;
			clone.song_6_last_score = original.song_6_last_score;
			clone.song_7_high_score = original.song_7_high_score;
			clone.song_7_last_score = original.song_7_last_score;
			clone.song_8_high_score = original.song_8_high_score;
			clone.song_8_last_score = original.song_8_last_score;
			clone.song_9_high_score = original.song_9_high_score;
			clone.song_9_last_score = original.song_9_last_score;
			clone.song_10_high_score = original.song_10_high_score;
			clone.song_10_last_score = original.song_10_last_score;
			clone.song_11_high_score = original.song_11_high_score;
			clone.song_11_last_score = original.song_11_last_score;
			clone.song_12_high_score = original.song_12_high_score;
			clone.song_12_last_score = original.song_12_last_score;
			clone.song_13_high_score = original.song_13_high_score;
			clone.song_13_last_score = original.song_13_last_score;
			if (!event.isWasDeath()) {
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					HyblockMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					HyblockMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					HyblockMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "hyblock_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				HyblockMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "hyblock_mapvars";
		public double midas_rows = 0.0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			midas_rows = nbt.getDouble("midas_rows");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("midas_rows", midas_rows);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				HyblockMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("hyblock", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double max_mana = 100.0;
		public double mana = 100.0;
		public double mana_tick = 0;
		public double creeper_pants_clock = 0;
		public boolean creeper_pants_used = false;
		public double guardian_chestplate_clock = 0;
		public boolean guardian_chestplate_used = false;
		public double skeleton_helmet_bones = 0;
		public double skeleton_helmet_max_bones = 3.0;
		public double skeleton_helmet_clock = 0;
		public boolean song_1_complete = false;
		public boolean song_2_complete = false;
		public boolean song_3_complete = false;
		public boolean song_4_complete = false;
		public boolean song_5_complete = false;
		public boolean song_6_complete = false;
		public boolean song_7_complete = false;
		public boolean song_8_complete = false;
		public boolean song_9_complete = false;
		public boolean song_10_complete = false;
		public boolean song_11_complete = false;
		public boolean song_12_complete = false;
		public boolean song_13_complete = false;
		public double songs_complete = 0;
		public double song_1_high_score = 0;
		public double song_1_last_score = 0;
		public double song_2_high_score = 0;
		public double song_2_last_score = 0;
		public double song_3_high_score = 0;
		public double song_3_last_score = 0;
		public double song_4_high_score = 0;
		public double song_4_last_score = 0;
		public double song_5_high_score = 0;
		public double song_5_last_score = 0;
		public double song_6_high_score = 0;
		public double song_6_last_score = 0;
		public double song_7_high_score = 0;
		public double song_7_last_score = 0;
		public double song_8_high_score = 0;
		public double song_8_last_score = 0;
		public double song_9_high_score = 0;
		public double song_9_last_score = 0;
		public double song_10_high_score = 0;
		public double song_10_last_score = 0;
		public double song_11_high_score = 0;
		public double song_11_last_score = 0;
		public double song_12_high_score = 0;
		public double song_12_last_score = 0;
		public double song_13_high_score = 0;
		public double song_13_last_score = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				HyblockMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("max_mana", max_mana);
			nbt.putDouble("mana", mana);
			nbt.putDouble("mana_tick", mana_tick);
			nbt.putDouble("creeper_pants_clock", creeper_pants_clock);
			nbt.putBoolean("creeper_pants_used", creeper_pants_used);
			nbt.putDouble("guardian_chestplate_clock", guardian_chestplate_clock);
			nbt.putBoolean("guardian_chestplate_used", guardian_chestplate_used);
			nbt.putDouble("skeleton_helmet_bones", skeleton_helmet_bones);
			nbt.putDouble("skeleton_helmet_max_bones", skeleton_helmet_max_bones);
			nbt.putDouble("skeleton_helmet_clock", skeleton_helmet_clock);
			nbt.putBoolean("song_1_complete", song_1_complete);
			nbt.putBoolean("song_2_complete", song_2_complete);
			nbt.putBoolean("song_3_complete", song_3_complete);
			nbt.putBoolean("song_4_complete", song_4_complete);
			nbt.putBoolean("song_5_complete", song_5_complete);
			nbt.putBoolean("song_6_complete", song_6_complete);
			nbt.putBoolean("song_7_complete", song_7_complete);
			nbt.putBoolean("song_8_complete", song_8_complete);
			nbt.putBoolean("song_9_complete", song_9_complete);
			nbt.putBoolean("song_10_complete", song_10_complete);
			nbt.putBoolean("song_11_complete", song_11_complete);
			nbt.putBoolean("song_12_complete", song_12_complete);
			nbt.putBoolean("song_13_complete", song_13_complete);
			nbt.putDouble("songs_complete", songs_complete);
			nbt.putDouble("song_1_high_score", song_1_high_score);
			nbt.putDouble("song_1_last_score", song_1_last_score);
			nbt.putDouble("song_2_high_score", song_2_high_score);
			nbt.putDouble("song_2_last_score", song_2_last_score);
			nbt.putDouble("song_3_high_score", song_3_high_score);
			nbt.putDouble("song_3_last_score", song_3_last_score);
			nbt.putDouble("song_4_high_score", song_4_high_score);
			nbt.putDouble("song_4_last_score", song_4_last_score);
			nbt.putDouble("song_5_high_score", song_5_high_score);
			nbt.putDouble("song_5_last_score", song_5_last_score);
			nbt.putDouble("song_6_high_score", song_6_high_score);
			nbt.putDouble("song_6_last_score", song_6_last_score);
			nbt.putDouble("song_7_high_score", song_7_high_score);
			nbt.putDouble("song_7_last_score", song_7_last_score);
			nbt.putDouble("song_8_high_score", song_8_high_score);
			nbt.putDouble("song_8_last_score", song_8_last_score);
			nbt.putDouble("song_9_high_score", song_9_high_score);
			nbt.putDouble("song_9_last_score", song_9_last_score);
			nbt.putDouble("song_10_high_score", song_10_high_score);
			nbt.putDouble("song_10_last_score", song_10_last_score);
			nbt.putDouble("song_11_high_score", song_11_high_score);
			nbt.putDouble("song_11_last_score", song_11_last_score);
			nbt.putDouble("song_12_high_score", song_12_high_score);
			nbt.putDouble("song_12_last_score", song_12_last_score);
			nbt.putDouble("song_13_high_score", song_13_high_score);
			nbt.putDouble("song_13_last_score", song_13_last_score);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			max_mana = nbt.getDouble("max_mana");
			mana = nbt.getDouble("mana");
			mana_tick = nbt.getDouble("mana_tick");
			creeper_pants_clock = nbt.getDouble("creeper_pants_clock");
			creeper_pants_used = nbt.getBoolean("creeper_pants_used");
			guardian_chestplate_clock = nbt.getDouble("guardian_chestplate_clock");
			guardian_chestplate_used = nbt.getBoolean("guardian_chestplate_used");
			skeleton_helmet_bones = nbt.getDouble("skeleton_helmet_bones");
			skeleton_helmet_max_bones = nbt.getDouble("skeleton_helmet_max_bones");
			skeleton_helmet_clock = nbt.getDouble("skeleton_helmet_clock");
			song_1_complete = nbt.getBoolean("song_1_complete");
			song_2_complete = nbt.getBoolean("song_2_complete");
			song_3_complete = nbt.getBoolean("song_3_complete");
			song_4_complete = nbt.getBoolean("song_4_complete");
			song_5_complete = nbt.getBoolean("song_5_complete");
			song_6_complete = nbt.getBoolean("song_6_complete");
			song_7_complete = nbt.getBoolean("song_7_complete");
			song_8_complete = nbt.getBoolean("song_8_complete");
			song_9_complete = nbt.getBoolean("song_9_complete");
			song_10_complete = nbt.getBoolean("song_10_complete");
			song_11_complete = nbt.getBoolean("song_11_complete");
			song_12_complete = nbt.getBoolean("song_12_complete");
			song_13_complete = nbt.getBoolean("song_13_complete");
			songs_complete = nbt.getDouble("songs_complete");
			song_1_high_score = nbt.getDouble("song_1_high_score");
			song_1_last_score = nbt.getDouble("song_1_last_score");
			song_2_high_score = nbt.getDouble("song_2_high_score");
			song_2_last_score = nbt.getDouble("song_2_last_score");
			song_3_high_score = nbt.getDouble("song_3_high_score");
			song_3_last_score = nbt.getDouble("song_3_last_score");
			song_4_high_score = nbt.getDouble("song_4_high_score");
			song_4_last_score = nbt.getDouble("song_4_last_score");
			song_5_high_score = nbt.getDouble("song_5_high_score");
			song_5_last_score = nbt.getDouble("song_5_last_score");
			song_6_high_score = nbt.getDouble("song_6_high_score");
			song_6_last_score = nbt.getDouble("song_6_last_score");
			song_7_high_score = nbt.getDouble("song_7_high_score");
			song_7_last_score = nbt.getDouble("song_7_last_score");
			song_8_high_score = nbt.getDouble("song_8_high_score");
			song_8_last_score = nbt.getDouble("song_8_last_score");
			song_9_high_score = nbt.getDouble("song_9_high_score");
			song_9_last_score = nbt.getDouble("song_9_last_score");
			song_10_high_score = nbt.getDouble("song_10_high_score");
			song_10_last_score = nbt.getDouble("song_10_last_score");
			song_11_high_score = nbt.getDouble("song_11_high_score");
			song_11_last_score = nbt.getDouble("song_11_last_score");
			song_12_high_score = nbt.getDouble("song_12_high_score");
			song_12_last_score = nbt.getDouble("song_12_last_score");
			song_13_high_score = nbt.getDouble("song_13_high_score");
			song_13_last_score = nbt.getDouble("song_13_last_score");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.max_mana = message.data.max_mana;
					variables.mana = message.data.mana;
					variables.mana_tick = message.data.mana_tick;
					variables.creeper_pants_clock = message.data.creeper_pants_clock;
					variables.creeper_pants_used = message.data.creeper_pants_used;
					variables.guardian_chestplate_clock = message.data.guardian_chestplate_clock;
					variables.guardian_chestplate_used = message.data.guardian_chestplate_used;
					variables.skeleton_helmet_bones = message.data.skeleton_helmet_bones;
					variables.skeleton_helmet_max_bones = message.data.skeleton_helmet_max_bones;
					variables.skeleton_helmet_clock = message.data.skeleton_helmet_clock;
					variables.song_1_complete = message.data.song_1_complete;
					variables.song_2_complete = message.data.song_2_complete;
					variables.song_3_complete = message.data.song_3_complete;
					variables.song_4_complete = message.data.song_4_complete;
					variables.song_5_complete = message.data.song_5_complete;
					variables.song_6_complete = message.data.song_6_complete;
					variables.song_7_complete = message.data.song_7_complete;
					variables.song_8_complete = message.data.song_8_complete;
					variables.song_9_complete = message.data.song_9_complete;
					variables.song_10_complete = message.data.song_10_complete;
					variables.song_11_complete = message.data.song_11_complete;
					variables.song_12_complete = message.data.song_12_complete;
					variables.song_13_complete = message.data.song_13_complete;
					variables.songs_complete = message.data.songs_complete;
					variables.song_1_high_score = message.data.song_1_high_score;
					variables.song_1_last_score = message.data.song_1_last_score;
					variables.song_2_high_score = message.data.song_2_high_score;
					variables.song_2_last_score = message.data.song_2_last_score;
					variables.song_3_high_score = message.data.song_3_high_score;
					variables.song_3_last_score = message.data.song_3_last_score;
					variables.song_4_high_score = message.data.song_4_high_score;
					variables.song_4_last_score = message.data.song_4_last_score;
					variables.song_5_high_score = message.data.song_5_high_score;
					variables.song_5_last_score = message.data.song_5_last_score;
					variables.song_6_high_score = message.data.song_6_high_score;
					variables.song_6_last_score = message.data.song_6_last_score;
					variables.song_7_high_score = message.data.song_7_high_score;
					variables.song_7_last_score = message.data.song_7_last_score;
					variables.song_8_high_score = message.data.song_8_high_score;
					variables.song_8_last_score = message.data.song_8_last_score;
					variables.song_9_high_score = message.data.song_9_high_score;
					variables.song_9_last_score = message.data.song_9_last_score;
					variables.song_10_high_score = message.data.song_10_high_score;
					variables.song_10_last_score = message.data.song_10_last_score;
					variables.song_11_high_score = message.data.song_11_high_score;
					variables.song_11_last_score = message.data.song_11_last_score;
					variables.song_12_high_score = message.data.song_12_high_score;
					variables.song_12_last_score = message.data.song_12_last_score;
					variables.song_13_high_score = message.data.song_13_high_score;
					variables.song_13_last_score = message.data.song_13_last_score;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
