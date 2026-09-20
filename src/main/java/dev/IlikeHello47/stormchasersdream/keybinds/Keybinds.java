package dev.IlikeHello47.stormchasersdream.keybinds;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

@EventBusSubscriber(modid = StormchasersDream.MODID)
public class Keybinds {

    public static final KeyMapping OPEN_RADAR = new KeyMapping(
            "key.stormchasersdream.open_radar",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_J,
            "key.categories.stormchasersdream"
    );

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(OPEN_RADAR);
    }
}
