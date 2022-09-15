package me.notlewx.eventstest2.listeners;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPistonExtendEvent;

public class PistonMoveEvent implements Listener {
    @EventHandler
    public static void onPistonExtend(BlockPistonExtendEvent e) {
        e.setCancelled(true);
    }

}
