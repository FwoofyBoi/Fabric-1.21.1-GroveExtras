package net.fwoofyboi.groveextras.block;

import net.fwoofyboi.groveextras.GroveExtras;
import net.fwoofyboi.groveextras.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DEV_A0_SURFACE = registerBlock("dev_a0_surface",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block DEV_A0_RUINS = registerBlock("dev_a0_ruins",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block DEV_A0_LUSH = registerBlock("dev_a0_lush",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block DEV_A0_VOLCANIC = registerBlock("dev_a0_volcanic",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block DEV_A0_DRIPSTONE = registerBlock("dev_a0_dripstone",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block DEV_A0_CRYSTAL = registerBlock("dev_a0_crystal",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block DEV_A0_DARK = registerBlock("dev_a0_dark",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block DEV_ULTRA_SPACE = registerBlock("dev_ultra_space",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.ANVIL)));

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CRYSTALLIZED_AMBER_BLOCK = registerBlock("crystallized_amber_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CUT_DIAMOND_BLOCK = registerBlock("cut_diamond_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CUT_AMETHYST_BLOCK = registerBlock("cut_amethyst_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block STAR_PIECE_BLOCK = registerBlock("star_piece_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block COMET_SHARD_BLOCK = registerBlock("comet_shard_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MINES_FOSSILISED_SAND = registerBlock("mines_fossilised_sand",
            new Block(AbstractBlock.Settings.create().strength(0.1f).requiresTool().sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)));
    public static final Block MINES_FOSSILISED_STONE = registerBlock("mines_fossilised_stone",
            new Block(AbstractBlock.Settings.create().strength(0.1f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MINES_FOSSILISED_DEEPSLATE = registerBlock("mines_fossilised_deepslate",
            new Block(AbstractBlock.Settings.create().strength(0.1f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).mapColor(MapColor.DEEPSLATE_GRAY)));

    public static final Block BUDDING_CRYSTAL_BLUE = registerBlock("budding_crystal_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block BUDDING_CRYSTAL_CYAN = registerBlock("budding_crystal_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block BUDDING_CRYSTAL_GREEN = registerBlock("budding_crystal_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block BUDDING_CRYSTAL_LIME = registerBlock("budding_crystal_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIME)));
    public static final Block BUDDING_CRYSTAL_MAGENTA = registerBlock("budding_crystal_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_PINK)));
    public static final Block BUDDING_CRYSTAL_ORANGE = registerBlock("budding_crystal_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.ORANGE)));
    public static final Block BUDDING_CRYSTAL_PINK = registerBlock("budding_crystal_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PINK)));
    public static final Block BUDDING_CRYSTAL_RED = registerBlock("budding_crystal_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_RED)));
    public static final Block BUDDING_CRYSTAL_WHITE = registerBlock("budding_crystal_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.WHITE)));
    public static final Block BUDDING_CRYSTAL_YELLOW = registerBlock("budding_crystal_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.YELLOW)));
    public static final Block BUDDING_CRYSTAL_AUBURN = registerBlock("budding_crystal_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block BUDDING_CRYSTAL_CORNFLOWER = registerBlock("budding_crystal_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.CYAN)));
    public static final Block BUDDING_CRYSTAL_GRAY = registerBlock("budding_crystal_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block BUDDING_CRYSTAL_INDIGO = registerBlock("budding_crystal_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PURPLE)));
    public static final Block BUDDING_CRYSTAL_MAROON = registerBlock("budding_crystal_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.RED)));
    public static final Block BUDDING_CRYSTAL_MOCHA = registerBlock("budding_crystal_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.BROWN)));
    public static final Block BUDDING_CRYSTAL_ORCHID = registerBlock("budding_crystal_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.MAGENTA)));
    public static final Block BUDDING_CRYSTAL_SLATE = registerBlock("budding_crystal_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GRAY)));
    public static final Block BUDDING_CRYSTAL_RAINBOW = registerBlock("budding_crystal_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.OFF_WHITE)));

    public static final Block CRYSTAL_BLOCK_BLUE = registerBlock("crystal_block_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block CRYSTAL_BLOCK_CYAN = registerBlock("crystal_block_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block CRYSTAL_BLOCK_GREEN = registerBlock("crystal_block_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block CRYSTAL_BLOCK_LIME = registerBlock("crystal_block_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIME)));
    public static final Block CRYSTAL_BLOCK_MAGENTA = registerBlock("crystal_block_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_PINK)));
    public static final Block CRYSTAL_BLOCK_ORANGE = registerBlock("crystal_block_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.ORANGE)));
    public static final Block CRYSTAL_BLOCK_PINK = registerBlock("crystal_block_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PINK)));
    public static final Block CRYSTAL_BLOCK_RED = registerBlock("crystal_block_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_RED)));
    public static final Block CRYSTAL_BLOCK_WHITE = registerBlock("crystal_block_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.WHITE)));
    public static final Block CRYSTAL_BLOCK_YELLOW = registerBlock("crystal_block_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.YELLOW)));
    public static final Block CRYSTAL_BLOCK_AUBURN = registerBlock("crystal_block_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block CRYSTAL_BLOCK_CORNFLOWER = registerBlock("crystal_block_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.CYAN)));
    public static final Block CRYSTAL_BLOCK_GRAY = registerBlock("crystal_block_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block CRYSTAL_BLOCK_INDIGO = registerBlock("crystal_block_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PURPLE)));
    public static final Block CRYSTAL_BLOCK_MAROON = registerBlock("crystal_block_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.RED)));
    public static final Block CRYSTAL_BLOCK_MOCHA = registerBlock("crystal_block_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.BROWN)));
    public static final Block CRYSTAL_BLOCK_ORCHID = registerBlock("crystal_block_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.MAGENTA)));
    public static final Block CRYSTAL_BLOCK_SLATE = registerBlock("crystal_block_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GRAY)));
    public static final Block CRYSTAL_BLOCK_RAINBOW = registerBlock("crystal_block_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.OFF_WHITE)));

    public static final Block GRAVEL_AQUARIUM = registerBlock("gravel_aquarium",
            new Block(AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRAVEL).mapColor(MapColor.CYAN)));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.DIRT_BROWN)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.DIRT_BROWN)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.DIRT_BROWN)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.DIRT_BROWN)));

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.STONE_GRAY)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.STONE_GRAY)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.STONE_GRAY)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.STONE_GRAY)));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS).mapColor(MapColor.OFF_WHITE)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));

    public static final Block CALCITE_POLISHED = registerBlock("calcite_polished",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CALCITE_POLISHED_STAIRS = registerBlock("calcite_polished_stairs",
            new StairsBlock(ModBlocks.CALCITE_POLISHED.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CALCITE_POLISHED_SLAB = registerBlock("calcite_polished_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CALCITE_POLISHED_WALL = registerBlock("calcite_polished_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE)));

    public static final Block PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .slipperiness(0.98f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block PACKED_ICE_BRICK_STAIRS = registerBlock("packed_ice_brick_stairs",
            new StairsBlock(ModBlocks.PACKED_ICE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .strength(0.5f)
                            .slipperiness(0.98f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.PALE_PURPLE)));
    public static final Block PACKED_ICE_BRICK_SLAB = registerBlock("packed_ice_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .slipperiness(0.98f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block PACKED_ICE_BRICK_WALL = registerBlock("packed_ice_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .slipperiness(0.98f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block CHISELED_PACKED_ICE = registerBlock("chiseled_packed_ice",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5f)
                    .slipperiness(0.98f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));

    public static final Block BLUE_ICE_BRICKS = registerBlock("blue_ice_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.8f)
                    .slipperiness(0.989f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block BLUE_ICE_BRICK_STAIRS = registerBlock("blue_ice_brick_stairs",
            new StairsBlock(ModBlocks.BLUE_ICE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .strength(2.8f)
                            .slipperiness(0.989f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.PALE_PURPLE)));
    public static final Block BLUE_ICE_BRICK_SLAB = registerBlock("blue_ice_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.8f)
                    .slipperiness(0.989f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block BLUE_ICE_BRICK_WALL = registerBlock("blue_ice_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.8f)
                    .slipperiness(0.989f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));
    public static final Block CHISELED_BLUE_ICE = registerBlock("chiseled_blue_ice",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.8f)
                    .slipperiness(0.989f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE)));


    public static final Block CRYSTAL_BRICKS_BLUE = registerBlock("crystal_bricks_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block CRYSTAL_BRICK_STAIRS_BLUE = registerBlock("crystal_brick_stairs_blue",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_BLUE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block CRYSTAL_BRICK_SLAB_BLUE = registerBlock("crystal_brick_slab_blue",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LAPIS_BLUE)));

    public static final Block CRYSTAL_BRICKS_CYAN = registerBlock("crystal_bricks_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block CRYSTAL_BRICK_STAIRS_CYAN = registerBlock("crystal_brick_stairs_cyan",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_CYAN.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block CRYSTAL_BRICK_SLAB_CYAN = registerBlock("crystal_brick_slab_cyan",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE)));

    public static final Block CRYSTAL_BRICKS_GREEN = registerBlock("crystal_bricks_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block CRYSTAL_BRICK_STAIRS_GREEN = registerBlock("crystal_brick_stairs_green",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_GREEN.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block CRYSTAL_BRICK_SLAB_GREEN = registerBlock("crystal_brick_slab_green",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.EMERALD_GREEN)));

    public static final Block CRYSTAL_BRICKS_LIME = registerBlock("crystal_bricks_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIME)));
    public static final Block CRYSTAL_BRICK_STAIRS_LIME = registerBlock("crystal_brick_stairs_lime",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_LIME.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIME)));
    public static final Block CRYSTAL_BRICK_SLAB_LIME = registerBlock("crystal_brick_slab_lime",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIME)));

    public static final Block CRYSTAL_BRICKS_MAGENTA = registerBlock("crystal_bricks_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_PINK)));
    public static final Block CRYSTAL_BRICK_STAIRS_MAGENTA = registerBlock("crystal_brick_stairs_magenta",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_MAGENTA.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_PINK)));
    public static final Block CRYSTAL_BRICK_SLAB_MAGENTA = registerBlock("crystal_brick_slab_magenta",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_PINK)));

    public static final Block CRYSTAL_BRICKS_ORANGE = registerBlock("crystal_bricks_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.ORANGE)));
    public static final Block CRYSTAL_BRICK_STAIRS_ORANGE = registerBlock("crystal_brick_stairs_orange",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_ORANGE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.ORANGE)));
    public static final Block CRYSTAL_BRICK_SLAB_ORANGE = registerBlock("crystal_brick_slab_orange",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.ORANGE)));

    public static final Block CRYSTAL_BRICKS_PINK = registerBlock("crystal_bricks_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PINK)));
    public static final Block CRYSTAL_BRICK_STAIRS_PINK = registerBlock("crystal_brick_stairs_pink",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_PINK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PINK)));
    public static final Block CRYSTAL_BRICK_SLAB_PINK = registerBlock("crystal_brick_slab_pink",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PINK)));

    public static final Block CRYSTAL_BRICKS_RED = registerBlock("crystal_bricks_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_RED)));
    public static final Block CRYSTAL_BRICK_STAIRS_RED = registerBlock("crystal_brick_stairs_red",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_RED.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_RED)));
    public static final Block CRYSTAL_BRICK_SLAB_RED = registerBlock("crystal_brick_slab_red",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_RED)));

    public static final Block CRYSTAL_BRICKS_WHITE = registerBlock("crystal_bricks_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.WHITE)));
    public static final Block CRYSTAL_BRICK_STAIRS_WHITE = registerBlock("crystal_brick_stairs_white",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_WHITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.WHITE)));
    public static final Block CRYSTAL_BRICK_SLAB_WHITE = registerBlock("crystal_brick_slab_white",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.WHITE)));

    public static final Block CRYSTAL_BRICKS_YELLOW = registerBlock("crystal_bricks_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.YELLOW)));
    public static final Block CRYSTAL_BRICK_STAIRS_YELLOW = registerBlock("crystal_brick_stairs_yellow",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_YELLOW.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.YELLOW)));
    public static final Block CRYSTAL_BRICK_SLAB_YELLOW = registerBlock("crystal_brick_slab_yellow",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.YELLOW)));

    public static final Block CRYSTAL_BRICKS_AUBURN = registerBlock("crystal_bricks_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block CRYSTAL_BRICK_STAIRS_AUBURN = registerBlock("crystal_brick_stairs_auburn",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_AUBURN.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block CRYSTAL_BRICK_SLAB_AUBURN = registerBlock("crystal_brick_slab_auburn",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));

    public static final Block CRYSTAL_BRICKS_CORNFLOWER = registerBlock("crystal_bricks_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.CYAN)));
    public static final Block CRYSTAL_BRICK_STAIRS_CORNFLOWER = registerBlock("crystal_brick_stairs_cornflower",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_CORNFLOWER.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.CYAN)));
    public static final Block CRYSTAL_BRICK_SLAB_CORNFLOWER = registerBlock("crystal_brick_slab_cornflower",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.CYAN)));

    public static final Block CRYSTAL_BRICKS_GRAY = registerBlock("crystal_bricks_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block CRYSTAL_BRICK_STAIRS_GRAY = registerBlock("crystal_brick_stairs_gray",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_GRAY.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block CRYSTAL_BRICK_SLAB_GRAY = registerBlock("crystal_brick_slab_gray",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_GRAY)));

    public static final Block CRYSTAL_BRICKS_INDIGO = registerBlock("crystal_bricks_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PURPLE)));
    public static final Block CRYSTAL_BRICK_STAIRS_INDIGO = registerBlock("crystal_brick_stairs_indigo",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_INDIGO.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PURPLE)));
    public static final Block CRYSTAL_BRICK_SLAB_INDIGO = registerBlock("crystal_brick_slab_indigo",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PURPLE)));

    public static final Block CRYSTAL_BRICKS_MAROON = registerBlock("crystal_bricks_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.RED)));
    public static final Block CRYSTAL_BRICK_STAIRS_MAROON = registerBlock("crystal_brick_stairs_maroon",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_MAROON.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.RED)));
    public static final Block CRYSTAL_BRICK_SLAB_MAROON = registerBlock("crystal_brick_slab_maroon",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.RED)));

    public static final Block CRYSTAL_BRICKS_MOCHA = registerBlock("crystal_bricks_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.BROWN)));
    public static final Block CRYSTAL_BRICK_STAIRS_MOCHA = registerBlock("crystal_brick_stairs_mocha",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_MOCHA.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.BROWN)));
    public static final Block CRYSTAL_BRICK_SLAB_MOCHA = registerBlock("crystal_brick_slab_mocha",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.BROWN)));

    public static final Block CRYSTAL_BRICKS_ORCHID = registerBlock("crystal_bricks_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.MAGENTA)));
    public static final Block CRYSTAL_BRICK_STAIRS_ORCHID = registerBlock("crystal_brick_stairs_orchid",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_ORCHID.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.MAGENTA)));
    public static final Block CRYSTAL_BRICK_SLAB_ORCHID = registerBlock("crystal_brick_slab_orchid",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.MAGENTA)));

    public static final Block CRYSTAL_BRICKS_SLATE = registerBlock("crystal_bricks_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GRAY)));
    public static final Block CRYSTAL_BRICK_STAIRS_SLATE = registerBlock("crystal_brick_stairs_slate",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_SLATE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GRAY)));
    public static final Block CRYSTAL_BRICK_SLAB_SLATE = registerBlock("crystal_brick_slab_slate",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GRAY)));

    public static final Block CRYSTAL_BRICKS_RAINBOW = registerBlock("crystal_bricks_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.OFF_WHITE)));
    public static final Block CRYSTAL_BRICK_STAIRS_RAINBOW = registerBlock("crystal_brick_stairs_rainbow",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_RAINBOW.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.OFF_WHITE)));
    public static final Block CRYSTAL_BRICK_SLAB_RAINBOW = registerBlock("crystal_brick_slab_rainbow",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.OFF_WHITE)));

    public static final Block CHISELED_CRYSTAL_BLOCK_BLUE = registerBlock("chiseled_crystal_block_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block CHISELED_CRYSTAL_BLOCK_CYAN = registerBlock("chiseled_crystal_block_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block CHISELED_CRYSTAL_BLOCK_GREEN = registerBlock("chiseled_crystal_block_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block CHISELED_CRYSTAL_BLOCK_LIME = registerBlock("chiseled_crystal_block_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIME)));
    public static final Block CHISELED_CRYSTAL_BLOCK_MAGENTA = registerBlock("chiseled_crystal_block_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_PINK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_ORANGE = registerBlock("chiseled_crystal_block_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.ORANGE)));
    public static final Block CHISELED_CRYSTAL_BLOCK_PINK = registerBlock("chiseled_crystal_block_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PINK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_RED = registerBlock("chiseled_crystal_block_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.DULL_RED)));
    public static final Block CHISELED_CRYSTAL_BLOCK_WHITE = registerBlock("chiseled_crystal_block_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.WHITE)));
    public static final Block CHISELED_CRYSTAL_BLOCK_YELLOW = registerBlock("chiseled_crystal_block_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.YELLOW)));
    public static final Block CHISELED_CRYSTAL_BLOCK_AUBURN = registerBlock("chiseled_crystal_block_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block CHISELED_CRYSTAL_BLOCK_CORNFLOWER = registerBlock("chiseled_crystal_block_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.CYAN)));
    public static final Block CHISELED_CRYSTAL_BLOCK_GRAY = registerBlock("chiseled_crystal_block_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block CHISELED_CRYSTAL_BLOCK_INDIGO = registerBlock("chiseled_crystal_block_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.PURPLE)));
    public static final Block CHISELED_CRYSTAL_BLOCK_MAROON = registerBlock("chiseled_crystal_block_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.RED)));
    public static final Block CHISELED_CRYSTAL_BLOCK_MOCHA = registerBlock("chiseled_crystal_block_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.BROWN)));
    public static final Block CHISELED_CRYSTAL_BLOCK_ORCHID = registerBlock("chiseled_crystal_block_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.MAGENTA)));
    public static final Block CHISELED_CRYSTAL_BLOCK_SLATE = registerBlock("chiseled_crystal_block_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GRAY)));
    public static final Block CHISELED_CRYSTAL_BLOCK_RAINBOW = registerBlock("chiseled_crystal_block_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.OFF_WHITE)));


    public static final Block SHRINE_DARKRAI = registerBlock("shrine_darkrai",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.HEAVY_CORE)));

    //Grove Decor
    public static final Block GRAVESTONE = registerBlock("gravestone",
            new GravestoneBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(1.0f).requiresTool().sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block GRAVESTONE_RIP = registerBlock("gravestone_rip",
            new GravestoneBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(1.0f).requiresTool().sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block GRAVESTONE_SKULL = registerBlock("gravestone_skull",
            new GravestoneBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(1.0f).requiresTool().sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block GRAVESTONE_STATEMENT = registerBlock("gravestone_statement",
            new GravestoneBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(1.0f).requiresTool().sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block CRYSTAL_LIGHTS_COOL = registerBlock("crystal_lights_cool",
            new CrystalLightsBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD)));
    public static final Block CRYSTAL_LIGHTS_FLORAL = registerBlock("crystal_lights_floral",
            new CrystalLightsBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD)));
    public static final Block CRYSTAL_LIGHTS_FESTIVE = registerBlock("crystal_lights_festive",
            new CrystalLightsBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD)));
    public static final Block CRYSTAL_LIGHTS_WARM = registerBlock("crystal_lights_warm",
            new CrystalLightsBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD)));

    //X-Mas Plushies
    public static final Block PLUSH_SLEIGH = registerBlock("plush_sleigh",
            new SleighPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_GINGERBREAD_MAN = registerBlock("plush_gingerbread_man",
            new GingerbreadManPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_PRESENT = registerBlock("plush_present",
            new PresentPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SANTA_HAT = registerBlock("plush_santa_hat",
            new SantaHatPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SNOWMAN = registerBlock("plush_snowman",
            new SnowmanPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_XMAS_DRATINI = registerBlock("plush_xmas_dratini",
            new XmasDratiniPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_XMAS_DRATINI = registerBlock("plush_s_xmas_dratini",
            new XmasDratiniPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_XMAS_PARAS = registerBlock("plush_xmas_paras",
            new XmasParasPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_XMAS_PARAS = registerBlock("plush_s_xmas_paras",
            new XmasParasPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_XMAS_ROWLET = registerBlock("plush_xmas_rowlet",
            new XmasRowletPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_XMAS_ROWLET = registerBlock("plush_s_xmas_rowlet",
            new XmasRowletPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));

    //Easter Plushies
    public static final Block PLUSH_BASKET = registerBlock("plush_basket",
            new BasketPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CHICK = registerBlock("plush_chick",
            new ChickPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EGG_EASTER_BLUE = registerBlock("plush_egg_easter_blue",
            new EggPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EGG_EASTER_GREEN = registerBlock("plush_egg_easter_green",
            new EggPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EGG_EASTER_ORANGE = registerBlock("plush_egg_easter_orange",
            new EggPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EASTER_DIGLETT = registerBlock("plush_easter_diglett",
            new EasterDiglettPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_EASTER_DIGLETT = registerBlock("plush_s_easter_diglett",
            new EasterDiglettPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EASTER_SCORBUNNY = registerBlock("plush_easter_scorbunny",
            new EasterScorbunnyPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_EASTER_SCORBUNNY = registerBlock("plush_s_easter_scorbunny",
            new EasterScorbunnyPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EASTER_TOGEPI = registerBlock("plush_easter_togepi",
            new EasterTogepiPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_EASTER_TOGEPI = registerBlock("plush_s_easter_togepi",
            new EasterTogepiPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));

    //Halloween Plushies
    public static final Block PLUSH_PUMPKIN = registerBlock("plush_pumpkin",
            new PumpkinPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_GHOST = registerBlock("plush_ghost",
            new GhostPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_LIL_REAPER = registerBlock("plush_lil_reaper",
            new LilReaperPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CRYSTAL_BALL = registerBlock("plush_crystal_ball",
            new CrystalBallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CANDY_CORN = registerBlock("plush_candy_corn",
            new CandyCornPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CARAMEL_APPLE = registerBlock("plush_caramel_apple",
            new CaramelApplePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_POTIONS = registerBlock("plush_potions",
            new PotionsPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BRAIN_IN_JAR = registerBlock("plush_brain_in_jar",
            new BrainInJarPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_HALLOWEEN_BULBASAUR = registerBlock("plush_halloween_bulbasaur",
            new HalloweenBulbasaurPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_HALLOWEEN_BULBASAUR = registerBlock("plush_s_halloween_bulbasaur",
            new HalloweenBulbasaurPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));

    //Trophies


    //Plushies
    //Balls
    public static final Block PLUSH_BALL_POKE = registerBlock("plush_ball_poke",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_GREAT = registerBlock("plush_ball_great",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_AZURE = registerBlock("plush_ball_azure",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_BEAST = registerBlock("plush_ball_beast",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_CHERISH = registerBlock("plush_ball_cherish",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_CITRINE = registerBlock("plush_ball_citrine",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_DIVE = registerBlock("plush_ball_dive",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_DREAM = registerBlock("plush_ball_dream",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_DUSK = registerBlock("plush_ball_dusk",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_FAST = registerBlock("plush_ball_fast",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_FRIEND = registerBlock("plush_ball_friend",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_HEAL = registerBlock("plush_ball_heal",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_HEAVY = registerBlock("plush_ball_heavy",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_LEVEL = registerBlock("plush_ball_level",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_LOVE = registerBlock("plush_ball_love",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_LURE = registerBlock("plush_ball_lure",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_LUXURY = registerBlock("plush_ball_luxury",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_MASTER = registerBlock("plush_ball_master",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_MOON = registerBlock("plush_ball_moon",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_NEST = registerBlock("plush_ball_nest",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_NET = registerBlock("plush_ball_net",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_PARK = registerBlock("plush_ball_park",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_PREMIER = registerBlock("plush_ball_premier",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_QUICK = registerBlock("plush_ball_quick",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_REPEAT = registerBlock("plush_ball_repeat",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_ROSEATE = registerBlock("plush_ball_roseate",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_SAFARI = registerBlock("plush_ball_safari",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_SLATE = registerBlock("plush_ball_slate",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_SPORT = registerBlock("plush_ball_sport",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_STRANGE = registerBlock("plush_ball_strange",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_TIMER = registerBlock("plush_ball_timer",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_ULTRA = registerBlock("plush_ball_ultra",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BALL_VERDANT = registerBlock("plush_ball_verdant",
            new BallPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));

    //Misc
    public static final Block PLUSH_SNAIL = registerBlock("plush_snail",
            new SnailPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EGG = registerBlock("plush_egg",
            new EggPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_STEVE = registerBlock("plush_steve",
            new StevePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_ALEX = registerBlock("plush_alex",
            new StevePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_GYM_STATUE = registerBlock("plush_gym_statue",
            new GymStatuePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_HP_UP = registerBlock("plush_vitamin_hp_up",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_PP_UP = registerBlock("plush_vitamin_pp_up",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_PP_MAX = registerBlock("plush_vitamin_pp_max",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_IRON = registerBlock("plush_vitamin_iron",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_PROTEIN = registerBlock("plush_vitamin_protein",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_ZINC = registerBlock("plush_vitamin_zinc",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_CARBOS = registerBlock("plush_vitamin_carbos",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_VITAMIN_CALCIUM = registerBlock("plush_vitamin_calcium",
            new VitaminPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_POUCH_METAL_POWDER = registerBlock("plush_pouch_metal_powder",
            new PouchPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_POUCH_QUICK_POWDER = registerBlock("plush_pouch_quick_powder",
            new PouchPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_POUCH_BRIGHT_POWDER = registerBlock("plush_pouch_bright_powder",
            new PouchPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_POUCH_SOFT_SAND = registerBlock("plush_pouch_soft_sand",
            new PouchPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_POUCH_STAR_DUST = registerBlock("plush_pouch_star_dust",
            new PouchPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));

    //Mons
    public static final Block PLUSH_DIGLETT = registerBlock("plush_diglett",
            new DiglettPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_DIGLETT = registerBlock("plush_s_diglett",
            new DiglettPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_DITTO = registerBlock("plush_ditto",
            new DittoPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_DITTO = registerBlock("plush_s_ditto",
            new DittoPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SQUIRTLE = registerBlock("plush_squirtle",
            new SquirtlePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SQUIRTLE = registerBlock("plush_s_squirtle",
            new SquirtlePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CHANSEY = registerBlock("plush_chansey",
            new ChanseyPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_CHANSEY = registerBlock("plush_s_chansey",
            new ChanseyPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_ODDISH = registerBlock("plush_oddish",
            new OddishPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_ODDISH = registerBlock("plush_s_oddish",
            new OddishPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_MANTYKE = registerBlock("plush_mantyke",
            new MantykePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_MANTYKE = registerBlock("plush_s_mantyke",
            new MantykePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_APPLIN = registerBlock("plush_applin",
            new ApplinPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_APPLIN = registerBlock("plush_s_applin",
            new ApplinPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SOLOSIS = registerBlock("plush_solosis",
            new SolosisPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SOLOSIS = registerBlock("plush_s_solosis",
            new SolosisPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_IGGLYBUFF = registerBlock("plush_igglybuff",
            new IgglybuffPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_IGGLYBUFF = registerBlock("plush_s_igglybuff",
            new IgglybuffPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CASTFORM = registerBlock("plush_castform",
            new CastformPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_CASTFORM = registerBlock("plush_s_castform",
            new CastformPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_PSYDUCK = registerBlock("plush_psyduck",
            new PsyduckPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_PSYDUCK = registerBlock("plush_s_psyduck",
            new PsyduckPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_LUVDISC = registerBlock("plush_luvdisc",
            new LuvdiscPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_LUVDISC = registerBlock("plush_s_luvdisc",
            new LuvdiscPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SHROOMISH = registerBlock("plush_shroomish",
            new ShroomishPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SHROOMISH = registerBlock("plush_s_shroomish",
            new ShroomishPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_WOOPER = registerBlock("plush_wooper",
            new WooperPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_WOOPER = registerBlock("plush_s_wooper",
            new WooperPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_TRAPINCH = registerBlock("plush_trapinch",
            new TrapinchPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_TRAPINCH = registerBlock("plush_s_trapinch",
            new TrapinchPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BUDEW = registerBlock("plush_budew",
            new BudewPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_BUDEW = registerBlock("plush_s_budew",
            new BudewPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_DWEBBLE = registerBlock("plush_dwebble",
            new DwebblePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_DWEBBLE = registerBlock("plush_s_dwebble",
            new DwebblePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SHUPPET = registerBlock("plush_shuppet",
            new ShuppetPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SHUPPET = registerBlock("plush_s_shuppet",
            new ShuppetPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_FOONGUS = registerBlock("plush_foongus",
            new FoongusPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_FOONGUS = registerBlock("plush_s_foongus",
            new FoongusPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_ROGGENROLA = registerBlock("plush_roggenrola",
            new RoggenrolaPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_ROGGENROLA = registerBlock("plush_s_roggenrola",
            new RoggenrolaPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_KABUTO = registerBlock("plush_kabuto",
            new KabutoPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_KABUTO = registerBlock("plush_s_kabuto",
            new KabutoPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SUNKERN = registerBlock("plush_sunkern",
            new SunkernPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SUNKERN = registerBlock("plush_s_sunkern",
            new SunkernPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SMOLIV = registerBlock("plush_smoliv",
            new SmolivPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SMOLIV = registerBlock("plush_s_smoliv",
            new SmolivPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_ANORITH = registerBlock("plush_anorith",
            new AnorithPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_ANORITH = registerBlock("plush_s_anorith",
            new AnorithPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CACTOT = registerBlock("plush_cactot",
            new CactotPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_CACTOT = registerBlock("plush_s_cactot",
            new CactotPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CHERUBI = registerBlock("plush_cherubi",
            new CherubiPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_CHERUBI = registerBlock("plush_s_cherubi",
            new CherubiPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_EEVEE = registerBlock("plush_eevee",
            new EeveePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_EEVEE = registerBlock("plush_s_eevee",
            new EeveePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_GRUBBIN = registerBlock("plush_grubbin",
            new GrubbinPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_GRUBBIN = registerBlock("plush_s_grubbin",
            new GrubbinPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_LITTEN = registerBlock("plush_litten",
            new LittenPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_LITTEN = registerBlock("plush_s_litten",
            new LittenPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_PHANTUMP = registerBlock("plush_phantump",
            new PhantumpPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_PHANTUMP = registerBlock("plush_s_phantump",
            new PhantumpPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_PINCURCHIN = registerBlock("plush_pincurchin",
            new PincurchinPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_PINCURCHIN = registerBlock("plush_s_pincurchin",
            new PincurchinPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_BULBASAUR = registerBlock("plush_bulbasaur",
            new BulbasaurPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_BULBASAUR = registerBlock("plush_s_bulbasaur",
            new BulbasaurPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_CHARMANDER = registerBlock("plush_charmander",
            new CharmanderPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_CHARMANDER = registerBlock("plush_s_charmander",
            new CharmanderPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_POPPLIO = registerBlock("plush_popplio",
            new PopplioPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_POPPLIO = registerBlock("plush_s_popplio",
            new PopplioPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_REBBLE = registerBlock("plush_rebble",
            new RebblePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_REBBLE = registerBlock("plush_s_rebble",
            new RebblePlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_ROWLET = registerBlock("plush_rowlet",
            new RowletPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_ROWLET = registerBlock("plush_s_rowlet",
            new RowletPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SEEDOT = registerBlock("plush_seedot",
            new SeedotPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SEEDOT = registerBlock("plush_s_seedot",
            new SeedotPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_SWINUB = registerBlock("plush_swinub",
            new SwinubPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_SWINUB = registerBlock("plush_s_swinub",
            new SwinubPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_PIKACHU = registerBlock("plush_pikachu",
            new PikachuPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PLUSH_S_PIKACHU = registerBlock("plush_s_pikachu",
            new PikachuPlushBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOL)));

    //Trophies
    public static final Block LEAGUE_TROPHY = registerBlock("league_trophy",
            new LeagueTrophyBlock(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.5f).sounds(BlockSoundGroup.WOOD)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GroveExtras.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GroveExtras.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GroveExtras.LOGGER.info("Registering Mod Blocks for " + GroveExtras.MOD_ID);
    }
}
