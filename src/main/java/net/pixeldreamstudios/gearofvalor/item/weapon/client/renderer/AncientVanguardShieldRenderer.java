package net.pixeldreamstudios.gearofvalor.item.weapon.client.renderer;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.pixeldreamstudios.gearofvalor.item.weapon.AncientVanguardShieldItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.client.model.AncientVanguardShieldModel;

public class AncientVanguardShieldRenderer extends GeoItemRenderer<AncientVanguardShieldItem> {
    public AncientVanguardShieldRenderer() {
        super(new AncientVanguardShieldModel());
    }
}
