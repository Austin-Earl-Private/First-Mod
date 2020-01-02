package com.quickmind2020.FirstMod.init;

import com.quickmind2020.FirstMod.Items.ItemBase;
import com.quickmind2020.FirstMod.Items.armor.ArmorBase;
import com.quickmind2020.FirstMod.Items.tools.*;
import com.quickmind2020.FirstMod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Austin Earl
 */
public class ModItems {
    //materials
    public static final Item.ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby",3,1532,7.5f,2.5f,10);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby",
            Reference.MOD_ID+":ruby",14,new int[]{3,6,8,2},16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,0.0f)
    //items
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item RUBY = new ItemBase("ruby");
    //tools
    public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
    public static final ItemSpade RUBY_SPADE = new ToolSpade("ruby_spade",MATERIAL_RUBY);
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe",MATERIAL_RUBY);
    public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe",MATERIAL_RUBY);
    public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe",MATERIAL_RUBY);

    //Armor
    public static final ItemArmor RUBY_HELMET = new ArmorBase("ruby_helmet",ARMOR_MATERIAL_RUBY,1,EntityEquipmentSlot.HEAD);
    public static final ItemArmor RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate",ARMOR_MATERIAL_RUBY,1,EntityEquipmentSlot.CHEST);
    public static final ItemArmor RUBY_LEGGINGS = new ArmorBase("ruby_leggings",ARMOR_MATERIAL_RUBY,2,EntityEquipmentSlot.LEGS);
    public static final ItemArmor RUBY_BOOTS = new ArmorBase("ruby_boots",ARMOR_MATERIAL_RUBY,1,EntityEquipmentSlot.FEET);

}
