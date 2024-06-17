package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.abstraction.CapeArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.NightRiderArmorItem;

public class NightRiderArmorModel extends CapeArmorModel<NightRiderArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/night_rider.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/night_rider.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/night_rider.animation.json");

    @Override
    public ResourceLocation getModelResource(NightRiderArmorItem nightArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(NightRiderArmorItem nightArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(NightRiderArmorItem nightArmorItem) {
        return animation;
    }
}
