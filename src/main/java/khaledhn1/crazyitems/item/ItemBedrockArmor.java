package khaledhn1.crazyitems.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;



public class ItemBedrockArmor extends ItemArmor{

public ItemBedrockArmor(ArmorMaterial armourmaterial, int renderIndex,
		int armourType) {
	super(armourmaterial, renderIndex, armourType);
}
@Override
public String getArmorTexture(ItemStack stack, Entity entity, int slot, String Type){
	
	if(this.armorType == 2)
	{
		return "ci:textures/models/armor/Bedrock_layer_2.png";
	}
	return "ci:textures/models/armor/Bedrock_layer_1.png";
}

}