package xyz.devgrill.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class AddItems {
    public static void addItems(Player p){
        p.getInventory().clear();
        p.getInventory().setArmorContents(null);
        for (PotionEffect pe : p.getActivePotionEffects()){
            p.removePotionEffect(pe.getType());
        }
        CreateItems createItems = new CreateItems();
        p.getInventory().setItem(1, createItems.createItem(Material.COMPASS, 1, 0 ,"§bTeleporter"));
        p.getInventory().setItem(8, createItems.createItem(Material.GREEN_RECORD, 1, 0 ,"§gAlle Spieler"));
    }
}
