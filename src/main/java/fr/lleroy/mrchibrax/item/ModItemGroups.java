package fr.lleroy.mrchibrax.item;

import fr.lleroy.mrchibrax.MrChibrax;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CHIBRAX_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MrChibrax.MOD_ID, "chibrax_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHIBRAX_ORB))
                    .displayName(Text.translatable("itemgroup.mrchibrax.chibrax_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHIBRAX_ORB);
                        entries.add(ModItems.RAW_CHIBRAX_ORE);
                        entries.add(ModItems.CHIBRAX_STICK);
                        entries.add(ModItems.CHIBRAX_DILDO);
                    }).build());

    public static void registerItemGroups() {
        MrChibrax.LOGGER.info("Enregistrement des onglets d'objets moddé pour " + MrChibrax.MOD_ID);
    }
}
