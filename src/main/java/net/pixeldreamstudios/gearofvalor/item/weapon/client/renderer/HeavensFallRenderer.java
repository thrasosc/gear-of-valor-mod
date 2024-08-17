package net.pixeldreamstudios.gearofvalor.item.weapon.client.renderer;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import mod.azure.azurelib.renderer.layer.AutoGlowingGeoLayer;
import net.pixeldreamstudios.gearofvalor.item.weapon.FurysCallItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.HeavensFallItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.FurysCallModel;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.HeavensFallModel;

public class HeavensFallRenderer extends GeoItemRenderer<HeavensFallItem> {
    public HeavensFallRenderer() {
        super(new HeavensFallModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}