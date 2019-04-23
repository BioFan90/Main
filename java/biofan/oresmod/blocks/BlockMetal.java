package biofan.oresmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMetal extends BlockBase
{
	public BlockMetal(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(25.0f);
		setResistance(6000f);
		setHarvestLevel("pickaxe", 2);

		
	}
}
