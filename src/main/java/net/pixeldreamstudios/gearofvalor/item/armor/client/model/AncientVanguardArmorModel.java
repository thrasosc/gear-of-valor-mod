package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.AncientVanguardArmorItem;

public class AncientVanguardArmorModel extends GeoModel<AncientVanguardArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/ancient_vanguard.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/ancient_vanguard.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/ancient_vanguard.animation.json");

    @Override
    public ResourceLocation getModelResource(AncientVanguardArmorItem ancientVanguardArmorItemArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(AncientVanguardArmorItem ancientVanguardArmorItemArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(AncientVanguardArmorItem ancientVanguardArmorItemArmorItem) {
        return animation;
    }
}
