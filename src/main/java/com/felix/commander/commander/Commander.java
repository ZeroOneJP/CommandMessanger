//Copyright 2021 ZeroOne\\
package com.felix.commander.commander;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commander extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Commander Started");
        Bukkit.getPluginManager().registerEvents(this, this);
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Commander Stopped");
    }


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cm1 = this.getConfig().getString("Command1");
        String cm1m = this.getConfig().getString("Command1M");
        String cm2 = this.getConfig().getString("Command2");
        String cm2m = this.getConfig().getString("Command2M");
        String cm3 = this.getConfig().getString("Command3");
        String cm3m = this.getConfig().getString("Command3M");
        String cm4 = this.getConfig().getString("Command4");
        String cm4m = this.getConfig().getString("Command4M");
        String cm5 = this.getConfig().getString("Command5");
        String cm5m = this.getConfig().getString("Command5M");
        if (cmd.getName().equals(cm1)) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(cm1m);
            }
        }
        if (cmd.getName().equals(cm2)) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(cm2m);
            }
        }
        if (cmd.getName().equals(cm3)) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(cm3m);
            }
        }
        if (cmd.getName().equals(cm4)) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(cm4m);
                }
            }
        if (cmd.getName().equals(cm5)) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(cm5m);
            }
        }
    return false;
    }

}