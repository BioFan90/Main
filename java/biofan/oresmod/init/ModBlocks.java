package biofan.oresmod.init;

import java.util.ArrayList;
import java.util.List;

import biofan.oresmod.blocks.AdamantiteOre;
import biofan.oresmod.blocks.AdamantiteBlock;
import biofan.oresmod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_ADAMANTITE = new AdamantiteOre("ore_adamantite", Material.IRON);
	public static final Block BLOCK_ADAMANTITE = new AdamantiteBlock("block_adamantite", Material.IRON);
	
	
}
