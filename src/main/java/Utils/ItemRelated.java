package Utils;

import Items.MakeItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import Utils.ItemRelated;

import java.util.HashMap;
import java.util.Map;

public class ItemRelated {
    public static <HashMap> ItemStack getItemStack(String name){
        switch(name.toLowerCase()){
            case "steamgenerator":
                java.util.HashMap<String, Object> map= new java.util.HashMap<String,Object>();
                map.put("type",1);
                map.put("id",1);

                return MakeItem.makeItem(Material.FURNACE,"Steam Generator",
                        new String[]{"generates steam"}, map);
            default : return null;
        }
    }
}
