package fr.lleroy.mrchibrax.item;

import fr.lleroy.mrchibrax.MrChibrax;
import fr.lleroy.mrchibrax.item.ModToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // permet de crée un nouveau objet vierge (aucune texture) en jeu
    public static final Item CHIBRAX_ORB = registerItem("chibrax_orb", new Item(new Item.Settings()));
    public static final Item RAW_CHIBRAX_ORE = registerItem("raw_chibrax_ore", new Item(new Item.Settings()));
    public static final Item CHIBRAX_STICK = registerItem("chibrax_stick", new Item(new Item.Settings()));
    public static final Item CHIBRAX_DILDO = registerItem("chibrax_dildo", new SwordItem(ModToolMaterials.CHIBRAX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHIBRAX, 6, -2.4f))));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MrChibrax.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MrChibrax.LOGGER.info("Enregistrement des objets moddé pour " + MrChibrax.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHIBRAX_ORB);
            entries.add(RAW_CHIBRAX_ORE);
            entries.add(CHIBRAX_STICK);
            entries.add(CHIBRAX_DILDO);
        });
    }

}
