package me.command.command.commands;

import me.command.command.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ClearCommand implements CommandExecutor {
    private final Main main;

    public ClearCommand(Main main) {
        this.main = main;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.isOp() || player.hasPermission("ClearInventory")) {
                Inventory inv = player.getInventory();
                inv.clear();

                player.sendMessage(ChatColor.GREEN + "Vše z tvého inv je pryč");

                return true;
            } else {
                player.sendMessage(ChatColor.RED + "Nemáš práva");
                return true;
            }

        } else {
            main.getLogger().info("Vše z tvého inv je pryč");
            return true;
        }
    }
}
