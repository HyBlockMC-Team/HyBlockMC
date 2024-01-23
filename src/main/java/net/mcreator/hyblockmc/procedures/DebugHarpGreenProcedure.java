package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DebugHarpGreenProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(41)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(41)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(42)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(42)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(43)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(43)).set(_setstack);
_player.containerMenu.broadcastChanges();
}if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(44)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(44)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_FALLING_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(46)).set(_setstack);
_player.containerMenu.broadcastChanges();
}HyblockMod.queueServerWork((int), () -> {
if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModItems.GREENMELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(46)).set(_setstack);
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
