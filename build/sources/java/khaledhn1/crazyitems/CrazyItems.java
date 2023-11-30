package khaledhn1.crazyitems;

import khaledhn1.crazyitems.item.ItemBedrockArmor;
import khaledhn1.crazyitems.item.ItemBedrockAxe;
import khaledhn1.crazyitems.item.ItemBedrockHoe;
import khaledhn1.crazyitems.item.ItemBedrockPickaxe;
import khaledhn1.crazyitems.item.ItemBedrockShovel;
import khaledhn1.crazyitems.item.ItemBedrockSword;
import khaledhn1.crazyitems.item.ItemObsidianAxe;
import khaledhn1.crazyitems.item.ItemObsidianHoe;
import khaledhn1.crazyitems.item.ItemObsidianPickaxe;
import khaledhn1.crazyitems.item.ItemObsidianShovel;
import khaledhn1.crazyitems.item.ItemObsidianSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "ci", name = "Crazy Items", version = "1.0")
public class CrazyItems {

	public static Item ItemBedrockSword;
	public static Item ItemBedrockPickaxe;
	public static Item ItemBedrockAxe;
	public static Item ItemBedrockShovel;
	public static Item ItemBedrockHoe;
	
	public static Item ItemObsidianPickaxe;
	public static Item ItemObsidianAxe;
	public static Item ItemObsidianShovel;
	public static Item ItemObsidianHoe;
	public static Item ItemObsidianSword;
	
	public static Item ItemBedrockHelmet;
	public static Item ItemBedrockChestplate;
	public static Item ItemBedrockLeggings;
	public static Item ItemBedrockBoots;
	
	public static Block blockBreakableBedrock;
	public static Block blockBlackQuartz;
	
	public static Item ItemChocolateBar;

	public static final ItemArmor.ArmorMaterial BedrockArmorMaterial = EnumHelper.addArmorMaterial("BedrockArmorMaterial", 10000, new int[]{20,30,25,15}, 100);
	public static final Item.ToolMaterial BedrockToolMaterial = EnumHelper.addToolMaterial("BedrockToolMaterial", 6, 10000, 125.0F, 1000.0F, 100);
	public static final Item.ToolMaterial ObsidianToolMaterial = EnumHelper.addToolMaterial("ObsidianToolMaterial", 5, 5000, 82.0F, 700.0F, 100);


	@EventHandler
	public void pi(FMLPreInitializationEvent event) {
		
		ItemChocolateBar = new ItemFood(10, 0.5F, false).setUnlocalizedName("itemChocolateBar").setTextureName("ci:ChocolateBar").setCreativeTab(tabCrazyItems);
		
		blockBlackQuartz = new BlockBlackQuartz(Material.rock).setBlockName("BlockBlackQuartz").setBlockTextureName("ci:BlackQuartz").setCreativeTab(tabCrazyItems);

		blockBreakableBedrock = new BlockBreakableBedrock(Material.rock).setBlockName("BlockBreakableBedrock").setBlockTextureName("ci:blockBreakableBedrock").setCreativeTab(tabCrazyItems);

        ItemBedrockPickaxe = new ItemBedrockPickaxe(BedrockToolMaterial).setUnlocalizedName("itemBedrockPickaxe").setTextureName("ci:itemBedrockPickaxe").setCreativeTab(tabCrazyItems);
		
		ItemBedrockAxe = new ItemBedrockAxe(BedrockToolMaterial).setUnlocalizedName("itemBedrockAxe").setTextureName("ci:itemBedrockAxe").setCreativeTab(tabCrazyItems);
		
		ItemObsidianPickaxe = new ItemObsidianPickaxe(ObsidianToolMaterial).setUnlocalizedName("itemObsidianPickaxe").setTextureName("ci:itemObsidianPickaxe").setCreativeTab(tabCrazyItems);
		
		ItemObsidianAxe = new ItemObsidianAxe(ObsidianToolMaterial).setUnlocalizedName("itemObsidianAxe").setTextureName("ci:itemObsidianAxe").setCreativeTab(tabCrazyItems);
		
		ItemObsidianHoe = new ItemObsidianHoe(ObsidianToolMaterial).setUnlocalizedName("itemObsidianHoe").setTextureName("ci:itemObsidianHoe").setCreativeTab(tabCrazyItems);
		
		ItemObsidianSword = new ItemObsidianSword(ObsidianToolMaterial).setUnlocalizedName("itemObsidianSword").setTextureName("ci:itemObsidianSword").setCreativeTab(tabCrazyItems);
		
		ItemObsidianShovel = new ItemObsidianShovel(ObsidianToolMaterial).setUnlocalizedName("itemObsidianShovel").setTextureName("ci:itemObsidianShovel").setCreativeTab(tabCrazyItems);
					
		ItemBedrockHoe = new ItemBedrockHoe(BedrockToolMaterial).setUnlocalizedName("itemBedrockHoe").setTextureName("ci:itemBedrockHoe").setCreativeTab(tabCrazyItems);
		
		ItemBedrockSword = new ItemBedrockSword(BedrockToolMaterial).setUnlocalizedName("itemBedrockSword").setTextureName("ci:itemBedrockSword").setCreativeTab(tabCrazyItems);
		
		ItemBedrockShovel = new ItemBedrockShovel(BedrockToolMaterial).setUnlocalizedName("itemBedrockShovel").setTextureName("ci:itemBedrockShovel").setCreativeTab(tabCrazyItems);

        ItemBedrockHelmet = new ItemBedrockArmor(BedrockArmorMaterial, 0, 0).setUnlocalizedName("itemBedrockHelmet").setTextureName("ci:itemBedrockHelmet").setCreativeTab(tabCrazyItems);;

        ItemBedrockChestplate = new ItemBedrockArmor(BedrockArmorMaterial, 0, 1).setUnlocalizedName("itemBedrockChestplate").setTextureName("ci:itemBedrockChestplate").setCreativeTab(tabCrazyItems);;

        ItemBedrockLeggings = new ItemBedrockArmor(BedrockArmorMaterial, 0, 2).setUnlocalizedName("itemBedrockLeggings").setTextureName("ci:itemBedrockLeggings").setCreativeTab(tabCrazyItems);;

        ItemBedrockBoots = new ItemBedrockArmor(BedrockArmorMaterial, 0, 3).setUnlocalizedName("itemBedrockBoots").setTextureName("ci:itemBedrockBoots").setCreativeTab(tabCrazyItems);;
	

		
		GameRegistry.registerItem(ItemChocolateBar, ItemChocolateBar.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(blockBlackQuartz, blockBlackQuartz.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBreakableBedrock, blockBreakableBedrock.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(ItemBedrockSword, ItemBedrockSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBedrockShovel, ItemBedrockShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBedrockAxe, ItemBedrockAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBedrockHoe, ItemBedrockHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBedrockPickaxe, ItemBedrockPickaxe.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(ItemBedrockHelmet, ItemBedrockHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBedrockChestplate, ItemBedrockChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBedrockLeggings, ItemBedrockLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBedrockBoots, ItemBedrockBoots.getUnlocalizedName().substring(5));
					
		GameRegistry.registerItem(ItemObsidianPickaxe, ItemObsidianPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemObsidianAxe, ItemObsidianAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemObsidianSword, ItemObsidianSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemObsidianShovel, ItemObsidianShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemObsidianHoe, ItemObsidianHoe.getUnlocalizedName().substring(5));
		
		GameRegistry.registerWorldGenerator(new BreakableBedrockGeneration(), 0);
		
		
		GameRegistry.addSmelting(Blocks.quartz_block, new ItemStack(blockBlackQuartz), 2.2F);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(ItemBedrockSword), new Object[]{"B","B","S", 'B', CrazyItems.blockBreakableBedrock, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemBedrockShovel), new Object[]{"B","S","S", 'B', CrazyItems.blockBreakableBedrock, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemBedrockAxe), new Object[]{" BB"," SB"," S ", 'B', CrazyItems.blockBreakableBedrock, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemBedrockHoe), new Object[]{" BB"," S "," S ", 'B', CrazyItems.blockBreakableBedrock, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemBedrockPickaxe), new Object[]{"BBB"," S "," S ", 'B', CrazyItems.blockBreakableBedrock, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(ItemObsidianShovel), new Object[]{"O","S","S", 'O', Blocks.obsidian, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemObsidianAxe), new Object[]{" OO"," SO"," S ", 'O', Blocks.obsidian, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemObsidianPickaxe), new Object[]{"OOO"," S "," S ", 'O', Blocks.obsidian, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemObsidianSword), new Object[]{"O","O","S", 'O', Blocks.obsidian, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemObsidianHoe), new Object[]{" OO"," S "," S ", 'O', Blocks.obsidian, 'S', Items.stick});
	
		GameRegistry.addRecipe(new ItemStack(ItemBedrockHelmet),new Object[]{"BBB","B B","   ",'B', CrazyItems.blockBreakableBedrock});
		GameRegistry.addRecipe(new ItemStack(ItemBedrockChestplate), new Object[]{"BNB","BBB","BBB",'B',CrazyItems.blockBreakableBedrock,'N',Items.nether_star});
        GameRegistry.addRecipe(new ItemStack(ItemBedrockLeggings), new Object[]{"BBB","B B","B B",'B',CrazyItems.blockBreakableBedrock});
        GameRegistry.addRecipe(new ItemStack(ItemBedrockBoots), new Object[]{"   ","B B","B B",'B',CrazyItems.blockBreakableBedrock});
		
	}
	

	@EventHandler
	public void pi(FMLPostInitializationEvent event) {
	}
		
		public static CreativeTabs tabCrazyItems = new CreativeTabs("tabCrazyItems"){
    	@Override
    	public Item getTabIconItem(){
    		return new ItemStack(ItemBedrockSword).getItem();
   }
  };
}
