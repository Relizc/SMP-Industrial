package net.itsrelizc.industrial;

import Commands.IndustrialGive;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        System.out.println("[RSIndustrial] SMP-Industrial enabled");
        getCommand("industrialgive").setExecutor(new IndustrialGive());
    }

}
