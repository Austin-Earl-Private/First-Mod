package com.quickmind2020.FirstMod.Items.tools;

import com.quickmind2020.FirstMod.Main;
import com.quickmind2020.FirstMod.init.ModItems;
import com.quickmind2020.FirstMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

/**
 * @author Austin Earl
 */
public class ToolSpade extends ItemSpade implements IHasModel {
    public ToolSpade(String name, Item.ToolMaterial material) {
        super(material);
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

