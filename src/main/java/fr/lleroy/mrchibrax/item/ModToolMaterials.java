package fr.lleroy.mrchibrax.item;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

import static fr.lleroy.mrchibrax.item.ModItems.CHIBRAX_ORB;

public enum ModToolMaterials implements ToolMaterial {
    CHIBRAX(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL, // Tag des blocs que cet outil ne peut pas miner
            5000, // Durabilité
            15.0F, // Vitesse de minage
            4.0F, // Dégâts d'attaque
            30, // Enchantabilité
            () -> Ingredient.ofItems(CHIBRAX_ORB) // Ingrédient de réparation
    );

    private final TagKey<Block> inverseTag;
    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(TagKey<Block> inverseTag, int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
