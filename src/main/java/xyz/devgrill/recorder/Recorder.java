package xyz.devgrill.recorder;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import xyz.devgrill.utils.CreateItems;

import java.util.ArrayList;
import java.util.List;

public class Recorder {

    private List<String> players = new ArrayList<>();

    public List<String> getPlayers(){
        return this.players;
    }


    public void toggleRecorder(Player p){
        CreateItems createItems = new CreateItems();
        if(p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§gAlle Spieler")){
            p.setItemInHand(createItems.createItem(Material.RECORD_9, 1, 0 ,"§gKeine Spieler"));
            for (Player online : Bukkit.getOnlinePlayers()) {
                p.hidePlayer(online);
            }
            players.add(p.getName());
            p.sendMessage("§4Alle spieler wurden versteckt.");
        }else{
            p.setItemInHand(createItems.createItem(Material.GREEN_RECORD, 1, 0 ,"§gAlle Spieler"));
            for (Player online : Bukkit.getOnlinePlayers()) {
                p.showPlayer(online);
            }
            players.remove(p.getName());
            p.sendMessage("§aAlle spieler werden dir angezeigt.");
        }
    }

}
