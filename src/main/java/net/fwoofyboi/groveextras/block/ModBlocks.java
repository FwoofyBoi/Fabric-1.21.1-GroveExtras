package net.fwoofyboi.groveextras.block;

import net.fwoofyboi.groveextras.GroveExtras;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_POLISHED = registerBlock("calcite_polished",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));




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
