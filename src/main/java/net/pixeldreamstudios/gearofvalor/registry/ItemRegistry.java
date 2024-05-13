package net.pixeldreamstudios.gearofvalor.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;

public class ItemRegistry {
    // WEAPONS
    public static Item PALADIN_HELMET;
    public static Item PALADIN_CHESTPLATE;
    public static Item PALADIN_LEGGINGS;
    public static Item PALADIN_BOOTS;


    static <T extends Item> T item(String id, T c) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GearOfValor.MOD_ID, id), c);
        return c;
    }

    public static void init() {
        GearOfValor.LOGGER.info("registering items for " + GearOfValor.MOD_ID);
        PALADIN_HELMET = item("paladin_helmet", new PaladinArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        PALADIN_CHESTPLATE = item("paladin_chestplate", new PaladinArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        PALADIN_LEGGINGS = item("paladin_leggings", new PaladinArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        PALADIN_BOOTS = item("paladin_boots", new PaladinArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));
    }
}
