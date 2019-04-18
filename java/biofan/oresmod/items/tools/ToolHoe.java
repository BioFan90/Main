package biofan.oresmod.items.tools;

import biofan.oresmod.Main;
import biofan.oresmod.init.ModItems;
import biofan.oresmod.util.interfaces.IHasModel;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class ToolHoe extends ItemHoe implements IHasModel
{
	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName (name);
		setCreativeTab(Main.biotooltab);
		
		ModItems.ITEMS.add(this);
	}
	
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}