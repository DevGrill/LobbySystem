package xyz.devgrill.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.devgrill.utils.AddItems;

import java.util.List;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player p = e.getPlayer();
        AddItems.addItems(p);
        e.setQuitMessage(p.getDisplayName() + " Hat das Netzwerk verlassen.");
    }

}
