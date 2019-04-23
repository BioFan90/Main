package biofan.oresmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.ORES_ADAMANTITE, new ItemStack(ModItems.INGOT_ADAMANTITE, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_ADAMANTITE, new ItemStack(ModItems.INGOT_ADAMANTITE, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.ORES_COBALT, new ItemStack(ModItems.INGOT_COBALT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_COBALT, new ItemStack(ModItems.INGOT_COBALT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_COAL_NETHER, new ItemStack(Items.COAL, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_GOLD_NETHER, new ItemStack(Items.GOLD_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.DUST_BRONZE, new ItemStack(ModItems.INGOT_BRONZE, 1), 1.5f);
	}
}
