package com.quickmind2020.FirstMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Austin Earl
 */
public class ModRecipes {

    public static void init(){
        GameRegistry.addSmelting(ModItems.RUBY,new ItemStack(ModBlocks.RUBY_BLOCK,1),10.5f);
        GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK,new ItemStack(Blocks.DIAMOND_BLOCK,1),10f);
    }
}
