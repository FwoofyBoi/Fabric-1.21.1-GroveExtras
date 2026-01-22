package net.fwoofyboi.groveextras.world.tree;

import net.fwoofyboi.groveextras.GroveExtras;
import net.fwoofyboi.groveextras.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator PURPLE_HEART = new SaplingGenerator(GroveExtras.MOD_ID + ":purple_heart",
            Optional.of(ModConfiguredFeatures.MEGA_PURPLE_HEART_KEY),
            Optional.of(ModConfiguredFeatures.PURPLE_HEART_KEY),
            Optional.empty());

}
