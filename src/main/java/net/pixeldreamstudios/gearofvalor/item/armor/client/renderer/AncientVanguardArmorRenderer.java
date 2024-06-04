package net.pixeldreamstudios.gearofvalor.item.armor.client.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.AncientVanguardArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.PaladinArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.AncientVanguardArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;

public class AncientVanguardArmorRenderer extends GeoArmorRenderer<AncientVanguardArmorItem> {
    public AncientVanguardArmorRenderer() {
        super(new AncientVanguardArmorModel());
    }
}
