package net.fwoofyboi.groveextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.fwoofyboi.groveextras.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //BlockStateModelGenerator.BlockTexturePool blueCrystalBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRYSTAL_BRICKS_BLUE);

        //blueCrystalBrickPool.stairs(ModBlocks.CRYSTAL_BRICK_STAIRS_BLUE);
        //blueCrystalBrickPool.slab(ModBlocks.CRYSTAL_BRICK_SLAB_BLUE);

        //blockStateModelGenerator.registerDoor(ModBlocks.FRAMED_GLASS_DOOR);
        //blockStateModelGenerator.registerDoor(ModBlocks.DARK_FRAMED_GLASS_DOOR);

        //blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.FRAMED_GLASS_TRAPDOOR);
        //blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DARK_FRAMED_GLASS_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.BLUE_SHARD, Models.GENERATED);

        //itemModelGenerator.register(ModItems.DEV_SWORD_BAWNGWAWTER, Models.HANDHELD);
        //itemModelGenerator.register(ModItems.DEV_PICKAXE_BAWNGWAWTER, Models.HANDHELD);
        //itemModelGenerator.register(ModItems.DEV_SHOVEL_BAWNGWAWTER, Models.HANDHELD);
        //itemModelGenerator.register(ModItems.DEV_AXE_BAWNGWAWTER, Models.HANDHELD);
        //itemModelGenerator.register(ModItems.DEV_HOE_BAWNGWAWTER, Models.HANDHELD);

        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.HELMET_DAWN_STONE));
        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHESTPLATE_DAWN_STONE));
        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.LEGGINGS_DAWN_STONE));
        //itemModelGenerator.registerArmor(((ArmorItem) ModItems.BOOTS_DAWN_STONE));


    }
}
