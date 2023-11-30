package khaledhn1.crazyitems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBreakableBedrock extends Block {

	protected BlockBreakableBedrock(Material material) {
		super(material);
		
		this.setHardness(11.5F);
		this.setHarvestLevel("pickaxe", 5);
		this.setLightOpacity(16);
	}

}
