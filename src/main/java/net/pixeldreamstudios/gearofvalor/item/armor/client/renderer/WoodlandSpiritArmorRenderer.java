package net.pixeldreamstudios.gearofvalor.item.armor.client.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.PaladinArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.WoodlandSpiritArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.WoodlandSpiritArmorItem;

public class WoodlandSpiritArmorRenderer extends GeoArmorRenderer<WoodlandSpiritArmorItem> {
    public WoodlandSpiritArmorRenderer() {
        super(new WoodlandSpiritArmorModel());
    }
}
