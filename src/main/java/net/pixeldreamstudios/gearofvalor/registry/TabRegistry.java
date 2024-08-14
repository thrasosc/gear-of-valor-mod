package net.pixeldreamstudios.gearofvalor.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.pixeldreamstudios.gearofvalor.GearOfValor;

public class TabRegistry {
    public static final CreativeModeTab CREATIVE_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(GearOfValor.MOD_ID, GearOfValor.MOD_ID), FabricItemGroup.builder().title(Component.translatable("creative_tab." + GearOfValor.MOD_ID)).icon(() -> new ItemStack(ItemRegistry.PALADIN_HELMET)).displayItems((displayContext, entries) -> {
        entries.accept(ItemRegistry.PALADIN_HELMET);
        entries.accept(ItemRegistry.PALADIN_CHESTPLATE);
        entries.accept(ItemRegistry.PALADIN_LEGGINGS);
        entries.accept(ItemRegistry.PALADIN_BOOTS);

        entries.accept(ItemRegistry.WOODLAND_SPIRIT_HELMET);
        entries.accept(ItemRegistry.WOODLAND_SPIRIT_CHESTPLATE);
        entries.accept(ItemRegistry.WOODLAND_SPIRIT_LEGGINGS);
        entries.accept(ItemRegistry.WOODLAND_SPIRIT_BOOTS);

        entries.accept(ItemRegistry.ARISMAS_AWAKENING_HELMET);
        entries.accept(ItemRegistry.ARISMAS_AWAKENING_CHESTPLATE);
        entries.accept(ItemRegistry.ARISMAS_AWAKENING_LEGGINGS);
        entries.accept(ItemRegistry.ARISMAS_AWAKENING_BOOTS);

        entries.accept(ItemRegistry.REAPERS_EMBRACE_HELMET);
        entries.accept(ItemRegistry.REAPERS_EMBRACE_CHESTPLATE);
        entries.accept(ItemRegistry.REAPERS_EMBRACE_LEGGINGS);
        entries.accept(ItemRegistry.REAPERS_EMBRACE_BOOTS);

        entries.accept(ItemRegistry.ANCIENT_VANGUARD_HELMET);
        entries.accept(ItemRegistry.ANCIENT_VANGUARD_CHESTPLATE);
        entries.accept(ItemRegistry.ANCIENT_VANGUARD_LEGGINGS);
        entries.accept(ItemRegistry.ANCIENT_VANGUARD_BOOTS);

        entries.accept(ItemRegistry.ANCIENT_VANGUARD_SWORD);
        entries.accept(ItemRegistry.ANCIENT_VANGUARD_SHIELD);

        entries.accept(ItemRegistry.NIGHT_RIDER_HELMET);
        entries.accept(ItemRegistry.NIGHT_RIDER_CHESTPLATE);
        entries.accept(ItemRegistry.NIGHT_RIDER_LEGGINGS);
        entries.accept(ItemRegistry.NIGHT_RIDER_BOOTS);

        entries.accept(ItemRegistry.NIGHT_RIDER_AXE);

        entries.accept(ItemRegistry.FURYS_CALL_SWORD);

        entries.accept(ItemRegistry.SHADOW_STALKER);
    }).build());

    public static void init() {
        GearOfValor.LOGGER.info("registering creative tabs for " + GearOfValor.MOD_ID);
    }
}
