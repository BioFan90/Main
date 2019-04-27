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
		GameRegistry.addSmelting(ModBlocks.ORE_COPPER, new ItemStack(ModItems.INGOT_COPPER, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_TIN, new ItemStack(ModItems.INGOT_TIN, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_NICKEL, new ItemStack(ModItems.INGOT_NICKEL, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_AMETHYST, new ItemStack(ModItems.GEM_AMETHYST, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_RUBY, new ItemStack(ModItems.GEM_RUBY, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_SAPHIRE, new ItemStack(ModItems.GEM_SAPHIRE, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_SULFUR_NETHER, new ItemStack(ModItems.SULFUR, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_ONYX, new ItemStack(ModItems.GEM_ONYX, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.ORE_GARNET, new ItemStack(ModItems.GEM_GARNET, 1), 1.5f);
	}
}
