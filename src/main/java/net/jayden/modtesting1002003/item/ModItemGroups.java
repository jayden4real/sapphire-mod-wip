package net.jayden.modtesting1002003.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jayden.modtesting1002003.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MODDED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "modded"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modded"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE)

                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " +TutorialMod.MOD_ID);
    }
}
