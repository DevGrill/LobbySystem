package xyz.devgrill.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import xyz.devgrill.utils.Warps;

public class Navigation {

    @EventHandler
    public void onTeleport(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory() != null) {
            if (e.getClickedInventory().getTitle().contains("Navigation")) {
                e.setCancelled(true);
                if (e.getCurrentItem().getItemMeta().getDisplayName() != null) {
                    String name = e.getCurrentItem().getItemMeta().getDisplayName();
                    Warps.warpPlayer(p, name);
                }
            }
        }
    }
}