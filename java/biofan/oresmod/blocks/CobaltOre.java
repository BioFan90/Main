package biofan.oresmod.blocks;

import java.util.Random;

import biofan.oresmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class CobaltOre extends BlockBase
{

	public CobaltOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(8.0f);
		setResistance(45.0f);
		setHarvestLevel("pickaxe", 2);
				
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.ORES_COBALT;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return rand.nextInt(3)+1;
	}
	
}
