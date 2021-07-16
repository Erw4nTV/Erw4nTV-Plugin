package fr.erw4ntv.pluginlife;

import fr.erw4ntv.pluginlife.commands.CommandBc;
import fr.erw4ntv.pluginlife.commands.Commandfly;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        System.out.print("Plugin On");

        commands();

    }

    @Override
    public void onDisable() {
        super.onDisable();
        System.out.print("Plugin Off");
    }

    private void commands() {
        getCommand("bc").setExecutor(new CommandBc());
        getCommand("fly").setExecutor(new Commandfly());
    }

}
