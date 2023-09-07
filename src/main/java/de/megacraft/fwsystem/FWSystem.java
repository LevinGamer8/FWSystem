package de.megacraft.fwsystem;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import de.megacraft.fwsystem.commands.CB;
import de.megacraft.fwsystem.commands.job;
import de.megacraft.fwsystem.listeners.jobGUI;
import de.megacraft.fwsystem.listeners.jobListener;
import de.megacraft.fwsystem.utils.JobUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public final class FWSystem extends JavaPlugin {

    private static Plugin instance;



    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        Bukkit.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this::onPluginMessageReceived);

        getCommand("CB").setExecutor(new CB());
        getCommand("jobs").setExecutor(new job());

        Bukkit.getPluginManager().registerEvents(new jobGUI(), this);
        Bukkit.getPluginManager().registerEvents(new jobListener(this), this);
        JobUtils.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }




    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if (!channel.equals("BungeeCord")) {
            return;
        }
        ByteArrayDataInput in = ByteStreams.newDataInput(message);
        String subchannel = in.readUTF();
    }

}
