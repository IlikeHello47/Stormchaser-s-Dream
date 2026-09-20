package dev.IlikeHello47.stormchasersdream.datagen;

import dev.IlikeHello47.stormchasersdream.StormchasersDream;
import dev.IlikeHello47.stormchasersdream.items.Airbag;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StormchasersDream.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Airbag.AIRBAG.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0", modLoc("item/" + Airbag.AIRBAG.getId().getPath()));
    }
}
