package de.megacraft.fwsystem.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class jobGUI implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equals("§bJobs")) {
                if (e.getCurrentItem().getType() == Material.IRON_PICKAXE && e.getCurrentItem().getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)) {
                } else if (e.getCurrentItem().getType() == Material.IRON_SHOVEL && e.getCurrentItem().getItemMeta().hasEnchant(Enchantment.DURABILITY)) {
                } else if (e.getCurrentItem().getType() == Material.IRON_AXE && e.getCurrentItem().getItemMeta().hasEnchant(Enchantment.DIG_SPEED)) {
                }
            e.setCancelled(true);
        }

    }
}
