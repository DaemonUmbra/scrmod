package com.D_men27.RadioMod.items;

import com.D_men27.RadioMod.Main;
import com.D_men27.RadioMod.init.ModItems;
import com.D_men27.RadioMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item implements IHasModel {

	public ItemBase(String Name) {
		setUnlocalizedName(Name);
		setRegistryName(Main.MOD_ID,Name); //Adding your Mod ID is required, otherwise Minecraft takes ownership of your item
		setCreativeTab(CreativeTabs.MISC);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0,"inventory");
	}

}
