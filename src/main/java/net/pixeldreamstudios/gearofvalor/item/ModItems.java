package net.pixeldreamstudios.gearofvalor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.CrownItem;
import net.pixeldreamstudios.gearofvalor.item.armor.ValorArmorMaterials;

public class ModItems {
    public static final Item RAW_FALLEN = registerItem("raw_fallen", new Item(new FabricItemSettings()));
    public static final Item FALLEN = registerItem("fallen", new Item(new FabricItemSettings()));
    public static final Item RAW_SOULINITE = registerItem("raw_soulinite", new Item(new FabricItemSettings()));
    public static final Item SOULINITE = registerItem("soulinite", new Item(new FabricItemSettings()));
    public static final Item NOBLE_GEM = registerItem("noble_gem", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item FALLEN_CORE = registerItem("fallen_core", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item ARISMA_SCALE = registerItem("arisma_scale", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item UNSEEN_SOUL = registerItem("unseen_soul", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item TAINTED_IRON = registerItem("tainted_iron", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item CROWN = registerItem("crown", new CrownItem(ValorArmorMaterials.CROWN, new Item.Properties()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GearOfValor.MOD_ID, name), item);
    }
    public static void registerModItems() {
        GearOfValor.LOGGER.info("Registering Mod Items for " + GearOfValor.MOD_ID);
    }

}
