package net.pixeldreamstudios.gearofvalor.item.armor.client.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.ArismasAwakeningArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.client.model.PaladinArmorModel;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.ArismasAwakeningArmorItem;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.PaladinArmorItem;

public class ArismasAwakeningArmorRenderer extends GeoArmorRenderer<ArismasAwakeningArmorItem> {
    public ArismasAwakeningArmorRenderer() {
        super(new ArismasAwakeningArmorModel());
    }
}
