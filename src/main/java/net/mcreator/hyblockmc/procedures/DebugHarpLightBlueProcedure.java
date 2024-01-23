package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DebugHarpLightBlueProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(71)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.LIGHTBLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(71)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(72)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.LIGHTBLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(72)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(73)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.LIGHTBLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(73)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(74)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.LIGHTBLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(74)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(76)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.LIGHTBLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(76)).set(_setstack);
_player.containerMenu.broadcastChanges();
}
});
});
});
});
});
});
}
}
