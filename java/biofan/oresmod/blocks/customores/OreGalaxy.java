package biofan.oresmod.blocks.customores;

import java.util.Random;

import biofan.oresmod.blocks.BlockBase;
import biofan.oresmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreGalaxy extends BlockBase
{

	public OreGalaxy(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 3);
				
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.ORES_GALAXY;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}
	
}
