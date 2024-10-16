package net.tenu.journey.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect TOTEM_REGEN = new TotemRegenEffect();
    public static final StatusEffect DAMAGE_AURA = new DamageAuraEffect();
    public static final StatusEffect MELEE_SPEED_AURA = new MeleeSpeedAuraEffect();

    public static void registerModEffects() {
        Registry.register(Registries.STATUS_EFFECT, Identifier.of("journey", "totem_regen"), TOTEM_REGEN);
        Registry.register(Registries.STATUS_EFFECT, Identifier.of("journey", "damage_aura"), DAMAGE_AURA);
        Registry.register(Registries.STATUS_EFFECT, Identifier.of("journey", "melee_speed_aura"), MELEE_SPEED_AURA);
    }
}
