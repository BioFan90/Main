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
	private WorldGenerator ore_adamantite, ore_cobalt,ore_gold_nether, ore_coal_nether;
	
	public ModWorldGen()
	{
		ore_adamantite = new WorldGenMinable(ModBlocks.ORE_ADAMANTITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_cobalt = new WorldGenMinable(ModBlocks.ORE_COBALT.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_gold_nether = new WorldGenMinable(ModBlocks.ORE_GOLD_NETHER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_coal_nether = new WorldGenMinable(ModBlocks.ORE_COAL_NETHER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ore_adamantite, world, random, chunkX, chunkZ, 20, 3, 50);
			runGenerator(ore_gold_nether, world, random, chunkX, chunkZ, 20, 3, 80);
			runGenerator(ore_coal_nether, world, random, chunkX, chunkZ, 20, 3, 80);
			
			break;
			
		case 0:
			
			runGenerator(ore_cobalt, world, random, chunkX, chunkZ, 20, 3, 50);
			
			break;
			
		case 1:
			
			
			
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