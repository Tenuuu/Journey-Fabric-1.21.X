package net.tenu.journey.item.client;

import net.tenu.journey.item.armor.BaseArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BaseArmorRenderer extends GeoArmorRenderer<BaseArmorItem> {
    public BaseArmorRenderer(String armorSet) { super(new BaseArmorModel(armorSet)); }
}
