package net.tenu.journey.item;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.potion.Potions;
import net.tenu.journey.Journey;

public class ModPotions {
    public static void registerModPotions() {
        Journey.LOGGER.info("Registering mod potions for " + Journey.MOD_ID);

//        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
//            builder.registerPotionRecipe(
//                    // Input potion
//                    Potions.AWKWARD,
//                    // Ingredient
//                    ModItems.FOUR_LEAF_CLOVER,
//                    // Output potion
//                    Potions.LUCK
//            );
//        });
    }
}
