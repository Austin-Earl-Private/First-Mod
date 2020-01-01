package com.quickmind2020.FirstMod;

import com.quickmind2020.FirstMod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.quickmind2020.FirstMod.util.Reference.*;

@Mod(modid=MOD_ID,name =NAME, version = VERSION)
public class Main {
    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS,serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }
}
