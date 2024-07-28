package net.pixeldreamstudios.gearofvalor.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.pixeldreamstudios.gearofvalor.GearOfValor;

public class ModBlocks {
    public static final Block SOULINITE_ORE = registerBlock("soulinite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DEEPSLATE_SOULINITE_ORE = registerBlock("deepslate_soulinite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NETHER_SOULINITE_ORE = registerBlock("nether_soulinite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block END_STONE_SOULINITE_ORE = registerBlock("end_stone_soulinite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FALLEN_ORE = registerBlock("fallen_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DEEPSLATE_FALLEN_ORE = registerBlock("deepslate_fallen_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NETHER_FALLEN_ORE = registerBlock("nether_fallen_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block END_STONE_FALLEN_ORE = registerBlock("end_stone_fallen_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(GearOfValor.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GearOfValor.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        GearOfValor.LOGGER.info("Registering ModBlocks for " + GearOfValor.MOD_ID);
    }
}
