package net.itsrelizc.industrial;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import net.itsrelizc.workblocks.BasicWorkBlock;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        System.out.println("[RSIndustrial] SMP-Industrial enabled");
        
        BasicWorkBlock work = new BasicWorkBlock(new Location(Bukkit.getWorld("world"), 0, 63, 0));
        
        
    }

}
