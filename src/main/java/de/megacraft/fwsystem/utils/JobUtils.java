package de.megacraft.fwsystem.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.*;

public class JobUtils {


    public static Map<Material, Integer> minerBlocks;
    public static Map<Material, Integer> graeberBlocks;
    public static Map<Material, Integer> holzfaellerBlocks;


    public static void init() {
        addMinerBlocks();
        addGraeberBlocks();
        addHolzfaellerBlocks();
    }



    private static void addMinerBlocks() {
        minerBlocks = new HashMap<>();
        minerBlocks.put(Material.STONE, (int) 0.1);
        minerBlocks.put(Material.ANDESITE, (int) 0.2);
        minerBlocks.put(Material.GRANITE, (int) 0.2);
        minerBlocks.put(Material.DIORITE, (int) 0.2);
        minerBlocks.put(Material.DEEPSLATE, (int) 0.2);
        minerBlocks.put(Material.TUFF, (int) 0.2);
        minerBlocks.put(Material.COAL_ORE, 3);
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
        minerBlocks.put(Material.DEEPSLATE_COAL_ORE, 40);
        minerBlocks.put(Material.NETHERRACK, 1);
        minerBlocks.put(Material.NETHER_GOLD_ORE, 5);
        minerBlocks.put(Material.NETHER_QUARTZ_ORE, 5);
        minerBlocks.put(Material.END_STONE, 1);
    }

    private static void addGraeberBlocks() {
        graeberBlocks = new HashMap<>();
        graeberBlocks.put(Material.DIRT, (int) 0.1);
        graeberBlocks.put(Material.DIRT_PATH, 2);
        graeberBlocks.put(Material.GRASS_BLOCK, (int) 0.1);
        graeberBlocks.put(Material.SAND, 1);
        graeberBlocks.put(Material.RED_SAND, 2);
        graeberBlocks.put(Material.GRAVEL, 1);
        graeberBlocks.put(Material.CLAY, (int) 1.5);
    }

    private static void addHolzfaellerBlocks() {
        holzfaellerBlocks = new HashMap<>();
        holzfaellerBlocks.put(Material.ACACIA_LOG, 2);
        holzfaellerBlocks.put(Material.STRIPPED_ACACIA_LOG, 2);
        holzfaellerBlocks.put(Material.BIRCH_LOG, 1);
        holzfaellerBlocks.put(Material.STRIPPED_BIRCH_LOG, 1);
        holzfaellerBlocks.put(Material.DARK_OAK_LOG, 2);
        holzfaellerBlocks.put(Material.STRIPPED_DARK_OAK_LOG, 2);
        holzfaellerBlocks.put(Material.OAK_LOG, 1);
        holzfaellerBlocks.put(Material.STRIPPED_OAK_LOG, 1);
        holzfaellerBlocks.put(Material.SPRUCE_LOG, 1);
        holzfaellerBlocks.put(Material.STRIPPED_SPRUCE_LOG, 1);
        holzfaellerBlocks.put(Material.JUNGLE_LOG, 2);
        holzfaellerBlocks.put(Material.STRIPPED_JUNGLE_LOG, 2);
        holzfaellerBlocks.put(Material.MANGROVE_LOG, 2);
        holzfaellerBlocks.put(Material.STRIPPED_MANGROVE_LOG, 2);
        holzfaellerBlocks.put(Material.CHERRY_LOG, 3);
        holzfaellerBlocks.put(Material.STRIPPED_CHERRY_LOG, 3);
        holzfaellerBlocks.put(Material.BAMBOO_BLOCK, 3);
        holzfaellerBlocks.put(Material.STRIPPED_BAMBOO_BLOCK, 3);
        holzfaellerBlocks.put(Material.CRIMSON_STEM, 3);
        holzfaellerBlocks.put(Material.STRIPPED_CRIMSON_STEM, 3);
        holzfaellerBlocks.put(Material.WARPED_STEM, 3);
        holzfaellerBlocks.put(Material.STRIPPED_WARPED_STEM, 3);
    }

    public static Map<Material, Integer> getMinerBlocks() {
        return minerBlocks;
    }
    public static Map<Material, Integer> getGraeberBlocks() {
        return graeberBlocks;
    }
    public static Map<Material, Integer> getHolzfaellerBlocks() {
        return holzfaellerBlocks;
    }

}
