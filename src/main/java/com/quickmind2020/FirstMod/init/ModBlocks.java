package com.quickmind2020.FirstMod.init;

import com.quickmind2020.FirstMod.blocks.BlockBase;

import com.quickmind2020.FirstMod.blocks.RubyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Austin Earl
 */
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
}
