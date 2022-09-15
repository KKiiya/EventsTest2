package me.notlewx.eventstest2.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {
    @EventHandler
    @Deprecated
    public static void onBlockBreakEvent(BlockBreakEvent e){
        Player p = e.getPlayer();
        String c = e.getPlayer().getName();
        Location l = p.getLocation();
        Material b = p.getTargetBlock(null, 999999).getType();
        String d = String.valueOf(b);
        p.sendTitle(ChatColor.GOLD + "YOU BROKE A BLOCK", ChatColor.YELLOW + "Block name: " + d.toLowerCase().replace("_", " "));
        System.out.println("The player " + c + "broke the block " + d.toLowerCase().replace("_", " "));
        p.playSound(l, Sound.BLOCK_NOTE_PLING, 1, 1);
    }
}
