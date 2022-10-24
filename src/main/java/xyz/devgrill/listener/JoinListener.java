package xyz.devgrill.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.devgrill.recorder.Recorder;
import xyz.devgrill.utils.AddItems;

import java.util.List;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        AddItems.addItems(p);
        e.setJoinMessage(p.getDisplayName() + " Ist dem Netzwerk beigetreten.");

        Recorder recorder = new Recorder();
        List<String> players = recorder.getPlayers();

        for (String p2name : players){
            Player p2 = Bukkit.getPlayer(p2name);
            if(p2 != null)
                p2.hidePlayer(p);
        }
    }

}
