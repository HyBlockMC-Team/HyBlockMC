package net.mcreator.hyblockmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SongGuiFillClickClayProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (==true) {HyblockMod.queueServerWork(1, () -> {
if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.PINK_CLICK_MELODY.get().asItem())==false) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PINK_CLICK_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(15)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(25)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.YELLOW_CLICK_MELODY.get().asItem())==false) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.YELLOW_CLICK_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(25)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(35)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.LIME_CLICK_MELODY.get().asItem())==false) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.LIME_CLICK_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(35)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(45)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.GREEN_CLICK_MELODY.get().asItem())==false) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.GREEN_CLICK_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(45)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(55)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.PURPLE_CLICK_MELODY.get().asItem())==false) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.PURPLE_CLICK_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(55)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(65)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.BLUE_CLICK_MELODY.get().asItem())==false) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.BLUE_CLICK_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(65)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(75)).getItem() : ItemStack.EMPTY).getItem() == HyblockModBlocks.LIGHTBLUE_CLICK_MELODY.get().asItem())==false) {if(entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(HyblockModBlocks.LIGHTBLUE_CLICK_MELODY.get());
_setstack.setCount(1);
((Slot) _slots.get(75)).set(_setstack);
_player.containerMenu.broadcastChanges();
}}
});
}
}
}
