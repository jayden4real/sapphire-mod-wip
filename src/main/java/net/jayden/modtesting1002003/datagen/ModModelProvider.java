package net.jayden.modtesting1002003.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jayden.modtesting1002003.block.ModBlocks;
import net.jayden.modtesting1002003.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.GENERATED);
    }
}
