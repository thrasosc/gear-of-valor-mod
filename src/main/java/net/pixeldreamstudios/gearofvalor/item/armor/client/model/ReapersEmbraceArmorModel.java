package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.abstraction.CapeArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.ReapersEmbraceArmorItem;

public class ReapersEmbraceArmorModel extends CapeArmorModel<ReapersEmbraceArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/reapers_embrace.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/reapers_embrace.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/reapers_embrace.animation.json");

    @Override
    public ResourceLocation getModelResource(ReapersEmbraceArmorItem reapersEmbraceArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(ReapersEmbraceArmorItem reapersEmbraceArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ReapersEmbraceArmorItem reapersEmbraceArmorItem) {
        return animation;
    }
}
