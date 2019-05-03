package biofan.oresmod.blocks.ores;

import biofan.oresmod.blocks.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ToolIronOre extends BlockBase
{
	public ToolIronOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 2);

	}
}
