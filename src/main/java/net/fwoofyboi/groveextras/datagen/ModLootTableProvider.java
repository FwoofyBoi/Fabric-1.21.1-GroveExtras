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
        //addDrop(ModBlocks.CRYSTAL_BRICK_STAIRS_BLUE);
        //addDrop(ModBlocks.CRYSTAL_BRICK_SLAB_BLUE, slabDrops(ModBlocks.CRYSTAL_BRICK_SLAB_BLUE));

        //addDrop(ModBlocks.FRAMED_GLASS_DOOR, doorDrops(ModBlocks.FRAMED_GLASS_DOOR));
        //addDrop(ModBlocks.DARK_FRAMED_GLASS_DOOR, doorDrops(ModBlocks.DARK_FRAMED_GLASS_DOOR));

        //addDrop(ModBlocks.FRAMED_GLASS_TRAPDOOR);
        //addDrop(ModBlocks.DARK_FRAMED_GLASS_TRAPDOOR);

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
