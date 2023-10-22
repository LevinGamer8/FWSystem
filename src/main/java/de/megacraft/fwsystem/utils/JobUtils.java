package de.megacraft.fwsystem.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.*;

public class JobUtils {


    public static Map<Material, Double> minerBlocks;
    public static Map<Material, Double> graeberBlocks;
    public static Map<Material, Double> holzfaellerBlocks;


    public static void init() {
        addMinerBlocks();
        addGraeberBlocks();
        addHolzfaellerBlocks();
    }



    private static void addMinerBlocks() {
        minerBlocks = new HashMap<>();
        minerBlocks.put(Material.STONE, 0.1);
        minerBlocks.put(Material.ANDESITE, 0.2);
        minerBlocks.put(Material.GRANITE, 0.2);
        minerBlocks.put(Material.DIORITE, 0.2);
        minerBlocks.put(Material.DEEPSLATE, 0.2);
        minerBlocks.put(Material.TUFF, 0.2);
        minerBlocks.put(Material.COAL_ORE, 3.0);
        minerBlocks.put(Material.COPPER_ORE, 6.0);
        minerBlocks.put(Material.REDSTONE_ORE, 8.0);
        minerBlocks.put(Material.LAPIS_ORE, 8.0);
        minerBlocks.put(Material.IRON_ORE, 10.0);
        minerBlocks.put(Material.GOLD_ORE, 12.0);
        minerBlocks.put(Material.DIAMOND_ORE, 15.0);
        minerBlocks.put(Material.EMERALD_ORE, 18.0);
        minerBlocks.put(Material.DEEPSLATE_COPPER_ORE, 12.0);
        minerBlocks.put(Material.DEEPSLATE_REDSTONE_ORE, 16.0);
        minerBlocks.put(Material.DEEPSLATE_LAPIS_ORE, 16.0);
        minerBlocks.put(Material.DEEPSLATE_IRON_ORE, 20.0);
        minerBlocks.put(Material.DEEPSLATE_GOLD_ORE, 24.0);
        minerBlocks.put(Material.DEEPSLATE_DIAMOND_ORE, 30.0);
        minerBlocks.put(Material.DEEPSLATE_EMERALD_ORE, 36.0);
        minerBlocks.put(Material.DEEPSLATE_COAL_ORE, 40.0);
        minerBlocks.put(Material.NETHERRACK, 0.1);
        minerBlocks.put(Material.NETHER_GOLD_ORE, 1.0);
        minerBlocks.put(Material.NETHER_QUARTZ_ORE, 1.0);
        minerBlocks.put(Material.END_STONE, 0.1);
    }

    private static void addGraeberBlocks() {
        graeberBlocks = new HashMap<>();
        graeberBlocks.put(Material.DIRT, 0.1);
        graeberBlocks.put(Material.DIRT_PATH, 0.2);
        graeberBlocks.put(Material.GRASS_BLOCK, 0.1);
        graeberBlocks.put(Material.SAND, 0.2);
        graeberBlocks.put(Material.RED_SAND, 0.2);
        graeberBlocks.put(Material.GRAVEL, 0.2);
        graeberBlocks.put(Material.CLAY, 0.5);
    }

    private static void addHolzfaellerBlocks() {
        holzfaellerBlocks = new HashMap<>();
        holzfaellerBlocks.put(Material.ACACIA_LOG, 2.0);
        holzfaellerBlocks.put(Material.STRIPPED_ACACIA_LOG, 2.0);
        holzfaellerBlocks.put(Material.BIRCH_LOG, 1.0);
        holzfaellerBlocks.put(Material.STRIPPED_BIRCH_LOG, 1.0);
        holzfaellerBlocks.put(Material.DARK_OAK_LOG, 2.0);
        holzfaellerBlocks.put(Material.STRIPPED_DARK_OAK_LOG, 2.0);
        holzfaellerBlocks.put(Material.OAK_LOG, 1.0);
        holzfaellerBlocks.put(Material.STRIPPED_OAK_LOG, 1.0);
        holzfaellerBlocks.put(Material.SPRUCE_LOG, 1.0);
        holzfaellerBlocks.put(Material.STRIPPED_SPRUCE_LOG, 1.0);
        holzfaellerBlocks.put(Material.JUNGLE_LOG, 2.0);
        holzfaellerBlocks.put(Material.STRIPPED_JUNGLE_LOG, 2.0);
        holzfaellerBlocks.put(Material.MANGROVE_LOG, 2.0);
        holzfaellerBlocks.put(Material.STRIPPED_MANGROVE_LOG, 2.0);
        holzfaellerBlocks.put(Material.CHERRY_LOG, 3.0);
        holzfaellerBlocks.put(Material.STRIPPED_CHERRY_LOG, 3.0);
        holzfaellerBlocks.put(Material.BAMBOO_BLOCK, 3.0);
        holzfaellerBlocks.put(Material.STRIPPED_BAMBOO_BLOCK, 3.0);
        holzfaellerBlocks.put(Material.CRIMSON_STEM, 3.0);
        holzfaellerBlocks.put(Material.STRIPPED_CRIMSON_STEM, 3.0);
        holzfaellerBlocks.put(Material.WARPED_STEM, 3.0);
        holzfaellerBlocks.put(Material.STRIPPED_WARPED_STEM, 3.0);
    }

    public static Map<Material, Double> getMinerBlocks() {
        return minerBlocks;
    }
    public static Map<Material, Double> getGraeberBlocks() {
        return graeberBlocks;
    }
    public static Map<Material, Double> getHolzfaellerBlocks() {
        return holzfaellerBlocks;
    }

}
