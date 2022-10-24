package xyz.devgrill.recorder;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import xyz.devgrill.utils.CreateItems;

public class Recorder {

    public static void toggleRecorder(Player p){
        CreateItems createItems = new CreateItems();
        p.getInventory().setItem(8, createItems.createItem(Material.GREEN_RECORD, 1, 0 ,"§gNur VIPs"));
    }

}
