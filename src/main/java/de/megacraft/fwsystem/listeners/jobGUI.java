package de.megacraft.fwsystem.listeners;

import de.megacraft.fwsystem.utils.DataBase;
import de.megacraft.fwsystem.utils.JobUtils;
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
                    JobUtils.setJob("Miner", p);
                    DataBase.savePlayerJob(p, "Miner");
                    e.getInventory().close();
                } else if (e.getCurrentItem().getType() == Material.IRON_SHOVEL && e.getCurrentItem().getItemMeta().hasEnchant(Enchantment.DURABILITY)) {
                    JobUtils.setJob("Gräber", p);
                    DataBase.savePlayerJob(p, "Gräber");
                    e.getInventory().close();
                } else if (e.getCurrentItem().getType() == Material.IRON_AXE && e.getCurrentItem().getItemMeta().hasEnchant(Enchantment.DIG_SPEED)) {
                    JobUtils.setJob("Baumfäller", p);
                    DataBase.savePlayerJob(p, "Baumfäller");
                    e.getInventory().close();
                }
            e.setCancelled(true);
        }

    }
}
