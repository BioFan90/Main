package biofan.oresmod.init;

import java.util.ArrayList;
import java.util.List;

import biofan.oresmod.blocks.OreAdamantite;
import biofan.oresmod.blocks.BlockMetal;
import biofan.oresmod.blocks.BlockBase;
import biofan.oresmod.blocks.OreCoal;
import biofan.oresmod.blocks.OreCobalt;
import biofan.oresmod.blocks.ToolStoneOre;
import biofan.oresmod.blocks.ToolWoodOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//ores
	public static final Block ORE_COPPER = new ToolWoodOre("ore_copper", Material.IRON);
	public static final Block ORE_TIN = new ToolWoodOre("ore_tin", Material.IRON);
	public static final Block ORE_NICKEL = new ToolWoodOre("ore_nickel", Material.IRON);
	public static final Block ORE_SULFUR_NETHER = new ToolWoodOre("ore_sulfur", Material.IRON);
	
	
	public static final Block ORE_GOLD_NETHER = new ToolStoneOre("ore_gold_nether", Material.IRON);
	
	
	public static final Block ORE_ADAMANTITE = new OreAdamantite("ore_adamantite", Material.IRON);
	public static final Block ORE_COBALT = new OreCobalt("ore_cobalt", Material.IRON);
	public static final Block ORE_COAL_NETHER = new OreCoal("ore_coal_nether", Material.IRON);
	
	
	//Blocks
	public static final Block BLOCK_ADAMANTITE = new BlockMetal("block_adamantite", Material.IRON);
	public static final Block BLOCK_COBALT = new BlockMetal("block_cobalt", Material.IRON);
	
	
}
