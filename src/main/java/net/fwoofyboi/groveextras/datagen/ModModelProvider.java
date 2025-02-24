package net.fwoofyboi.groveextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //BlockStateModelGenerator.BlockTexturePool blueCrystalBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRYSTAL_BRICKS_BLUE);

        //blueCrystalBrickPool.stairs(ModBlocks.CRYSTAL_BRICK_STAIRS_BLUE);
        //blueCrystalBrickPool.slab(ModBlocks.CRYSTAL_BRICK_SLAB_BLUE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.BLUE_SHARD, Models.GENERATED);
    }
}
