package me.notlewx.eventstest2;

import me.notlewx.eventstest2.listeners.BlockBreak;
import me.notlewx.eventstest2.listeners.InventoryOpen;
import me.notlewx.eventstest2.listeners.PistonMoveEvent;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Eventstest2 extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled correctly");

        getServer().getPluginManager().registerEvents((Listener) new InventoryOpen(), this);
        getServer().getPluginManager().registerEvents((Listener) new PistonMoveEvent(), this);
        getServer().getPluginManager().registerEvents((Listener) new BlockBreak(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled correctly");
    }
}
