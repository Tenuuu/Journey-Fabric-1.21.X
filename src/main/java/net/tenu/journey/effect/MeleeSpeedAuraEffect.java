package net.tenu.journey.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MeleeSpeedAuraEffect extends StatusEffect {
    public MeleeSpeedAuraEffect() {
        super (
            StatusEffectCategory.BENEFICIAL, // choose between BENEFICIAL and HARMFUL
            0xde3a1d // color in RGB
        );
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
