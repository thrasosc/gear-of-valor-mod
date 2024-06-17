package net.pixeldreamstudios.gearofvalor.item.armor.client.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.NightRiderArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.NightRiderArmorItem;

public class NightRiderArmorRenderer extends GeoArmorRenderer<NightRiderArmorItem> {
    public NightRiderArmorRenderer() {
        super(new NightRiderArmorModel());
    }
}
