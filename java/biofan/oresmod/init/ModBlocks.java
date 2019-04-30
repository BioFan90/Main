package biofan.oresmod.init;

import java.util.ArrayList;
import java.util.List;

import biofan.oresmod.blocks.OreAdamantite;
import biofan.oresmod.blocks.OreAmethyst;
import biofan.oresmod.blocks.BlockMetal;
import biofan.oresmod.blocks.BlockBase;
import biofan.oresmod.blocks.OreCoal;
import biofan.oresmod.blocks.OreCobalt;
import biofan.oresmod.blocks.OreGalaxy;
import biofan.oresmod.blocks.OreGarnet;
import biofan.oresmod.blocks.OreJade;
import biofan.oresmod.blocks.OreMythril;
import biofan.oresmod.blocks.OreOnyx;
import biofan.oresmod.blocks.OrePalladium;
import biofan.oresmod.blocks.OrePhospholite;
import biofan.oresmod.blocks.OreRuby;
import biofan.oresmod.blocks.OreSaphire;
import biofan.oresmod.blocks.ToolIronOre;
import biofan.oresmod.blocks.ToolStoneOre;
import biofan.oresmod.blocks.ToolWoodOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block BLOCK_COPPER = new BlockMetal("block_copper", Material.IRON);
	public static final Block BLOCK_TIN = new BlockMetal("block_tin", Material.IRON);
	public static final Block BLOCK_NICKEL = new BlockMetal("block_nickel", Material.IRON);
	public static final Block BLOCK_SULFUR = new BlockMetal("block_sulfur", Material.IRON);
	
	public static final Block BLOCK_SILVER = new BlockMetal("block_silver", Material.IRON);
	public static final Block BLOCK_PLATINUM = new BlockMetal("block_platinum", Material.IRON);
	public static final Block BLOCK_STEEL = new BlockMetal("block_steel", Material.IRON);
	public static final Block BLOCK_BRONZE = new BlockMetal("block_bronze", Material.IRON);
	public static final Block BLOCK_VULCANITE = new BlockMetal("block_vulcanite", Material.IRON);
	
	
	public static final Block BLOCK_RUBY = new BlockMetal("block_ruby", Material.IRON);
	public static final Block BLOCK_SAPHIRE = new BlockMetal("block_saphire", Material.IRON);
	public static final Block BLOCK_AMETHYST = new BlockMetal("block_amethyst", Material.IRON);
	public static final Block BLOCK_JADE = new BlockMetal("block_jade", Material.IRON);
	public static final Block BLOCK_PHOSPHOLITE = new BlockMetal("block_phospholite", Material.IRON);
	public static final Block BLOCK_ONYX = new BlockMetal("block_onyx", Material.IRON);
	public static final Block BLOCK_ROSE_QUARTZ = new BlockMetal("block_rose_quartz", Material.IRON);
	public static final Block BLOCK_GARNET = new BlockMetal("block_garnet", Material.IRON);
	public static final Block BLOCK_MALACHITE = new BlockMetal("block_malachite", Material.IRON);
	public static final Block BLOCK_YELLOW_DIAMOND = new BlockMetal("block_yellow_diamond", Material.IRON);
	public static final Block BLOCK_PERIDOT = new BlockMetal("block_peridot", Material.IRON);	
	
	public static final Block BLOCK_COBALT = new BlockMetal("block_cobalt", Material.IRON);
	public static final Block BLOCK_ADAMANTITE = new BlockMetal("block_adamantite", Material.IRON);
	public static final Block BLOCK_MYTHRIL = new BlockMetal("block_mythril", Material.IRON);
	public static final Block BLOCK_PALLADIUM = new BlockMetal("block_palladium", Material.IRON);
	
	public static final Block BLOCK_GALAXY = new BlockMetal("block_galaxy", Material.IRON);
	
	//overworld ores
	public static final Block ORE_COPPER = new ToolWoodOre("ore_copper", Material.IRON);
	public static final Block ORE_TIN = new ToolWoodOre("ore_tin", Material.IRON);
	public static final Block ORE_NICKEL = new ToolWoodOre("ore_nickel", Material.IRON);
	public static final Block ORE_SILVER = new ToolIronOre("ore_silver", Material.IRON);
	public static final Block ORE_PLATINUM = new ToolIronOre("ore_platinum", Material.IRON);
	public static final Block ORE_RUBY = new OreRuby("ore_ruby", Material.IRON);
	public static final Block ORE_SAPHIRE = new OreSaphire("ore_saphire", Material.IRON);
	public static final Block ORE_COBALT = new OreCobalt("ore_cobalt", Material.IRON);

	
	//nether ores
	public static final Block ORE_SULFUR_NETHER = new ToolWoodOre("ore_sulfur", Material.IRON);
	public static final Block ORE_COAL_NETHER = new OreCoal("ore_coal_nether", Material.IRON);
	public static final Block ORE_GOLD_NETHER = new ToolStoneOre("ore_gold_nether", Material.IRON);
	public static final Block ORE_ONYX = new OreOnyx("ore_onyx", Material.IRON);
	public static final Block ORE_GARNET = new OreGarnet("ore_garnet", Material.IRON);
	public static final Block ORE_ROSE_QUARTZ = new ToolIronOre("ore_rose_quartz", Material.IRON);
	public static final Block ORE_ADAMANTITE = new OreAdamantite("ore_adamantite", Material.IRON);
	
	//aether ores
	public static final Block ORE_MALACHITE = new ToolIronOre("ore_malachite", Material.IRON);
	public static final Block ORE_YELLOW_DIAMOND = new ToolIronOre("ore_yellow_diamond", Material.IRON);
	public static final Block ORE_PERIDOT = new ToolIronOre("ore_peridot", Material.IRON);
	public static final Block ORE_MYTHRIL = new OreMythril("ore_mythril", Material.IRON);
	
	//end ores
	public static final Block ORE_AMETHYST = new OreAmethyst("ore_amethyst", Material.IRON);
	public static final Block ORE_JADE = new OreJade("ore_jade", Material.IRON);
	public static final Block ORE_PHOSPHOLITE = new OrePhospholite("ore_phospholite", Material.IRON);
	public static final Block ORE_PALLADIUM = new OrePalladium("ore_palladium", Material.IRON);
	public static final Block ORE_GALAXY = new OreGalaxy("ore_galaxy", Material.IRON);
	

}
