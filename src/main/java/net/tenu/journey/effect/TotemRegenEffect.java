package net.tenu.journey.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class TotemRegenEffect extends StatusEffect {
    public TotemRegenEffect() {
        super (
            StatusEffectCategory.BENEFICIAL, // choose between BENEFICIAL and HARMFUL
            0xff3d98 // color in RGB
        );
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
