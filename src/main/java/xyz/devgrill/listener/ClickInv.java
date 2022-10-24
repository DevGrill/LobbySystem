package xyz.devgrill.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.devgrill.teleporter.Teleporter;
import xyz.devgrill.utils.CreateItems;
import xyz.devgrill.utils.Warps;

public class ClickInv implements Listener {

    @EventHandler
    public void onCLickLobbySystem(PlayerInteractEvent e){
        Player p = (Player) e.getPlayer();
        if(p.getItemInHand().getType() == Material.COMPASS){
            Teleporter.createTeleporter(p);
        }

        if(p.getItemInHand().getType() == Material.GREEN_RECORD){

        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        Inventory inv = p.getInventory();
        if(e.getClickedInventory() != null){
            if(e.getClickedInventory() == inv){
                e.setCancelled(true);
            }
            if(e.getView().getTitle().equals("Navigation")){
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Farmwelt")){
                    Warps.warpPlayer(p, "Farmwelt");
                }
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§4Nether")){
                    Warps.warpPlayer(p, "Nether");
                }
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        e.setCancelled(true);
    }
}
