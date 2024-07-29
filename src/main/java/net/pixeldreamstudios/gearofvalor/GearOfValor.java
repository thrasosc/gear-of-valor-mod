package net.pixeldreamstudios.gearofvalor;

import mod.azure.azurelib.AzureLib;
import net.fabricmc.api.ModInitializer;

import net.pixeldreamstudios.gearofvalor.block.ModBlocks;
import net.pixeldreamstudios.gearofvalor.item.ModItems;
import net.pixeldreamstudios.gearofvalor.registry.ItemRegistry;
import net.pixeldreamstudios.gearofvalor.registry.TabRegistry;
import net.pixeldreamstudios.gearofvalor.world.OreJsonRegistration;
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
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		OreJsonRegistration.registerOreGeneration();


	}
}