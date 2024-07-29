package net.pixeldreamstudios.gearofvalor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.pixeldreamstudios.gearofvalor.GearOfValor;

public class ModItems {
    public static final Item RAW_FALLEN = registerItem("raw_fallen", new Item(new FabricItemSettings()));
    public static final Item FALLEN = registerItem("fallen", new Item(new FabricItemSettings()));
    public static final Item RAW_SOULINITE = registerItem("raw_soulinite", new Item(new FabricItemSettings()));
    public static final Item SOULINITE = registerItem("soulinite", new Item(new FabricItemSettings()));
    public static final Item NOBLE_GEM = registerItem("noble_gem", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GearOfValor.MOD_ID, name), item);
    }
    public static void registerModItems() {
        GearOfValor.LOGGER.info("Registering Mod Items for " + GearOfValor.MOD_ID);
    }

}
