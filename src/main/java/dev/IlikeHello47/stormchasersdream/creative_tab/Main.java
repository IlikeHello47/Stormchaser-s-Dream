package dev.IlikeHello47.stormchasersdream.creative_tab;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import dev.IlikeHello47.stormchasersdream.items.Airbag;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Main {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StormchasersDream.MODID);

    public static final Supplier<CreativeModeTab> STORMCHASERS_DREAM_TAB = CREATIVE_MODE_TAB.register("stormchasers_dream_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Airbag.AIRBAG.get()))
                    .title(Component.translatable("creativetab.tutorialmod.stormchasers_dream"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Airbag.AIRBAG.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
