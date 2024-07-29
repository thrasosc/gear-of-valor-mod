package net.pixeldreamstudios.gearofvalor.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.pixeldreamstudios.gearofvalor.GearOfValor;

public class OreJsonRegistration {
    public static final ResourceKey<PlacedFeature> FALLEN_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(GearOfValor.MOD_ID, "fallen_ore_placed"));
    public static final ResourceKey<PlacedFeature> SOULINITE_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(GearOfValor.MOD_ID, "soulinite_ore_placed"));

    public static void registerOreGeneration() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, FALLEN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SOULINITE_ORE_PLACED_KEY);
        System.out.println("Registered ore generation");
    }
}
