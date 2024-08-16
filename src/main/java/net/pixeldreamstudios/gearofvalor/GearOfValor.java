package net.pixeldreamstudios.gearofvalor;

import mod.azure.azurelib.AzureLib;
import net.fabricmc.api.ModInitializer;

import net.pixeldreamstudios.gearofvalor.registry.BlockRegistry;
import net.pixeldreamstudios.gearofvalor.registry.ItemRegistry;
import net.pixeldreamstudios.gearofvalor.registry.TabRegistry;
import net.pixeldreamstudios.gearofvalor.world.WorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GearOfValor implements ModInitializer {
	public static String MOD_ID = "gear-of-valor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AzureLib.initialize();
		ItemRegistry.init();
		TabRegistry.init();
		BlockRegistry.registerModBlocks();
		WorldGen.registerOreGeneration();


	}
}