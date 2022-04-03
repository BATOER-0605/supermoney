
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
public class ItemBigPowerOfMoney extends ElementsSupermoneyMod.ModElement {
	@GameRegistry.ObjectHolder("supermoney:big_power_of_money")
	public static final Item block = null;
	public ItemBigPowerOfMoney(ElementsSupermoneyMod instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("supermoney:big_power_of_money", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("big_power_of_money");
			setRegistryName("big_power_of_money");
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
					"\u5F37\u5927\u306A\u8CA1\u529B\u3092\u3082\u3063\u305F\u3001\u300C\u8CA1\u529B\u306E\u6E90\u300D\u306E\u4E0A\u4F4D\u4E92\u63DB");
		}
	}
}
