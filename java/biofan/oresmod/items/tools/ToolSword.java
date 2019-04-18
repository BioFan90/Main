package biofan.oresmod.items.tools;

import biofan.oresmod.Main;
import biofan.oresmod.init.ModItems;
import biofan.oresmod.util.interfaces.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
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
