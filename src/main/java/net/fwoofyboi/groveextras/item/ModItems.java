package net.fwoofyboi.groveextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fwoofyboi.groveextras.GroveExtras;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item KEY_VOTE = registerItem("key_vote", new Item(new Item.Settings()));
    public static final Item KEY_ELITE = registerItem("key_elite", new Item(new Item.Settings()));
    public static final Item KEY_MASTER = registerItem("key_master", new Item(new Item.Settings()));
    public static final Item KEY_COSMETIC = registerItem("key_cosmetic", new Item(new Item.Settings()));

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