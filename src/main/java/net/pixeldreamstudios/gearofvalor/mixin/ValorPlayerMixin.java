package net.pixeldreamstudios.gearofvalor.mixin;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.pixeldreamstudios.gearofvalor.registry.ItemRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public class ValorPlayerMixin {

    @Inject(at = @At("TAIL"), method = "Lnet/minecraft/world/entity/player/Player;tick()V")
    private void valorArmorSetBonusTick(CallbackInfo info) {
        Player thisPlayer = (Player)(Object)this;
        ItemStack helmet = thisPlayer.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestplate = thisPlayer.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggings = thisPlayer.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = thisPlayer.getItemBySlot(EquipmentSlot.FEET);

        // ARISMA'S AWAKENING
        if (!thisPlayer.isInLava()
                && helmet.is(ItemRegistry.ARISMAS_AWAKENING_HELMET)
                && chestplate.is(ItemRegistry.ARISMAS_AWAKENING_CHESTPLATE)
                && leggings.is(ItemRegistry.ARISMAS_AWAKENING_LEGGINGS)
                && boots.is(ItemRegistry.ARISMAS_AWAKENING_BOOTS)) {
            thisPlayer.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0, false, false, false));
        }
        // REAPER'S EMBRACE
        if (
                helmet.is(ItemRegistry.REAPERS_EMBRACE_HELMET)
                && chestplate.is(ItemRegistry.REAPERS_EMBRACE_CHESTPLATE)
                && leggings.is(ItemRegistry.REAPERS_EMBRACE_LEGGINGS)
                && boots.is(ItemRegistry.REAPERS_EMBRACE_BOOTS)) {
            if (thisPlayer.isShiftKeyDown()) {
                thisPlayer.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, MobEffectInstance.INFINITE_DURATION, 0, false, true, true));
            }
            else {
                thisPlayer.removeEffect(MobEffects.INVISIBILITY);
            }
        }
    }
}
