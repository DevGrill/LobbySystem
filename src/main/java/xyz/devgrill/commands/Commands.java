package xyz.devgrill.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.devgrill.utils.Warps;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label , String[] args) {
        if(s instanceof Player){
        Player p = (Player) s;
        Warps.setLocation(p.getLocation(), args[0], true);
        p.sendMessage("Du hast den Warp: " + args[0] + "   gesetzt.");
        }
        return false;
    }
}
