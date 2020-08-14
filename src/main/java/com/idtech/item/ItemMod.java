package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class ItemMod {

	// Material
	public static Item.ToolMaterial GEL;

	// Tools
	public static ItemCustomArmor customHelm;
	public static ItemCustomArmor customChestplate;
	public static ItemCustomArmor customLeggings;
	public static ItemCustomArmor customBoots;
	public static ItemCustomSword customSword;
	public static ItemGelPickaxe itemGelPickaxe;

	public static void preInit(){

		// Materials
		GEL = EnumHelper.addToolMaterial("GEL", 3, 100, 4, 50, 0);

		// Tools
		customHelm = new ItemCustomArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.HEAD, "CustomHelm");
		customChestplate = new ItemCustomArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.CHEST, "CustomChestplate");
		customLeggings = new ItemCustomArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.LEGS, "CustomLeggings");
		customBoots = new ItemCustomArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.FEET, "CustomBoots");
		customSword = new ItemCustomSword();
		itemGelPickaxe = new ItemGelPickaxe();



	}

	public static void init(){

		// Register Item Renderers
		BaseMod.proxy.registerItemInventoryRender(customHelm, customHelm.name);
		BaseMod.proxy.registerItemInventoryRender(customChestplate, customChestplate.name);
		BaseMod.proxy.registerItemInventoryRender(customLeggings, customLeggings.name);
		BaseMod.proxy.registerItemInventoryRender(customBoots, customBoots.name);
		BaseMod.proxy.registerItemInventoryRender(customSword, customSword.name);
		BaseMod.proxy.registerItemInventoryRender(itemGelPickaxe, itemGelPickaxe.name);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		// Register Items
		event.getRegistry().register(customHelm.setRegistryName(customHelm.name));
		event.getRegistry().register(customChestplate.setRegistryName(customChestplate.name));
		event.getRegistry().register(customLeggings.setRegistryName(customLeggings.name));
		event.getRegistry().register(customBoots.setRegistryName(customBoots.name));
		event.getRegistry().register(customSword.setRegistryName(customSword.name));
		event.getRegistry().register(itemGelPickaxe.setRegistryName(itemGelPickaxe.name));
	}
}