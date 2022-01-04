package de.ingressboy.ingresscore;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.*;



public final class IngressCore extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("Moin Meister!");

        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(this, "iron_sword"), new ItemStack(Material.IRON_SWORD));

        recipe.addIngredient(Material.IRON_INGOT);
        recipe.addIngredient(Material.WOODEN_SWORD);

        Bukkit.addRecipe(recipe);

    }

    @Override
    public void onDisable() {
        this.getLogger().info("Bye Meister!");
    }
}
