package com.quickmind2020.FirstMod.Items.armor;

import com.quickmind2020.FirstMod.Main;
import com.quickmind2020.FirstMod.init.ModItems;
import com.quickmind2020.FirstMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * @author Austin Earl
 */
public class ArmorBase extends ItemArmor implements IHasModel {
    public ArmorBase(String name, ArmorMaterial armorMaterial, int renderIndex, EntityEquipmentSlot entityEquipmentSlots) {
        super(armorMaterial,renderIndex,entityEquipmentSlots);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0 , "inventory");
    }
}
