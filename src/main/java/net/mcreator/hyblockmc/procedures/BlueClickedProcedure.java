package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BlueClickedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(64)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.BLUE_FALLING_MELODY.get().asItem()) {if (==false) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hyblock:harp_blue_note")),
SoundSource.MASTER, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hyblock:harp_blue_note")),
SoundSource.MASTER, 1, 1, false);
}
}
HyblockMod.queueServerWork(4, () -> {
});
}}
}
}
