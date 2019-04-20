package biofan.oresmod.init;

import java.util.ArrayList;
import java.util.List;

import biofan.oresmod.Main;
import biofan.oresmod.items.ItemBase;
import biofan.oresmod.items.armor.ArmorBase;
import biofan.oresmod.items.tools.ToolAxe;
import biofan.oresmod.items.tools.ToolHoe;
import biofan.oresmod.items.tools.ToolPickaxe;
import biofan.oresmod.items.tools.ToolShield;
import biofan.oresmod.items.tools.ToolSpade;
import biofan.oresmod.items.tools.ToolSword;
import biofan.oresmod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
		
	//Materials
	public static final ToolMaterial MATERIAL_ADAMANTITE = EnumHelper.addToolMaterial("material_adamantite", 3, 1561, 10.0f, 4.0f, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_ADAMANTITE = EnumHelper.addArmorMaterial("armor_material_adamantite", Reference.MOD_ID + ":adamantite", 17,
			new int[] {4,9,7,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.5f);
	
	public static final ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_cobalt", 2, 1561, 8.5f, 3.5f, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_COBALT = EnumHelper.addArmorMaterial("armor_material_cobalt", Reference.MOD_ID + ":cobalt", 17,
			new int[] {2,5,7,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f);
	
	//Items
	public static final Item ORES_ADAMANTITE = new ItemBase ("ores_adamantite");
	public static final Item INGOT_ADAMANTITE = new ItemBase ("ingot_adamantite");
	public static final Item ORES_COBALT = new ItemBase ("ores_cobalt");
	public static final Item INGOT_COBALT = new ItemBase ("ingot_cobalt");

	//Tools
	public static final ItemSword ADAMANTITE_SWORD = new ToolSword("sword_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemSpade ADAMANTITE_SHOVEL = new ToolSpade("shovel_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemPickaxe ADAMANTITE_PICKAXE = new ToolPickaxe("pickaxe_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemAxe ADAMANTITE_AXE = new ToolAxe("axe_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemHoe ADAMANTITE_HOE = new ToolHoe("hoe_adamantite", MATERIAL_ADAMANTITE);
	
	public static final ItemSword COBALT_SWORD = new ToolSword("sword_cobalt", MATERIAL_COBALT);
	public static final ItemSpade COBALT_SHOVEL = new ToolSpade("shovel_cobalt", MATERIAL_COBALT);
	public static final ItemPickaxe COBALT_PICKAXE = new ToolPickaxe("pickaxe_cobalt", MATERIAL_COBALT);
	public static final ItemAxe COBALT_AXE = new ToolAxe("axe_cobalt", MATERIAL_COBALT);
	public static final ItemHoe COBALT_HOE = new ToolHoe("hoe_cobalt", MATERIAL_COBALT);
	
	
	//Armor
	public static final Item ADAMANTITE_HELMET = new ArmorBase("helmet_adamantite", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ADAMANTITE_CHESTPLATE = new ArmorBase("chestplate_adamantite", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ADAMANTITE_LEGGINGS = new ArmorBase("leggings_adamantite", ARMOR_MATERIAL_ADAMANTITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ADAMANTITE_BOOTS = new ArmorBase("boots_adamantite", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COBALT_HELMET = new ArmorBase("helmet_cobalt", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.HEAD);
	public static final Item COBALT_CHESTPLATE = new ArmorBase("chestplate_cobalt", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.CHEST);
	public static final Item COBALT_LEGGINGS = new ArmorBase("leggings_cobalt", ARMOR_MATERIAL_COBALT, 2, EntityEquipmentSlot.LEGS);
	public static final Item COBALT_BOOTS = new ArmorBase("boots_cobalt", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.FEET);
	
	//Shields
	//public static final Item SHIELD_ADAMANTITE = new ToolShield("shield_adamantite", Main.biotooltab, 800);

}
