package net.pixeldreamstudios.gearofvalor.item.weapon.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.weapon.FurysCallItem;

public class FurysCallModel extends GeoModel<FurysCallItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/weapon/furys_call.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/weapon/furys_call.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/weapon/furys_call.animation.json");

    @Override
    public ResourceLocation getModelResource(FurysCallItem ancientVanguardSwordItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(FurysCallItem ancientVanguardSwordItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(FurysCallItem ancientVanguardSwordItem) {
        return animation;
    }
}
