package fr.erw4ntv.pluginlife.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandBc implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (strings.length < 1) {
                sender.sendMessage("§c§l[Erreur] §c Vous devez renseigner un message.");
                return false;
            }
        }


        String message = " ";
        for (int i = 0; i < strings.length; i++)
            message += strings[i] + " ";
        Bukkit.broadcastMessage("§7§l[§3§lBroadcast§7§l]§c" + message);


                return true;
    }
}
