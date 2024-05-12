package net.pixeldreamstudios.gearofvalor.item.armor.client.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.PaladinArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;

public class PaladinArmorRenderer extends GeoArmorRenderer<PaladinArmorItem> {
    public PaladinArmorRenderer() {
        super(new PaladinArmorModel());
    }
}
