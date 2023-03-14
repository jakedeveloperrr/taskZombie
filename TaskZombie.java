package dev.jake.taskzombie;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class TaskZombie extends JavaPlugin {

    public static Plugin instance;

    public static Plugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("Plugin ZombieEquipment - ON");
        getServer().getPluginManager().registerEvents(new ZombieStat(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin ZombieEquipment - ON");
    }
}
