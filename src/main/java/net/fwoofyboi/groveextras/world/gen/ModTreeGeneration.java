package net.fwoofyboi.groveextras.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fwoofyboi.groveextras.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PURPLE_HEART_PLACED_KEY);
    }
}
