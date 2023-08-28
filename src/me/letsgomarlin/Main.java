package me.letsgomarlin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void OnEnable (){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new IceTouch(), this);

    }

    public void onDisable (){

    }
}
