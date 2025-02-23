package net.fwoofyboi.groveextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fwoofyboi.groveextras.block.ModBlocks;
import net.fwoofyboi.groveextras.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> CRYSTAL_BLOCK_STONECUTTABLES = List.of(ModBlocks.CRYSTAL_BLOCK_CYAN);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTAL_BRICKS_CYAN, CRYSTAL_BLOCK_STONECUTTABLES.getFirst(), 1);

        //ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTAL_BLOCK_CYAN)
                //.pattern("aa")
                //.pattern("aa")
                //.input('a', ModItems.CRYSTAL_SHARD_CYAN)
                //.criterion(hasItem(ModItems.CRYSTAL_SHARD_CYAN), conditionsFromItem(ModItems.CRYSTAL_SHARD_CYAN))
                //.offerTo(recipeExporter);
    }
}
