package net.pixeldreamstudios.gearofvalor.item.weapon.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.weapon.HeavensFallItem;

public class HeavensFallModel extends GeoModel<HeavensFallItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/weapon/heavens_fall.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/weapon/heavens_fall.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/weapon/heavens_fall.animation.json");

    @Override
    public ResourceLocation getModelResource(HeavensFallItem heavensFallIItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(HeavensFallItem heavensFallIItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(HeavensFallItem heavensFallIItem) {
        return animation;
    }
}