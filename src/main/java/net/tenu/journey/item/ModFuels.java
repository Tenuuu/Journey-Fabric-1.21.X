package net.tenu.journey.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.tenu.journey.Journey;

public class ModFuels {


    public static void registerFuelItems() {
        Journey.LOGGER.info("Registering fuel items for " + Journey.MOD_ID);

        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
    }
}
