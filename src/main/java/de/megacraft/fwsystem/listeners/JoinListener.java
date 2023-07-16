package de.megacraft.fwsystem.listeners;

import de.megacraft.fwsystem.utils.DataBase;
import de.megacraft.fwsystem.utils.JobUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        if (!(DataBase.exist(e.getPlayer()))) {
            DataBase.setup(e.getPlayer());
        } else {
            JobUtils.setJob(DataBase.getPlayerJob(e.getPlayer()), e.getPlayer());
        }


    }

}
