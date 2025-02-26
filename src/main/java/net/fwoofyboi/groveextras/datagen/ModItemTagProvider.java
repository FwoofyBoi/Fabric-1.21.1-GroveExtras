package net.fwoofyboi.groveextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fwoofyboi.groveextras.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        //getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                //.add(ModItems.HELMET_DAWN_STONE);
        //getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                //.add(ModItems.CHESTPLATE_DAWN_STONE);
        //getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                //.add(ModItems.LEGGINGS_DAWN_STONE);
        //getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                //.add(ModItems.BOOTS_DAWN_STONE);


        //getOrCreateTagBuilder(ItemTags.SWORDS)
                //.add(ModItems.DEV_SWORD_BAWNGWAWTER);
        //getOrCreateTagBuilder(ItemTags.PICKAXES)
                //.add(ModItems.DEV_PICKAXE_BAWNGWAWTER);
        //getOrCreateTagBuilder(ItemTags.SHOVELS)
                //.add(ModItems.DEV_SHOVEL_BAWNGWAWTER);
        //getOrCreateTagBuilder(ItemTags.AXES)
                //.add(ModItems.DEV_AXE_BAWNGWAWTER);
        //getOrCreateTagBuilder(ItemTags.HOES)
                //.add(ModItems.DEV_HOE_BAWNGWAWTER);




    }
}
