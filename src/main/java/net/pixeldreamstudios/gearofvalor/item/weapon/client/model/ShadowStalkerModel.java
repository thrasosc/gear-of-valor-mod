package net.pixeldreamstudios.gearofvalor.item.weapon.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.weapon.ShadowStalkerItem;

public class ShadowStalkerModel extends GeoModel<ShadowStalkerItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/weapon/shadow_stalker.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/weapon/shadow_stalker.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/weapon/shadow_stalker.animation.json");

    @Override
    public ResourceLocation getModelResource(ShadowStalkerItem shadowStalkerItemItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(ShadowStalkerItem shadowStalkerItemItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ShadowStalkerItem shadowStalkerItemItem) {
        return animation;
    }
}
