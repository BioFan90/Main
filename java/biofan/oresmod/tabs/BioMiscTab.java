package biofan.oresmod.tabs;

import biofan.oresmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BioMiscTab extends CreativeTabs
{

	public BioMiscTab(String label) 
	{
		super("biomisctab");
		this.setBackgroundImageName("biotab.png");
	}
	
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.ORE_ADAMANTITE);
	}
	
	
	
}
