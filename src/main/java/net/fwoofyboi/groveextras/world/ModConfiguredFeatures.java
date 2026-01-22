package net.fwoofyboi.groveextras.world;

import net.fwoofyboi.groveextras.GroveExtras;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_HEART_KEY = registerKey("purple_heart");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_PURPLE_HEART_KEY = registerKey("mega_purple_heart");




    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, PURPLE_HEART_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                SimpleBlockStateProvider.of(ModBlocks.PURPLE_HEART_LOG),
                new StraightTrunkPlacer(4, 8, 0),//baseHeight, firstRandomHeight, secondRandomHeight
                SimpleBlockStateProvider.of(ModBlocks.PURPLE_HEART_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),//radius, offset, height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, MEGA_PURPLE_HEART_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PURPLE_HEART_LOG),
                new MegaJungleTrunkPlacer(10, 2, 19),//baseHeight, firstRandomHeight, secondRandomHeight
                BlockStateProvider.of(ModBlocks.PURPLE_HEART_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),//radius, offset, height
                new TwoLayersFeatureSize(1, 1, 2)).build());

    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(GroveExtras.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
