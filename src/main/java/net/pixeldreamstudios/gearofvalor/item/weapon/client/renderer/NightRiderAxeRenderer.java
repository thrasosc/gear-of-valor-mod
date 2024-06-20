package net.pixeldreamstudios.gearofvalor.item.weapon.client.renderer;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.pixeldreamstudios.gearofvalor.item.weapon.AncientVanguardSwordItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.NightRiderAxeItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.AncientVanguardSwordModel;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.NightRiderAxeModel;

public class NightRiderAxeRenderer extends GeoItemRenderer<NightRiderAxeItem> {
    public NightRiderAxeRenderer() {
        super(new NightRiderAxeModel());
    }
}
