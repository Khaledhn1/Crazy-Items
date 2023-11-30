package khaledhn1.crazyitems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBlackQuartz extends Block {

	protected BlockBlackQuartz(Material material) {
		super(material);
		
		this.setHardness(5.5F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightOpacity(16);
	}

}
