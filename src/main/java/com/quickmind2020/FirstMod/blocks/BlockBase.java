package com.quickmind2020.FirstMod.blocks;

import com.quickmind2020.FirstMod.Main;
import com.quickmind2020.FirstMod.init.ModBlocks;
import com.quickmind2020.FirstMod.init.ModItems;
import com.quickmind2020.FirstMod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * @author Austin Earl
 */
public class BlockBase extends Block implements IHasModel{
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0 ,"inventory");
    }
}
