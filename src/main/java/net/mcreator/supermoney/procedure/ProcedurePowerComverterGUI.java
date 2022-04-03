package net.mcreator.supermoney.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.supermoney.item.ItemWadofMoney;
import net.mcreator.supermoney.item.ItemPowerofMoney;
import net.mcreator.supermoney.item.ItemBigPowerOfMoney;
import net.mcreator.supermoney.block.BlockSuperMoneyPowerBlock;
import net.mcreator.supermoney.ElementsSupermoneyMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsSupermoneyMod.ModElement.Tag
public class ProcedurePowerComverterGUI extends ElementsSupermoneyMod.ModElement {
	public ProcedurePowerComverterGUI(ElementsSupermoneyMod instance) {
		super(instance, 28);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PowerComverterGUI!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (1))) != 64)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemBigPowerOfMoney.block, (int) (1)).getItem())) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockSuperMoneyPowerBlock.block, (int) (1));
							_setstack.setCount(((new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof EntityPlayerMP) {
										Container _current = ((EntityPlayerMP) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
												if (stack != null)
													return stack.getCount();
											}
										}
									}
									return 0;
								}
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemWadofMoney.block, (int) (1)).getItem())) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemPowerofMoney.block, (int) (1));
							_setstack.setCount(((new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof EntityPlayerMP) {
										Container _current = ((EntityPlayerMP) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
												if (stack != null)
													return stack.getCount();
											}
										}
									}
									return 0;
								}
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
