package net.fwoofyboi.groveextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.fwoofyboi.groveextras.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                //.add(ModBlocks.CRYSTAL_BRICKS_BLUE);
                //.add(ModBlocks.GRANITE_BRICK_WALL);

        //getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                //.add(ModBlocks.CRYSTAL_BRICKS_BLUE);
        //getOrCreateTagBuilder(BlockTags.WALLS)
                // .add(ModBlocks.GRANITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PURPLE_HEART_LOG)
                .add(ModBlocks.PURPLE_HEART_WOOD)
                .add(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_LOG)
                .add(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_WOOD)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_LOG)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.PURPLE_HEART_LOG)
                .add(ModBlocks.PURPLE_HEART_WOOD)
                .add(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_LOG)
                .add(ModBlocks.STRIPPED_LIGHT_PURPLE_HEART_WOOD)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_LOG)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_WOOD);
    }
}
