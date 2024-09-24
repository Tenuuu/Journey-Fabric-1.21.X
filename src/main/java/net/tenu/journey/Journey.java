package net.tenu.journey;

import net.fabricmc.api.ModInitializer;

import net.tenu.journey.block.ModBlocks;
import net.tenu.journey.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Journey implements ModInitializer {
	public static final String MOD_ID = "journey";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}