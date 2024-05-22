package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.ArismasAwakeningArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;

public class ArismasAwakeningArmorModel extends GeoModel<ArismasAwakeningArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/arismas_awakening.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/arismas_awakening.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/arismas_awakening.animation.json");

    @Override
    public ResourceLocation getModelResource(ArismasAwakeningArmorItem paladinArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(ArismasAwakeningArmorItem paladinArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ArismasAwakeningArmorItem paladinArmorItem) {
        return animation;
    }
}
