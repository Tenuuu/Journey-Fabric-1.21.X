package net.tenu.journey.item.client;

import net.tenu.journey.item.armor.CityDefenderItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CityDefenderRenderer extends GeoArmorRenderer<CityDefenderItem> {
    public CityDefenderRenderer() {
        super(new CityDefenderModel());
    }
}
