package biofan.oresmod.world;

import java.util.Random;

import biofan.oresmod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator 
{
	private WorldGenerator ore_adamantite, ore_cobalt,ore_gold_nether, ore_coal_nether, ore_copper, ore_tin, ore_nickel, 
	ore_sulfur, ore_amethyst, ore_garnet, ore_onyx, ore_ruby, ore_saphire, ore_rose, ore_jade, ore_phos, ore_palladium, ore_plat, ore_silver;
	
	public ModWorldGen()
	{
		
		
		ore_tin = new WorldGenMinable(ModBlocks.ORE_TIN.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_copper = new WorldGenMinable(ModBlocks.ORE_COPPER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_nickel = new WorldGenMinable(ModBlocks.ORE_NICKEL.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_silver = new WorldGenMinable(ModBlocks.ORE_SILVER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_plat = new WorldGenMinable(ModBlocks.ORE_PLATINUM.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		
		ore_ruby = new WorldGenMinable(ModBlocks.ORE_RUBY.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.STONE));
		ore_saphire = new WorldGenMinable(ModBlocks.ORE_SAPHIRE.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.STONE));
		ore_cobalt = new WorldGenMinable(ModBlocks.ORE_COBALT.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));

		ore_coal_nether = new WorldGenMinable(ModBlocks.ORE_COAL_NETHER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_sulfur = new WorldGenMinable(ModBlocks.ORE_SULFUR_NETHER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_gold_nether = new WorldGenMinable(ModBlocks.ORE_GOLD_NETHER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_onyx = new WorldGenMinable(ModBlocks.ORE_ONYX.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_garnet = new WorldGenMinable(ModBlocks.ORE_GARNET.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_rose = new WorldGenMinable(ModBlocks.ORE_ROSE_QUARTZ.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_adamantite = new WorldGenMinable(ModBlocks.ORE_ADAMANTITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		
		ore_amethyst = new WorldGenMinable(ModBlocks.ORE_AMETHYST.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_jade = new WorldGenMinable(ModBlocks.ORE_JADE.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_phos = new WorldGenMinable(ModBlocks.ORE_PHOSPHOLITE.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_palladium = new WorldGenMinable(ModBlocks.ORE_PALLADIUM.getDefaultState(), 1, BlockMatcher.forBlock(Blocks.END_STONE));
		
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ore_adamantite, world, random, chunkX, chunkZ, 20, 5, 50);
			runGenerator(ore_gold_nether, world, random, chunkX, chunkZ, 20, 15, 60);
			runGenerator(ore_coal_nether, world, random, chunkX, chunkZ, 30, 5, 120);
			runGenerator(ore_sulfur, world, random, chunkX, chunkZ, 30, 5, 120);
			runGenerator(ore_onyx, world, random, chunkX, chunkZ, 30, 5, 29);
			runGenerator(ore_garnet, world, random, chunkX, chunkZ, 30, 5, 29);
			
			break;
			
		case 0:
			
			runGenerator(ore_cobalt, world, random, chunkX, chunkZ, 20, 5, 50);
			runGenerator(ore_copper, world, random, chunkX, chunkZ, 20, 5, 128);
			runGenerator(ore_tin, world, random, chunkX, chunkZ, 20, 25, 67);
			runGenerator(ore_nickel, world, random, chunkX, chunkZ, 20, 25, 67);
			runGenerator(ore_silver, world, random, chunkX, chunkZ, 20, 25, 67);
			runGenerator(ore_plat, world, random, chunkX, chunkZ, 20, 10, 45);
			runGenerator(ore_ruby, world, random, chunkX, chunkZ, 30, 5, 29);
			runGenerator(ore_saphire, world, random, chunkX, chunkZ, 30, 5, 29);
			
			break;
			
		case 1:
			
			runGenerator(ore_amethyst, world, random, chunkX, chunkZ, 30, 5, 29);
			
			break;
			
			
		}
	}

	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minY, int maxY) 
	{
		if (minY > maxY || minY < 0 || maxY > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chance; i++) 
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minY + rand.nextInt(deltaY);
			int z = chunkZ * 16 + rand.nextInt(16);
	
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
	
	
}