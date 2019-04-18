package biofan.oresmod.init;

import java.util.ArrayList;
import java.util.List;

import biofan.oresmod.items.ItemBase;
import biofan.oresmod.items.armor.ArmorBase;
import biofan.oresmod.items.tools.ToolAxe;
import biofan.oresmod.items.tools.ToolHoe;
import biofan.oresmod.items.tools.ToolPickaxe;
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
			new int[] {4,9,7,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f);
	
	//Items
	public static final Item GEM_AMETHYST = new ItemBase ("amethyst");
	public static final Item ORE_ADAMANTITE = new ItemBase ("adamantite_ore");
	public static final Item INGOT_ADAMANTITE = new ItemBase ("ingot_adamantite");
	
	
	//Tools
	public static final ItemSword ADAMANTITE_SWORD = new ToolSword("adamantite_sword", MATERIAL_ADAMANTITE);
	public static final ItemSpade ADAMANTITE_SHOVEL = new ToolSpade("adamantite_spade", MATERIAL_ADAMANTITE);
	public static final ItemPickaxe ADAMANTITE_PICKAXE = new ToolPickaxe("adamantite_pickaxe", MATERIAL_ADAMANTITE);
	public static final ItemAxe ADAMANTITE_AXE = new ToolAxe("adamantite_axe", MATERIAL_ADAMANTITE);
	public static final ItemHoe ADAMANTITE_HOE = new ToolHoe("adamantite_hoe", MATERIAL_ADAMANTITE);
	
	//Armor
	public static final Item ADAMANTITE_HELMET = new ArmorBase("adamantite_helmet", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ADAMANTITE_CHESTPLATE = new ArmorBase("adamantite_chestplate", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ADAMANTITE_LEGGINGS = new ArmorBase("adamantite_leggings", ARMOR_MATERIAL_ADAMANTITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ADAMANTITE_BOOTS = new ArmorBase("adamantite_boots", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.FEET);
	//public static final Item ADAMANTITE_SHIELD = new ArmorBase("adamantite_shield", ARMOR_MATERIAL_ADAMANTITE);

}
