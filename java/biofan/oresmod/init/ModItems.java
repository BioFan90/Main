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
	
	//Copper
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 1, 150, 4f, 1f, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial("armor_material_copper", Reference.MOD_ID + ":copper", 7,
			new int[] {1,4,5,1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
	
	public static final Item INGOT_COPPER = new ItemBase ("ingot_copper");
	
	public static final ItemSword COPPER_SWORD = new ToolSword("sword_copper", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("pickaxe_copper", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("axe_copper", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("shovel_copper", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("hoe_copper", MATERIAL_COPPER);
	public static final Item COPPER_HELMET = new ArmorBase("helmet_copper", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("chestplate_copper", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("leggings_copper", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("boots_copper", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);
	
	//Tin
	public static final Item INGOT_TIN = new ItemBase ("ingot_tin");
	
	//Nickel
	public static final ToolMaterial MATERIAL_NICKEL = EnumHelper.addToolMaterial("material_nickel", 1, 200, 5f, 1f, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_NICKEL = EnumHelper.addArmorMaterial("armor_material_nickel", Reference.MOD_ID + ":nickel", 10,
			new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
	
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
	
	//Silver
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 2, 16, 6f, 1f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_SILVER = EnumHelper.addArmorMaterial("armor_material_silver", Reference.MOD_ID + ":silver", 4,
			new int[] {1,2,4,1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
	
	public static final Item INGOT_SILVER = new ItemBase ("ingot_silver");
	
	public static final ItemSword SILVER_SWORD = new ToolSword("sword_silver", MATERIAL_SILVER);
	public static final ItemPickaxe SILVER_PICKAXE = new ToolPickaxe("pickaxe_silver", MATERIAL_SILVER);
	public static final ItemAxe SILVER_AXE = new ToolAxe("axe_silver", MATERIAL_SILVER);
	public static final ItemSpade SILVER_SHOVEL = new ToolSpade("shovel_silver", MATERIAL_SILVER);
	public static final ItemHoe SILVER_HOE = new ToolHoe("hoe_silver", MATERIAL_SILVER);
	public static final Item SILVER_HELMET = new ArmorBase("helmet_silver", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHESTPLATE = new ArmorBase("chestplate_silver", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGGINGS = new ArmorBase("leggings_silver", ARMOR_MATERIAL_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new ArmorBase("boots_silver", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.FEET);
	
	
	//Platinum
	public static final ToolMaterial MATERIAL_PLATINUM = EnumHelper.addToolMaterial("material_platinum", 2, 32, 12f, 1f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_PLATINUM = EnumHelper.addArmorMaterial("armor_material_platinum", Reference.MOD_ID + ":platinum", 7,
			new int[] {1,3,5,2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0f);
	
	public static final Item INGOT_PLATINUM = new ItemBase ("ingot_platinum");
	
	public static final ItemSword PLATINUM_SWORD = new ToolSword("sword_platinum", MATERIAL_PLATINUM);
	public static final ItemPickaxe PLATINUM_PICKAXE = new ToolPickaxe("pickaxe_platinum", MATERIAL_PLATINUM);
	public static final ItemAxe PLATINUM_AXE = new ToolAxe("axe_platinum", MATERIAL_PLATINUM);
	public static final ItemSpade PLATINUM_SHOVEL = new ToolSpade("shovel_platinum", MATERIAL_PLATINUM);
	public static final ItemHoe PLATINUM_HOE = new ToolHoe("hoe_platinum", MATERIAL_PLATINUM);
	public static final Item PLATINUM_HELMET = new ArmorBase("helmet_platinum", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_CHESTPLATE = new ArmorBase("chestplate_platinum", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_LEGGINGS = new ArmorBase("leggings_platinum", ARMOR_MATERIAL_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLATINUM_BOOTS = new ArmorBase("boots_platinum", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.FEET);
	
	//Bronze
	public static final ToolMaterial MATERIAL_BRONZE = EnumHelper.addToolMaterial("material_bronze", 2, 325, 7f, 1f, 18);
	public static final ArmorMaterial ARMOR_MATERIAL_BRONZE = EnumHelper.addArmorMaterial("armor_material_bronze", Reference.MOD_ID + ":bronze", 24,
			new int[] {2,6,7,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1f);
	
	public static final Item DUST_BRONZE = new ItemBase ("dust_bronze");
	public static final Item INGOT_BRONZE = new ItemBase ("ingot_bronze");
	
	public static final ItemSword BRONZE_SWORD = new ToolSword("sword_bronze", MATERIAL_BRONZE);
	public static final ItemPickaxe BRONZE_PICKAXE = new ToolPickaxe("pickaxe_bronze", MATERIAL_BRONZE);
	public static final ItemAxe BRONZE_AXE = new ToolAxe("axe_bronze", MATERIAL_BRONZE);
	public static final ItemSpade BRONZE_SHOVEL = new ToolSpade("shovel_bronze", MATERIAL_BRONZE);
	public static final ItemHoe BRONZE_HOE = new ToolHoe("hoe_bronze", MATERIAL_BRONZE);
	public static final Item BRONZE_HELMET = new ArmorBase("helmet_bronze", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ArmorBase("chestplate_bronze", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ArmorBase("leggings_bronze", ARMOR_MATERIAL_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ArmorBase("boots_bronze", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.FEET);
	
	//Steel
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 300, 7f, 2f, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 20,
			new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	//Vulcanite
	public static final ToolMaterial MATERIAL_VULCANITE = EnumHelper.addToolMaterial("material_vulcanite", 2, 450, 7f, 2f, 18);
	public static final ArmorMaterial ARMOR_MATERIAL_VULCANITE = EnumHelper.addArmorMaterial("armor_material_vulcanite", Reference.MOD_ID + ":vulcanite", 28,
			new int[] {2,6,7,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1f);
	
	
	public static final Item INGOT_VULCANITE = new ItemBase ("ingot_vulcanite");
	
	public static final ItemSword VULCANITE_SWORD = new ToolSword("sword_vulcanite", MATERIAL_VULCANITE);
	public static final ItemPickaxe VULCANITE_PICKAXE = new ToolPickaxe("pickaxe_vulcanite", MATERIAL_VULCANITE);
	public static final ItemAxe VULCANITE_AXE = new ToolAxe("axe_vulcanite", MATERIAL_VULCANITE);
	public static final ItemSpade VULCANITE_SHOVEL = new ToolSpade("shovel_vulcanite", MATERIAL_VULCANITE);
	public static final ItemHoe VULCANITE_HOE = new ToolHoe("hoe_vulcanite", MATERIAL_VULCANITE);
	public static final Item VULCANITE_HELMET = new ArmorBase("helmet_vulcanite", ARMOR_MATERIAL_VULCANITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item VULCANITE_CHESTPLATE = new ArmorBase("chestplate_vulcanite", ARMOR_MATERIAL_VULCANITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item VULCANITE_LEGGINGS = new ArmorBase("leggings_vulcanite", ARMOR_MATERIAL_VULCANITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item VULCANITE_BOOTS = new ArmorBase("boots_vulcanite", ARMOR_MATERIAL_VULCANITE, 1, EntityEquipmentSlot.FEET);

	
	//Cobalt
	public static final ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_cobalt", 3, 1561, 8.5f, 3.5f, 14);
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
	public static final Item ORES_MYTHRIL = new ItemBase ("ores_mythril");
	public static final Item INGOT_MYTHRIL = new ItemBase ("ingot_mythril");
	
	public static final ToolMaterial MATERIAL_MYTHRIL = EnumHelper.addToolMaterial("material_mythril", 3, 200, 5f, 1f, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_MYTHRIL = EnumHelper.addArmorMaterial("armor_material_mythril", Reference.MOD_ID + ":nickel", 10,
			new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0f);
	
	
	//Palladium
	public static final Item ORES_PALLADIUM = new ItemBase ("ores_palladium");
	public static final Item INGOT_PALLADIUM = new ItemBase ("ingot_palladium");
	
	public static final ToolMaterial MATERIAL_PALLADIUM = EnumHelper.addToolMaterial("material_palladium", 3, 200, 5f, 1f, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_PALLADIUM = EnumHelper.addArmorMaterial("armor_material_palladium", Reference.MOD_ID + ":nickel", 10,
			new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0f);
	
	
	//Galaxy
	public static final Item ORES_GALAXY = new ItemBase ("ores_galaxy");
	public static final Item INGOT_GALAXY = new ItemBase ("ingot_galaxy");
	
	public static final ToolMaterial MATERIAL_GALAXY = EnumHelper.addToolMaterial("material_palladium", 3, 200, 5f, 1f, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_GALAXY = EnumHelper.addArmorMaterial("armor_material_palladium", Reference.MOD_ID + ":nickel", 10,
			new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0f);

	//Miscellaneous
	public static final Item SULFUR = new ItemBase ("sulfur");
	
	//Gems
	public static final Item GEM_RUBY = new ItemBase ("ruby");
	public static final Item GEM_SAPHIRE = new ItemBase ("saphire");
	public static final Item GEM_AMETHYST = new ItemBase ("amethyst");
	public static final Item GEM_JADE = new ItemBase ("jade");
	public static final Item GEM_PHOSPHOLITE = new ItemBase ("phospholite");
	public static final Item GEM_ONYX = new ItemBase ("onyx");
	public static final Item GEM_ROSE_QUARTZ = new ItemBase ("rose_quartz");
	public static final Item GEM_GARNET = new ItemBase ("garnet");
	public static final Item GEM_MALACHITE = new ItemBase ("malachite");
	public static final Item GEM_YELLOW_DIAMOND = new ItemBase ("yellow_diamond");
	public static final Item GEM_PERIDOT = new ItemBase ("peridot");
	

}
