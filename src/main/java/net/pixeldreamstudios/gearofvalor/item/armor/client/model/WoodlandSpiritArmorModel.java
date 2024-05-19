package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.WoodlandSpiritArmorItem;

public class WoodlandSpiritArmorModel extends GeoModel<WoodlandSpiritArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/woodland_spirit.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/woodland_spirit.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/woodland_spirit.animation.json");

    @Override
    public ResourceLocation getModelResource(WoodlandSpiritArmorItem woodlandSpiritArmorItemArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(WoodlandSpiritArmorItem woodlandSpiritArmorItemArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(WoodlandSpiritArmorItem woodlandSpiritArmorItemArmorItem) {
        return animation;
    }
}
