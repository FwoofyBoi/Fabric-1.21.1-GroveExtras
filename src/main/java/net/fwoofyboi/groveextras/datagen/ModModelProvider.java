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
        BlockStateModelGenerator.BlockTexturePool purpleHeartPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_HEART_PLANKS);

        purpleHeartPool.stairs(ModBlocks.PURPLE_HEART_STAIRS);
        purpleHeartPool.slab(ModBlocks.PURPLE_HEART_SLAB);
        purpleHeartPool.button(ModBlocks.PURPLE_HEART_BUTTON);
        purpleHeartPool.pressurePlate(ModBlocks.PURPLE_HEART_PRESSURE_PLATE);
        purpleHeartPool.fence(ModBlocks.PURPLE_HEART_FENCE);
        purpleHeartPool.fenceGate(ModBlocks.PURPLE_HEART_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool purpleLightHeartPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_PURPLE_HEART_PLANKS);

        purpleLightHeartPool.stairs(ModBlocks.LIGHT_PURPLE_HEART_STAIRS);
        purpleLightHeartPool.slab(ModBlocks.LIGHT_PURPLE_HEART_SLAB);
        purpleLightHeartPool.button(ModBlocks.LIGHT_PURPLE_HEART_BUTTON);
        purpleLightHeartPool.pressurePlate(ModBlocks.LIGHT_PURPLE_HEART_PRESSURE_PLATE);
        purpleLightHeartPool.fence(ModBlocks.LIGHT_PURPLE_HEART_FENCE);
        purpleLightHeartPool.fenceGate(ModBlocks.LIGHT_PURPLE_HEART_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_HEART_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_PURPLE_HEART_DOOR);

        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PURPLE_HEART_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_PURPLE_HEART_TRAPDOOR);

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
