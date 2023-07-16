package de.megacraft.fwsystem.commands;

import de.megaessentialsrecode.MegaEssentials;
import de.megaessentialsrecode.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class job implements CommandExecutor  {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        ItemStack glass_pane = new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setDisplayName("§b").build();
        if (!(sender instanceof Player)) {
            sender.sendMessage(MegaEssentials.Prefix + "§4Dieser Command ist nur für Spieler!");
            return true;
        }

        Player p = (Player) sender;


        Inventory inv = Bukkit.createInventory(null, 1*9, "§bJobs");

        for(int i = 0; i < 9; i++) {
            inv.setItem(i, glass_pane);
        }

        inv.setItem(2, new ItemBuilder(Material.IRON_PICKAXE).setDisplayName("§bMiner").setLore("§3Als §bMiner baust du §6Erze und §7Steine §3ab§7.").setUnbreakable(true).addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3, true).build());
        inv.setItem(4, new ItemBuilder(Material.IRON_SHOVEL).setDisplayName("§eGräber").setLore("§3Als §eGräber §abaust du §eSand§7, Kies, §3usw. ab§7.").setUnbreakable(true).addEnchantment(Enchantment.DURABILITY, 3, true).build());
        inv.setItem(6, new ItemBuilder(Material.IRON_AXE).setDisplayName("§aBaumfäller").setLore("§3Als §aBaumfäller fällst du Bäume§7.").setUnbreakable(true).addEnchantment(Enchantment.DIG_SPEED, 5, true).build());

        p.openInventory(inv);

        return false;
    }
}
