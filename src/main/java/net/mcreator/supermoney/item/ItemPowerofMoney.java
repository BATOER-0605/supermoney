
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
public class ItemPowerofMoney extends ElementsSupermoneyMod.ModElement {
	@GameRegistry.ObjectHolder("supermoney:powerof_money")
	public static final Item block = null;
	public ItemPowerofMoney(ElementsSupermoneyMod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("supermoney:powerof_money", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("powerof_money");
			setRegistryName("powerof_money");
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
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(
					"\u8CA1\u529B\u304C\u5177\u73FE\u5316\u3057\u305F\u3082\u306E\u3002\u4F55\u304B\u3092\u4F5C\u308B\u3053\u3068\u304C\u51FA\u304D\u308B\u3063\u307D\u3044\uFF1F");
		}
	}
}
