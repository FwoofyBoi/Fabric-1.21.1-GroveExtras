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
