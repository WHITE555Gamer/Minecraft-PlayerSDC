package com.github.white555gamer.playersdc;

import com.github.white555gamer.playersdc.assets.commands.PlayerSDCC;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerSDC extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PlayerSDC Enabled...");
        getServer().broadcastMessage("PlayerSDC Enabled...");

        getCommand("playersdc").setExecutor(new PlayerSDCC());
    }

    @Override
    public void onDisable() {
        getLogger().info("PlayerSDC Disabled...");
        getServer().broadcastMessage("PlayerSDC Disabled...");
    }

    @Override
    public void onLoad() {
        getLogger().info("PlayerSDC Loaded...");
        getServer().broadcastMessage("PlayerSDC Loaded...");
    }
}
