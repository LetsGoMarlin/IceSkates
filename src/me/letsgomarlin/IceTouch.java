package me.letsgomarlin;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class IceTouch implements Listener{
    @EventHandler
    public void onTouch(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        if (p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() == Material.ICE) {
            if (p.isSneaking()) {

            }

        }
    }
}
