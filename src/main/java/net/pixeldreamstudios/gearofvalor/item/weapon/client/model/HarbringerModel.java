package net.pixeldreamstudios.gearofvalor.item.weapon.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.weapon.HarbringerItem;

public class HarbringerModel extends GeoModel<HarbringerItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/weapon/harbringer.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/weapon/harbringer.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/weapon/harbringer.animation.json");

    @Override
    public ResourceLocation getModelResource(HarbringerItem harbringerItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(HarbringerItem harbringerItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(HarbringerItem harbringerItem) {
        return animation;
    }
}