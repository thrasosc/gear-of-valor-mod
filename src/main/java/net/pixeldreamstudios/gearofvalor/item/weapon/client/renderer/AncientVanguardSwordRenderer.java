package net.pixeldreamstudios.gearofvalor.item.weapon.client.renderer;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.pixeldreamstudios.gearofvalor.item.weapon.AncientVanguardSwordItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.AncientVanguardSwordModel;

public class AncientVanguardSwordRenderer extends GeoItemRenderer<AncientVanguardSwordItem> {
    public AncientVanguardSwordRenderer() {
        super(new AncientVanguardSwordModel());
    }
}
