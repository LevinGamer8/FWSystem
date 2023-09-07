package de.megacraft.fwsystem.listeners;

import de.megacraft.fwsystem.utils.JobUtils;
import de.megaessentialsrecode.utils.DataBase;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public class jobListener implements Listener {

    private static final String PLAYER_PLACED_METADATA_KEY = "player-placed";

    private final Plugin plugin;

    public jobListener(Plugin plugin) {
        this.plugin = plugin;
    }



    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Block brokenBlock = event.getBlock();
        if (!(isPlayerPlacedBlock(brokenBlock))) {
                if (JobUtils.getMinerBlocks().containsKey(brokenBlock.getType())) {
                    int economyAmount = JobUtils.getMinerBlocks().get(brokenBlock.getType());
                    DataBase.addEconomy(player, economyAmount);
                }
            if (JobUtils.getGraeberBlocks().containsKey(brokenBlock.getType())) {
                int economyAmount = JobUtils.getGraeberBlocks().get(brokenBlock.getType());
                DataBase.addEconomy(player, economyAmount);
            }
            if (JobUtils.getHolzfaellerBlocks().containsKey(brokenBlock.getType())) {
                int economyAmount = JobUtils.getHolzfaellerBlocks().get(brokenBlock.getType());
                DataBase.addEconomy(player, economyAmount);
            }
        }
        }


    private boolean isPlayerPlacedBlock(Block block) {
        for (MetadataValue metadata : block.getMetadata(PLAYER_PLACED_METADATA_KEY)) {
            if (metadata.value() instanceof Boolean && metadata.asBoolean()) {
                return true;
            }
        }
        return false;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        markAsPlayerPlaced(plugin, e.getBlock());
    }

    private void markAsPlayerPlaced(Plugin plugin, Block block) {
        block.setMetadata(PLAYER_PLACED_METADATA_KEY, new FixedMetadataValue(plugin, true));
    }
}