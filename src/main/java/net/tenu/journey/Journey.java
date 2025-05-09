package net.tenu.journey;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.tenu.journey.block.ModBlocks;
import net.tenu.journey.effect.ModEffects;
import net.tenu.journey.item.ModFuels;
import net.tenu.journey.item.ModItemGroups;
import net.tenu.journey.item.ModItems;
import net.tenu.journey.item.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Journey implements ModInitializer {
	public static final String MOD_ID = "journey";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModPotions.registerModPotions();
		ModBlocks.registerModBlocks();
		ModEffects.registerModEffects();
		ModFuels.registerFuelItems();
	}
}