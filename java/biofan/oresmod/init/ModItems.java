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
	
	//Items	
	public static final Item SULFUR = new ItemBase ("sulfur");
	
	//Gems
	public static final Item GEM_AMETHYST = new ItemBase ("amethyst");
	public static final Item GEM_GARNET = new ItemBase ("garnet");
	public static final Item GEM_ONYX = new ItemBase ("onyx");
	public static final Item GEM_RUBY = new ItemBase ("ruby");
	public static final Item GEM_SAPHIRE = new ItemBase ("saphire");

	//Copper
	public static final Item INGOT_COPPER = new ItemBase ("ingot_copper");
	
	//Nickel
	public static final ToolMaterial MATERIAL_NICKEL = EnumHelper.addToolMaterial("material_nickel", 0, 200, 5f, 1f, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_NICKEL = EnumHelper.addArmorMaterial("armor_material_nickel", Reference.MOD_ID + ":nickel", 10,
			new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0f);
	
	public static final Item INGOT_NICKEL = new ItemBase ("ingot_nickel");
	
	public static final ItemSword NICKEL_SWORD = new ToolSword("sword_nickel", MATERIAL_NICKEL);
	public static final ItemPickaxe NICKEL_PICKAXE = new ToolPickaxe("pickaxe_nickel", MATERIAL_NICKEL);
	public static final ItemAxe NICKEL_AXE = new ToolAxe("axe_nickel", MATERIAL_NICKEL);
	public static final ItemSpade NICKEL_SHOVEL = new ToolSpade("shovel_nickel", MATERIAL_NICKEL);
	public static final ItemHoe NICKEL_HOE = new ToolHoe("hoe_nickel", MATERIAL_NICKEL);
	public static final Item NICKEL_HELMET = new ArmorBase("helmet_nickel", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item NICKEL_CHESTPLATE = new ArmorBase("chestplate_nickel", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item NICKEL_LEGGINGS = new ArmorBase("leggings_nickel", ARMOR_MATERIAL_NICKEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item NICKEL_BOOTS = new ArmorBase("boots_nickel", ARMOR_MATERIAL_NICKEL, 1, EntityEquipmentSlot.FEET);
	
	//Bronze
	public static final Item DUST_BRONZE = new ItemBase ("dust_bronze");
	public static final Item INGOT_BRONZE = new ItemBase ("ingot_bronze");
	
	//Silver
	
	//Platinum
	
	//Vulcanite
	
	//Cobalt
	public static final ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_cobalt", 2, 1561, 8.5f, 3.5f, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_COBALT = EnumHelper.addArmorMaterial("armor_material_cobalt", Reference.MOD_ID + ":cobalt", 17,
			new int[] {2,5,7,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f);

	public static final Item ORES_COBALT = new ItemBase ("ores_cobalt");
	public static final Item INGOT_COBALT = new ItemBase ("ingot_cobalt");
	
	public static final ItemSword COBALT_SWORD = new ToolSword("sword_cobalt", MATERIAL_COBALT);
	public static final ItemPickaxe COBALT_PICKAXE = new ToolPickaxe("pickaxe_cobalt", MATERIAL_COBALT);
	public static final ItemAxe COBALT_AXE = new ToolAxe("axe_cobalt", MATERIAL_COBALT);
	public static final ItemSpade COBALT_SHOVEL = new ToolSpade("shovel_cobalt", MATERIAL_COBALT);
	public static final ItemHoe COBALT_HOE = new ToolHoe("hoe_cobalt", MATERIAL_COBALT);
	public static final Item COBALT_HELMET = new ArmorBase("helmet_cobalt", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.HEAD);
	public static final Item COBALT_CHESTPLATE = new ArmorBase("chestplate_cobalt", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.CHEST);
	public static final Item COBALT_LEGGINGS = new ArmorBase("leggings_cobalt", ARMOR_MATERIAL_COBALT, 2, EntityEquipmentSlot.LEGS);
	public static final Item COBALT_BOOTS = new ArmorBase("boots_cobalt", ARMOR_MATERIAL_COBALT, 1, EntityEquipmentSlot.FEET);
	
	
	//Adamantite
	public static final Item ORES_ADAMANTITE = new ItemBase ("ores_adamantite");
	public static final Item INGOT_ADAMANTITE = new ItemBase ("ingot_adamantite");
	
	public static final ToolMaterial MATERIAL_ADAMANTITE = EnumHelper.addToolMaterial("material_adamantite", 3, 1561, 10.0f, 4.0f, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_ADAMANTITE = EnumHelper.addArmorMaterial("armor_material_adamantite", Reference.MOD_ID + ":adamantite", 17,
			new int[] {4,9,7,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.5f);
	
	public static final ItemSword ADAMANTITE_SWORD = new ToolSword("sword_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemPickaxe ADAMANTITE_PICKAXE = new ToolPickaxe("pickaxe_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemAxe ADAMANTITE_AXE = new ToolAxe("axe_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemSpade ADAMANTITE_SHOVEL = new ToolSpade("shovel_adamantite", MATERIAL_ADAMANTITE);
	public static final ItemHoe ADAMANTITE_HOE = new ToolHoe("hoe_adamantite", MATERIAL_ADAMANTITE);
	public static final Item ADAMANTITE_HELMET = new ArmorBase("helmet_adamantite", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ADAMANTITE_CHESTPLATE = new ArmorBase("chestplate_adamantite", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ADAMANTITE_LEGGINGS = new ArmorBase("leggings_adamantite", ARMOR_MATERIAL_ADAMANTITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ADAMANTITE_BOOTS = new ArmorBase("boots_adamantite", ARMOR_MATERIAL_ADAMANTITE, 1, EntityEquipmentSlot.FEET);
	
	//Mythril
	
	//Palladium
	
	//Galaxy


	

}
