package xyz.devgrill.teleporter;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import xyz.devgrill.utils.CreateItems;

public class Teleporter {

    public static void createTeleporter(Player p){
        CreateItems createItems = new CreateItems();
        Inventory inv = Bukkit.createInventory(null, 3 * 9, "Navigation");
        inv.setItem(9, createItems.createItem(Material.GRASS, 1, 0 ,"§2Farmwelt"));
        inv.setItem(17, createItems.createItem(Material.NETHER_STAR, 1, 0 ,"§4Nether"));
        p.openInventory(inv);
    }

}
