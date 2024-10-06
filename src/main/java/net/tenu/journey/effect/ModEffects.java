package net.tenu.journey.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect TOTEM_REGEN = new TotemRegenEffect();

    public static void registerModEffects() {
        Registry.register(Registries.STATUS_EFFECT, Identifier.of("journey", "totem_regen"), TOTEM_REGEN);
    }
}
