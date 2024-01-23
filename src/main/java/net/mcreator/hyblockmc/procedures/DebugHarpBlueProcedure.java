package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DebugHarpBlueProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(61)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.BLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(61)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(62)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.BLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(62)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(63)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.BLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(63)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(64)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.BLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(64)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(66)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.BLUEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(66)).set(_setstack);
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
