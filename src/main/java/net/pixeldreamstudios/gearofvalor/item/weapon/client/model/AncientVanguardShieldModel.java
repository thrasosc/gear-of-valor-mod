package net.pixeldreamstudios.gearofvalor.item.weapon.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.weapon.AncientVanguardShieldItem;

public class AncientVanguardShieldModel extends GeoModel<AncientVanguardShieldItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/weapon/ancient_vanguard_shield.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/weapon/ancient_vanguard_shield.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/weapon/ancient_vanguard_shield.animation.json");

    @Override
    public ResourceLocation getModelResource(AncientVanguardShieldItem ancientVanguardShieldItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(AncientVanguardShieldItem ancientVanguardShieldItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(AncientVanguardShieldItem ancientVanguardShieldItem) {
        return animation;
    }
}
