package Items;

import net.minecraft.server.v1_8_R3.ItemStack;
import net.minecraft.server.v1_8_R3.NBTBase;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftItem;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MakeItem {
    public static org.bukkit.inventory.ItemStack makeItem(Material itemMaterial, String itemName, String[] itemLore, HashMap<String,Object> nbts){
        org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(itemMaterial);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(itemName);
        List<String> lore = new ArrayList<>();
        for(String i:itemLore) lore.add(i);


        meta.setLore(lore);
        ItemStack nmsVers = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = (nmsVers.hasTag())? nmsVers.getTag() : new NBTTagCompound();
        for(String i:nbts.keySet()){
            Object cur = nbts.get(i);
            compound.set(i, (NBTBase) cur);

        }
        nmsVers.setTag(compound);
        org.bukkit.inventory.ItemStack refined = CraftItemStack.asBukkitCopy(nmsVers);
        return refined;


    }
}
