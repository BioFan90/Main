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
	private WorldGenerator ore_adamantite;
	
	public ModWorldGen()
	{
		ore_adamantite = new WorldGenMinable(ModBlocks.ORE_ADAMANTITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ore_adamantite, world, random, chunkX, chunkZ, 25, 3, 50);
			
			break;
			
		case 0:
			
			//generateOre();
			
			break;
			
		case 1:
			
			//generateOre();
			
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