package xyz.devgrill.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Warps {

    public static File f = new File("plugins/LobbySystem", "locations.yml");
    public static FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
    public static void setLocation(Location loc, String warpName, boolean direction) {
        cfg.set(warpName + ".world", loc.getWorld().getName());
        cfg.set(warpName + ".x", Integer. valueOf(loc.getBlockX()));
        cfg.set(warpName + ".y", Integer. valueOf(loc.getBlockY()));
        cfg.set(warpName + ".z", Integer. valueOf(loc.getBlockZ()));
        if (direction == true) {
            cfg.set(warpName + ".yaw", Float. valueOf(loc.getYaw()));
            cfg.set(warpName + ".pitch", Float.valueOf(loc.getPitch()));




        }
        savecfg();
    }

    public static Location getLocation(String warpName,boolean direction) {
        String w = (String) cfg.get(warpName + ".world");
        int x = (int) cfg.getInt(warpName + ".x");
        int y = (int) cfg.getInt(warpName + ".y");
        int z = (int) cfg.getInt(warpName + ".z");
        Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        if(direction == true) {
            float yaw = (float) cfg.getDouble(warpName + ".yaw");
            float pitch = (float) cfg.getDouble(warpName + ".pitch");
            loc.setPitch(yaw) ;
            loc.setPitch(pitch);
        }

        return loc;
    }

    public static void warpPlayer(Player p, String warpName){
        Location loc = getLocation(warpName, true);
        p.teleport(loc);
    }

    public static void savecfg(){
        try {
            cfg.save(f);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
