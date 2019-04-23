package biofan.oresmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GoldOre extends BlockBase
{
	public GoldOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 1);

	}
}
