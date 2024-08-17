package net.pixeldreamstudios.gearofvalor.item.weapon.client.renderer;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import mod.azure.azurelib.renderer.layer.AutoGlowingGeoLayer;
import net.pixeldreamstudios.gearofvalor.item.weapon.HarbringerItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.HarbringerModel;


public class HarbringerRenderer extends GeoItemRenderer<HarbringerItem> {
    public HarbringerRenderer() {
        super(new HarbringerModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}