package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.CrownItem;


public class CrownArmorModel extends GeoModel<CrownItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/crown.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/crown.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/crown.animation.json");

    @Override
    public ResourceLocation getModelResource(CrownItem crownItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(CrownItem crownItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(CrownItem crownItem) {
        return animation;
    }
}
