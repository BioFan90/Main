package biofan.oresmod.items.armor;

import biofan.oresmod.Main;
import biofan.oresmod.init.ModItems;
import biofan.oresmod.util.interfaces.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName (name);
		setCreativeTab(Main.biotooltab);
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
