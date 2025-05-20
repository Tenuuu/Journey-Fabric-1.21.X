package net.tenu.journey.item.client;

import net.tenu.journey.item.armor.SplendidRobeItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SplendidRobeRenderer extends GeoArmorRenderer<SplendidRobeItem> {
    public SplendidRobeRenderer() {
        super(new SplendidRobeModel());
    }
}
