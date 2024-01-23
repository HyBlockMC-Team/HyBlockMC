package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DebugHarpPinkProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(11)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PINKMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(11)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(12)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PINKMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(12)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(13)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PINKMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(13)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(14)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PINKMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(14)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(16)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.PINKMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(16)).set(_setstack);
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
