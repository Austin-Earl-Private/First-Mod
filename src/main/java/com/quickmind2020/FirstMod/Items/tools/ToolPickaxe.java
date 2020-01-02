package com.quickmind2020.FirstMod.Items.tools;

import com.quickmind2020.FirstMod.Main;
import com.quickmind2020.FirstMod.init.ModItems;
import com.quickmind2020.FirstMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

/**
 * @author Austin Earl
 */
public class ToolPickaxe extends ItemPickaxe implements IHasModel {
    public ToolPickaxe(String name, ToolMaterial material) {
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

