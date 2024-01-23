package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DebugHarpPurpleProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(51)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(51)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(52)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(52)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(53)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(53)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(54)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(54)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(56)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PURPLEMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(56)).set(_setstack);
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
