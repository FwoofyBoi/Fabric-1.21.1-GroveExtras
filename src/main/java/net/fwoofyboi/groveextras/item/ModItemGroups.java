package net.fwoofyboi.groveextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fwoofyboi.groveextras.GroveExtras;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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

                        entries.add(ModItems.DEV_SWORD_MARISNOW);
                        entries.add(ModItems.DEV_PICKAXE_MARISNOW);
                        entries.add(ModItems.DEV_SHOVEL_MARISNOW);
                        entries.add(ModItems.DEV_AXE_MARISNOW);
                        entries.add(ModItems.DEV_HOE_MARISNOW);

                        entries.add(ModItems.DEV_SWORD_KINGSTEGO);
                        entries.add(ModItems.DEV_PICKAXE_KINGSTEGO);
                        entries.add(ModItems.DEV_SHOVEL_KINGSTEGO);
                        entries.add(ModItems.DEV_AXE_KINGSTEGO);
                        entries.add(ModItems.DEV_HOE_KINGSTEGO);

                        entries.add(ModItems.DEV_SWORD_DOTODY);
                        entries.add(ModItems.DEV_PICKAXE_DOTODY);
                        entries.add(ModItems.DEV_SHOVEL_DOTODY);
                        entries.add(ModItems.DEV_AXE_DOTODY);
                        entries.add(ModItems.DEV_HOE_DOTODY);

                        entries.add(ModItems.DEV_SWORD_GIRAFFE);
                        entries.add(ModItems.DEV_PICKAXE_GIRAFFE);
                        entries.add(ModItems.DEV_SHOVEL_GIRAFFE);
                        entries.add(ModItems.DEV_AXE_GIRAFFE);
                        entries.add(ModItems.DEV_HOE_GIRAFFE);

                        entries.add(ModItems.DEV_SWORD_CRAYOLA);
                        entries.add(ModItems.DEV_PICKAXE_CRAYOLA);
                        entries.add(ModItems.DEV_SHOVEL_CRAYOLA);
                        entries.add(ModItems.DEV_AXE_CRAYOLA);
                        entries.add(ModItems.DEV_HOE_CRAYOLA);

                    }).build());

    public static final ItemGroup MEGA_STONES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "mega_stones"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_DIANCITE))
                    .displayName(Text.translatable("itemgroup.groveextras.mega_stones"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_DIANCITE);
                        entries.add(ModItems.CUT_DIANCITE);

                    }).build());

    public static final ItemGroup PLUSH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "plush"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLUSH_VOUCHER))
                    .displayName(Text.translatable("itemgroup.groveextras.plush"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PLUSH_VOUCHER);
                        entries.add(ModBlocks.PLUSH_BALL_POKE);
                        entries.add(ModBlocks.PLUSH_SNAIL);
                        entries.add(ModBlocks.PLUSH_EGG);
                        entries.add(ModBlocks.PLUSH_STEVE);
                        entries.add(ModBlocks.PLUSH_ALEX);
                        entries.add(ModBlocks.PLUSH_GYM_STATUE);
                        entries.add(ModBlocks.PLUSH_VITAMIN_HP_UP);
                        entries.add(ModBlocks.PLUSH_VITAMIN_PP_UP);
                        entries.add(ModBlocks.PLUSH_VITAMIN_PP_MAX);
                        entries.add(ModBlocks.PLUSH_VITAMIN_IRON);
                        entries.add(ModBlocks.PLUSH_VITAMIN_PROTEIN);
                        entries.add(ModBlocks.PLUSH_VITAMIN_ZINC);
                        entries.add(ModBlocks.PLUSH_VITAMIN_CARBOS);
                        entries.add(ModBlocks.PLUSH_VITAMIN_CALCIUM);
                        entries.add(ModBlocks.PLUSH_POUCH_METAL_POWDER);
                        entries.add(ModBlocks.PLUSH_POUCH_QUICK_POWDER);
                        entries.add(ModBlocks.PLUSH_POUCH_BRIGHT_POWDER);
                        entries.add(ModBlocks.PLUSH_POUCH_SOFT_SAND);
                        entries.add(ModBlocks.PLUSH_POUCH_STAR_DUST);

                        entries.add(ModBlocks.PLUSH_DIGLETT);
                        entries.add(ModBlocks.PLUSH_S_DIGLETT);
                        entries.add(ModBlocks.PLUSH_DITTO);
                        entries.add(ModBlocks.PLUSH_S_DITTO);
                        entries.add(ModBlocks.PLUSH_SQUIRTLE);
                        entries.add(ModBlocks.PLUSH_S_SQUIRTLE);
                        entries.add(ModBlocks.PLUSH_CHANSEY);
                        entries.add(ModBlocks.PLUSH_S_CHANSEY);
                        entries.add(ModBlocks.PLUSH_ODDISH);
                        entries.add(ModBlocks.PLUSH_S_ODDISH);
                        entries.add(ModBlocks.PLUSH_MANTYKE);
                        entries.add(ModBlocks.PLUSH_S_MANTYKE);
                        entries.add(ModBlocks.PLUSH_APPLIN);
                        entries.add(ModBlocks.PLUSH_S_APPLIN);
                        entries.add(ModBlocks.PLUSH_SOLOSIS);
                        entries.add(ModBlocks.PLUSH_S_SOLOSIS);
                        entries.add(ModBlocks.PLUSH_IGGLYBUFF);
                        entries.add(ModBlocks.PLUSH_S_IGGLYBUFF);
                        entries.add(ModBlocks.PLUSH_CASTFORM);
                        entries.add(ModBlocks.PLUSH_S_CASTFORM);
                        entries.add(ModBlocks.PLUSH_PSYDUCK);
                        entries.add(ModBlocks.PLUSH_S_PSYDUCK);
                        entries.add(ModBlocks.PLUSH_LUVDISC);
                        entries.add(ModBlocks.PLUSH_S_LUVDISC);
                        entries.add(ModBlocks.PLUSH_SHROOMISH);
                        entries.add(ModBlocks.PLUSH_S_SHROOMISH);
                        entries.add(ModBlocks.PLUSH_WOOPER);
                        entries.add(ModBlocks.PLUSH_S_WOOPER);
                        entries.add(ModBlocks.PLUSH_TRAPINCH);
                        entries.add(ModBlocks.PLUSH_S_TRAPINCH);
                        entries.add(ModBlocks.PLUSH_BUDEW);
                        entries.add(ModBlocks.PLUSH_S_BUDEW);
                        entries.add(ModBlocks.PLUSH_DWEBBLE);
                        entries.add(ModBlocks.PLUSH_S_DWEBBLE);
                        entries.add(ModBlocks.PLUSH_SHUPPET);
                        entries.add(ModBlocks.PLUSH_S_SHUPPET);
                        entries.add(ModBlocks.PLUSH_FOONGUS);
                        entries.add(ModBlocks.PLUSH_S_FOONGUS);
                        entries.add(ModBlocks.PLUSH_ROGGENROLA);
                        entries.add(ModBlocks.PLUSH_S_ROGGENROLA);
                        entries.add(ModBlocks.PLUSH_KABUTO);
                        entries.add(ModBlocks.PLUSH_S_KABUTO);
                        entries.add(ModBlocks.PLUSH_SUNKERN);
                        entries.add(ModBlocks.PLUSH_S_SUNKERN);
                        entries.add(ModBlocks.PLUSH_SMOLIV);
                        entries.add(ModBlocks.PLUSH_S_SMOLIV);

                    }).build());

    public static final ItemGroup GROVE_DECOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "grove_decor"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.FLOWER_POT))
                    .displayName(Text.translatable("itemgroup.groveextras.grove_decor"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GRAVESTONE);
                        entries.add(ModBlocks.GRAVESTONE_RIP);
                        entries.add(ModBlocks.GRAVESTONE_SKULL);
                        entries.add(ModBlocks.GRAVESTONE_STATEMENT);

                        entries.add(ModBlocks.CRYSTAL_LIGHTS_COOL);
                        entries.add(ModBlocks.CRYSTAL_LIGHTS_FLORAL);
                        entries.add(ModBlocks.CRYSTAL_LIGHTS_FESTIVE);
                        entries.add(ModBlocks.CRYSTAL_LIGHTS_WARM);

                    }).build());

    public static final ItemGroup XMAS_PLUSH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "xmas_plush"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ICON_XMAS))
                    .displayName(Text.translatable("itemgroup.groveextras.xmas_plush"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PLUSH_SLEIGH);
                        entries.add(ModBlocks.PLUSH_GINGERBREAD_MAN);
                        entries.add(ModBlocks.PLUSH_PRESENT);
                        entries.add(ModBlocks.PLUSH_SANTA_HAT);
                        entries.add(ModBlocks.PLUSH_SNOWMAN);
                        entries.add(ModBlocks.PLUSH_XMAS_DRATINI);
                        entries.add(ModBlocks.PLUSH_S_XMAS_DRATINI);
                        entries.add(ModBlocks.PLUSH_XMAS_PARAS);
                        entries.add(ModBlocks.PLUSH_S_XMAS_PARAS);
                        entries.add(ModBlocks.PLUSH_XMAS_ROWLET);
                        entries.add(ModBlocks.PLUSH_S_XMAS_ROWLET);

                    }).build());

    public static final ItemGroup EASTER_PLUSH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "easter_plush"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ICON_EASTER))
                    .displayName(Text.translatable("itemgroup.groveextras.easter_plush"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PLUSH_BASKET);
                        entries.add(ModBlocks.PLUSH_CHICK);
                        entries.add(ModBlocks.PLUSH_EGG_EASTER_BLUE);
                        entries.add(ModBlocks.PLUSH_EGG_EASTER_GREEN);
                        entries.add(ModBlocks.PLUSH_EGG_EASTER_ORANGE);
                        entries.add(ModBlocks.PLUSH_EASTER_DIGLETT);
                        entries.add(ModBlocks.PLUSH_S_EASTER_DIGLETT);
                        entries.add(ModBlocks.PLUSH_EASTER_SCORBUNNY);
                        entries.add(ModBlocks.PLUSH_S_EASTER_SCORBUNNY);
                        entries.add(ModBlocks.PLUSH_EASTER_TOGEPI);
                        entries.add(ModBlocks.PLUSH_S_EASTER_TOGEPI);
                    }).build());

    public static final ItemGroup HALLOWEEN_PLUSH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "halloween_plush"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ICON_HALLOWEEN))
                    .displayName(Text.translatable("itemgroup.groveextras.halloween_plush"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PLUSH_PUMPKIN);
                        entries.add(ModBlocks.PLUSH_GHOST);
                        entries.add(ModBlocks.PLUSH_LIL_REAPER);
                        entries.add(ModBlocks.PLUSH_CRYSTAL_BALL);
                        entries.add(ModBlocks.PLUSH_CANDY_CORN);
                        entries.add(ModBlocks.PLUSH_CARAMEL_APPLE);
                        entries.add(ModBlocks.PLUSH_POTIONS);
                        entries.add(ModBlocks.PLUSH_BRAIN_IN_JAR);
                        entries.add(ModBlocks.PLUSH_HALLOWEEN_BULBASAUR);
                        entries.add(ModBlocks.PLUSH_S_HALLOWEEN_BULBASAUR);
                    }).build());

    public static final ItemGroup GROVE_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "grove_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MUSIC_DISC_CORAL_REEF))
                    .displayName(Text.translatable("itemgroup.groveextras.grove_discs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MUSIC_DISC_CORAL_REEF);
                        entries.add(ModItems.MUSIC_DISC_WANDER);
                        entries.add(ModItems.MUSIC_DISC_UPLOAD);
                        entries.add(ModItems.MUSIC_DISC_TOXIC);
                        entries.add(ModItems.MUSIC_DISC_GLACIER);
                        entries.add(ModItems.MUSIC_DISC_DUNES);
                        entries.add(ModItems.MUSIC_DISC_WHIMSY);
                        entries.add(ModItems.MUSIC_DISC_GLADE);
                        entries.add(ModItems.MUSIC_DISC_MENACE);

                    }).build());

    public static final ItemGroup GROVE_ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "grove_armor"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HELMET_DAWN_STONE))
                    .displayName(Text.translatable("itemgroup.groveextras.grove_armor"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HELMET_DAWN_STONE);
                        entries.add(ModItems.CHESTPLATE_DAWN_STONE);
                        entries.add(ModItems.LEGGINGS_DAWN_STONE);
                        entries.add(ModItems.BOOTS_DAWN_STONE);

                        entries.add(ModItems.HELMET_DUSK_STONE);
                        entries.add(ModItems.CHESTPLATE_DUSK_STONE);
                        entries.add(ModItems.LEGGINGS_DUSK_STONE);
                        entries.add(ModItems.BOOTS_DUSK_STONE);

                        entries.add(ModItems.HELMET_FIRE_STONE);
                        entries.add(ModItems.CHESTPLATE_FIRE_STONE);
                        entries.add(ModItems.LEGGINGS_FIRE_STONE);
                        entries.add(ModItems.BOOTS_FIRE_STONE);

                        entries.add(ModItems.HELMET_ICE_STONE);
                        entries.add(ModItems.CHESTPLATE_ICE_STONE);
                        entries.add(ModItems.LEGGINGS_ICE_STONE);
                        entries.add(ModItems.BOOTS_ICE_STONE);

                        entries.add(ModItems.HELMET_LEAF_STONE);
                        entries.add(ModItems.CHESTPLATE_LEAF_STONE);
                        entries.add(ModItems.LEGGINGS_LEAF_STONE);
                        entries.add(ModItems.BOOTS_LEAF_STONE);

                        entries.add(ModItems.HELMET_MOON_STONE);
                        entries.add(ModItems.CHESTPLATE_MOON_STONE);
                        entries.add(ModItems.LEGGINGS_MOON_STONE);
                        entries.add(ModItems.BOOTS_MOON_STONE);

                        entries.add(ModItems.HELMET_SHINY_STONE);
                        entries.add(ModItems.CHESTPLATE_SHINY_STONE);
                        entries.add(ModItems.LEGGINGS_SHINY_STONE);
                        entries.add(ModItems.BOOTS_SHINY_STONE);

                        entries.add(ModItems.HELMET_SUN_STONE);
                        entries.add(ModItems.CHESTPLATE_SUN_STONE);
                        entries.add(ModItems.LEGGINGS_SUN_STONE);
                        entries.add(ModItems.BOOTS_SUN_STONE);

                        entries.add(ModItems.HELMET_THUNDER_STONE);
                        entries.add(ModItems.CHESTPLATE_THUNDER_STONE);
                        entries.add(ModItems.LEGGINGS_THUNDER_STONE);
                        entries.add(ModItems.BOOTS_THUNDER_STONE);

                        entries.add(ModItems.HELMET_WATER_STONE);
                        entries.add(ModItems.CHESTPLATE_WATER_STONE);
                        entries.add(ModItems.LEGGINGS_WATER_STONE);
                        entries.add(ModItems.BOOTS_WATER_STONE);

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
                        entries.add(ModItems.APPRENTICES_EPEE);
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
                        entries.add(ModItems.PLASMA_SWORD);
                        entries.add(ModItems.SEA_CROWN);
                        entries.add(ModItems.SOUL_HEART);
                        entries.add(ModItems.SPECTRAL_CLUB);
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
                        entries.add(ModItems.COBALT_EPEE);
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
                        entries.add(ModItems.IVY_CUDGEL);
                        entries.add(ModItems.JADE_ORB);
                        entries.add(ModItems.KOKO_FEATHER);
                        entries.add(ModItems.LAKE_SPIRIT_AMULET);
                        entries.add(ModItems.LAKE_SPIRIT_SHIELD);
                        entries.add(ModItems.LAKE_SPIRIT_SWORD);
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
                        entries.add(ModItems.RUSTED_SHIELD);
                        entries.add(ModItems.RUSTED_SWORD);
                        entries.add(ModItems.SAPPHIRE_ORB);
                        entries.add(ModItems.SCARLET_BOOK);
                        entries.add(ModItems.SHADEROOT_CARROT);
                        entries.add(ModItems.SILVER_WING);
                        entries.add(ModItems.STEEL_STATUE);
                        entries.add(ModItems.STELLAR_CRYSTAL);
                        entries.add(ModItems.SWORD_OF_RUIN);
                        entries.add(ModItems.TABLET_OF_RUIN);
                        entries.add(ModItems.TERRACOTTA_EPEE);
                        entries.add(ModItems.THUNDER_FANG);
                        entries.add(ModItems.THUNDER_FEATHER);
                        entries.add(ModItems.UGAJINS_LAMP);
                        entries.add(ModItems.VESSEL_OF_RUIN);
                        entries.add(ModItems.VIOLET_BOOK);
                        entries.add(ModItems.VIRIDIAN_EPEE);
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
                        entries.add(ModItems.PLATE_BLANK);
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

                        entries.add(ModItems.MEMORY_NORMAL);
                        entries.add(ModItems.MEMORY_FAIRY);
                        entries.add(ModItems.MEMORY_FIGHTING);
                        entries.add(ModItems.MEMORY_FIRE);
                        entries.add(ModItems.MEMORY_FLYING);
                        entries.add(ModItems.MEMORY_DARK);
                        entries.add(ModItems.MEMORY_DRAGON);
                        entries.add(ModItems.MEMORY_BUG);
                        entries.add(ModItems.MEMORY_ELECTRIC);
                        entries.add(ModItems.MEMORY_GHOST);
                        entries.add(ModItems.MEMORY_GRASS);
                        entries.add(ModItems.MEMORY_GROUND);
                        entries.add(ModItems.MEMORY_ROCK);
                        entries.add(ModItems.MEMORY_WATER);
                        entries.add(ModItems.MEMORY_POISON);
                        entries.add(ModItems.MEMORY_PSYCHIC);
                        entries.add(ModItems.MEMORY_ICE);
                        entries.add(ModItems.MEMORY_STEEL);

                    }).build());


    public static final ItemGroup BADGE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GroveExtras.MOD_ID, "badge_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BADGE_BLANK))
                    .displayName(Text.translatable("itemgroup.groveextras.badge_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.BADGE_BUG);
                        entries.add(ModItems.BADGE_DARK);
                        entries.add(ModItems.BADGE_DRAGON);
                        entries.add(ModItems.BADGE_ELECTRIC);
                        entries.add(ModItems.BADGE_FAIRY);
                        entries.add(ModItems.BADGE_FIGHTING);
                        entries.add(ModItems.BADGE_FIRE);
                        entries.add(ModItems.BADGE_FLYING);
                        entries.add(ModItems.BADGE_GHOST);
                        entries.add(ModItems.BADGE_GRASS);
                        entries.add(ModItems.BADGE_GROUND);
                        entries.add(ModItems.BADGE_ICE);
                        entries.add(ModItems.BADGE_NORMAL);
                        entries.add(ModItems.BADGE_POISON);
                        entries.add(ModItems.BADGE_PSYCHIC);
                        entries.add(ModItems.BADGE_ROCK);
                        entries.add(ModItems.BADGE_STEEL);
                        entries.add(ModItems.BADGE_WATER);
                        entries.add(ModItems.BADGE_BLANK);

                        entries.add(ModBlocks.LEAGUE_TROPHY);

                    }).build());



    public static void registerItemGroups() {
        GroveExtras.LOGGER.info("Registering Item Groups for " + GroveExtras.MOD_ID);
    }
}
