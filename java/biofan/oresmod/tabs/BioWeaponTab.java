package biofan.oresmod.tabs;

import biofan.oresmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BioWeaponTab extends CreativeTabs
{

	public BioWeaponTab(String label) 
	{
		super("bioweapontab");
		this.setBackgroundImageName("biotab.png");
	}
	
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.ADAMANTITE_SWORD);
	}
	
	
	
}
