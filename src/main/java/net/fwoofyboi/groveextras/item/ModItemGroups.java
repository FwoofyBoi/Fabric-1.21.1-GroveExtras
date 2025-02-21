package net.fwoofyboi.groveextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fwoofyboi.groveextras.GroveExtras;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CRATE_KEYS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "crate_keys"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KEY_COSMETIC))
                    .displayName(Text.translatable("itemgroup.groveextras.crate_keys"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.KEY_VOTE);
                        entries.add(ModItems.KEY_ELITE);
                        entries.add(ModItems.KEY_MASTER);
                        entries.add(ModItems.KEY_COSMETIC);
                    }).build());

    public static final ItemGroup TREASURE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "treasure_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.groveextras.treasure_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.CUT_DIAMOND);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.PEARL);
                        entries.add(ModItems.CRYSTALLIZED_AMBER);
                        entries.add(ModItems.CUT_AMETHYST);
                        entries.add(ModItems.NUGGET);
                        entries.add(ModItems.BIG_PEARL);
                        entries.add(ModItems.BIG_NUGGET);
                        entries.add(ModItems.COMET_SHARD);
                        entries.add(ModItems.STAR_PIECE);
                        entries.add(ModItems.STAR_DUST);
                        entries.add(ModItems.WITHER_SKULL_FRAGMENT);
                        entries.add(ModItems.RED_SHARD);
                        entries.add(ModItems.BLUE_SHARD);
                        entries.add(ModItems.GREEN_SHARD);
                        entries.add(ModItems.YELLOW_SHARD);
                        entries.add(ModItems.PRETTY_FEATHER);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.CRYSTALLIZED_AMBER_BLOCK);
                        entries.add(ModBlocks.CUT_DIAMOND_BLOCK);
                        entries.add(ModBlocks.CUT_AMETHYST_BLOCK);
                        entries.add(ModBlocks.STAR_PIECE_BLOCK);
                        entries.add(ModBlocks.COMET_SHARD_BLOCK);
                        entries.add(ModItems.CRYSTAL_SHARD_BLUE);
                        entries.add(ModItems.CRYSTAL_SHARD_CYAN);
                        entries.add(ModItems.CRYSTAL_SHARD_GREEN);
                        entries.add(ModItems.CRYSTAL_SHARD_LIME);
                        entries.add(ModItems.CRYSTAL_SHARD_MAGENTA);
                        entries.add(ModItems.CRYSTAL_SHARD_ORANGE);
                        entries.add(ModItems.CRYSTAL_SHARD_PINK);
                        entries.add(ModItems.CRYSTAL_SHARD_RED);
                        entries.add(ModItems.CRYSTAL_SHARD_WHITE);
                        entries.add(ModItems.CRYSTAL_SHARD_YELLOW);
                        entries.add(ModItems.CRYSTAL_SHARD_AUBURN);
                        entries.add(ModItems.CRYSTAL_SHARD_CORNFLOWER);
                        entries.add(ModItems.CRYSTAL_SHARD_GRAY);
                        entries.add(ModItems.CRYSTAL_SHARD_INDIGO);
                        entries.add(ModItems.CRYSTAL_SHARD_MAROON);
                        entries.add(ModItems.CRYSTAL_SHARD_MOCHA);
                        entries.add(ModItems.CRYSTAL_SHARD_ORCHID);
                        entries.add(ModItems.CRYSTAL_SHARD_SLATE);
                        entries.add(ModItems.CRYSTAL_SHARD_RAINBOW);
                    }).build());

    public static final ItemGroup DEV_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "dev_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DEV_A0_SURFACE))
                    .displayName(Text.translatable("itemgroup.groveextras.dev_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DEV_A0_SURFACE);
                        entries.add(ModBlocks.DEV_A0_RUINS);
                        entries.add(ModBlocks.DEV_A0_LUSH);
                        entries.add(ModBlocks.DEV_A0_VOLCANIC);
                        entries.add(ModBlocks.DEV_A0_DRIPSTONE);
                        entries.add(ModBlocks.DEV_A0_CRYSTAL);
                        entries.add(ModBlocks.DEV_A0_DARK);
                        entries.add(ModBlocks.DEV_ULTRA_SPACE);
                    }).build());

    public static void registerItemGroups() {
        GroveExtras.LOGGER.info("Registering Item Groups for " + GroveExtras.MOD_ID);
    }
}
