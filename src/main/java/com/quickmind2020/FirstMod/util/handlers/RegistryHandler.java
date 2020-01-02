package com.quickmind2020.FirstMod.util.handlers;

import com.quickmind2020.FirstMod.init.ModBlocks;
import com.quickmind2020.FirstMod.init.ModItems;
import com.quickmind2020.FirstMod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author Austin Earl
 */
@Mod.EventBusSubscriber
public class RegistryHandler  {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item: ModItems.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel) item).registerModels();
            }
        }
        for(Block block: ModBlocks.BLOCKS){
            if(block instanceof IHasModel){
                ((IHasModel) block).registerModels();
            }
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

}
