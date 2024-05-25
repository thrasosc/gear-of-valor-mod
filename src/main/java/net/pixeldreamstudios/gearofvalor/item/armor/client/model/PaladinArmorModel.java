package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.abstraction.CapeArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;

public class PaladinArmorModel extends CapeArmorModel<PaladinArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/paladin.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/paladin.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/paladin.animation.json");

    @Override
    public ResourceLocation getModelResource(PaladinArmorItem paladinArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(PaladinArmorItem paladinArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(PaladinArmorItem paladinArmorItem) {
        return animation;
    }
}
