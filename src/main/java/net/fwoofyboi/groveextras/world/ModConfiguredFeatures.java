package net.fwoofyboi.groveextras.world;

import net.fwoofyboi.groveextras.GroveExtras;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public  static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public  static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public  static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");

    public  static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_CRYSTALLIZED_AMBER_ORE_KEY = registerKey("nether_crystallized_amber_ore");

    public  static final RegistryKey<ConfiguredFeature<?, ?>> END_COMET_SHARD_ORE_KEY = registerKey("end_comet_shard_ore");
    public  static final RegistryKey<ConfiguredFeature<?, ?>> END_STAR_PIECE_ORE_KEY = registerKey("end_star_piece_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_HEART_KEY = registerKey("purple_heart");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_PURPLE_HEART_KEY = registerKey("mega_purple_heart");




    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherCrystallizedAmberOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_CRYSTALLIZED_AMBER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endCometShardOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_COMET_SHARD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endStarPieceOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_STAR_PIECE_ORE.getDefaultState()));

        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 4));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 4));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 4));

        register(context, NETHER_CRYSTALLIZED_AMBER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCrystallizedAmberOres, 3));

        register(context, END_COMET_SHARD_ORE_KEY, Feature.ORE, new OreFeatureConfig(endCometShardOres, 4));
        register(context, END_STAR_PIECE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endStarPieceOres, 4));

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
