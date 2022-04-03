package net.mcreator.supermoney.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.supermoney.gui.GuiNormalWallet;
import net.mcreator.supermoney.SupermoneyMod;
import net.mcreator.supermoney.ElementsSupermoneyMod;

import java.util.Map;

@ElementsSupermoneyMod.ModElement.Tag
public class ProcedureOpenWallets extends ElementsSupermoneyMod.ModElement {
	public ProcedureOpenWallets(ElementsSupermoneyMod instance) {
		super(instance, 21);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenWallets!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenWallets!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenWallets!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenWallets!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenWallets!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(SupermoneyMod.instance, GuiNormalWallet.GUIID, world, x, y, z);
	}
}
