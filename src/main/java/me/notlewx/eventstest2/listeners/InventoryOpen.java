package me.notlewx.eventstest2.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.ChatColor;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class InventoryOpen implements Listener {
    @EventHandler
    @Deprecated
    public void onInventoryOpenEvent(InventoryOpenEvent e) {
        HumanEntity p = e.getPlayer();
        Material b = p.getTargetBlock(null, 999999).getType();
        String c = String.valueOf(b);
        String message = ChatColor.GOLD + "You opened a " + c.toLowerCase().replace("_", " ");
        p.sendMessage(message);
    }
}
