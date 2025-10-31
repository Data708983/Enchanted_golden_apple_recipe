package org.data7.enchanted_golden_apple_recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class Enchanted_golden_apple_recipe extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getLogger().info("Enchanted Golden Apple Recipe Added!");
        NamespacedKey key = new NamespacedKey(this, "enchanted_golden_apple");
        ItemStack item = ItemStack.of(Material.ENCHANTED_GOLDEN_APPLE, 1);
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("AAA", "ABA", "AAA");
        recipe.setIngredient('A', Material.GOLD_BLOCK);
        recipe.setIngredient('B', Material.APPLE);
        getServer().addRecipe(recipe);
    }

    @Override
    public void onDisable() {
    }
}
