package me.notlewx.eventstest2.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    @Deprecated
    public static void onJoin(PlayerJoinEvent e){
        Player p = (Player) e.getPlayer();
        String message = ChatColor.AQUA + "THIS IS A BOSSBAR TEST :)";

        BarColor color = BarColor.GREEN;
        BarStyle style = BarStyle.SOLID;
        BossBar bar = Bukkit.createBossBar(message, color, style);
        bar.setVisible(true);
        bar.addPlayer(p);
    }
}
