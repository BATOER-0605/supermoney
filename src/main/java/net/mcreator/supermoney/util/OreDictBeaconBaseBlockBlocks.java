
package net.mcreator.supermoney.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.supermoney.block.BlockUsedemeraldbrock;
import net.mcreator.supermoney.ElementsSupermoneyMod;

@ElementsSupermoneyMod.ModElement.Tag
public class OreDictBeaconBaseBlockBlocks extends ElementsSupermoneyMod.ModElement {
	public OreDictBeaconBaseBlockBlocks(ElementsSupermoneyMod instance) {
		super(instance, 23);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("beacon_base_blocks", new ItemStack(BlockUsedemeraldbrock.block, (int) (1)));
	}
}
