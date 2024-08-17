package net.pixeldreamstudios.gearofvalor.item.weapon.client.renderer;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import mod.azure.azurelib.renderer.layer.AutoGlowingGeoLayer;
import net.pixeldreamstudios.gearofvalor.item.weapon.ShadowStalkerItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.ShadowStalkerModel;

public class ShadowStalkerRenderer extends GeoItemRenderer<ShadowStalkerItem> {
    public ShadowStalkerRenderer() {
        super(new ShadowStalkerModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}