package net.tenu.journey.item.client;

import net.minecraft.util.Identifier;
import net.tenu.journey.Journey;
import net.tenu.journey.item.armor.BaseArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class BaseArmorModel extends GeoModel<BaseArmorItem> {
    private final String armorSet;

    public BaseArmorModel(String armorSet) {
        this.armorSet = armorSet;
    }

    @Override
    public Identifier getModelResource(BaseArmorItem animatable) {
        return Identifier.of(Journey.MOD_ID, "geo/" + armorSet + ".geo.json");
    }

    @Override
    public Identifier getTextureResource(BaseArmorItem animatable) {
        return Identifier.of(Journey.MOD_ID, "textures/armor/" + armorSet + ".png");
    }

    @Override
    public Identifier getAnimationResource(BaseArmorItem animatable) {
        return Identifier.of(Journey.MOD_ID, "animations/idle.animation.json");
    }
}
