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
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.SAND)));
    public static final Block MINES_FOSSILISED_STONE = registerBlock("mines_fossilised_stone",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block MINES_FOSSILISED_DEEPSLATE = registerBlock("mines_fossilised_deepslate",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block BUDDING_CRYSTAL_BLUE = registerBlock("budding_crystal_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_CYAN = registerBlock("budding_crystal_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_GREEN = registerBlock("budding_crystal_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_LIME = registerBlock("budding_crystal_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_MAGENTA = registerBlock("budding_crystal_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_ORANGE = registerBlock("budding_crystal_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_PINK = registerBlock("budding_crystal_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_RED = registerBlock("budding_crystal_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_WHITE = registerBlock("budding_crystal_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_YELLOW = registerBlock("budding_crystal_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_AUBURN = registerBlock("budding_crystal_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_CORNFLOWER = registerBlock("budding_crystal_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_GRAY = registerBlock("budding_crystal_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_INDIGO = registerBlock("budding_crystal_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_MAROON = registerBlock("budding_crystal_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_MOCHA = registerBlock("budding_crystal_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_ORCHID = registerBlock("budding_crystal_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_SLATE = registerBlock("budding_crystal_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BUDDING_CRYSTAL_RAINBOW = registerBlock("budding_crystal_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BLOCK_BLUE = registerBlock("crystal_block_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_CYAN = registerBlock("crystal_block_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_GREEN = registerBlock("crystal_block_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_LIME = registerBlock("crystal_block_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_MAGENTA = registerBlock("crystal_block_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_ORANGE = registerBlock("crystal_block_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_PINK = registerBlock("crystal_block_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_RED = registerBlock("crystal_block_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_WHITE = registerBlock("crystal_block_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_YELLOW = registerBlock("crystal_block_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_AUBURN = registerBlock("crystal_block_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_CORNFLOWER = registerBlock("crystal_block_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_GRAY = registerBlock("crystal_block_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_INDIGO = registerBlock("crystal_block_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_MAROON = registerBlock("crystal_block_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_MOCHA = registerBlock("crystal_block_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_ORCHID = registerBlock("crystal_block_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_SLATE = registerBlock("crystal_block_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BLOCK_RAINBOW = registerBlock("crystal_block_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block GRAVEL_AQUARIUM = registerBlock("gravel_aquarium",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.GRAVEL)));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_POLISHED = registerBlock("calcite_polished",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_POLISHED_STAIRS = registerBlock("calcite_polished_stairs",
            new StairsBlock(ModBlocks.CALCITE_POLISHED.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_POLISHED_SLAB = registerBlock("calcite_polished_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_POLISHED_WALL = registerBlock("calcite_polished_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CRYSTAL_BRICKS_BLUE = registerBlock("crystal_bricks_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_BLUE = registerBlock("crystal_brick_stairs_blue",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_BLUE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_BLUE = registerBlock("crystal_brick_slab_blue",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_CYAN = registerBlock("crystal_bricks_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_CYAN = registerBlock("crystal_brick_stairs_cyan",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_CYAN.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_CYAN = registerBlock("crystal_brick_slab_cyan",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_GREEN = registerBlock("crystal_bricks_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_GREEN = registerBlock("crystal_brick_stairs_green",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_GREEN.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_GREEN = registerBlock("crystal_brick_slab_green",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_LIME = registerBlock("crystal_bricks_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_LIME = registerBlock("crystal_brick_stairs_lime",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_LIME.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_LIME = registerBlock("crystal_brick_slab_lime",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_MAGENTA = registerBlock("crystal_bricks_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_MAGENTA = registerBlock("crystal_brick_stairs_magenta",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_MAGENTA.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_MAGENTA = registerBlock("crystal_brick_slab_magenta",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_ORANGE = registerBlock("crystal_bricks_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_ORANGE = registerBlock("crystal_brick_stairs_orange",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_ORANGE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_ORANGE = registerBlock("crystal_brick_slab_orange",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_PINK = registerBlock("crystal_bricks_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_PINK = registerBlock("crystal_brick_stairs_pink",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_PINK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_PINK = registerBlock("crystal_brick_slab_pink",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_RED = registerBlock("crystal_bricks_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_RED = registerBlock("crystal_brick_stairs_red",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_RED.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_RED = registerBlock("crystal_brick_slab_red",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_WHITE = registerBlock("crystal_bricks_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_WHITE = registerBlock("crystal_brick_stairs_white",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_WHITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_WHITE = registerBlock("crystal_brick_slab_white",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_YELLOW = registerBlock("crystal_bricks_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_YELLOW = registerBlock("crystal_brick_stairs_yellow",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_YELLOW.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_YELLOW = registerBlock("crystal_brick_slab_yellow",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_AUBURN = registerBlock("crystal_bricks_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_AUBURN = registerBlock("crystal_brick_stairs_auburn",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_AUBURN.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_AUBURN = registerBlock("crystal_brick_slab_auburn",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_CORNFLOWER = registerBlock("crystal_bricks_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_CORNFLOWER = registerBlock("crystal_brick_stairs_cornflower",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_CORNFLOWER.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_CORNFLOWER = registerBlock("crystal_brick_slab_cornflower",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_GRAY = registerBlock("crystal_bricks_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_GRAY = registerBlock("crystal_brick_stairs_gray",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_GRAY.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_GRAY = registerBlock("crystal_brick_slab_gray",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_INDIGO = registerBlock("crystal_bricks_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_INDIGO = registerBlock("crystal_brick_stairs_indigo",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_INDIGO.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_INDIGO = registerBlock("crystal_brick_slab_indigo",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_MAROON = registerBlock("crystal_bricks_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_MAROON = registerBlock("crystal_brick_stairs_maroon",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_MAROON.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_MAROON = registerBlock("crystal_brick_slab_maroon",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_MOCHA = registerBlock("crystal_bricks_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_MOCHA = registerBlock("crystal_brick_stairs_mocha",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_MOCHA.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_MOCHA = registerBlock("crystal_brick_slab_mocha",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_ORCHID = registerBlock("crystal_bricks_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_ORCHID = registerBlock("crystal_brick_stairs_orchid",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_ORCHID.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_ORCHID = registerBlock("crystal_brick_slab_orchid",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_SLATE = registerBlock("crystal_bricks_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_SLATE = registerBlock("crystal_brick_stairs_slate",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_SLATE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_SLATE = registerBlock("crystal_brick_slab_slate",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CRYSTAL_BRICKS_RAINBOW = registerBlock("crystal_bricks_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_STAIRS_RAINBOW = registerBlock("crystal_brick_stairs_rainbow",
            new StairsBlock(ModBlocks.CRYSTAL_BRICKS_RAINBOW.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CRYSTAL_BRICK_SLAB_RAINBOW = registerBlock("crystal_brick_slab_rainbow",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CHISELED_CRYSTAL_BLOCK_BLUE = registerBlock("chiseled_crystal_block_blue",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_CYAN = registerBlock("chiseled_crystal_block_cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_GREEN = registerBlock("chiseled_crystal_block_green",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_LIME = registerBlock("chiseled_crystal_block_lime",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_MAGENTA = registerBlock("chiseled_crystal_block_magenta",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_ORANGE = registerBlock("chiseled_crystal_block_orange",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_PINK = registerBlock("chiseled_crystal_block_pink",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_RED = registerBlock("chiseled_crystal_block_red",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_WHITE = registerBlock("chiseled_crystal_block_white",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_YELLOW = registerBlock("chiseled_crystal_block_yellow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_AUBURN = registerBlock("chiseled_crystal_block_auburn",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_CORNFLOWER = registerBlock("chiseled_crystal_block_cornflower",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_GRAY = registerBlock("chiseled_crystal_block_gray",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_INDIGO = registerBlock("chiseled_crystal_block_indigo",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_MAROON = registerBlock("chiseled_crystal_block_maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_MOCHA = registerBlock("chiseled_crystal_block_mocha",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_ORCHID = registerBlock("chiseled_crystal_block_orchid",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_SLATE = registerBlock("chiseled_crystal_block_slate",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHISELED_CRYSTAL_BLOCK_RAINBOW = registerBlock("chiseled_crystal_block_rainbow",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

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


    //Halloween Plushies


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
