package com.quickmind2020.FirstMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * @author Austin Earl
 */
public class RubyBlock extends  BlockBase {
    public RubyBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe",2);
        setLightLevel(0.9f);

    }
}
