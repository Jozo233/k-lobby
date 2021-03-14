package me.klobby.me.klobby.Me;

import me.klobby.me.klobby.Me.commands.ClearCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginCommand("clear").setExecutor(new ClearCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
