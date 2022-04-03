
package net.mcreator.supermoney.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.supermoney.creativetab.TabSuperMoney;
import net.mcreator.supermoney.ElementsSupermoneyMod;

import java.util.List;

@ElementsSupermoneyMod.ModElement.Tag
public class ItemNineyen extends ElementsSupermoneyMod.ModElement {
	@GameRegistry.ObjectHolder("supermoney:nineyen")
	public static final Item block = null;
	public ItemNineyen(ElementsSupermoneyMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("supermoney:nineyen", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("nineyen");
			setRegistryName("nineyen");
			setCreativeTab(TabSuperMoney.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(
					"\u30A8\u30E1\u30E9\u30EB\u30C9\u30D6\u30ED\u30C3\u30AF1\u500B\u5206\u306E\u4FA1\u5024\u304C\u3042\u308B\u30029\u500B\u3067\u30AF\u30E9\u30D5\u30C8\u3059\u308B\u3068...?");
		}
	}
}
