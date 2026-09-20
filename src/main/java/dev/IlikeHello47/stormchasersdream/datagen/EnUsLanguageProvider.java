package dev.IlikeHello47.stormchasersdream.datagen;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import dev.IlikeHello47.stormchasersdream.items.Airbag;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnUsLanguageProvider extends LanguageProvider {

    public EnUsLanguageProvider(PackOutput output) {
        super(output, StormchasersDream.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addItem(Airbag.AIRBAG, "Airbag");
        this.add("map.stormchasersdream.radar", "Storm Radar");
        this.add("key.categories.stormchasersdream", "Stormchaser's Dream");
        this.add("key.stormchasersdream.open_radar", "Open Storm Radar");

    }
}
