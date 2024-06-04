package net.pixeldreamstudios.gearofvalor.item.weapon.client.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.weapon.AncientVanguardSwordItem;

public class AncientVanguardSwordModel extends GeoModel<AncientVanguardSwordItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/weapon/ancient_vanguard_sword.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/weapon/ancient_vanguard_sword.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/weapon/ancient_vanguard_sword.animation.json");

    @Override
    public ResourceLocation getModelResource(AncientVanguardSwordItem ancientVanguardSwordItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(AncientVanguardSwordItem ancientVanguardSwordItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(AncientVanguardSwordItem ancientVanguardSwordItem) {
        return animation;
    }
}
