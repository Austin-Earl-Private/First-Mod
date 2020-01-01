package com.quickmind2020.FirstMod.Items;

import com.quickmind2020.FirstMod.Main;
import com.quickmind2020.FirstMod.init.ModItems;
import com.quickmind2020.FirstMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author Austin Earl
 */
public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name ) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0 , "inventory");
    }
}
