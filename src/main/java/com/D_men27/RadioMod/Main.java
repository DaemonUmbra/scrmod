package com.D_men27.RadioMod;

import com.D_men27.RadioMod.init.ModItems;
import com.D_men27.RadioMod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MOD_ID,name = Main.NAME,version = Main.VERSION, acceptedMinecraftVersions = Main.ACCEPTED_VERSIONS)
public class Main {
	public static final String MOD_ID = "scrmod";
	public static final String NAME = "Radio Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	public static final String CLIENT_PROXY_CLASS = "com.D_men27.RadioMod.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.D_men27.RadioMod.proxy.CommonProxy";
	
	@Instance
	public static Main Instance;
	
	@SidedProxy(clientSide = Main.CLIENT_PROXY_CLASS, serverSide = Main.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {
	
}
}
