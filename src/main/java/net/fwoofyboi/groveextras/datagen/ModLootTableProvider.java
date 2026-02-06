package net.fwoofyboi.groveextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.fwoofyboi.groveextras.block.custom.GarlicCropBlock;
import net.fwoofyboi.groveextras.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.TOPAZ_ORE, oreDrops(ModBlocks.TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE, oreDrops(ModBlocks.DEEPSLATE_TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, oreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));

        addDrop(ModBlocks.NETHERRACK_CRYSTALLIZED_AMBER_ORE, oreDrops(ModBlocks.NETHERRACK_CRYSTALLIZED_AMBER_ORE, ModItems.CRYSTALLIZED_AMBER));

        addDrop(ModBlocks.END_STONE_COMET_SHARD_ORE, oreDrops(ModBlocks.END_STONE_COMET_SHARD_ORE, ModItems.COMET_SHARD));
        addDrop(ModBlocks.END_STONE_STAR_PIECE_ORE, oreDrops(ModBlocks.END_STONE_STAR_PIECE_ORE, ModItems.STAR_PIECE));

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

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.GARLIC_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(GarlicCropBlock.AGE, 3));
        this.addDrop(ModBlocks.GARLIC_CROP, this.cropDrops(ModBlocks.GARLIC_CROP, ModItems.GARLIC, ModItems.GARLIC, builder2));

    }
}
