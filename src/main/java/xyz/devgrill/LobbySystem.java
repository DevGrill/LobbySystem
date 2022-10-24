package xyz.devgrill;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.devgrill.commands.Commands;
import xyz.devgrill.listener.ClickInv;
import xyz.devgrill.listener.JoinListener;
import xyz.devgrill.listener.QuitListener;

import java.util.ArrayList;
import java.util.List;

public class LobbySystem extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getServer().getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
        pluginManager.registerEvents(new ClickInv(), this);
        this.getCommand("setwarp").setExecutor(new Commands());
    }
}
