package biofan.oresmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.ORES_ADAMANTITE, new ItemStack(ModItems.INGOT_ADAMANTITE, 1), 1.5f);
	}
}
