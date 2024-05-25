package net.pixeldreamstudios.gearofvalor.item.armor.client.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.ReapersEmbraceArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.ReapersEmbraceArmorItem;

public class ReapersEmbraceArmorRenderer extends GeoArmorRenderer<ReapersEmbraceArmorItem> {
    public ReapersEmbraceArmorRenderer() {
        super(new ReapersEmbraceArmorModel());
    }
}
