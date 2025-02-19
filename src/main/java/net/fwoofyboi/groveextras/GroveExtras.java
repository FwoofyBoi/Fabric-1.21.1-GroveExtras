package net.fwoofyboi.groveextras;

import net.fabricmc.api.ModInitializer;

import net.fwoofyboi.groveextras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GroveExtras implements ModInitializer {
	public static final String MOD_ID = "groveextras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}