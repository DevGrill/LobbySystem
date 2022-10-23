package xyz.devgrill.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CreateItems {

    public ItemStack createItem(Material material, int amount, int id, String DPName){
        ItemStack i = new ItemStack(material, amount, (short)id);
        ItemMeta itemMeta = i.getItemMeta();
        itemMeta.setDisplayName(DPName);
        i.setItemMeta(itemMeta);
        return i;
    }

}
