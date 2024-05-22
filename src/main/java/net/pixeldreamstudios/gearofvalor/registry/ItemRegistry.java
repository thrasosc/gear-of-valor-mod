package net.pixeldreamstudios.gearofvalor.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.ArismasAwakeningArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.WoodlandSpiritArmorItem;

public class ItemRegistry {
    // ARMOR SETS
    public static Item PALADIN_HELMET;
    public static Item PALADIN_CHESTPLATE;
    public static Item PALADIN_LEGGINGS;
    public static Item PALADIN_BOOTS;

    public static Item WOODLAND_SPIRIT_HELMET;
    public static Item WOODLAND_SPIRIT_CHESTPLATE;
    public static Item WOODLAND_SPIRIT_LEGGINGS;
    public static Item WOODLAND_SPIRIT_BOOTS;

    public static Item ARISMAS_AWAKENING_HELMET;
    public static Item ARISMAS_AWAKENING_CHESTPLATE;
    public static Item ARISMAS_AWAKENING_LEGGINGS;
    public static Item ARISMAS_AWAKENING_BOOTS;

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

        WOODLAND_SPIRIT_HELMET = item("woodland_spirit_helmet", new WoodlandSpiritArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        WOODLAND_SPIRIT_CHESTPLATE = item("woodland_spirit_chestplate", new WoodlandSpiritArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        WOODLAND_SPIRIT_LEGGINGS = item("woodland_spirit_leggings", new WoodlandSpiritArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        WOODLAND_SPIRIT_BOOTS = item("woodland_spirit_boots", new WoodlandSpiritArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));

        ARISMAS_AWAKENING_HELMET = item("arismas_awakening_helmet", new ArismasAwakeningArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        ARISMAS_AWAKENING_CHESTPLATE = item("arismas_awakening_chestplate", new ArismasAwakeningArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        ARISMAS_AWAKENING_LEGGINGS = item("arismas_awakening_leggings", new ArismasAwakeningArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        ARISMAS_AWAKENING_BOOTS = item("arismas_awakening_boots", new ArismasAwakeningArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));
    }
}
