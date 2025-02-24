package net.fwoofyboi.groveextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fwoofyboi.groveextras.GroveExtras;
import net.minecraft.item.BrushItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Keys
    public static final Item KEY_VOTE = registerItem("key_vote", new Item(new Item.Settings()));
    public static final Item KEY_ELITE = registerItem("key_elite", new Item(new Item.Settings()));
    public static final Item KEY_MASTER = registerItem("key_master", new Item(new Item.Settings()));
    public static final Item KEY_COSMETIC = registerItem("key_cosmetic", new Item(new Item.Settings()));

    //Treasure Items
    public static final Item TOPAZ = registerItem("topaz", new Item(new Item.Settings()));
    public static final Item CUT_DIAMOND = registerItem("cut_diamond", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item PEARL = registerItem("pearl", new Item(new Item.Settings()));
    public static final Item CRYSTALLIZED_AMBER = registerItem("crystallized_amber", new Item(new Item.Settings()));
    public static final Item CUT_AMETHYST = registerItem("cut_amethyst", new Item(new Item.Settings()));
    public static final Item NUGGET = registerItem("nugget", new Item(new Item.Settings()));
    public static final Item BIG_PEARL = registerItem("big_pearl", new Item(new Item.Settings()));
    public static final Item BIG_NUGGET = registerItem("big_nugget", new Item(new Item.Settings()));
    public static final Item COMET_SHARD = registerItem("comet_shard", new Item(new Item.Settings()));
    public static final Item STAR_PIECE = registerItem("star_piece", new Item(new Item.Settings()));
    public static final Item STAR_DUST = registerItem("star_dust", new Item(new Item.Settings()));
    public static final Item WITHER_SKULL_FRAGMENT = registerItem("wither_skull_fragment", new Item(new Item.Settings()));
    public static final Item RED_SHARD = registerItem("red_shard", new Item(new Item.Settings()));
    public static final Item BLUE_SHARD = registerItem("blue_shard", new Item(new Item.Settings()));
    public static final Item GREEN_SHARD = registerItem("green_shard", new Item(new Item.Settings()));
    public static final Item YELLOW_SHARD = registerItem("yellow_shard", new Item(new Item.Settings()));
    public static final Item PRETTY_FEATHER = registerItem("pretty_feather", new Item(new Item.Settings()));

    //Crystal Shards
    public static final Item CRYSTAL_SHARD_BLUE = registerItem("crystal_shard_blue", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_CYAN = registerItem("crystal_shard_cyan", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_GREEN = registerItem("crystal_shard_green", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_LIME = registerItem("crystal_shard_lime", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_MAGENTA = registerItem("crystal_shard_magenta", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_ORANGE = registerItem("crystal_shard_orange", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_PINK = registerItem("crystal_shard_pink", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_RED = registerItem("crystal_shard_red", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_WHITE = registerItem("crystal_shard_white", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_YELLOW = registerItem("crystal_shard_yellow", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_AUBURN = registerItem("crystal_shard_auburn", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_CORNFLOWER = registerItem("crystal_shard_cornflower", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_GRAY = registerItem("crystal_shard_gray", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_INDIGO = registerItem("crystal_shard_indigo", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_MAROON = registerItem("crystal_shard_maroon", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_MOCHA = registerItem("crystal_shard_mocha", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_ORCHID = registerItem("crystal_shard_orchid", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_SLATE = registerItem("crystal_shard_slate", new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD_RAINBOW = registerItem("crystal_shard_rainbow", new Item(new Item.Settings()));

    //Dev Tools
    public static final Item DEV_BRUSH_BAWNGWAWTER = registerItem("dev_brush_bawngwawter", new BrushItem(new Item.Settings()));

    //Creative Icons
    public static final Item ICON_FORM_SWAP = registerItem("icon_form_swap", new Item(new Item.Settings()));
    public static final Item ICON_TROPHY = registerItem("icon_trophy", new Item(new Item.Settings()));
    public static final Item ICON_KEY_ITEMS = registerItem("icon_key_items", new Item(new Item.Settings()));
    public static final Item ICON_XMAS = registerItem("icon_xmas", new Item(new Item.Settings()));
    public static final Item ICON_EASTER = registerItem("icon_easter", new Item(new Item.Settings()));
    public static final Item ICON_HALLOWEEN = registerItem("icon_halloween", new Item(new Item.Settings()));

    //Form Swap Items
    public static final Item GRACIDEA_FLOWER = registerItem("gracidea_flower", new Item(new Item.Settings()));
    public static final Item PLATE_MEADOW = registerItem("plate_meadow", new Item(new Item.Settings()));
    public static final Item PLATE_INSECT = registerItem("plate_insect", new Item(new Item.Settings()));
    public static final Item PLATE_ZAP = registerItem("plate_zap", new Item(new Item.Settings()));
    public static final Item PLATE_STONE = registerItem("plate_stone", new Item(new Item.Settings()));
    public static final Item PLATE_EARTH = registerItem("plate_earth", new Item(new Item.Settings()));
    public static final Item PLATE_DRACO = registerItem("plate_draco", new Item(new Item.Settings()));
    public static final Item PLATE_FIST = registerItem("plate_fist", new Item(new Item.Settings()));
    public static final Item PLATE_PIXIE = registerItem("plate_pixie", new Item(new Item.Settings()));
    public static final Item PLATE_MIND = registerItem("plate_mind", new Item(new Item.Settings()));
    public static final Item PLATE_TOXIC = registerItem("plate_toxic", new Item(new Item.Settings()));
    public static final Item PLATE_SPOOKY = registerItem("plate_spooky", new Item(new Item.Settings()));
    public static final Item PLATE_DREAD = registerItem("plate_dread", new Item(new Item.Settings()));
    public static final Item PLATE_ICICLE = registerItem("plate_icicle", new Item(new Item.Settings()));
    public static final Item PLATE_SKY = registerItem("plate_sky", new Item(new Item.Settings()));
    public static final Item PLATE_SPLASH = registerItem("plate_splash", new Item(new Item.Settings()));
    public static final Item PLATE_IRON = registerItem("plate_iron", new Item(new Item.Settings()));
    public static final Item PLATE_FLAME = registerItem("plate_flame", new Item(new Item.Settings()));
    public static final Item MASK_TEAL = registerItem("mask_teal", new Item(new Item.Settings()));
    public static final Item MASK_CORNERSTONE = registerItem("mask_cornerstone", new Item(new Item.Settings()));
    public static final Item MASK_WELLSPRING = registerItem("mask_wellspring", new Item(new Item.Settings()));
    public static final Item MASK_HEARTHFLAME = registerItem("mask_hearthflame", new Item(new Item.Settings()));
    public static final Item VILE_VIAL = registerItem("vile_vial", new Item(new Item.Settings()));
    public static final Item DNA_SPLICER = registerItem("dna_splicer", new Item(new Item.Settings()));
    public static final Item PECULIAR_OVEN = registerItem("peculiar_oven", new Item(new Item.Settings()));
    public static final Item PECULIAR_FAN = registerItem("peculiar_fan", new Item(new Item.Settings()));
    public static final Item PECULIAR_WASHING_MACHINE = registerItem("peculiar_washing_machine", new Item(new Item.Settings()));
    public static final Item PECULIAR_LAWN_MOWER = registerItem("peculiar_lawn_mower", new Item(new Item.Settings()));
    public static final Item PECULIAR_FRIDGE = registerItem("peculiar_fridge", new Item(new Item.Settings()));
    public static final Item METEORITE_SHARP = registerItem("meteorite_sharp", new Item(new Item.Settings()));
    public static final Item METEORITE_HARD = registerItem("meteorite_hard", new Item(new Item.Settings()));
    public static final Item METEORITE_SMOOTH = registerItem("meteorite_smooth", new Item(new Item.Settings()));
    public static final Item REVEAL_GLASS = registerItem("reveal_glass", new Item(new Item.Settings()));
    public static final Item ICY_REINS_OF_UNITY = registerItem("icy_reins_of_unity", new Item(new Item.Settings()));
    public static final Item SHADOW_REINS_OF_UNITY = registerItem("shadow_reins_of_unity", new Item(new Item.Settings()));
    public static final Item DRIVE_BURN = registerItem("drive_burn", new Item(new Item.Settings()));
    public static final Item DRIVE_SHOCK = registerItem("drive_shock", new Item(new Item.Settings()));
    public static final Item DRIVE_CHILL = registerItem("drive_chill", new Item(new Item.Settings()));
    public static final Item DRIVE_DOUSE = registerItem("drive_douse", new Item(new Item.Settings()));
    public static final Item RED_ORB = registerItem("red_orb", new Item(new Item.Settings()));
    public static final Item BLUE_ORB = registerItem("blue_orb", new Item(new Item.Settings()));
    public static final Item ADAMANT_CRYSTAL = registerItem("adamant_crystal", new Item(new Item.Settings()));
    public static final Item GRISEOUS_CORE = registerItem("griseous_core", new Item(new Item.Settings()));
    public static final Item LUSTROUS_GLOBE = registerItem("lustrous_globe", new Item(new Item.Settings()));
    public static final Item N_SOLARIZER = registerItem("n_solarizer", new Item(new Item.Settings()));
    public static final Item N_LUNARIZER = registerItem("n_lunarizer", new Item(new Item.Settings()));
    public static final Item ULTRANECROZIUM_Z = registerItem("ultranecrozium_z", new Item(new Item.Settings()));
    public static final Item PRISON_BOTTLE = registerItem("prison_bottle", new Item(new Item.Settings()));

    //Key Items (Summon Items)
    public static final Item ANCIENT_DRIVE = registerItem("ancient_drive", new Item(new Item.Settings()));
    public static final Item AZURE_FLUTE = registerItem("azure_flute", new Item(new Item.Settings()));
    public static final Item DIAMOND_TIARA = registerItem("diamond_tiara", new Item(new Item.Settings()));
    public static final Item GRACIDEA_SEED = registerItem("gracidea_seed", new Item(new Item.Settings()));
    public static final Item GS_BALL = registerItem("gs_ball", new Item(new Item.Settings()));
    public static final Item HELIX_ORB = registerItem("helix_orb", new Item(new Item.Settings()));
    public static final Item HYPERSPACE_RING = registerItem("hyperspace_ring", new Item(new Item.Settings()));
    public static final Item JUNGLE_ROOT = registerItem("jungle_root", new Item(new Item.Settings()));
    public static final Item MUSIC_BOX = registerItem("music_box", new Item(new Item.Settings()));
    public static final Item MYSTERY_BOX = registerItem("mystery_box", new Item(new Item.Settings()));
    public static final Item MYTHICAL_PECHA_BERRY = registerItem("mythical_pecha_berry", new Item(new Item.Settings()));
    public static final Item NIGHTMARE_SHROUD = registerItem("nightmare_shroud", new Item(new Item.Settings()));
    public static final Item ORIGIN_SASH = registerItem("origin_sash", new Item(new Item.Settings()));
    public static final Item SEA_CROWN = registerItem("sea_crown", new Item(new Item.Settings()));
    public static final Item SOUL_HEART = registerItem("soul_heart", new Item(new Item.Settings()));
    public static final Item VICTORY_MEDAL = registerItem("victory_medal", new Item(new Item.Settings()));
    public static final Item VOLCANIC_DOLL = registerItem("volcanic_doll", new Item(new Item.Settings()));
    public static final Item WISHING_TAG = registerItem("wishing_tag", new Item(new Item.Settings()));

    public static final Item DNA_STRAND = registerItem("dna_strand", new Item(new Item.Settings()));
    public static final Item ULTRA_BEAST_TOKEN = registerItem("ultra_beast_token", new Item(new Item.Settings()));

    public static final Item ADAMANT_ORB = registerItem("adamant_orb", new Item(new Item.Settings()));
    public static final Item BEADS_OF_RUIN = registerItem("beads_of_ruin", new Item(new Item.Settings()));
    public static final Item BLACK_PRISM = registerItem("black_prism", new Item(new Item.Settings()));
    public static final Item BLACK_STONE = registerItem("black_stone", new Item(new Item.Settings()));
    public static final Item BLUE_SOUL_DEW = registerItem("blue_soul_dew", new Item(new Item.Settings()));
    public static final Item BULU_BELL = registerItem("bulu_bell", new Item(new Item.Settings()));
    public static final Item CLONED_SASH = registerItem("cloned_sash", new Item(new Item.Settings()));
    public static final Item COMBAT_FEATHER = registerItem("combat_feather", new Item(new Item.Settings()));
    public static final Item DEATH_WING = registerItem("death_wing", new Item(new Item.Settings()));
    public static final Item DRAGON_STATUE = registerItem("dragon_statue", new Item(new Item.Settings()));
    public static final Item ECLIPSE_FLUTE = registerItem("eclipse_flute", new Item(new Item.Settings()));
    public static final Item ELECTRIC_STATUE = registerItem("electric_statue", new Item(new Item.Settings()));
    public static final Item FINI_FIN = registerItem("fini_fin", new Item(new Item.Settings()));
    public static final Item FIRE_FANG = registerItem("fire_fang", new Item(new Item.Settings()));
    public static final Item FIRE_FEATHER = registerItem("fire_feather", new Item(new Item.Settings()));
    public static final Item FUJINS_LAMP = registerItem("fujins_lamp", new Item(new Item.Settings()));
    public static final Item GOLD_STATUE = registerItem("gold_statue", new Item(new Item.Settings()));
    public static final Item GRAY_STONE = registerItem("gray_stone", new Item(new Item.Settings()));
    public static final Item GRISEOUS_ORB = registerItem("griseous_orb", new Item(new Item.Settings()));
    public static final Item HEAVY_CONTROL_MASK = registerItem("heavy_control_mask", new Item(new Item.Settings()));
    public static final Item ICE_FANG = registerItem("ice_fang", new Item(new Item.Settings()));
    public static final Item ICE_FEATHER = registerItem("ice_feather", new Item(new Item.Settings()));
    public static final Item ICE_STATUE = registerItem("ice_statue", new Item(new Item.Settings()));
    public static final Item ICEROOT_CARROT = registerItem("iceroot_carrot", new Item(new Item.Settings()));
    public static final Item INARIS_LAMP = registerItem("inaris_lamp", new Item(new Item.Settings()));
    public static final Item JADE_ORB = registerItem("jade_orb", new Item(new Item.Settings()));
    public static final Item KOKO_FEATHER = registerItem("koko_feather", new Item(new Item.Settings()));
    public static final Item LAKE_SPIRIT_AMULET = registerItem("lake_spirit_amulet", new Item(new Item.Settings()));
    public static final Item LELE_ANTENNAE = registerItem("lele_antennae", new Item(new Item.Settings()));
    public static final Item LIFE_ANTLER = registerItem("life_antler", new Item(new Item.Settings()));
    public static final Item LUNAR_WING = registerItem("lunar_wing", new Item(new Item.Settings()));
    public static final Item LUSTROUS_ORB = registerItem("lustrous_orb", new Item(new Item.Settings()));
    public static final Item MAGMA_STONE = registerItem("magma_stone", new Item(new Item.Settings()));
    public static final Item MASK_OF_BEAUTY = registerItem("mask_of_beauty", new Item(new Item.Settings()));
    public static final Item MASK_OF_CLEVERNESS = registerItem("mask_of_cleverness", new Item(new Item.Settings()));
    public static final Item MASK_OF_STRENGTH = registerItem("mask_of_strength", new Item(new Item.Settings()));
    public static final Item ORDERS_CREST = registerItem("orders_crest", new Item(new Item.Settings()));
    public static final Item PSYCHIC_FEATHER = registerItem("psychic_feather", new Item(new Item.Settings()));
    public static final Item RADIANT_PETAL = registerItem("radiant_petal", new Item(new Item.Settings()));
    public static final Item RAGE_FEATHER = registerItem("rage_feather", new Item(new Item.Settings()));
    public static final Item RAIJINS_LAMP = registerItem("raijins_lamp", new Item(new Item.Settings()));
    public static final Item RAINBOW_WING = registerItem("rainbow_wing", new Item(new Item.Settings()));
    public static final Item RED_SOUL_DEW = registerItem("red_soul_dew", new Item(new Item.Settings()));
    public static final Item ROCK_STATUE = registerItem("rock_statue", new Item(new Item.Settings()));
    public static final Item RUBY_ORB = registerItem("ruby_orb", new Item(new Item.Settings()));
    public static final Item SAPPHIRE_ORB = registerItem("sapphire_orb", new Item(new Item.Settings()));
    public static final Item SCARLET_BOOK = registerItem("scarlet_book", new Item(new Item.Settings()));
    public static final Item SHADEROOT_CARROT = registerItem("shaderoot_carrot", new Item(new Item.Settings()));
    public static final Item SILVER_WING = registerItem("silver_wing", new Item(new Item.Settings()));
    public static final Item STEEL_STATUE = registerItem("steel_statue", new Item(new Item.Settings()));
    public static final Item STELLAR_CRYSTAL = registerItem("stellar_crystal", new Item(new Item.Settings()));
    public static final Item TABLET_OF_RUIN = registerItem("tablet_of_ruin", new Item(new Item.Settings()));
    public static final Item THUNDER_FANG = registerItem("thunder_fang", new Item(new Item.Settings()));
    public static final Item THUNDER_FEATHER = registerItem("thunder_feather", new Item(new Item.Settings()));
    public static final Item UGAJINS_LAMP = registerItem("ugajins_lamp", new Item(new Item.Settings()));
    public static final Item VESSEL_OF_RUIN = registerItem("vessel_of_ruin", new Item(new Item.Settings()));
    public static final Item VIOLET_BOOK = registerItem("violet_book", new Item(new Item.Settings()));
    public static final Item WHITE_BELT = registerItem("white_belt", new Item(new Item.Settings()));
    public static final Item WHITE_STONE = registerItem("white_stone", new Item(new Item.Settings()));
    public static final Item WISHING_STAR = registerItem("wishing_star", new Item(new Item.Settings()));

    //Evolution Items
    public static final Item SYRUPY_APPLE = registerItem("syrupy_apple", new Item(new Item.Settings()));
    public static final Item METAL_ALLOY = registerItem("metal_alloy", new Item(new Item.Settings()));
    public static final Item LEADERS_CREST = registerItem("leaders_crest", new Item(new Item.Settings()));
    public static final Item SCROLL_OF_DARKNESS = registerItem("scroll_of_darkness", new Item(new Item.Settings()));
    public static final Item SCROLL_OF_WATERS = registerItem("scroll_of_waters", new Item(new Item.Settings()));

    //Mega Stones
    public static final Item RAW_DIANCITE = registerItem("raw_diancite", new Item(new Item.Settings()));
    public static final Item CUT_DIANCITE = registerItem("cut_diancite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GroveExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GroveExtras.LOGGER.info("Registering Mod Items for " + GroveExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(WITHER_SKULL_FRAGMENT);
        });
    }
}