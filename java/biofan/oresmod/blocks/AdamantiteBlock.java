package biofan.oresmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdamantiteBlock extends BlockBase
{
	public AdamantiteBlock(String name, Material material) 
	{
		super(name, material);
		//when you run over it
		setSoundType(SoundType.METAL);
		//how long to break it
		setHardness(25.0f);
		//explosion damage threshold
		setResistance(6000f);
		//tool and level of tool
		setHarvestLevel("pickaxe", 2);
		//light emission
		//setLightLevel(1.0f);
		//for windows, essentially
		//setLightOpacity(0);
		//makes block unbreakable (bedrock)
		//setBlockUnbreakable();
		
	}
}
