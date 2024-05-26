package net.pixeldreamstudios.gearofvalor.item.armor.client.model;

import mod.azure.azurelib.core.animation.AnimationState;
import mod.azure.azurelib.util.ClientUtils;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.abstraction.CapeArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.ReapersEmbraceArmorItem;
import net.pixeldreamstudios.gearofvalor.registry.ItemRegistry;
import net.spell_engine.particle.Particles;

public class ReapersEmbraceArmorModel extends CapeArmorModel<ReapersEmbraceArmorItem> {
    private static final ResourceLocation model = new ResourceLocation(GearOfValor.MOD_ID, "geo/armor/reapers_embrace.geo.json");
    private static final ResourceLocation texture = new ResourceLocation(GearOfValor.MOD_ID, "textures/armor/reapers_embrace.png");
    private static final ResourceLocation animation = new ResourceLocation(GearOfValor.MOD_ID, "animations/armor/reapers_embrace.animation.json");

    @Override
    public ResourceLocation getModelResource(ReapersEmbraceArmorItem reapersEmbraceArmorItem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(ReapersEmbraceArmorItem reapersEmbraceArmorItem) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ReapersEmbraceArmorItem reapersEmbraceArmorItem) {
        return animation;
    }

    @Override
    public void setCustomAnimations(ReapersEmbraceArmorItem animatable, long instanceId, AnimationState<ReapersEmbraceArmorItem> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
        Player player = ClientUtils.getClientPlayer();
        Level level = ClientUtils.getLevel();
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        if (helmet.is(ItemRegistry.REAPERS_EMBRACE_HELMET)
                && chestplate.is(ItemRegistry.REAPERS_EMBRACE_CHESTPLATE)
                && leggings.is(ItemRegistry.REAPERS_EMBRACE_LEGGINGS)
                && boots.is(ItemRegistry.REAPERS_EMBRACE_BOOTS)) {
            if (player.isShiftKeyDown() && !player.isInvisible()) {
                renderParticles(player, level);
                makeInvisible(player);
            }
            else if (!player.isShiftKeyDown() && player.isInvisible()) {
                renderParticles(player, level);
                makeVisible(player);
            }
        }
        else { // needed to fix bug when dying while crouching
            makeVisible(player);
        }
    }

    private void makeInvisible(Player player) {
        player.setInvisible(true);
        getAnimationProcessor().getBone("bipedHead").setHidden(true);
        getAnimationProcessor().getBone("bipedBody").setHidden(true);
        getAnimationProcessor().getBone("bipedRightArm").setHidden(true);
        getAnimationProcessor().getBone("bipedLeftArm").setHidden(true);
        getAnimationProcessor().getBone("bipedRightLeg").setHidden(true);
        getAnimationProcessor().getBone("bipedLeftLeg").setHidden(true);
    }

    private void makeVisible(Player player) {
        getAnimationProcessor().getBone("bipedHead").setHidden(false);
        getAnimationProcessor().getBone("bipedBody").setHidden(false);
        getAnimationProcessor().getBone("bipedRightArm").setHidden(false);
        getAnimationProcessor().getBone("bipedLeftArm").setHidden(false);
        getAnimationProcessor().getBone("bipedRightLeg").setHidden(false);
        getAnimationProcessor().getBone("bipedLeftLeg").setHidden(false);
        player.setInvisible(false);
    }

    private void renderParticles(Player player, Level level) {
        for (int i = 0; i < 5; ++i) {
            double d = level.random.nextGaussian() * 0.02;
            double e = level.random.nextGaussian() * 0.02;
            double f = level.random.nextGaussian() * 0.02;
            level.addParticle(Particles.arcane_spell.particleType, player.getRandomX(1.0), player.getRandomY(), player.getRandomZ(1.0), d, e, f);
        }
    }
}
