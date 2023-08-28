package me.letsgomarlin;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class IceTouch implements Listener{
    @EventHandler
    public void onTouch(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        if (p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() == Material.ICE) {
            if (p.isSneaking()) {
                p.setVelocity(new Vector(p.getLocation().getDirection().multiply(0.4).getX(), 0.0D, p.getLocation().getDirection().multiply(0.4).getZ()));
            }
        }
    }
}
