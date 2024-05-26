package net.pixeldreamstudios.gearofvalor;

import dev.architectury.registry.ReloadListenerRegistry;
import mod.chloeprime.aaaparticles.client.loader.EffekAssetLoader;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;

public class GearOfValorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ReloadListenerRegistry.register(PackType.CLIENT_RESOURCES, new EffekAssetLoader(), new ResourceLocation(GearOfValor.MOD_ID, "effeks"));
    }
}
