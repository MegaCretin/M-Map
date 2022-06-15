package fr.megacretin.custommap;

import fr.megacretin.custommap.commands.ImageCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("map").setExecutor(new ImageCommand());

    }

    @Override
    public void onDisable() {

    }
}
