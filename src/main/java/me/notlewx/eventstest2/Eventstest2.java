package me.notlewx.eventstest2;

import me.notlewx.eventstest2.listeners.BlockBreak;
import me.notlewx.eventstest2.listeners.InventoryOpen;
import me.notlewx.eventstest2.listeners.JoinEvent;
import me.notlewx.eventstest2.listeners.PistonMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Eventstest2 extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled correctly");

        getServer().getPluginManager().registerEvents(new InventoryOpen(), this);
        getServer().getPluginManager().registerEvents(new PistonMoveEvent(), this);
        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled correctly");
    }
}
