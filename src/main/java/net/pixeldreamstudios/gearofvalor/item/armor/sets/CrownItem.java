package net.pixeldreamstudios.gearofvalor.item.armor.sets;

import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.core.animation.AnimationController;
import mod.azure.azurelib.core.object.PlayState;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.pixeldreamstudios.gearofvalor.item.armor.ValorArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.ValorArmorMaterials;
import net.pixeldreamstudios.gearofvalor.item.armor.client.renderer.CrownArmorRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CrownItem extends ValorArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    public CrownItem(Type type, Properties properties) {
        super(ValorArmorMaterials.CROWN, type, properties);
    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("crown.toolip").withStyle(ChatFormatting.DARK_AQUA));
        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }
    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private CrownArmorRenderer renderer;

            @Override
            public HumanoidModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<LivingEntity> original) {
                if (renderer == null) renderer = new CrownArmorRenderer();

                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return renderer;
            }
        });
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return renderProvider;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controllerName", 0, event ->
        {
            return PlayState.STOP;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
