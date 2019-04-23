package biofan.oresmod.blocks;

import java.util.Random;

import biofan.oresmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AdamantiteOre extends BlockBase
{

	public AdamantiteOre(String name, Material material) 
	{
		super(name, material);
		//when you run over it
		setSoundType(SoundType.STONE);
		//how long to break it
		setHardness(3f);
		//explosion damage threshold
		setResistance(15f);
		//tool and level of tool
		setHarvestLevel("pickaxe", 2);
		//light emission
		//setLightLevel(1.0f);
		//for windows, essentially
		//setLightOpacity(0);
		//makes block unbreakable (bedrock)
		//setBlockUnbreakable();
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.ORES_ADAMANTITE;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return rand.nextInt(3)+1;
	}
	
}
