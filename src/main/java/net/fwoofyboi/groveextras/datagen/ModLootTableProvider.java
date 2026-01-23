package net.fwoofyboi.groveextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PURPLE_HEART_STAIRS);
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_STAIRS);

        addDrop(ModBlocks.PURPLE_HEART_SLAB, slabDrops(ModBlocks.PURPLE_HEART_SLAB));
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_SLAB, slabDrops(ModBlocks.LIGHT_PURPLE_HEART_SLAB));

        addDrop(ModBlocks.PURPLE_HEART_DOOR, doorDrops(ModBlocks.PURPLE_HEART_DOOR));
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_DOOR, doorDrops(ModBlocks.LIGHT_PURPLE_HEART_DOOR));

        addDrop(ModBlocks.PURPLE_HEART_FENCE);
        addDrop(ModBlocks.PURPLE_HEART_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_FENCE);
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_FENCE_GATE);

        addDrop(ModBlocks.PURPLE_HEART_BUTTON);
        addDrop(ModBlocks.PURPLE_HEART_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_BUTTON);
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_PRESSURE_PLATE);

        addDrop(ModBlocks.PURPLE_HEART_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_TRAPDOOR);

        addDrop(ModBlocks.PURPLE_HEART_PLANKS);
        addDrop(ModBlocks.LIGHT_PURPLE_HEART_PLANKS);
        addDrop(ModBlocks.PURPLE_HEART_LOG);
        addDrop(ModBlocks.PURPLE_HEART_WOOD);
        addDrop(ModBlocks.STRIPPED_PURPLE_HEART_LOG);
        addDrop(ModBlocks.STRIPPED_PURPLE_HEART_WOOD);
        addDrop(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_LOG);
        addDrop(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_WOOD);
        addDrop(ModBlocks.PURPLE_HEART_SAPLING);

        addDrop(ModBlocks.PURPLE_HEART_LEAVES, leavesDrops(ModBlocks.PURPLE_HEART_LEAVES, ModBlocks.PURPLE_HEART_SAPLING, 0.0625f));
    }
}
