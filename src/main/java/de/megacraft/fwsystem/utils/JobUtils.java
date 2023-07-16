package de.megacraft.fwsystem.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.*;

public class JobUtils {

    public static Map<UUID, String> playerJobs = new HashMap<>();

    public static Map<Material, Integer> minerBlocks;

    static {
        minerBlocks = new HashMap<>();
        minerBlocks.put(Material.STONE, 1);
        minerBlocks.put(Material.ANDESITE, 1);
        minerBlocks.put(Material.GRANITE, 1);
        minerBlocks.put(Material.DIORITE, 1);
        minerBlocks.put(Material.DEEPSLATE, 1);
        minerBlocks.put(Material.TUFF, 1);
        minerBlocks.put(Material.COPPER_ORE, 6);
        minerBlocks.put(Material.REDSTONE_ORE, 8);
        minerBlocks.put(Material.LAPIS_ORE, 8);
        minerBlocks.put(Material.IRON_ORE, 10);
        minerBlocks.put(Material.GOLD_ORE, 12);
        minerBlocks.put(Material.DIAMOND_ORE, 15);
        minerBlocks.put(Material.EMERALD_ORE, 18);
        minerBlocks.put(Material.DEEPSLATE_COPPER_ORE, 12);
        minerBlocks.put(Material.DEEPSLATE_REDSTONE_ORE, 16);
        minerBlocks.put(Material.DEEPSLATE_LAPIS_ORE, 16);
        minerBlocks.put(Material.DEEPSLATE_IRON_ORE, 20);
        minerBlocks.put(Material.DEEPSLATE_GOLD_ORE, 24);
        minerBlocks.put(Material.DEEPSLATE_DIAMOND_ORE, 30);
        minerBlocks.put(Material.DEEPSLATE_EMERALD_ORE, 36);
    }

    public static void setJob(String job, Player p) {
        playerJobs.put(p.getUniqueId(), job);
    }

    public static String getJob(Player p) {
        UUID uuid = p.getUniqueId();
        if (hasJob(p)) {
            return playerJobs.get(uuid);
        }
        return null;
    }

    public static boolean hasJob(Player p) {
        UUID uuid = p.getUniqueId();
        return playerJobs.containsKey(uuid);
    }

    public static Map<Material, Integer> getMinerBlocks() {
        return minerBlocks;
    }


}
