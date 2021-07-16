package fr.erw4ntv.pluginlife.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandfly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if(player.getAllowFlight() == false) {
                player.setAllowFlight(true);
                player.sendMessage("§7§l[§3§lErw4nTV§7§l] §7Le fly est désormais activer");
            } else {
                player.setAllowFlight(false);
                player.sendMessage("§7§l[§3§lErw4nTV§7§l] §7Le fly est désormais désactiver");
            }

        }


        return true;
    }
}
