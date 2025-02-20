package net.fwoofyboi.groveextras;

import net.fabricmc.api.ModInitializer;

import net.fwoofyboi.groveextras.block.ModBlocks;
import net.fwoofyboi.groveextras.item.ModItemGroups;
import net.fwoofyboi.groveextras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GroveExtras implements ModInitializer {
	public static final String MOD_ID = "groveextras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}