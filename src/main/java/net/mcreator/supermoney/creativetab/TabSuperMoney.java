
package net.mcreator.supermoney.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.supermoney.item.ItemCreativeticket;
import net.mcreator.supermoney.ElementsSupermoneyMod;

@ElementsSupermoneyMod.ModElement.Tag
public class TabSuperMoney extends ElementsSupermoneyMod.ModElement {
	public TabSuperMoney(ElementsSupermoneyMod instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsuper_money") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCreativeticket.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
