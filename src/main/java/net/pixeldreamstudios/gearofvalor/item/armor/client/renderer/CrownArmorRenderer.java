package net.pixeldreamstudios.gearofvalor.item.armor.client.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.CrownArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.CrownItem;

public class CrownArmorRenderer extends GeoArmorRenderer<CrownItem> {
    public CrownArmorRenderer() {
        super(new CrownArmorModel());
    }
}
