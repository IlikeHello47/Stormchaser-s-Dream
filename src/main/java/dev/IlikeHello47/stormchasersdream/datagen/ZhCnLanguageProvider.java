package dev.IlikeHello47.stormchasersdream.datagen;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import dev.IlikeHello47.stormchasersdream.items.Airbag;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ZhCnLanguageProvider extends LanguageProvider {

    public ZhCnLanguageProvider(PackOutput output) {
        super(output, StormchasersDream.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.addItem(Airbag.AIRBAG, "追风者安全气囊");
        this.add("map.stormchasersdream.radar", "风暴雷达");
        this.add("key.categories.stormchasersdream", "追风者的梦想");
        this.add("key.stormchasersdream.open_radar", "打开风暴雷达");

    }
}
