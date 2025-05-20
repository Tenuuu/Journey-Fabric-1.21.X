package net.tenu.journey.item.client;

import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;
import net.tenu.journey.item.armor.SplendidRobeItem;
import software.bernie.geckolib.model.GeoModel;

public class SplendidRobeModel extends GeoModel<SplendidRobeItem> {

    @Override
    public Identifier getModelResource(SplendidRobeItem animatable) {
        return Identifier.of(Journey.MOD_ID, "geo/splendid_robe.geo.json");
    }

    @Override
    public Identifier getTextureResource(SplendidRobeItem animatable) {
        return Identifier.of(Journey.MOD_ID, "textures/armor/splendid_robe.png");
    }

    @Override
    public Identifier getAnimationResource(SplendidRobeItem animatable) {
        return Identifier.of(Journey.MOD_ID, "animations/splendid_robe.animation.json");
    }
}
