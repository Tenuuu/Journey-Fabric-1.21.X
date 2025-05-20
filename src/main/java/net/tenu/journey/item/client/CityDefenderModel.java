package net.tenu.journey.item.client;

import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;
import net.tenu.journey.item.armor.CityDefenderItem;
import net.tenu.journey.item.armor.SplendidRobeItem;
import software.bernie.geckolib.model.GeoModel;

public class CityDefenderModel extends GeoModel<CityDefenderItem> {

    @Override
    public Identifier getModelResource(CityDefenderItem animatable) {
        return Identifier.of(Journey.MOD_ID, "geo/city_defender.geo.json");
    }

    @Override
    public Identifier getTextureResource(CityDefenderItem animatable) {
        return Identifier.of(Journey.MOD_ID, "textures/armor/city_defender.png");
    }

    @Override
    public Identifier getAnimationResource(CityDefenderItem animatable) {
        return Identifier.of(Journey.MOD_ID, "animations/city_defender.animation.json");
    }
}
