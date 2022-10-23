package xyz.devgrill.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.devgrill.utils.AddItems;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        AddItems.addItems(p);
        e.setJoinMessage(p.getDisplayName() + " Ist dem Netzwerk beigetreten.");
    }

}
