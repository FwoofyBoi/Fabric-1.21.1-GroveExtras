package net.fwoofyboi.groveextras;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.fwoofyboi.groveextras.component.ModDataComponentTypes;
import net.fwoofyboi.groveextras.entity.ModEntities;
import net.fwoofyboi.groveextras.item.ModItemGroups;
import net.fwoofyboi.groveextras.item.ModItems;
import net.fwoofyboi.groveextras.sound.ModSounds;
import net.fwoofyboi.groveextras.world.gen.ModWorldGeneration;
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
		ModDataComponentTypes.registerDataComponentTypes();
		ModSounds.registerSounds();
		ModEntities.registerModEntities();

		ModWorldGeneration.generateModWorldGen();


		StrippableBlockRegistry.register(ModBlocks.PURPLE_HEART_LOG, ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_LOG);
		StrippableBlockRegistry.register(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_LOG, ModBlocks.STRIPPED_PURPLE_HEART_LOG);
		StrippableBlockRegistry.register(ModBlocks.PURPLE_HEART_WOOD, ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_WOOD);
		StrippableBlockRegistry.register(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_WOOD, ModBlocks.STRIPPED_PURPLE_HEART_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_HEART_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_HEART_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PURPLE_HEART_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PURPLE_HEART_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_HEART_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_PURPLE_HEART_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_HEART_LEAVES, 30, 60);


		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC_CLOVE, 0.2f);
	}
}