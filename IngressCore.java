package de.ingressboy.ingresscore;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.*;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.*;
import org.bukkit.event.player.PlayerJoinEvent;



public final class IngressCore extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getLogger().info("Moin Meister!");

        ShapelessRecipe ironswordrecipe = new ShapelessRecipe(new NamespacedKey(this, "iron_sword"), new ItemStack(Material.IRON_SWORD));
        ironswordrecipe.addIngredient(Material.IRON_INGOT);
        ironswordrecipe.addIngredient(Material.WOODEN_SWORD);
        Bukkit.addRecipe(ironswordrecipe);
        Bukkit.getPluginManager().registerEvents(this, this);

        ShapelessRecipe diamondswordrecipe = new ShapelessRecipe(new NamespacedKey(this, "diamond_sword"), new ItemStack(Material.DIAMOND_SWORD));
        diamondswordrecipe.addIngredient(Material.DIAMOND);
        diamondswordrecipe.addIngredient(Material.IRON_SWORD);
        Bukkit.addRecipe(diamondswordrecipe);
        Bukkit.getPluginManager().registerEvents(this, this);

        ShapelessRecipe netheriteswordrecipe = new ShapelessRecipe(new NamespacedKey(this, "netherite_sword"), new ItemStack(Material.NETHERITE_SWORD));
        netheriteswordrecipe.addIngredient(Material.NETHERITE_INGOT);
        netheriteswordrecipe.addIngredient(Material.DIAMOND_SWORD);
        Bukkit.addRecipe(netheriteswordrecipe);
        Bukkit.getPluginManager().registerEvents(this, this);

        getCommand("problemmitplugin").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command befehl, String label, String[] args) {
        Bukkit.broadcastMessage(ChatColor.RED + "Halt dein Maul! Es wird nicht gemeckert!");
        return true;
    }

    @EventHandler
    private void onJoin(PlayerJoinEvent e) {
        e.getPlayer().discoverRecipe(new NamespacedKey(this, "iron_sword"));
        e.getPlayer().discoverRecipe(new NamespacedKey(this, "diamond_sword"));
        e.getPlayer().discoverRecipe(new NamespacedKey(this, "netherite_sword"));
    }


    @Override
    public void onDisable() {
        this.getLogger().info("Bye Meister!");
    }
}
