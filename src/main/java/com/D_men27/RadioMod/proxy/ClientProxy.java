package com.D_men27.RadioMod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

public void registerItemRenderer(Item item, int meta, String id) {
		System.out.println("Attempting to register render for: " + item.getRegistryName());
	ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
