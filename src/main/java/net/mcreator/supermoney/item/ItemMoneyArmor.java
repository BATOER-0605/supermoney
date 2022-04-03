
package net.mcreator.supermoney.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.supermoney.creativetab.TabSuperMoney;
import net.mcreator.supermoney.ElementsSupermoneyMod;

@ElementsSupermoneyMod.ModElement.Tag
public class ItemMoneyArmor extends ElementsSupermoneyMod.ModElement {
	@GameRegistry.ObjectHolder("supermoney:money_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("supermoney:money_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("supermoney:money_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("supermoney:money_armorboots")
	public static final Item boots = null;
	public ItemMoneyArmor(ElementsSupermoneyMod instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MONEY_ARMOR", "supermoney:money", 25, new int[]{11, 16, 15, 13}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("money_armorhelmet")
				.setRegistryName("money_armorhelmet").setCreativeTab(TabSuperMoney.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("money_armorbody")
				.setRegistryName("money_armorbody").setCreativeTab(TabSuperMoney.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("money_armorlegs")
				.setRegistryName("money_armorlegs").setCreativeTab(TabSuperMoney.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("money_armorboots")
				.setRegistryName("money_armorboots").setCreativeTab(TabSuperMoney.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("supermoney:money_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("supermoney:money_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("supermoney:money_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("supermoney:money_armorboots", "inventory"));
	}
}
