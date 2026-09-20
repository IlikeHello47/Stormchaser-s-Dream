package dev.IlikeHello47.stormchasersdream.items;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Airbag {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StormchasersDream.MODID);

    public static final DeferredItem<Item> AIRBAG = ITEMS.registerItem("airbag",
            Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
