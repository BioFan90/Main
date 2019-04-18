package biofan.oresmod.tabs;

import biofan.oresmod.init.ModBlocks;
import biofan.oresmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BioBlockTab extends CreativeTabs
{

	public BioBlockTab(String label) 
	{
		super("bioblocktab");
		this.setBackgroundImageName("biotab.png");
	}
	
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModBlocks.ORE_ADAMANTITE);
	}
	
	
	
}
