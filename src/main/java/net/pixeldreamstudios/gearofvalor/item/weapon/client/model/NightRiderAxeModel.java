package net.pixeldreamstudios.gearofvalor.item.weapon.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.weapon.NightRiderAxeItem;

public class NightRiderAxeModel extends GeoModel<NightRiderAxeItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/weapon/night_rider_axe.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/weapon/night_rider_axe.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/weapon/night_rider_axe.animation.json");

    @Override
    public ResourceLocation getModelResource(NightRiderAxeItem nightRiderAxeItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(NightRiderAxeItem nightRiderAxeItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(NightRiderAxeItem nightRiderAxeItem) {
        return animation;
    }
}
