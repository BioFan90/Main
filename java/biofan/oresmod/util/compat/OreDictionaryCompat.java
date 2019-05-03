package biofan.oresmod.util.compat;

import biofan.oresmod.init.ModBlocks;
import biofan.oresmod.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat
{
	public static void registerOres() 
	{
		OreDictionary.registerOre("oreCopper", ModBlocks.ORE_COPPER);
		OreDictionary.registerOre("ingotCopper", ModItems.INGOT_COPPER);
	}
}
