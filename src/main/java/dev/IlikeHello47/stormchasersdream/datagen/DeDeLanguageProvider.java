package dev.IlikeHello47.stormchasersdream.datagen;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import dev.IlikeHello47.stormchasersdream.items.Airbag;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class DeDeLanguageProvider extends LanguageProvider {

    public DeDeLanguageProvider(PackOutput output) {
        super(output, StormchasersDream.MODID, "de_de");
    }

    @Override
    protected void addTranslations() {
        this.addItem(Airbag.AIRBAG, "Airbag");
        this.add("map.stormchasersdream.radar", "Sturm Radar");
        this.add("key.categories.stormchasersdream", "Traum eines Sturmjägers");
        this.add("key.stormchasersdream.open_radar", "Sturmradar öffnen");

    }
}
