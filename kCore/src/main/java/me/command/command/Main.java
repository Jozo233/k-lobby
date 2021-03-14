package me.command.command;

import me.command.command.commands.ClearCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

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
