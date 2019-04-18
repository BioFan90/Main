package biofan.oresmod.items.tools;

import biofan.oresmod.Main;
import biofan.oresmod.init.ModItems;
import biofan.oresmod.util.interfaces.IHasModel;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 6.0f, -3.2f);
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