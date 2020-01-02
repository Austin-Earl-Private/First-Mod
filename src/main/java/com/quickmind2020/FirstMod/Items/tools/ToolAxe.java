package com.quickmind2020.FirstMod.Items.tools;

import com.quickmind2020.FirstMod.Main;
import com.quickmind2020.FirstMod.init.ModItems;
import com.quickmind2020.FirstMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;

/**
 * @author Austin Earl
 */
public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(String name, ToolMaterial material) {
        super(material,6.0f, -3.2f);
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
