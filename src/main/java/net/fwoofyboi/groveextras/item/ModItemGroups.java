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

    public static final ItemGroup MINES_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "mines_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.MINES_FOSSILISED_SAND))
                    .displayName(Text.translatable("itemgroup.groveextras.mines_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MINES_FOSSILISED_SAND);
                        entries.add(ModBlocks.MINES_FOSSILISED_STONE);
                        entries.add(ModBlocks.MINES_FOSSILISED_DEEPSLATE);

                        entries.add(ModBlocks.BUDDING_CRYSTAL_BLUE);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_CYAN);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_GREEN);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_LIME);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_MAGENTA);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_ORANGE);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_PINK);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_RED);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_WHITE);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_YELLOW);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_AUBURN);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_CORNFLOWER);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_GRAY);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_INDIGO);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_MAROON);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_MOCHA);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_ORCHID);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_SLATE);
                        entries.add(ModBlocks.BUDDING_CRYSTAL_RAINBOW);

                        entries.add(ModBlocks.CRYSTAL_BLOCK_BLUE);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_CYAN);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_GREEN);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_LIME);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_MAGENTA);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_ORANGE);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_PINK);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_RED);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_WHITE);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_YELLOW);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_AUBURN);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_CORNFLOWER);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_GRAY);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_INDIGO);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_MAROON);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_MOCHA);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_ORCHID);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_SLATE);
                        entries.add(ModBlocks.CRYSTAL_BLOCK_RAINBOW);
                    }).build());

    public static final ItemGroup GROVE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "grove_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.GRAVEL_AQUARIUM))
                    .displayName(Text.translatable("itemgroup.groveextras.grove_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GRAVEL_AQUARIUM);

                        entries.add(ModBlocks.GRANITE_BRICKS);
                        entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
                        entries.add(ModBlocks.GRANITE_BRICK_SLAB);
                        entries.add(ModBlocks.GRANITE_BRICK_WALL);

                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.ANDESITE_BRICK_WALL);

                        entries.add(ModBlocks.DIORITE_BRICKS);
                        entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
                        entries.add(ModBlocks.DIORITE_BRICK_SLAB);
                        entries.add(ModBlocks.DIORITE_BRICK_WALL);

                        entries.add(ModBlocks.CALCITE_BRICKS);
                        entries.add(ModBlocks.CALCITE_BRICK_STAIRS);
                        entries.add(ModBlocks.CALCITE_BRICK_SLAB);
                        entries.add(ModBlocks.CALCITE_BRICK_WALL);

                        entries.add(ModBlocks.CALCITE_POLISHED);
                        entries.add(ModBlocks.CALCITE_POLISHED_STAIRS);
                        entries.add(ModBlocks.CALCITE_POLISHED_SLAB);
                        entries.add(ModBlocks.CALCITE_POLISHED_WALL);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_BLUE);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_BLUE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_BLUE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_BLUE);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_CYAN);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_CYAN);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_CYAN);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_CYAN);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_GREEN);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_GREEN);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_GREEN);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_GREEN);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_LIME);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_LIME);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_LIME);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_LIME);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_MAGENTA);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_MAGENTA);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_MAGENTA);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_MAGENTA);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_ORANGE);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_ORANGE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_ORANGE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_ORANGE);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_PINK);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_PINK);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_PINK);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_PINK);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_RED);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_RED);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_RED);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_RED);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_WHITE);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_WHITE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_WHITE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_WHITE);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_YELLOW);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_YELLOW);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_YELLOW);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_YELLOW);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_AUBURN);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_AUBURN);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_AUBURN);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_AUBURN);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_CORNFLOWER);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_CORNFLOWER);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_CORNFLOWER);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_CORNFLOWER);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_GRAY);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_GRAY);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_GRAY);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_GRAY);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_INDIGO);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_INDIGO);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_INDIGO);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_INDIGO);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_MAROON);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_MAROON);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_MAROON);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_MAROON);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_MOCHA);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_MOCHA);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_MOCHA);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_MOCHA);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_ORCHID);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_ORCHID);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_ORCHID);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_ORCHID);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_SLATE);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_SLATE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_SLATE);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_SLATE);

                        entries.add(ModBlocks.CHISELED_CRYSTAL_BLOCK_RAINBOW);
                        entries.add(ModBlocks.CRYSTAL_BRICKS_RAINBOW);
                        entries.add(ModBlocks.CRYSTAL_BRICK_STAIRS_RAINBOW);
                        entries.add(ModBlocks.CRYSTAL_BRICK_SLAB_RAINBOW);

                    }).build());

    public static final ItemGroup SHRINES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "shrines"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SHRINE_DARKRAI))
                    .displayName(Text.translatable("itemgroup.groveextras.shrines"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SHRINE_DARKRAI);
                    }).build());


    public static final ItemGroup DEV_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "dev_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DEV_BRUSH_BAWNGWAWTER))
                    .displayName(Text.translatable("itemgroup.groveextras.dev_tools"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DEV_BRUSH_BAWNGWAWTER);
                        entries.add(ModItems.DEV_SHEARS_BAWNGWAWTER);
                        entries.add(ModItems.DEV_SWORD_BAWNGWAWTER);
                        entries.add(ModItems.DEV_PICKAXE_BAWNGWAWTER);
                        entries.add(ModItems.DEV_SHOVEL_BAWNGWAWTER);
                        entries.add(ModItems.DEV_AXE_BAWNGWAWTER);
                        entries.add(ModItems.DEV_HOE_BAWNGWAWTER);

                        entries.add(ModItems.DEV_BRUSH_SHADESOFCEDAR);
                        entries.add(ModItems.DEV_SWORD_SHADESOFCEDAR);
                        entries.add(ModItems.DEV_PICKAXE_SHADESOFCEDAR);
                        entries.add(ModItems.DEV_SHOVEL_SHADESOFCEDAR);
                        entries.add(ModItems.DEV_AXE_SHADESOFCEDAR);
                        entries.add(ModItems.DEV_HOE_SHADESOFCEDAR);
                    }).build());

    public static final ItemGroup MEGA_STONES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "mega_stones"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_DIANCITE))
                    .displayName(Text.translatable("itemgroup.groveextras.mega_stones"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_DIANCITE);
                        entries.add(ModItems.CUT_DIANCITE);

                    }).build());

    public static final ItemGroup EVOLUTION_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "evolution_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SCROLL_OF_DARKNESS))
                    .displayName(Text.translatable("itemgroup.groveextras.evolution_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SCROLL_OF_DARKNESS);
                        entries.add(ModItems.SCROLL_OF_WATERS);
                        entries.add(ModItems.SYRUPY_APPLE);
                        entries.add(ModItems.METAL_ALLOY);
                        entries.add(ModItems.LEADERS_CREST);

                    }).build());

    public static final ItemGroup KEY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "key_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ICON_KEY_ITEMS))
                    .displayName(Text.translatable("itemgroup.groveextras.key_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ANCIENT_DRIVE);
                        entries.add(ModItems.AZURE_FLUTE);
                        entries.add(ModItems.DIAMOND_TIARA);
                        entries.add(ModItems.GRACIDEA_SEED);
                        entries.add(ModItems.GS_BALL);
                        entries.add(ModItems.HELIX_ORB);
                        entries.add(ModItems.HYPERSPACE_RING);
                        entries.add(ModItems.JUNGLE_ROOT);
                        entries.add(ModItems.MUSIC_BOX);
                        entries.add(ModItems.MYSTERY_BOX);
                        entries.add(ModItems.MYTHICAL_PECHA_BERRY);
                        entries.add(ModItems.NIGHTMARE_SHROUD);
                        entries.add(ModItems.ORIGIN_SASH);
                        entries.add(ModItems.SEA_CROWN);
                        entries.add(ModItems.SOUL_HEART);
                        entries.add(ModItems.VICTORY_MEDAL);
                        entries.add(ModItems.VOLCANIC_DOLL);
                        entries.add(ModItems.WISHING_TAG);

                        entries.add(ModItems.DNA_STRAND);
                        entries.add(ModItems.ULTRA_BEAST_TOKEN);

                        entries.add(ModItems.ADAMANT_ORB);
                        entries.add(ModItems.BEADS_OF_RUIN);
                        entries.add(ModItems.BLACK_PRISM);
                        entries.add(ModItems.BLACK_STONE);
                        entries.add(ModItems.BLUE_SOUL_DEW);
                        entries.add(ModItems.BULU_BELL);
                        entries.add(ModItems.CLONED_SASH);
                        entries.add(ModItems.COMBAT_FEATHER);
                        entries.add(ModItems.DEATH_WING);
                        entries.add(ModItems.DRAGON_STATUE);
                        entries.add(ModItems.ECLIPSE_FLUTE);
                        entries.add(ModItems.ELECTRIC_STATUE);
                        entries.add(ModItems.FINI_FIN);
                        entries.add(ModItems.FIRE_FANG);
                        entries.add(ModItems.FIRE_FEATHER);
                        entries.add(ModItems.FUJINS_LAMP);
                        entries.add(ModItems.GOLD_STATUE);
                        entries.add(ModItems.GRAY_STONE);
                        entries.add(ModItems.GRISEOUS_ORB);
                        entries.add(ModItems.HEAVY_CONTROL_MASK);
                        entries.add(ModItems.ICE_FANG);
                        entries.add(ModItems.ICE_FEATHER);
                        entries.add(ModItems.ICE_STATUE);
                        entries.add(ModItems.ICEROOT_CARROT);
                        entries.add(ModItems.INARIS_LAMP);
                        entries.add(ModItems.JADE_ORB);
                        entries.add(ModItems.KOKO_FEATHER);
                        entries.add(ModItems.LAKE_SPIRIT_AMULET);
                        entries.add(ModItems.LELE_ANTENNAE);
                        entries.add(ModItems.LIFE_ANTLER);
                        entries.add(ModItems.LUNAR_WING);
                        entries.add(ModItems.LUSTROUS_ORB);
                        entries.add(ModItems.MAGMA_STONE);
                        entries.add(ModItems.MASK_OF_BEAUTY);
                        entries.add(ModItems.MASK_OF_CLEVERNESS);
                        entries.add(ModItems.MASK_OF_STRENGTH);
                        entries.add(ModItems.ORDERS_CREST);
                        entries.add(ModItems.PSYCHIC_FEATHER);
                        entries.add(ModItems.RADIANT_PETAL);
                        entries.add(ModItems.RAGE_FEATHER);
                        entries.add(ModItems.RAIJINS_LAMP);
                        entries.add(ModItems.RAINBOW_WING);
                        entries.add(ModItems.RED_SOUL_DEW);
                        entries.add(ModItems.ROCK_STATUE);
                        entries.add(ModItems.RUBY_ORB);
                        entries.add(ModItems.SAPPHIRE_ORB);
                        entries.add(ModItems.SCARLET_BOOK);
                        entries.add(ModItems.SHADEROOT_CARROT);
                        entries.add(ModItems.SILVER_WING);
                        entries.add(ModItems.STEEL_STATUE);
                        entries.add(ModItems.STELLAR_CRYSTAL);
                        entries.add(ModItems.TABLET_OF_RUIN);
                        entries.add(ModItems.THUNDER_FANG);
                        entries.add(ModItems.THUNDER_FEATHER);
                        entries.add(ModItems.UGAJINS_LAMP);
                        entries.add(ModItems.VESSEL_OF_RUIN);
                        entries.add(ModItems.VIOLET_BOOK);
                        entries.add(ModItems.WHITE_BELT);
                        entries.add(ModItems.WHITE_STONE);
                        entries.add(ModItems.WISHING_STAR);

                    }).build());

    public static final ItemGroup FORM_SWAP_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "form_swap_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ICON_FORM_SWAP))
                    .displayName(Text.translatable("itemgroup.groveextras.form_swap_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GRACIDEA_FLOWER);
                        entries.add(ModItems.PLATE_MEADOW);
                        entries.add(ModItems.PLATE_INSECT);
                        entries.add(ModItems.PLATE_ZAP);
                        entries.add(ModItems.PLATE_STONE);
                        entries.add(ModItems.PLATE_EARTH);
                        entries.add(ModItems.PLATE_DRACO);
                        entries.add(ModItems.PLATE_FIST);
                        entries.add(ModItems.PLATE_PIXIE);
                        entries.add(ModItems.PLATE_MIND);
                        entries.add(ModItems.PLATE_TOXIC);
                        entries.add(ModItems.PLATE_SPOOKY);
                        entries.add(ModItems.PLATE_DREAD);
                        entries.add(ModItems.PLATE_ICICLE);
                        entries.add(ModItems.PLATE_SKY);
                        entries.add(ModItems.PLATE_SPLASH);
                        entries.add(ModItems.PLATE_IRON);
                        entries.add(ModItems.PLATE_FLAME);
                        entries.add(ModItems.MASK_TEAL);
                        entries.add(ModItems.MASK_CORNERSTONE);
                        entries.add(ModItems.MASK_WELLSPRING);
                        entries.add(ModItems.MASK_HEARTHFLAME);
                        entries.add(ModItems.VILE_VIAL);
                        entries.add(ModItems.DNA_SPLICER);
                        entries.add(ModItems.PECULIAR_OVEN);
                        entries.add(ModItems.PECULIAR_FAN);
                        entries.add(ModItems.PECULIAR_WASHING_MACHINE);
                        entries.add(ModItems.PECULIAR_LAWN_MOWER);
                        entries.add(ModItems.PECULIAR_FRIDGE);
                        entries.add(ModItems.METEORITE_SHARP);
                        entries.add(ModItems.METEORITE_HARD);
                        entries.add(ModItems.METEORITE_SMOOTH);
                        entries.add(ModItems.REVEAL_GLASS);
                        entries.add(ModItems.ICY_REINS_OF_UNITY);
                        entries.add(ModItems.SHADOW_REINS_OF_UNITY);
                        entries.add(ModItems.DRIVE_BURN);
                        entries.add(ModItems.DRIVE_SHOCK);
                        entries.add(ModItems.DRIVE_CHILL);
                        entries.add(ModItems.DRIVE_DOUSE);
                        entries.add(ModItems.RED_ORB);
                        entries.add(ModItems.BLUE_ORB);
                        entries.add(ModItems.ADAMANT_CRYSTAL);
                        entries.add(ModItems.GRISEOUS_CORE);
                        entries.add(ModItems.LUSTROUS_GLOBE);
                        entries.add(ModItems.N_SOLARIZER);
                        entries.add(ModItems.N_LUNARIZER);
                        entries.add(ModItems.ULTRANECROZIUM_Z);
                        entries.add(ModItems.PRISON_BOTTLE);

                    }).build());



    public static void registerItemGroups() {
        GroveExtras.LOGGER.info("Registering Item Groups for " + GroveExtras.MOD_ID);
    }
}
