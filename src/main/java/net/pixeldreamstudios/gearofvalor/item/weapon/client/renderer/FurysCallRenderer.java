package net.pixeldreamstudios.gearofvalor.item.weapon.client.renderer;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.pixeldreamstudios.gearofvalor.item.weapon.FurysCallItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.FurysCallModel;

public class FurysCallRenderer extends GeoItemRenderer<FurysCallItem> {
    public FurysCallRenderer() {
        super(new FurysCallModel());
    }
}
