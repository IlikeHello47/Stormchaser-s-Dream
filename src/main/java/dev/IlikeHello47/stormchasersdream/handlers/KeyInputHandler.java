package dev.IlikeHello47.stormchasersdream.handlers;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import dev.IlikeHello47.stormchasersdream.keybinds.Keybinds;
import net.minecraft.client.Minecraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = StormchasersDream.MODID)
public class KeyInputHandler {

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.screen != null) return;

        while (Keybinds.OPEN_RADAR.consumeClick()) {
        }
    }
}
