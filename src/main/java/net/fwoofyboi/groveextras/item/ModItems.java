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


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GroveExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GroveExtras.LOGGER.info("Registering Mod Items for " + GroveExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(KEY_VOTE);
        });
    }
}