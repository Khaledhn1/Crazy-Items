package khaledhn1.crazyitems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class BreakableBedrockGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX, chunkZ);
			break;

		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;

		case 1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		}
	}

	public void generateNether(World world, Random rand, int x, int z) {

	}

	public void generateOverworld(World world, Random rand, int x, int z) {
    generateOre(CrazyItems.blockBreakableBedrock, world, rand, x, z, 2, 10, 35, 0, 30, Blocks.stone);
	}

	public void generateEnd(World world, Random rand, int x, int z) {

	}

	public void generateOre(Block block, World world, Random random,
			int chunkX, int chunkZ, int minVienSize, int maxVienSize,
			int chance, int minY, int maxY, Block generateIn) {
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int XRand = chunkX * 16 + random.nextInt(16);
			int YRand = random.nextInt(heightRange) + minY;
			int ZRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, XRand, YRand, ZRand);
		}
	}

}
