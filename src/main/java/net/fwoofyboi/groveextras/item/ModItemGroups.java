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
                    }).build());

    public static final ItemGroup DEV_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "dev_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DEV_A0_SURFACE))
                    .displayName(Text.translatable("itemgroup.groveextras.dev_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DEV_A0_SURFACE);
                    }).build());

    public static void registerItemGroups() {
        GroveExtras.LOGGER.info("Registering Item Groups for " + GroveExtras.MOD_ID);
    }
}
