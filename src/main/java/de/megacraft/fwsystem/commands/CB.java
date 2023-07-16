package de.megacraft.fwsystem.commands;

import de.megacraft.fwsystem.FWSystem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CB implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            FWSystem.connect(p, "CB-1");
        }
        return false;
    }
}